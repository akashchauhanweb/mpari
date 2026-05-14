#!/usr/bin/env python3
"""
mParivahan — citizen registration/sign-in + RC vehicle lookup.

Uses curl subprocesses for all HTTP (avoids Python SSL issues on macOS).
Endpoints confirmed from decompiled APK source (vn7.java, c26.java, mt6.java).

REGISTRATION flow (new account):
  1. alertsapi/forwardOTPAlerts   {smsAlert: {smsEvent: CTZ_REG, smsMobile}}
  2. alertsapi/validateOTPAlerts  {mparCitizenDevice, smsOtp, mparCitizenUser}
     → returns ctzRecordId in mparCitizenUser
  3. citizenapi/getUserLoginToken {citizenLogin: {ctzRecordId,...}, mparCitizenUser: {ctzMpin}}
     → establishes server-side session needed for nrapi

SIGN-IN flow (existing account):
  1. alertsapi/forwardOTPAlerts   {smsAlert: {smsEvent: CTZ_SIG, smsMobile}}
  2. alertsapi/validateOTPAlerts  {smsOtp: {otpSmsId, otpVal}}
     → returns ctzRecordId in mparCitizenUser
  3. citizenapi/getUserLoginToken {citizenLogin: {ctzRecordId,...}, mparCitizenUser: {ctzMpin}}
     → establishes server-side session needed for nrapi

Usage:
    python3 register.py <MOBILE>                    # sign-in (existing account)
    python3 register.py <MOBILE> "" CTZ_REG         # registration (new account)
    python3 register.py --lookup WB74AN9717 <CID>   # RC lookup (need citizenId)
    python3 register.py --retry <MOB> <SMSID> <OTP> # retry registration without new OTP
"""

import base64
import json
import subprocess
import sys
import time

from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

OAUTH_URL      = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
ALERT_BASE     = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/alertsapi/"
CITIZEN_BASE   = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/citizenapi/"
NRAPI_BASE     = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/"
SEND_OTP_EP    = "service/forwardOTPAlerts"
VERIFY_OTP_EP  = "service/validateOTPAlerts"
LOGIN_EP       = "service/getUserLoginToken"
RC_LOOKUP_EP   = "service/getSearchDocDetails"
CLIENT_ID      = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET  = "de83eeeb148878ae375f28756492e8a0"
PAYMENT_SUFFIX = "!~)#@*&^"
COOKIE_JAR     = "/tmp/mpar_session.txt"


# ── AES-128/ECB/PKCS7 + double Base64 ─────────────────────────────────────────
def derive_key(ts: str) -> bytes:
    rev  = ts[::-1]
    part = rev[:4] + rev[len(rev) - 4:]
    return (part + PAYMENT_SUFFIX).encode("utf-8")

def encrypt_body(plain: str, ts: str) -> str:
    ct = AES.new(derive_key(ts), AES.MODE_ECB).encrypt(pad(plain.encode(), 16))
    return base64.b64encode(base64.b64encode(ct)).decode()

def decrypt_response(data_b64: str, ts: str) -> str:
    try:
        ct = base64.b64decode(base64.b64decode(data_b64))
        pt = unpad(AES.new(derive_key(ts), AES.MODE_ECB).decrypt(ct), 16)
        return pt.decode("utf-8")
    except Exception as e:
        return f"<decryption failed: {e}>"


# ── curl helpers ───────────────────────────────────────────────────────────────
def curl_post_form(url: str, data: dict) -> str:
    cmd = ["curl", "-s", "-k", "--max-time", "15", "-X", "POST", url]
    for k, v in data.items():
        cmd += ["-d", f"{k}={v}"]
    result = subprocess.run(cmd, capture_output=True, text=True)
    if not result.stdout and result.stderr:
        print("   curl stderr:", result.stderr[:300])
    return result.stdout

def curl_post_json(url: str, body: str, headers: dict,
                   save_cookies: bool = False, send_cookies: bool = False) -> tuple[str, str]:
    ts = str(int(time.time() * 1000))
    cmd = ["curl", "-s", "-k", "--max-time", "30",
           "-H", "Content-Type: application/json",
           "-H", "Accept: application/json",
           "-H", "User-Agent: okhttp/4.9.3",
           "-w", "\nHTTP_STATUS:%{http_code}"]
    if save_cookies:
        cmd += ["-c", COOKIE_JAR]
    if send_cookies:
        cmd += ["-b", COOKIE_JAR]
    for k, v in headers.items():
        cmd += ["-H", f"{k}: {v}"]
    cmd += [url, "-d", body]
    result = subprocess.run(cmd, capture_output=True, text=True)
    out = result.stdout
    if "\nHTTP_STATUS:" in out:
        body_part, status = out.rsplit("\nHTTP_STATUS:", 1)
        print(f"  HTTP {status.strip()}")
        return body_part, ts
    return out, ts

