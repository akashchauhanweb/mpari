package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ur3 extends rr3 {
    public int e;
    public int f;
    public ji2 g;
    public rs4 h;
    public ii2 i;
    public dr4 j;
    public dr4 k;
    public ii2 l;
    public rs4[] m;

    public ur3(int i, int i2, ji2 ji2Var, rs4 rs4Var, dr4 dr4Var, dr4 dr4Var2, ii2 ii2Var) {
        super(true, null);
        this.f = i2;
        this.e = i;
        this.g = ji2Var;
        this.h = rs4Var;
        this.i = ii2Var;
        this.j = dr4Var;
        this.k = dr4Var2;
        this.l = hk2.a(ji2Var, rs4Var);
        this.m = new ts4(ji2Var, rs4Var).c();
    }

    public ji2 a() {
        return this.g;
    }

    public rs4 b() {
        return this.h;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public dr4 e() {
        return this.j;
    }

    public dr4 f() {
        return this.k;
    }

    public ii2 g() {
        return this.i;
    }
}
