package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ou5 {
    public final x80 a;

    public ou5(x80 x80Var) {
        this.a = x80Var;
    }

    public static ou5 a(byte[] bArr, pu5 pu5Var) {
        if (pu5Var != null) {
            return new ou5(x80.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.a.c();
    }
}
