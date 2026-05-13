package com.zepto;

import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x35 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws f33 {
        try {
            Cipher cipherA = lk0.a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            cipherA.init(1, rSAPublicKey, new SecureRandom());
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new f33("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new f33(e2.getMessage(), e2);
        }
    }
}
