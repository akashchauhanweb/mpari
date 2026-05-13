package com.zepto;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vk2 {
    public static byte[] a(String str, SecretKey secretKey, byte[] bArr, Provider provider) throws f33 {
        Mac macC = c(str, secretKey, provider);
        macC.update(bArr);
        return macC.doFinal();
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, Provider provider) {
        return a(secretKey.getAlgorithm(), secretKey, bArr, provider);
    }

    public static Mac c(String str, SecretKey secretKey, Provider provider) throws f33 {
        try {
            Mac mac = provider != null ? Mac.getInstance(str, provider) : Mac.getInstance(str);
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e) {
            throw new f33("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new f33("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }
}
