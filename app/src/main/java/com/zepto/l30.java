package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class l30 extends e1 {
    public l30(int i, int i2, int i3, a0 a0Var) {
        super(i, i2, i3, a0Var);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        u0 u0VarM = this.g.m();
        boolean zR0 = r0();
        if (z) {
            int i = this.e;
            if (zR0 || u0VarM.D()) {
                i |= 32;
            }
            s0Var.t(true, i, this.f);
        }
        if (!zR0) {
            u0VarM.B(s0Var, false);
            return;
        }
        s0Var.i(128);
        u0VarM.B(s0Var, true);
        s0Var.i(0);
        s0Var.i(0);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return r0() || this.g.m().D();
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        u0 u0VarM = this.g.m();
        boolean zR0 = r0();
        int iT = u0VarM.T(zR0);
        if (zR0) {
            iT += 3;
        }
        return iT + (z ? s0.h(this.f) : 0);
    }

    @Override // com.zepto.e1
    public x0 s0(u0 u0Var) {
        return new h30(u0Var);
    }
}
