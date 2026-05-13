package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class r41 extends e0 {
    public r41(p0 p0Var, k0 k0Var, u0 u0Var, int i, u0 u0Var2) {
        super(p0Var, k0Var, u0Var, i, u0Var2);
    }

    @Override // com.zepto.e0, com.zepto.u0
    public u0 e0() {
        return this;
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
            b0Var.a(u0Var.e0());
        }
        int i = this.g;
        b0Var.a(new g51(i == 0, i, this.h));
        return new d51(b0Var);
    }

    public r41(d51 d51Var) {
        super(d51Var);
    }
}