def post_encrypted(url, plain_body, bearer, save_cookies=False, send_cookies=False, retries=3):
    for attempt in range(retries):
        ts    = str(int(time.time() * 1000))
        plain = json.dumps(plain_body, separators=(",", ":"))
        wire  = json.dumps({"data": encrypt_body(plain, ts)})
        if attempt == 0:
            print(f"  plain: {plain}")
        else:
            print(f"  [retry {attempt}]")
        raw, _ = curl_post_json(url, wire, {
            "timestamp":     ts,
            "Param2":        "2.0.135",
            "Param1":        "",
            "Authorization": f"Bearer {bearer}",
        }, save_cookies=save_cookies, send_cookies=send_cookies)
        if "503\n" in raw or "404" in raw[:20] or raw.strip().startswith("<"):
            print(f"  Server error on attempt {attempt+1}, retrying in 3s ...")
            time.sleep(3)
            continue
        try:
            rj = json.loads(raw)
        except Exception:
            print("  RAW:", raw[:300])
            return None, ts
        if "data" in rj:
            dec = decrypt_response(rj["data"], ts)
            print(f"  decrypted: {dec}")
            try:
                return json.loads(dec), ts
            except Exception:
                return {"_raw": dec}, ts
        print("  response:", rj)
        return rj, ts
    print(f"  All {retries} attempts failed.")
    return None, ts


# ── Step 0: OAuth ──────────────────────────────────────────────────────────────
def fetch_token() -> str:
    print(">> Fetching OAuth token ...")
    raw = curl_post_form(OAUTH_URL, {
        "grant_type":    "client_credentials",
        "scope":         "napix",
        "client_id":     CLIENT_ID,
        "client_secret": CLIENT_SECRET,
    })
    try:
        token = json.loads(raw).get("access_token", "")
        if token:
            print(f"   Token: {token[:50]}...")
            return token
        print("   Response:", raw[:300])
    except Exception:
        print("   Raw:", raw[:300])
    return ""


