package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class em3 {
    public static void a(byte[] bArr, wj1 wj1Var) {
        wj1Var.d(bArr, 0, bArr.length);
    }

    public static void b(short s, wj1 wj1Var) {
        wj1Var.e((byte) (s >>> 8));
        wj1Var.e((byte) s);
    }

    public static void c(int i, wj1 wj1Var) {
        wj1Var.e((byte) (i >>> 24));
        wj1Var.e((byte) (i >>> 16));
        wj1Var.e((byte) (i >>> 8));
        wj1Var.e((byte) i);
    }
}
