package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class u30 {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static u30 a() {
        return new q00(a.FATAL_ERROR, -1L);
    }

    public static u30 d() {
        return new q00(a.INVALID_PAYLOAD, -1L);
    }

    public static u30 e(long j) {
        return new q00(a.OK, j);
    }

    public static u30 f() {
        return new q00(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
