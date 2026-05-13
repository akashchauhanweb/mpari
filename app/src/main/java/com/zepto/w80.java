package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w80 {
    public static int a(int i) {
        return i / 8;
    }

    public static int b(int i) throws o03 {
        long j = ((long) i) * 8;
        int i2 = (int) j;
        if (i2 == j) {
            return i2;
        }
        throw new o03();
    }

    public static int c(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return b(bArr.length);
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
