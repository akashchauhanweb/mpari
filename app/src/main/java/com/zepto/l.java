package com.zepto;

import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static Cipher a(SecretKey secretKey, boolean z, byte[] bArr, Provider provider) throws f33 {
        try {
            Cipher cipherA = lk0.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z) {
                cipherA.init(1, secretKeySpec, ivParameterSpec);
            } else {
                cipherA.init(2, secretKeySpec, ivParameterSpec);
            }
            return cipherA;
        } catch (Exception e) {
            throw new f33(e.getMessage(), e);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws f33 {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new f33(e.getMessage(), e);
        }
    }

    public static vz c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws f33 {
        xu0 xu0Var = new xu0(secretKey);
        byte[] bArrB = b(xu0Var.a(), bArr, bArr2, provider);
        byte[] bArrC = h.c(bArr3);
        return new vz(bArrB, Arrays.copyOf(vk2.b(xu0Var.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArrB.length + bArrC.length).put(bArr3).put(bArr).put(bArrB).put(bArrC).array(), provider2), xu0Var.c()));
    }

    public static vz d(o33 o33Var, SecretKey secretKey, h40 h40Var, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws f33 {
        byte[] bArrA = o33Var.b("epu") instanceof String ? new h40((String) o33Var.b("epu")).a() : null;
        byte[] bArrA2 = o33Var.b("epv") instanceof String ? new h40((String) o33Var.b("epv")).a() : null;
        byte[] bArrB = b(re3.a(secretKey, o33Var.g(), bArrA, bArrA2), bArr, bArr2, provider);
        return new vz(bArrB, vk2.b(re3.b(secretKey, o33Var.g(), bArrA, bArrA2), (o33Var.c() + "." + h40Var + "." + h40.d(bArr) + "." + h40.d(bArrB)).getBytes(m66.a), provider2));
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[w80.a(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
