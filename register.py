#!/usr/bin/env python3
"""
mParivahan — citizen registration via curl subprocesses.

Uses Python only for AES encryption/decryption.
All HTTP calls go through `curl` so Python SSL is never involved.
Run this from your phone hotspot (Indian ISP IP) so the OTP send works.

Flow:
  1. Fetch OAuth Bearer token
  2. Send OTP (CTZ_REG event)  — needs Indian IP
  3. Register new citizen account with OTP + name/email/mpin/state
  4. Prints ctzRecordId (citizenId) on success

Usage:
    python3 register.py <MOBILE_NUMBER>
    python3 register.py <MOBILE_NUMBER> <BEARER_TOKEN>   # skip OAuth fetch
"""

import base64
import json
import subprocess
import sys
import time

from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

OAUTH_URL     = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
ALERT_BASE    = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/alertsapi/"
CITIZEN_BASE  = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/citizenapi/"
SEND_OTP_EP   = "service/forwardOTPAlerts"
LOGIN_EP      = "service/getUserLoginToken"
CLIENT_ID     = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET = "de83eeeb148878ae375f28756492e8a0"
PAYMENT_SUFFIX = "!~)#@*&^"


# ── AES-128/ECB/PKCS7 + double Base64 ────────────────────────────────────────
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


# ── curl helpers ──────────────────────────────────────────────────────────────
def curl_post_form(url: str, data: dict) -> str:
    cmd = ["curl", "-s", "-k", "--max-time", "15", "-X", "POST", url]
    for k, v in data.items():
        cmd += ["-d", f"{k}={v}"]
    result = subprocess.run(cmd, capture_output=True, text=True)
    if not result.stdout and result.stderr:
        print("   curl stderr:", result.stderr[:300])
    print("   curl exit:", result.returncode)
    return result.stdout

def curl_post_json(url: str, body: str, headers: dict) -> str:
    cmd = ["curl", "-s", "-k", "--max-time", "15", "-X", "POST", url,
           "-H", "Content-Type: application/json",
           "-H", "Accept: application/json",
           "-H", "User-Agent: okhttp/4.9.3"]
    for k, v in headers.items():
        cmd += ["-H", f"{k}: {v}"]
    cmd += ["-d", body]
    result = subprocess.run(cmd, capture_output=True, text=True)
    return result.stdout


# ── Step 0: OAuth token ───────────────────────────────────────────────────────
def fetch_token() -> str:
    print(">> Fetching OAuth Bearer token (curl) ...")
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


# ── Step 1: Send OTP (CTZ_REG) ────────────────────────────────────────────────
def send_otp_reg(mobile: str, bearer: str, event: str = "CTZ_REG") -> tuple[int, str]:
    ts    = str(int(time.time() * 1000))
    plain = json.dumps({"smsAlert": {"smsEvent": event, "smsMobile": mobile}},
                       separators=(",", ":"))
    wire  = json.dumps({"data": encrypt_body(plain, ts)})

    print(f"\n{'='*60}")
    print(f"  STEP 1 — Send OTP to {mobile}  (event={event})")
    print(f"  plain: {plain}")
    print(f"{'='*60}")

    raw = curl_post_json(ALERT_BASE + SEND_OTP_EP, wire, {
        "timestamp":     ts,
        "Param2":        "2.0.135",
        "Param1":        "",
        "Authorization": f"Bearer {bearer}",
    })
    try:
        rj = json.loads(raw)
    except Exception:
        print("  RAW:", raw[:300])
        return 0, "ERROR"

    if "data" in rj:
        dec = decrypt_response(rj["data"], ts)
        print(f"  Decrypted: {dec}")
        try:
            parsed = json.loads(dec)
        except Exception:
            return 0, "ERROR"
    else:
        print("  Response:", rj)
        return 0, "ERROR"

    status = parsed.get("statusCode", "")
    sms_id = int(parsed.get("recordId", 0))
    print(f"\n  statusCode : {status}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    print(f"  smsId      : {sms_id}")
    return sms_id, status


# ── Step 2: Register ──────────────────────────────────────────────────────────
def register_user(otp: str, sms_id: int, mobile: str, bearer: str) -> dict | None:
    name  = input("\n   Full name      : ").strip()
    email = input("   Email          : ").strip()
    mpin  = input("   MPIN (6 digits): ").strip()
    state = input("   State code (e.g. DL, WB, MH, KA): ").strip().upper()

    ts    = str(int(time.time() * 1000))
    plain = json.dumps({
        "mparCitizenDevice": {
            "deviceModel":     "Python-Simulator",
            "deviceOsType":    "Android",
            "deviceOsVersion": "14",
            "deviceFcmToken":  "0000000000000000",
            "deviceId":        "0000000000000000",
        },
        "smsOtp": {"otpSmsId": sms_id, "otpVal": otp},
        "mparCitizenUser": {
            "ctzMobile":     mobile,
            "ctzDispName":   name,
            "ctzEmail":      email,
            "ctzMpin":       mpin,
            "ctzMpinStatus": True,
            "ctzStateCd":    state,
        },
    }, separators=(",", ":"))
    wire  = json.dumps({"data": encrypt_body(plain, ts)})

    print(f"\n{'='*60}")
    print(f"  STEP 2 — Register account")
    print(f"{'='*60}")

    raw = curl_post_json(CITIZEN_BASE + LOGIN_EP, wire, {
        "timestamp":     ts,
        "Param2":        "2.0.135",
        "Param1":        "",
        "Authorization": f"Bearer {bearer}",
    })
    try:
        rj = json.loads(raw)
    except Exception:
        print("  RAW:", raw[:300])
        return None

    if "data" in rj:
        dec = decrypt_response(rj["data"], ts)
        print(f"  Decrypted: {dec}")
        try:
            return json.loads(dec)
        except Exception:
            return {"_raw": dec}
    print("  Response:", rj)
    return rj


# ── main ──────────────────────────────────────────────────────────────────────
def main():
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    mobile = sys.argv[1]
    bearer = sys.argv[2] if len(sys.argv) > 2 else ""
    event  = sys.argv[3] if len(sys.argv) > 3 else "CTZ_REG"

    if not bearer:
        bearer = fetch_token()
        if not bearer:
            print("ERROR: could not obtain OAuth token — check connectivity")
            sys.exit(1)

    sms_id, status = send_otp_reg(mobile, bearer, event)
    if status != "AL001":
        print(f"\nERROR: OTP send failed ({status}).")
        print("If running from EC2 try again from a phone hotspot / non-datacenter IP.")
        sys.exit(1)

    print(f"\n>> OTP sent to {mobile}. Check your SMS.")
    otp = input(">> Enter OTP: ").strip()

    parsed = register_user(otp, sms_id, mobile, bearer)
    if not parsed:
        print("\nNo response from registration endpoint.")
        sys.exit(1)

    print(f"\n  statusCode : {parsed.get('statusCode', '')}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    user = parsed.get("mparCitizenUser", {})
    citizen_id = user.get("ctzRecordId", 0)

    if citizen_id:
        print(f"\n{'='*60}")
        print(f"  SUCCESS — citizenId = {citizen_id}")
        print(f"  Bearer  = {bearer[:60]}...")
        print(f"{'='*60}")
        print(f"\nNow look up the vehicle from EC2:")
        print(f"  python3 call.py WB74AN9717 '{bearer}' {citizen_id}")
    else:
        print("\nCould not extract citizenId from response.")


if __name__ == "__main__":
    main()
