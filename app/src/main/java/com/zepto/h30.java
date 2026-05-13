package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class h30 extends x0 {
    public h30() {
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.r(z, 48, this.c);
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        int iT = z ? 4 : 3;
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            iT += this.c[i].m().T(true);
        }
        return iT;
    }

    @Override // com.zepto.x0
    public x m0() {
        return new c30(g0());
    }

    @Override // com.zepto.x0
    public e0 n0() {
        return ((x0) f0()).n0();
    }

    @Override // com.zepto.x0
    public q0 o0() {
        return new f30(h0());
    }

    @Override // com.zepto.x0
    public z0 p0() {
        return new j30(false, q0());
    }

    public h30(a0 a0Var) {
        super(a0Var);
    }

    public h30(b0 b0Var) {
        super(b0Var);
    }
}
