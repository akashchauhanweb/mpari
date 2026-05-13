package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d51 extends x0 {
    public int f;

    public d51(a0 a0Var) {
        super(a0Var);
        this.f = -1;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 48);
        b51 b51VarD = s0Var.d();
        int length = this.c.length;
        int i = 0;
        if (this.f >= 0 || length > 16) {
            s0Var.k(r0());
            while (i < length) {
                this.c[i].m().e0().B(b51VarD, true);
                i++;
            }
            return;
        }
        u0[] u0VarArr = new u0[length];
        int iT = 0;
        for (int i2 = 0; i2 < length; i2++) {
            u0 u0VarE0 = this.c[i2].m().e0();
            u0VarArr[i2] = u0VarE0;
            iT += u0VarE0.T(true);
        }
        this.f = iT;
        s0Var.k(iT);
        while (i < length) {
            u0VarArr[i].B(b51VarD, true);
            i++;
        }
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, r0());
    }

    @Override // com.zepto.x0, com.zepto.u0
    public u0 e0() {
        return this;
    }

    @Override // com.zepto.x0, com.zepto.u0
    public u0 f0() {
        return this;
    }

    @Override // com.zepto.x0
    public x m0() {
        return new q41(c30.m0(g0()), false);
    }

    @Override // com.zepto.x0
    public e0 n0() {
        return new r41(this);
    }

    @Override // com.zepto.x0
    public q0 o0() {
        return new z41(f30.k0(h0()));
    }

    @Override // com.zepto.x0
    public z0 p0() {
        return new pb1(false, q0());
    }

    public final int r0() {
        if (this.f < 0) {
            int length = this.c.length;
            int iT = 0;
            for (int i = 0; i < length; i++) {
                iT += this.c[i].m().e0().T(true);
            }
            this.f = iT;
        }
        return this.f;
    }

    public d51(b0 b0Var) {
        super(b0Var);
        this.f = -1;
    }

    public d51(a0[] a0VarArr, boolean z) {
        super(a0VarArr, z);
        this.f = -1;
    }
}
