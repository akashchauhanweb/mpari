package com.zepto;

import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cg3 {
    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public static int d(byte[] bArr) {
        return ((bArr[3] & UByte.MAX_VALUE) << 24) | (bArr[0] & UByte.MAX_VALUE) | ((bArr[1] & UByte.MAX_VALUE) << 8) | ((bArr[2] & UByte.MAX_VALUE) << 16);
    }

    public static int e(byte[] bArr, int i) {
        int i2 = ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | (bArr[i] & UByte.MAX_VALUE);
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | i2 | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int f(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & KotlinVersion.MAX_COMPONENT_VALUE) << (i4 * 8);
        }
        return i3;
    }
}
