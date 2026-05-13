package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class sb1 extends e1 {
    public sb1(int i, int i2, int i3, a0 a0Var) {
        super(i, i2, i3, a0Var);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        u0 u0VarF0 = this.g.m().f0();
        boolean zR0 = r0();
        if (z) {
            int i = this.e;
            if (zR0 || u0VarF0.D()) {
                i |= 32;
            }
            s0Var.t(true, i, this.f);
        }
        if (zR0) {
            s0Var.k(u0VarF0.T(true));
        }
        u0VarF0.B(s0Var.e(), zR0);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return r0() || this.g.m().f0().D();
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        u0 u0VarF0 = this.g.m().f0();
        boolean zR0 = r0();
        int iT = u0VarF0.T(zR0);
        if (zR0) {
            iT += s0.f(iT);
        }
        return iT + (z ? s0.h(this.f) : 0);
    }

    @Override // com.zepto.e1, com.zepto.u0
    public u0 f0() {
        return this;
    }

    @Override // com.zepto.e1
    public x0 s0(u0 u0Var) {
        return new fa1(u0Var);
    }

    public sb1(boolean z, int i, a0 a0Var) {
        super(z, i, a0Var);
    }
}