# ── Step 1: Send OTP ───────────────────────────────────────────────────────────
def send_otp(mobile: str, bearer: str, event: str = "CTZ_SIG") -> tuple[int, str]:
    print(f"\n{'='*60}")
    print(f"  STEP 1 — Send OTP  mobile={mobile}  event={event}")
    print(f"{'='*60}")
    body = {"smsAlert": {"smsEvent": event, "smsMobile": mobile}}
    parsed, _ = post_encrypted(ALERT_BASE + SEND_OTP_EP, body, bearer)
    if not parsed:
        return 0, "ERROR"
    status = parsed.get("statusCode", "")
    sms_id = int(parsed.get("recordId", 0))
    print(f"  statusCode : {status}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    print(f"  smsId      : {sms_id}")
    return sms_id, status


# ── Step 2A: OTP verify (sign-in) → returns ctzRecordId ──────────────────────
def verify_otp(otp, sms_id, bearer):
    print(f"\n{'='*60}")
    print(f"  STEP 2 — Verify OTP (sign-in path)")
    print(f"{'='*60}")
    body = {"smsOtp": {"otpSmsId": sms_id, "otpVal": otp}}
    # Try alertsapi (per decompiled c26.g), then citizenapi (per .so string ordering)
    for base, label in [(ALERT_BASE, "alertsapi"), (CITIZEN_BASE, "citizenapi")]:
        print(f"  Trying {label}/validateOTPAlerts ...")
        parsed, _ = post_encrypted(base + VERIFY_OTP_EP, body, bearer, save_cookies=True, retries=2)
        if parsed:
            print(f"  statusCode : {parsed.get('statusCode', '')}")
            print(f"  statusDesc : {parsed.get('statusDesc', '')}")
            user = parsed.get("mparCitizenUser", {})
            if user:
                print(f"  ctzRecordId: {user.get('ctzRecordId', '')}")
            return parsed
    return None


# ── Step 2B: Register (new account) → validateOTPAlerts with full body ────────
def register_user(otp: str, sms_id: int, mobile: str, bearer: str,
                  name: str = "", email: str = "", mpin: str = "", state: str = "") -> dict | None:
    if not name:
        name  = input("\n   Full name      : ").strip()
        email = input("   Email          : ").strip()
        mpin  = input("   MPIN (6 digits): ").strip()
        state = input("   State (WB/DL/MH): ").strip().upper()

    print(f"\n{'='*60}")
    print(f"  STEP 2 — Register (alertsapi/validateOTPAlerts)")
    print(f"{'='*60}")

    # Body confirmed from mt6.a.z() in decompiled APK
    body = {
        "mparCitizenDevice": {
            "deviceModel":     "Samsung SM-G991B",
            "deviceOsType":    "Android",
            "deviceOsVersion": "walleye",          # Build.DEVICE in app (codename, not version)
            "deviceFcmToken":  "",
            "deviceId":        "a1b2c3d4e5f6a7b8",
        },
        "smsOtp": {
            "otpSmsId": sms_id,
            "otpVal":   otp,
        },
        "mparCitizenUser": {
            "ctzMobile":     mobile,
            "ctzDispName":   name,
            "ctzEmail":      email,
            "ctzMpin":       mpin,
            "ctzMpinStatus": len(mpin) >= 6,
            "ctzStateCd":    state,
        },
    }
    for base, label in [(ALERT_BASE, "alertsapi"), (CITIZEN_BASE, "citizenapi")]:
        print(f"  Trying {label}/validateOTPAlerts ...")
        parsed, _ = post_encrypted(base + VERIFY_OTP_EP, body, bearer, save_cookies=True, retries=2)
        if parsed:
            print(f"  statusCode : {parsed.get('statusCode', '')}")
            print(f"  statusDesc : {parsed.get('statusDesc', '')}")
            user = parsed.get("mparCitizenUser", {})
            if user:
                print(f"  ctzRecordId: {user.get('ctzRecordId', '')}")
            return parsed
    return None


# ── Step 3: Establish session (getUserLoginToken) ──────────────────────────────
def establish_session(citizen_id: int, mobile: str, mpin: str, bearer: str) -> dict | None:
    print(f"\n{'='*60}")
    print(f"  STEP 3 — Establish session (citizenapi/getUserLoginToken)")
    print(f"{'='*60}")

    # Body confirmed from mt6.a.F() in decompiled APK
    body = {
        "mparCitizenDevice": {
            "deviceFcmToken": "",
        },
        "citizenLogin": {
            "ctzRecordId": citizen_id,
            "ctzMobile":   mobile,
            "ctzDeviceId": "a1b2c3d4e5f6a7b8",
            "deviceModel": "Samsung SM-G991B",
        },
        "mparCitizenUser": {
            "ctzMpin": mpin,
        },
    }
    parsed, _ = post_encrypted(CITIZEN_BASE + LOGIN_EP, body, bearer, send_cookies=True, save_cookies=True)
    if not parsed:
        return None
    print(f"  statusCode : {parsed.get('statusCode', '')}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    return parsed


# ── RC vehicle lookup ──────────────────────────────────────────────────────────
def lookup_rc(rc: str, bearer: str, citizen_id: int) -> None:
    print(f"\n{'='*60}")
    print(f"  RC LOOKUP  : {rc}  citizenId={citizen_id}")
    print(f"{'='*60}")
    body = {
        "rcNumber": rc,
        "recordId": citizen_id,
        "did":      "a1b2c3d4e5f6a7b8",
        "mid":      "0000000000",
        "tid":      "",
    }
    ts    = str(int(time.time() * 1000))
    plain = json.dumps(body, separators=(",", ":"))
    wire  = json.dumps({"data": encrypt_body(plain, ts)})
    print(f"  plain: {plain}")
    raw, _ = curl_post_json(NRAPI_BASE + RC_LOOKUP_EP, wire, {
        "timestamp":     ts,
        "Param2":        "2.0.135",
        "Param1":        str(citizen_id),
        "Authorization": f"Bearer {bearer}",
    }, send_cookies=True)
    try:
        rj = json.loads(raw)
    except Exception:
        print("  RAW:", raw[:500])
        return
    if "data" in rj:
        print("  DECRYPTED:", decrypt_response(rj["data"], ts))
    else:
        print("  RESPONSE:", json.dumps(rj)[:500])


# ── main ───────────────────────────────────────────────────────────────────────
def main():
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    # --retry-signin <mobile> <smsId> <otp> <mpin>
    if sys.argv[1] == "--retry-signin":
        mobile = sys.argv[2]
        sms_id = int(sys.argv[3])
        otp    = sys.argv[4]
        mpin   = sys.argv[5] if len(sys.argv) > 5 else ""
        bearer = fetch_token()
        if not bearer:
            sys.exit(1)
        parsed = verify_otp(otp, sms_id, bearer)
        if parsed and parsed.get("statusCode") == "AL001":
            user = parsed.get("mparCitizenUser", {})
            cid  = user.get("ctzRecordId", 0)
            if cid:
                print(f"\n  SUCCESS — citizenId = {cid}")
                if not mpin:
                    mpin = input("  Enter MPIN for session: ").strip()
                _do_session_and_lookup(cid, mobile, mpin, bearer)
        else:
            print(f"\n  Failed: {parsed}")
        sys.exit(0)

    # --retry <mobile> <smsId> <otp> [name] [email] [mpin] [state]
    if sys.argv[1] == "--retry":
        mobile = sys.argv[2]
        sms_id = int(sys.argv[3])
        otp    = sys.argv[4]
        name   = sys.argv[5] if len(sys.argv) > 5 else "Akash Chauhan"
        email  = sys.argv[6] if len(sys.argv) > 6 else "akash.chauhan.web@gmail.com"
        mpin   = sys.argv[7] if len(sys.argv) > 7 else "988663"
        state  = sys.argv[8] if len(sys.argv) > 8 else "WB"
        bearer = fetch_token()
        if not bearer:
            sys.exit(1)
        parsed = register_user(otp, sms_id, mobile, bearer,
                               name=name, email=email, mpin=mpin, state=state)
        if parsed:
            user = parsed.get("mparCitizenUser", {})
            cid  = user.get("ctzRecordId", 0)
            if cid:
                print(f"\n  SUCCESS — citizenId = {cid}")
                _do_session_and_lookup(cid, mobile, mpin, bearer)
        sys.exit(0)

    # --lookup <rc> <citizenId>
    if sys.argv[1] == "--lookup":
        rc  = sys.argv[2] if len(sys.argv) > 2 else "WB74AN9717"
        cid = int(sys.argv[3]) if len(sys.argv) > 3 else 1
        bearer = fetch_token()
        if bearer:
            lookup_rc(rc, bearer, cid)
        sys.exit(0)

    mobile = sys.argv[1]
    bearer = sys.argv[2] if len(sys.argv) > 2 else ""
    event  = sys.argv[3] if len(sys.argv) > 3 else "CTZ_SIG"

    if not bearer:
        bearer = fetch_token()
        if not bearer:
            print("ERROR: could not obtain OAuth token")
            sys.exit(1)

    sms_id, status = send_otp(mobile, bearer, event)
    if status != "AL001":
        print(f"\nERROR: OTP send failed ({status}).")
        sys.exit(1)

    print(f"\n>> OTP sent to {mobile}. Check your SMS.")
    otp = input(">> Enter OTP: ").strip()

    name = email = mpin = state = ""

    if event == "CTZ_REG":
        print("\n  Enter registration details:")
        name  = input("   Full name      : ").strip()
        email = input("   Email          : ").strip()
        mpin  = input("   MPIN (6 digits): ").strip()
        state = input("   State (WB/DL/MH): ").strip().upper()
        parsed = register_user(otp, sms_id, mobile, bearer,
                               name=name, email=email, mpin=mpin, state=state)
    else:
        parsed = verify_otp(otp, sms_id, bearer)

    if not parsed:
        print("\nNo response from server.")
        sys.exit(1)

    status_code = parsed.get("statusCode", "")
    if status_code != "AL001":
        print(f"\nFailed: {status_code} — {parsed.get('statusDesc', '')}")
        sys.exit(1)

    user       = parsed.get("mparCitizenUser", {})
    citizen_id = user.get("ctzRecordId", 0)

    if not citizen_id:
        print("\nCould not extract ctzRecordId from response.")
        sys.exit(1)

    print(f"\n  ctzRecordId = {citizen_id}")

    if not mpin:
        mpin = input("\n  Enter MPIN for session (needed for RC lookup): ").strip()

    _do_session_and_lookup(citizen_id, mobile, mpin, bearer)


def _do_session_and_lookup(citizen_id: int, mobile: str, mpin: str, bearer: str):
    sess = establish_session(citizen_id, mobile, mpin, bearer)
    if not sess:
        print("Session establishment failed — RC lookup may not work.")

    rc = input("\n  RC number to look up (Enter to skip): ").strip()
    if rc:
        lookup_rc(rc, bearer, citizen_id)
    else:
        print(f"\n{'='*60}")
        print(f"  citizenId = {citizen_id}")
        print(f"  Bearer    = {bearer[:60]}...")
        print(f"{'='*60}")
        print(f"\n  python3 register.py --lookup WB74AN9717 {citizen_id}")


if __name__ == "__main__":
    main()
