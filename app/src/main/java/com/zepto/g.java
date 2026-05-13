package com.zepto;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final boolean a(byte[] a, int i, byte[] b, int i2, int i3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final int c(int i) {
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final short d(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final String e(byte b) {
        return new String(new char[]{u80.f()[(b >> 4) & 15], u80.f()[b & 15]});
    }

    public static final String f(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {u80.f()[(i >> 28) & 15], u80.f()[(i >> 24) & 15], u80.f()[(i >> 20) & 15], u80.f()[(i >> 16) & 15], u80.f()[(i >> 12) & 15], u80.f()[(i >> 8) & 15], u80.f()[(i >> 4) & 15], u80.f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}
