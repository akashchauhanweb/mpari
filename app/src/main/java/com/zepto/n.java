package com.zepto;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static byte[] a(Cipher cipher) throws f33 {
        GCMParameterSpec gCMParameterSpecB = b(cipher);
        byte[] iv = gCMParameterSpecB.getIV();
        e(iv, gCMParameterSpecB.getTLen());
        return iv;
    }

    public static GCMParameterSpec b(Cipher cipher) throws f33 {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters == null) {
            throw new f33("AES GCM ciphers are expected to make use of algorithm parameters");
        }
        try {
            return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
        } catch (InvalidParameterSpecException e) {
            throw new f33(e.getMessage(), e);
        }
    }

    public static vz c(SecretKey secretKey, gy0 gy0Var, byte[] bArr, byte[] bArr2, Provider provider) throws f33 {
        SecretKey secretKeyA = x63.a(secretKey);
        byte[] bArr3 = (byte[]) gy0Var.a();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance("AES/GCM/NoPadding", provider) : Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeyA, new GCMParameterSpec(128, bArr3));
            cipher.updateAAD(bArr2);
            try {
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                int length = bArrDoFinal.length - w80.a(128);
                byte[] bArrD = w80.d(bArrDoFinal, 0, length);
                byte[] bArrD2 = w80.d(bArrDoFinal, length, w80.a(128));
                gy0Var.b(a(cipher));
                return new vz(bArrD, bArrD2);
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                throw new f33("Couldn't encrypt with AES/GCM/NoPadding: " + e.getMessage(), e);
            }
        } catch (NoClassDefFoundError unused) {
            return qe3.c(secretKeyA, bArr3, bArr, bArr2);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new f33("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new f33("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new f33("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        } catch (NoSuchPaddingException e5) {
            e = e5;
            throw new f33("Couldn't create AES/GCM/NoPadding cipher: " + e.getMessage(), e);
        }
    }

    public static byte[] d(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static void e(byte[] bArr, int i) throws f33 {
        if (w80.c(bArr) != 96) {
            throw new f33(String.format("IV length of %d bits is required, got %d", 96, Integer.valueOf(w80.c(bArr))));
        }
        if (i != 128) {
            throw new f33(String.format("Authentication tag length of %d bits is required, got %d", 128, Integer.valueOf(i)));
        }
    }
}
