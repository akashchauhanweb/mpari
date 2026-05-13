package com.zepto;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class xu0 {
    public final SecretKey a;
    public final SecretKey b;
    public final SecretKey c;
    public final int d;

    public xu0(SecretKey secretKey) throws i63 {
        this.a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.c = new SecretKeySpec(encoded, 16, 16, "AES");
            this.d = 16;
        } else if (encoded.length == 48) {
            this.b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.c = new SecretKeySpec(encoded, 24, 24, "AES");
            this.d = 24;
        } else {
            if (encoded.length != 64) {
                throw new i63("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
            }
            this.b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.c = new SecretKeySpec(encoded, 32, 32, "AES");
            this.d = 32;
        }
    }

    public SecretKey a() {
        return this.c;
    }

    public SecretKey b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }
}
