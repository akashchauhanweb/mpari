package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class nr3 extends lr3 {
    public int f;
    public int g;
    public ji2 h;
    public rs4 i;
    public dr4 j;
    public ii2 k;
    public rs4[] l;

    public nr3(int i, int i2, ji2 ji2Var, rs4 rs4Var, ii2 ii2Var, dr4 dr4Var, String str) {
        super(true, str);
        this.f = i;
        this.g = i2;
        this.h = ji2Var;
        this.i = rs4Var;
        this.k = ii2Var;
        this.j = dr4Var;
        this.l = new ts4(ji2Var, rs4Var).c();
    }

    public ji2 b() {
        return this.h;
    }

    public rs4 c() {
        return this.i;
    }

    public ii2 d() {
        return this.k;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.f;
    }

    public dr4 g() {
        return this.j;
    }

    public nr3(int i, int i2, ji2 ji2Var, rs4 rs4Var, dr4 dr4Var, String str) {
        this(i, i2, ji2Var, rs4Var, hk2.a(ji2Var, rs4Var), dr4Var, str);
    }
}
