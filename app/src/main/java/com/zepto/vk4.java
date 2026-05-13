package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vk4 {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | (bArr[i] << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public static long b(byte[] bArr, int i) {
        int iA = a(bArr, i);
        return (((long) a(bArr, i + 4)) & 4294967295L) | ((((long) iA) & 4294967295L) << 32);
    }

    public static void c(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i2 + i4] = b(bArr, i);
            i += 8;
        }
    }

    public static void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void e(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static int f(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static long g(byte[] bArr, int i) {
        return ((((long) f(bArr, i + 4)) & 4294967295L) << 32) | (((long) f(bArr, i)) & 4294967295L);
    }

    public static short h(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE));
    }

    public static void i(long j, byte[] bArr, int i) {
        d((int) (j >>> 32), bArr, i);
        d((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void j(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            i(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void k(long j, byte[] bArr, int i) {
        e((int) (4294967295L & j), bArr, i);
        e((int) (j >>> 32), bArr, i + 4);
    }

    public static void l(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            k(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void m(short s, byte[] bArr, int i) {
        bArr[i] = (byte) (s >>> 8);
        bArr[i + 1] = (byte) s;
    }

    public static void n(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
