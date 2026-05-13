package com.zepto;

import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y35 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i, Provider provider) throws f33 {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = "SHA-256";
        } else if (384 == i) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = "SHA-384";
        } else {
            if (512 != i) {
                throw new f33("Unsupported SHA-2 bit size: " + i);
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = "SHA-512";
        }
        try {
            AlgorithmParameters algorithmParametersA = fo.a("OAEP", provider);
            algorithmParametersA.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher cipherA = lk0.a(str, provider);
            cipherA.init(1, rSAPublicKey, algorithmParametersA);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new f33("RSA block size exception: The RSA key is too short, use a longer one", e);
        } catch (Exception e2) {
            throw new f33(e2.getMessage(), e2);
        }
    }
}
