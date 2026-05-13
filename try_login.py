#!/usr/bin/env python3
"""
mParivahan — citizen registration/sign-in simulator.

Simulates the exact API flow from the decompiled APK to obtain a valid
citizenId (ctzRecordId) needed as Param1 header and recordId body field
in nrapi / echallan calls.

Flow A — existing user (sign-in):
    1. Send OTP  → alertsapi/service/forwardOTPAlerts  (CTZ_SIG event)
    2. Verify OTP → alertsapi/service/validateOTPAlerts
    3. Extract ctzRecordId from OtpVerifyResult.mparCitizenUser

Flow B — new user (registration, adds user profile):
    1. Send OTP  → alertsapi/service/forwardOTPAlerts  (CTZ_SIG event)
    2. Register  → citizenapi/service/getUserLoginToken
       (OTP + name / email / mpin / state in one call)
    3. Extract ctzRecordId from response

Usage:
    python3 try_login.py <MOBILE_NUMBER>            # sign-in (existing account)
    python3 try_login.py <MOBILE_NUMBER> --register  # registration (new account)
    python3 try_login.py <MOBILE_NUMBER> <TOKEN>    # reuse OAuth token
"""

import base64
import json
import ssl
import sys
import time
import warnings

from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

try:
    import requests
    from requests.adapters import HTTPAdapter
    import urllib3
    urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

    class _TLSAdapter(HTTPAdapter):
        """Force TLS 1.2 + permissive cipher list to match Android OkHttp."""
        def init_poolmanager(self, *a, **kw):
            ctx = ssl.SSLContext(ssl.PROTOCOL_TLS_CLIENT)
            ctx.check_hostname = False
            ctx.verify_mode = ssl.CERT_NONE
            ctx.minimum_version = ssl.TLSVersion.TLSv1_2
            ctx.maximum_version = ssl.TLSVersion.TLSv1_2
            ctx.set_ciphers(
                "ECDH+AESGCM:DH+AESGCM:ECDH+AES256:DH+AES256:"
                "ECDH+AES128:DH+AES:RSA+AESGCM:RSA+AES:!aNULL:!MD5:!DSS"
            )
            kw["ssl_context"] = ctx
            super().init_poolmanager(*a, **kw)

    _SESSION = requests.Session()
    _SESSION.mount("https://", _TLSAdapter())
    HAS_REQUESTS = True
except ImportError:
    HAS_REQUESTS = False
    _SESSION = None

# ── endpoints ────────────────────────────────────────────────────────────────
OAUTH_URL     = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
ALERT_BASE    = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/alertsapi/"
CITIZEN_BASE  = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/citizenapi/"
SEND_OTP_EP   = "service/forwardOTPAlerts"       # SendSmsAlert() native
VERIFY_OTP_EP = "service/validateOTPAlerts"      # VerifySMSOtp() native
LOGIN_EP      = "service/getUserLoginToken"      # UserLogin() native

# ── OAuth credentials (from libsystem-arch.so) ────────────────────────────────
CLIENT_ID     = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET = "de83eeeb148878ae375f28756492e8a0"

# ── AES-128/ECB/PKCS7 + double Base64  (same as call.py / try_verifyrc.py) ──
PAYMENT_SUFFIX = "!~)#@*&^"   # getPayment() native

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

# ── OAuth ─────────────────────────────────────────────────────────────────────
def fetch_token() -> str:
    print(">> Fetching OAuth Bearer token ...")
    resp = _SESSION.post(OAUTH_URL, data={
        "grant_type":    "client_credentials",
        "scope":         "napix",
        "client_id":     CLIENT_ID,
        "client_secret": CLIENT_SECRET,
    }, timeout=15, verify=False)
    print(f"   HTTP {resp.status_code}")
    try:
        token = resp.json().get("access_token", "")
        if token:
            print(f"   Token: {token[:50]}...")
            return token
        print("   Response:", resp.text[:300])
    except Exception:
        print("   Raw:", resp.text[:300])
    return ""

# ── generic signed POST ───────────────────────────────────────────────────────
def signed_post(url: str, plain_body: dict, bearer: str) -> tuple[dict | None, str]:
    """Encrypts body, POSTs with timestamp header, returns (response_json, ts)."""
    ts = str(int(time.time() * 1000))
    plain = json.dumps(plain_body, separators=(",", ":"))
    wire  = json.dumps({"data": encrypt_body(plain, ts)})
    headers = {
        "Content-Type":   "application/json",
        "Accept":         "application/json",
        "timestamp":      ts,
        "Param2":         "2.0.135",
        "Param1":         "",
        "Authorization":  f"Bearer {bearer}",
        "X-Forwarded-For": "49.36.128.100",
        "X-Real-IP":      "49.36.128.100",
    }
    print(f"   POST {url}")
    print(f"   plain body: {plain}")
    resp = _SESSION.post(url, headers=headers, data=wire, timeout=15, verify=False)
    print(f"   HTTP {resp.status_code}")
    try:
        return resp.json(), ts
    except Exception:
        print("   Raw:", resp.text[:300])
        return None, ts

def decode_response(rj: dict | None, ts: str, label: str) -> dict | None:
    if not rj:
        return None
    if "data" in rj:
        plaintext = decrypt_response(rj["data"], ts)
        print(f"   {label} decrypted: {plaintext}")
        try:
            return json.loads(plaintext)
        except Exception:
            return {"_raw": plaintext}
    print(f"   {label} (no data field):", rj)
    return rj

