#!/usr/bin/env python3
"""
Probe all known nrapi endpoints with zero/dummy citizenId to characterise
which ones require a real citizenId and what errors they return.

Endpoints (all at nrapi base https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/):
  service/getSearchDocDetails  — main RC vehicle lookup (call.py)
  service/verifyRC             — citizen violation-reporting flow (of4.java, hardcoded)
  service/vindicateRc          — RC owner self-validate (ValidateRC() native, s45.j)

Body (exact per decompiled tf4.a.q / mt6.a bodies):
  { "rcNumber": <rc>, "recordId": <citizenId>, "did": <devId>, "mid": <mobile>, "tid": <token> }

Usage:
    python3 try_nrapi.py <RC_NUMBER>                       # auto-fetch token, dummy citizenId
    python3 try_nrapi.py <RC_NUMBER> <BEARER_TOKEN>        # reuse token
    python3 try_nrapi.py <RC_NUMBER> <BEARER_TOKEN> <CID>  # real citizenId
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
            ctx.maximum_version = ssl.TLSVersion.TLSv1_3
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

OAUTH_URL  = "https://delhigw.napix.gov.in/nic/parivahan/oauth2/token"
NRAPI_BASE = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/"
CLIENT_ID     = "b91c303443f61b37106750823881cd2f"
CLIENT_SECRET = "de83eeeb148878ae375f28756492e8a0"
PAYMENT_SUFFIX = "!~)#@*&^"

ENDPOINTS = [
    "service/getSearchDocDetails",  # main RC lookup
    "service/verifyRC",             # citizen violation reporting (of4.java)
    "service/vindicateRc",          # RC owner validate (ValidateRC() native)
]

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

def fetch_token() -> str:
    print(">> Fetching OAuth token ...")
    for attempt in range(3):
        try:
            resp = _SESSION.post(OAUTH_URL, data={
                "grant_type": "client_credentials", "scope": "napix",
                "client_id": CLIENT_ID, "client_secret": CLIENT_SECRET,
            }, timeout=15, verify=False)
            print(f"   HTTP {resp.status_code}")
            token = resp.json().get("access_token", "")
            if token:
                print(f"   Token: {token[:50]}...")
                return token
            print("   Response:", resp.text[:300])
            return ""
        except Exception as e:
            print(f"   Attempt {attempt+1} failed: {type(e).__name__}: {e}")
            if attempt < 2:
                import time as _t; _t.sleep(2)
    return ""

def probe(endpoint: str, rc: str, bearer: str, citizen_id: int):
    ts = str(int(time.time() * 1000))
    plain = json.dumps({
        "rcNumber": rc,
        "recordId": citizen_id,
        "did":      "0000000000000000",
        "mid":      "0000000000",
        "tid":      "",
    }, separators=(",", ":"))
    wire = json.dumps({"data": encrypt_body(plain, ts)})
    headers = {
        "Content-Type":  "application/json",
        "Accept":        "application/json",
        "timestamp":     ts,
        "Param2":        "2.0.135",
        "Param1":        str(citizen_id) if citizen_id else "",
        "Authorization": f"Bearer {bearer}",
    }
    url = NRAPI_BASE + endpoint
    print(f"\n{'='*60}")
    print(f"  ENDPOINT  : {endpoint}")
    print(f"  RC        : {rc}  citizenId={citizen_id}")
    print(f"  AES KEY   : {derive_key(ts).decode()}")
    print(f"  PLAIN     : {plain}")
    print(f"{'='*60}")
    try:
        resp = _SESSION.post(url, headers=headers, data=wire, timeout=15, verify=False)
        print(f"  HTTP {resp.status_code}")
        try:
            rj = resp.json()
            if "data" in rj:
                dec = decrypt_response(rj["data"], ts)
                print(f"  DECRYPTED : {dec}")
            else:
                print(f"  RESPONSE  : {json.dumps(rj)[:300]}")
        except Exception:
            print(f"  RAW       : {resp.text[:300]}")
    except Exception as e:
        print(f"  ERROR: {e}")


if __name__ == "__main__":
    if not HAS_REQUESTS:
        print("ERROR: pip install requests pycryptodome")
        sys.exit(1)

    rc         = sys.argv[1] if len(sys.argv) > 1 else "WB74AN9717"
    bearer     = sys.argv[2] if len(sys.argv) > 2 else ""
    citizen_id = int(sys.argv[3]) if len(sys.argv) > 3 else 1

    if not bearer:
        bearer = fetch_token()
        if not bearer:
            print("ERROR: could not obtain OAuth token")
            sys.exit(1)

    for ep in ENDPOINTS:
        probe(ep, rc, bearer, citizen_id)
