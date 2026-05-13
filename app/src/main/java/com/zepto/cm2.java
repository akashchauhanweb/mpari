package com.zepto;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cm2 {
    public static final em2 a = new em2();

    public static byte[] a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new b22("exception encoding Hex string: " + e.getMessage(), e);
        }
    }
}