# ── Step 1: Send OTP ──────────────────────────────────────────────────────────
def send_otp(mobile: str, bearer: str, event: str = "CTZ_SIG") -> tuple[int, str]:
    """Returns (sms_id, statusCode).
    event = CTZ_SIG  → existing user sign-in  (q() in mt6)
    event = CTZ_REG  → new user registration   (p() in mt6)
    """
    print(f"\n{'='*60}")
    print(f"  STEP 1 — Send OTP to {mobile}  (event={event})")
    print(f"{'='*60}")
    body = {"smsAlert": {"smsEvent": event, "smsMobile": mobile}}
    rj, ts = signed_post(ALERT_BASE + SEND_OTP_EP, body, bearer)
    parsed = decode_response(rj, ts, "SendOTP")
    if not parsed:
        return 0, "ERROR"
    status = parsed.get("statusCode", "")
    sms_id = int(parsed.get("recordId", 0))
    print(f"\n   statusCode : {status}")
    print(f"   statusDesc : {parsed.get('statusDesc', '')}")
    print(f"   smsId      : {sms_id}")
    return sms_id, status

# ── Step 2A: Verify OTP (sign-in path) ───────────────────────────────────────
def verify_otp(otp: str, sms_id: int, bearer: str) -> dict | None:
    print(f"\n{'='*60}")
    print(f"  STEP 2A — Verify OTP (sign-in path)")
    print(f"{'='*60}")
    body = {"smsOtp": {"otpSmsId": sms_id, "otpVal": otp}}
    rj, ts = signed_post(ALERT_BASE + VERIFY_OTP_EP, body, bearer)
    parsed = decode_response(rj, ts, "VerifyOTP")
    if not parsed:
        return None
    print(f"\n   statusCode : {parsed.get('statusCode', '')}")
    print(f"   statusDesc : {parsed.get('statusDesc', '')}")
    user = parsed.get("mparCitizenUser", {})
    if user:
        print(f"   ctzRecordId: {user.get('ctzRecordId', '')}")
        print(f"   ctzMobile  : {user.get('ctzMobile', '')}")
    return parsed

# ── Step 2B: Register (new-user path) ────────────────────────────────────────
def register_user(otp: str, sms_id: int, mobile: str, bearer: str) -> dict | None:
    print(f"\n{'='*60}")
    print(f"  STEP 2B — Register new citizen account")
    print(f"{'='*60}")
    name   = input("   Full name   : ").strip()
    email  = input("   Email       : ").strip()
    mpin   = input("   MPIN (6 digits): ").strip()
    state  = input("   State code  (e.g. DL, WB, MH): ").strip().upper()
    body = {
        "mparCitizenDevice": {
            "deviceModel":     "Python-Simulator",
            "deviceOsType":    "Android",
            "deviceOsVersion": "14",
            "deviceFcmToken":  "0000000000000000",
            "deviceId":        "0000000000000000",
        },
        "smsOtp": {
            "otpSmsId": sms_id,
            "otpVal":   otp,
        },
        "mparCitizenUser": {
            "ctzMobile":      mobile,
            "ctzDispName":    name,
            "ctzEmail":       email,
            "ctzMpin":        mpin,
            "ctzMpinStatus":  True,
            "ctzStateCd":     state,
        },
    }
    rj, ts = signed_post(CITIZEN_BASE + LOGIN_EP, body, bearer)
    parsed = decode_response(rj, ts, "Register")
    if not parsed:
        return None
    print(f"\n   statusCode : {parsed.get('statusCode', '')}")
    print(f"   statusDesc : {parsed.get('statusDesc', '')}")
    user = parsed.get("mparCitizenUser", {})
    if user:
        print(f"   ctzRecordId: {user.get('ctzRecordId', '')}")
    return parsed

# ── main ──────────────────────────────────────────────────────────────────────
def main():
    args = sys.argv[1:]
    register_mode = "--register" in args
    args = [a for a in args if a != "--register"]

    if not args:
        print(__doc__)
        sys.exit(1)

    mobile = args[0]
    bearer = args[1] if len(args) > 1 else ""

    if not HAS_REQUESTS:
        print("ERROR: install requests → pip install requests pycryptodome")
        sys.exit(1)

    if not bearer:
        bearer = fetch_token()
        if not bearer:
            print("ERROR: could not obtain OAuth token")
            sys.exit(1)

    otp_event = "CTZ_REG" if register_mode else "CTZ_SIG"
    sms_id, status = send_otp(mobile, bearer, event=otp_event)
    if status != "AL001":
        print(f"\nERROR: OTP send failed ({status}).")
        if not register_mode:
            print("If this mobile number is not yet registered, re-run with --register")
        sys.exit(1)

    print(f"\n>> OTP sent to {mobile}. Check your SMS.")
    otp = input(">> Enter OTP: ").strip()

    citizen_id = 0

    if register_mode:
        parsed = register_user(otp, sms_id, mobile, bearer)
        if parsed:
            user = parsed.get("mparCitizenUser", {})
            citizen_id = user.get("ctzRecordId", 0)
    else:
        parsed = verify_otp(otp, sms_id, bearer)
        if parsed and parsed.get("statusCode") == "AL001":
            user = parsed.get("mparCitizenUser", {})
            citizen_id = user.get("ctzRecordId", 0)
        elif parsed:
            print(f"\nSign-in verify failed ({parsed.get('statusCode')}). "
                  "If this is a new account, re-run with --register.")

    if citizen_id:
        print(f"\n{'='*60}")
        print(f"  SUCCESS — citizenId = {citizen_id}")
        print(f"  Bearer  = {bearer[:50]}...")
        print(f"{'='*60}")
        print(f"\nNow look up a vehicle:")
        print(f"  python3 call.py WB74AN9717 '{bearer}' {citizen_id}")
    else:
        print("\nCould not extract citizenId from response.")

if __name__ == "__main__":
    main()
