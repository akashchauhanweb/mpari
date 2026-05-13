package com.zepto;

import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u35 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws f33 {
        try {
            Cipher cipherA = lk0.a("RSA/ECB/PKCS1Padding", provider);
            cipherA.init(1, rSAPublicKey);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new f33("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (Exception e2) {
            throw new f33("Couldn't encrypt Content Encryption Key (CEK): " + e2.getMessage(), e2);
        }
    }
}
