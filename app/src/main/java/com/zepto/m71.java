package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class m71 extends e0 {
    public m71(b0 b0Var) {
        this(y71.a(b0Var));
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return this;
    }

    @Override // com.zepto.e0
    public x0 g0() {
        b0 b0Var = new b0(4);
        p0 p0Var = this.c;
        if (p0Var != null) {
            b0Var.a(p0Var);
        }
        k0 k0Var = this.e;
        if (k0Var != null) {
            b0Var.a(k0Var);
        }
        u0 u0Var = this.f;
        if (u0Var != null) {
            b0Var.a(u0Var.f0());
        }
        int i = this.g;
        b0Var.a(new sb1(i == 0, i, this.h));
        return new fa1(b0Var);
    }

    public m71(fa1 fa1Var) {
        super(fa1Var);
    }
}
