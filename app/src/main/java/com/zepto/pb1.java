package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class pb1 extends z0 {
    public int g;

    public pb1() {
        this.g = -1;
    }

    private int n0() {
        if (this.g < 0) {
            int length = this.c.length;
            int iT = 0;
            for (int i = 0; i < length; i++) {
                iT += this.c[i].m().f0().T(true);
            }
            this.g = iT;
        }
        return this.g;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 49);
        c91 c91VarE = s0Var.e();
        int length = this.c.length;
        int i = 0;
        if (this.g >= 0 || length > 16) {
            s0Var.k(n0());
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
        this.g = iT;
        s0Var.k(iT);
        while (i < length) {
            c91VarE.u(u0VarArr[i], true);
            i++;
        }
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, n0());
    }

    @Override // com.zepto.z0, com.zepto.u0
    public u0 f0() {
        return this;
    }

    public pb1(b0 b0Var) {
        super(b0Var, false);
        this.g = -1;
    }

    public pb1(boolean z, a0[] a0VarArr) {
        super(z, a0VarArr);
        this.g = -1;
    }
}
