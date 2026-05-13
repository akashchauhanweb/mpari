package com.zepto;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t31 {
    public static SecretKey a(char[] cArr, byte[] bArr) {
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(cArr, bArr, 65536, 256)).getEncoded(), "AES");
    }
}
