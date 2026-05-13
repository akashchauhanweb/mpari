#!/usr/bin/env python3
"""
Send mParivahan OTP via Tor (Indian exit node) to bypass datacenter IP block.

Prerequisites on EC2:
    sudo apt install tor -y
    echo -e 'ExitNodes {in}\nStrictNodes 1' | sudo tee -a /etc/tor/torrc
    sudo systemctl restart tor
    pip install requests[socks] pycryptodome

Usage:
    python3 otp_via_tor.py <MOBILE>               # registration (new account)
    python3 otp_via_tor.py <MOBILE> <BEARER>      # skip OAuth fetch
    python3 otp_via_tor.py <MOBILE> <BEARER> --signin  # existing account
"""

import base64
import json
import sys
import time

from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

try:
    import requests
    import urllib3
    urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
    HAS_REQUESTS = True
except ImportError:
    HAS_REQUESTS = False

OAUTH_URL     = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
ALERT_BASE    = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/alertsapi/"
CITIZEN_BASE  = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/citizenapi/"
SEND_OTP_EP   = "service/forwardOTPAlerts"
VERIFY_OTP_EP = "service/validateOTPAlerts"
LOGIN_EP      = "service/getUserLoginToken"
CLIENT_ID     = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET = "de83eeeb148878ae375f28756492e8a0"
PAYMENT_SUFFIX = "!~)#@*&^"

TOR_PROXY = {"http": "socks5h://127.0.0.1:9050", "https": "socks5h://127.0.0.1:9050"}

# Set this to your Cloudflare Worker URL to use CF instead of Tor
CF_WORKER_URL = ""   # e.g. "https://my-proxy.yourname.workers.dev"


def derive_key(ts: str) -> bytes:
    rev  = ts[::-1]
    part = rev[:4] + rev[len(rev) - 4:]
    return (part + PAYMENT_SUFFIX).encode()

def encrypt_body(plain: str, ts: str) -> str:
    ct = AES.new(derive_key(ts), AES.MODE_ECB).encrypt(pad(plain.encode(), 16))
    return base64.b64encode(base64.b64encode(ct)).decode()

def decrypt_response(data_b64: str, ts: str) -> str:
    try:
        ct = base64.b64decode(base64.b64decode(data_b64))
        pt = unpad(AES.new(derive_key(ts), AES.MODE_ECB).decrypt(ct), 16)
        return pt.decode()
    except Exception as e:
        return f"<decryption failed: {e}>"


def _post(url: str, plain_body: dict, bearer: str, via_tor: bool = False) -> tuple[dict | None, str]:
    ts    = str(int(time.time() * 1000))
    plain = json.dumps(plain_body, separators=(",", ":"))
    wire  = json.dumps({"data": encrypt_body(plain, ts)})
    headers = {
        "Content-Type":  "application/json",
        "Accept":        "application/json",
        "timestamp":     ts,
        "Param2":        "2.0.135",
        "Param1":        "",
        "Authorization": f"Bearer {bearer}",
    }
    print(f"   POST {url}  {'[via Tor/curl]' if via_tor else '[direct]'}")
    print(f"   plain: {plain}")

    if via_tor:
        import subprocess
        if CF_WORKER_URL:
            # Route through Cloudflare Worker (preferred — not in Tor blocklist)
            cmd = [
                "curl", "-s", "--max-time", "30",
                "-X", "POST", CF_WORKER_URL,
                "-H", f"X-Target-URL: {url}",
                "-H", f"Content-Type: application/json",
                "-H", f"Accept: application/json",
                "-H", f"timestamp: {ts}",
                "-H", f"Param2: 2.0.135",
                "-H", f"Param1: ",
                "-H", f"X-Forwarded-Auth: Bearer {bearer}",
                "-d", wire,
            ]
            label = "CF Worker"
        else:
            # Fall back to Tor SOCKS5
            cmd = [
                "curl", "-s", "-k", "--max-time", "60",
                "--socks5-hostname", "127.0.0.1:9050",
                "-X", "POST", url,
                "-H", f"Content-Type: application/json",
                "-H", f"Accept: application/json",
                "-H", f"timestamp: {ts}",
                "-H", f"Param2: 2.0.135",
                "-H", f"Param1: ",
                "-H", f"Authorization: Bearer {bearer}",
                "-d", wire,
            ]
            label = "Tor"
        try:
            result = subprocess.run(cmd, capture_output=True, text=True, timeout=65)
            raw = result.stdout
            print(f"   curl [{label}] exit={result.returncode}  response: {raw[:200]}")
            return json.loads(raw), ts
        except Exception as e:
            print(f"   ERROR (curl/{label}): {e}")
            return None, ts

    try:
        resp = requests.post(url, headers=headers, data=wire,
                             timeout=30, verify=False)
        print(f"   HTTP {resp.status_code}")
        return resp.json(), ts
    except Exception as e:
        print(f"   ERROR: {e}")
        return None, ts


def _decode(rj: dict | None, ts: str, label: str) -> dict | None:
    if not rj:
        return None
    if "data" in rj:
        dec = decrypt_response(rj["data"], ts)
        print(f"   {label} decrypted: {dec}")
        try:
            return json.loads(dec)
        except Exception:
            return {"_raw": dec}
    print(f"   {label} raw:", rj)
    return rj


