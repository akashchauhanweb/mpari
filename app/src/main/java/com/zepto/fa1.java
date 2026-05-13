package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class fa1 extends x0 {
    public int f;

    public fa1() {
        this.f = -1;
    }

    private int r0() {
        if (this.f < 0) {
            int length = this.c.length;
            int iT = 0;
            for (int i = 0; i < length; i++) {
                iT += this.c[i].m().f0().T(true);
            }
            this.f = iT;
        }
        return this.f;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 48);
        c91 c91VarE = s0Var.e();
        int length = this.c.length;
        int i = 0;
        if (this.f >= 0 || length > 16) {
            s0Var.k(r0());
            while (i < length) {
                c91VarE.u(this.c[i].m(), true);
                i++;
            }
            return;
        }
        u0[] u0VarArr = new u0[length];
        int iT = 0;
        for (int i2 = 0; i2 < length; i2++) {
            u0 u0VarF0 = this.c[i2].m().f0();
            u0VarArr[i2] = u0VarF0;
            iT += u0VarF0.T(true);
        }
        this.f = iT;
        s0Var.k(iT);
        while (i < length) {
            c91VarE.u(u0VarArr[i], true);
            i++;
        }
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, r0());
    }

    @Override // com.zepto.x0, com.zepto.u0
    public u0 f0() {
        return this;
    }

    @Override // com.zepto.x0
    public x m0() {
        return new p51(c30.m0(g0()), false);
    }

    @Override // com.zepto.x0
    public e0 n0() {
        return new m71(this);
    }

    @Override // com.zepto.x0
    public q0 o0() {
        return new z41(f30.k0(h0()));
    }

    @Override // com.zepto.x0
    public z0 p0() {
        return new pb1(false, q0());
    }

    public fa1(a0 a0Var) {
        super(a0Var);
        this.f = -1;
    }

    public fa1(b0 b0Var) {
        super(b0Var);
        this.f = -1;
    }

    public fa1(a0[] a0VarArr, boolean z) {
        super(a0VarArr, z);
        this.f = -1;
    }
}
