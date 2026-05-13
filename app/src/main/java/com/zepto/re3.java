package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class re3 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final byte[] b = {0, 0, 0, 0};
    public static final byte[] c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};
    public static final byte[] d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, j22 j22Var, byte[] bArr, byte[] bArr2) throws f33 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(q03.a(length / 2));
            byteArrayOutputStream.write(j22Var.toString().getBytes(m66.a));
            if (bArr != null) {
                byteArrayOutputStream.write(q03.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(q03.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(b);
            }
            byteArrayOutputStream.write(c);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = bArrDigest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArrDigest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e) {
                throw new f33(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new f33(e2.getMessage(), e2);
        }
    }

    public static SecretKey b(SecretKey secretKey, j22 j22Var, byte[] bArr, byte[] bArr2) throws f33 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(q03.a(length));
            byteArrayOutputStream.write(j22Var.toString().getBytes(m66.a));
            if (bArr != null) {
                byteArrayOutputStream.write(q03.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(q03.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(b);
            }
            byteArrayOutputStream.write(d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e) {
                throw new f33(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new f33(e2.getMessage(), e2);
        }
    }
}
