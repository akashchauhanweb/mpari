package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class bq4 {
    public static final lp4[] a = {lp4.I5, lp4.z8, lp4.h8, lp4.y1};
    public static final byte[] b = xo4.c("endstream", null);
    public static final byte[] c = xo4.c("endobj", null);

    public static rp4 a(rp4 rp4Var) {
        if (rp4Var == null) {
            return null;
        }
        if (!rp4Var.f()) {
            return rp4Var;
        }
        try {
            wb0.a(rp4Var);
            throw null;
        } catch (Exception e) {
            throw new p52(e);
        }
    }

    public static rp4 b(rp4 rp4Var, rp4 rp4Var2) {
        if (rp4Var == null) {
            return null;
        }
        if (rp4Var.f()) {
            return a(rp4Var);
        }
        if (rp4Var2 != null) {
            rp4Var2.c();
        }
        return rp4Var;
    }
}
