package com.zepto;

import kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class me4 {
    public static final int a(double d, double d2) {
        return b(MathKt__MathJVMKt.roundToInt((d * d2) / ((double) 16)) * 16);
    }

    public static final int b(int i) {
        return (i + 1) & (-2);
    }

    public static final int c(int i) throws Exception {
        if (i >= 0) {
            return i;
        }
        throw new Exception("uInt32 value is too large");
    }

    public static final int d(long j) throws Exception {
        if (j > 2147483647L || j < 0) {
            throw new Exception("uInt32 value is too large");
        }
        return (int) j;
    }

    public static final long e(int i) {
        return i;
    }

    public static final long f(long j) throws Exception {
        if (j >= 0) {
            return j;
        }
        throw new Exception("uInt64 value is too large");
    }
}
