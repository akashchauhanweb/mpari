#!/usr/bin/env python3
"""
mParivahan — vehicle number lookup call simulator.
Usage:  python3 call.py <RC_NUMBER> [bearer_token]
"""

import base64
import json
import time
import sys

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

# ── constants from libsystem-arch.so ────────────────────────────────────────
BASE_URL       = "https://delhigw.napix.gov.in/nic/parivahan/mparivahan/nrapi/"
ENDPOINT       = "service/getSearchDocDetails"
PAYMENT_SUFFIX = "!~)#@*&^"   # getPayment() @ offset 0x162f6

# ── key derivation (getResUrl + getPayment) ──────────────────────────────────
def derive_key(ts: str) -> bytes:
    rev  = ts[::-1]
    part = rev[:4] + rev[len(rev) - 4:]
    return (part + PAYMENT_SUFFIX).encode("utf-8")   # 16 bytes → AES-128

# ── AES-128/ECB/PKCS7 + double Base64 (tu5.a.b) ─────────────────────────────
def encrypt_body(plain: str, ts: str) -> str:
    ct    = AES.new(derive_key(ts), AES.MODE_ECB).encrypt(pad(plain.encode(), 16))
    b64_1 = base64.b64encode(ct)
    b64_2 = base64.b64encode(b64_1)
    return b64_2.decode()

def decrypt_response(data_b64: str, ts: str) -> str:
    try:
        inner = base64.b64decode(data_b64)
        ct    = base64.b64decode(inner)
        pt    = unpad(AES.new(derive_key(ts), AES.MODE_ECB).decrypt(ct), 16)
        return pt.decode("utf-8")
    except Exception as e:
        return f"<decryption failed: {e}>"

# ── build request ────────────────────────────────────────────────────────────
def build_request(rc_number, bearer_token="", citizen_id=""):
    ts = str(int(time.time() * 1000))

    plain = json.dumps({
        "rcNumber": rc_number,
        "recordId": int(citizen_id) if citizen_id else 1,
        "did":      "0000000000000000",
        "mid":      "0000000000",
        "tid":      "",
    }, separators=(",", ":"))

    wire_body = json.dumps({"data": encrypt_body(plain, ts)})

    headers = {
        "Content-Type":  "application/json",
        "Accept":        "application/json",
        "timestamp":     ts,
        "Param2":        "2.0.135",   # app version (tz.java interceptor)
        "Param1":        str(citizen_id) if citizen_id else "",
    }
    if bearer_token:
        headers["Authorization"] = f"Bearer {bearer_token}"

    return BASE_URL + ENDPOINT, headers, wire_body, plain, derive_key(ts).decode()


if __name__ == "__main__":
    rc          = sys.argv[1] if len(sys.argv) > 1 else "WB74AN9717"
    token       = sys.argv[2] if len(sys.argv) > 2 else ""
    citizen_id  = sys.argv[3] if len(sys.argv) > 3 else ""

    url, headers, body, plain, key = build_request(rc, token, citizen_id)

    print(f"\n{'='*55}")
    print(f"  RC NUMBER   : {rc}")
    print(f"  CITIZEN ID  : {citizen_id or '(not set — will use 1)'}")
    print(f"  ENDPOINT    : {url}")
    print(f"  AES KEY     : {key}")
    print(f"  PLAIN BODY  : {plain}")
    print(f"{'='*55}\n")

    if HAS_REQUESTS:
        print(">> Firing request ...\n")
        try:
            resp = _SESSION.post(url, headers=headers, data=body, timeout=15, verify=False)
            print(f"HTTP {resp.status_code}")
            print()
            try:
                rj = resp.json()
                print("Encrypted response:", json.dumps(rj, indent=2))
                if "data" in rj:
                    print()
                    print("DECRYPTED:", decrypt_response(rj["data"], headers["timestamp"]))
            except Exception:
                print("Raw response:", resp.text)
        except requests.exceptions.Timeout:
            print("ERROR: Request timed out (server unreachable or geo-blocked)")
        except Exception as e:
            print(f"ERROR: {e}")
    else:
        print("(requests not installed — paste the curl below)\n")
        print(f"curl -X POST '{url}' \\")
        for k, v in headers.items():
            print(f"  -H '{k}: {v}' \\")
        print(f"  -d '{body}'")