def fetch_token_direct() -> str:
    """OAuth fetch goes direct (EC2 IP works fine for this)."""
    print(">> Fetching OAuth token (direct) ...")
    try:
        resp = requests.post(OAUTH_URL, data={
            "grant_type":    "client_credentials",
            "scope":         "napix",
            "client_id":     CLIENT_ID,
            "client_secret": CLIENT_SECRET,
        }, timeout=15, verify=False)
        print(f"   HTTP {resp.status_code}")
        token = resp.json().get("access_token", "")
        if token:
            print(f"   Token: {token[:50]}...")
            return token
        print("   Response:", resp.text[:300])
    except Exception as e:
        print(f"   ERROR: {e}")
    return ""


def send_otp(mobile: str, bearer: str, event: str) -> tuple[int, str]:
    print(f"\n{'='*60}")
    print(f"  STEP 1 — Send OTP  mobile={mobile}  event={event}")
    print(f"{'='*60}")
    rj, ts = _post(ALERT_BASE + SEND_OTP_EP,
                   {"smsAlert": {"smsEvent": event, "smsMobile": mobile}},
                   bearer, via_tor=True)
    parsed = _decode(rj, ts, "SendOTP")
    if not parsed:
        return 0, "ERROR"
    status = parsed.get("statusCode", "")
    sms_id = int(parsed.get("recordId", 0))
    print(f"\n  statusCode : {status}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    print(f"  smsId      : {sms_id}")
    return sms_id, status


def verify_otp(otp: str, sms_id: int, bearer: str) -> dict | None:
    print(f"\n{'='*60}")
    print(f"  STEP 2A — Verify OTP (sign-in)")
    print(f"{'='*60}")
    rj, ts = _post(ALERT_BASE + VERIFY_OTP_EP,
                   {"smsOtp": {"otpSmsId": sms_id, "otpVal": otp}},
                   bearer)
    parsed = _decode(rj, ts, "VerifyOTP")
    if not parsed:
        return None
    print(f"\n  statusCode : {parsed.get('statusCode', '')}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    user = parsed.get("mparCitizenUser", {})
    if user:
        print(f"  ctzRecordId: {user.get('ctzRecordId', '')}")
    return parsed


def register_user(otp: str, sms_id: int, mobile: str, bearer: str) -> dict | None:
    print(f"\n{'='*60}")
    print(f"  STEP 2B — Register new citizen account")
    print(f"{'='*60}")
    name  = input("   Full name        : ").strip()
    email = input("   Email            : ").strip()
    mpin  = input("   MPIN (6 digits)  : ").strip()
    state = input("   State code (e.g. DL/MH/WB/KA): ").strip().upper()
    body  = {
        "mparCitizenDevice": {
            "deviceModel": "Python-Simulator", "deviceOsType": "Android",
            "deviceOsVersion": "14", "deviceFcmToken": "0000000000000000",
            "deviceId": "0000000000000000",
        },
        "smsOtp": {"otpSmsId": sms_id, "otpVal": otp},
        "mparCitizenUser": {
            "ctzMobile": mobile, "ctzDispName": name, "ctzEmail": email,
            "ctzMpin": mpin, "ctzMpinStatus": True, "ctzStateCd": state,
        },
    }
    rj, ts = _post(CITIZEN_BASE + LOGIN_EP, body, bearer)
    parsed = _decode(rj, ts, "Register")
    if not parsed:
        return None
    print(f"\n  statusCode : {parsed.get('statusCode', '')}")
    print(f"  statusDesc : {parsed.get('statusDesc', '')}")
    user = parsed.get("mparCitizenUser", {})
    if user:
        print(f"  ctzRecordId: {user.get('ctzRecordId', '')}")
    return parsed


def main():
    if not HAS_REQUESTS:
        print("ERROR: pip install requests[socks] pycryptodome")
        sys.exit(1)

    args        = sys.argv[1:]
    signin_mode = "--signin" in args
    args        = [a for a in args if a != "--signin"]

    if not args:
        print(__doc__)
        sys.exit(1)

    mobile = args[0]
    bearer = args[1] if len(args) > 1 else ""

    if not bearer:
        bearer = fetch_token_direct()
        if not bearer:
            print("ERROR: could not fetch OAuth token")
            sys.exit(1)

    event = "CTZ_SIG" if signin_mode else "CTZ_REG"
    sms_id, status = send_otp(mobile, bearer, event)

    if status != "AL001":
        print(f"\nERROR: OTP send failed ({status}).")
        print("Make sure Tor is running:  sudo systemctl status tor")
        print("And torrc has:  ExitNodes {in}  StrictNodes 1")
        sys.exit(1)

    print(f"\n>> OTP sent to {mobile}.  Check your SMS.")
    otp = input(">> Enter OTP: ").strip()

    citizen_id = 0
    if signin_mode:
        parsed = verify_otp(otp, sms_id, bearer)
        if parsed and parsed.get("statusCode") == "AL001":
            citizen_id = parsed.get("mparCitizenUser", {}).get("ctzRecordId", 0)
    else:
        parsed = register_user(otp, sms_id, mobile, bearer)
        if parsed:
            citizen_id = parsed.get("mparCitizenUser", {}).get("ctzRecordId", 0)

    if citizen_id:
        print(f"\n{'='*60}")
        print(f"  SUCCESS — citizenId = {citizen_id}")
        print(f"  Bearer  = {bearer[:60]}...")
        print(f"{'='*60}")
        print(f"\nNow look up the vehicle:")
        print(f"  python3 call.py WB74AN9717 '{bearer}' {citizen_id}")
    else:
        print("\nCould not extract citizenId.")


if __name__ == "__main__":
    main()
