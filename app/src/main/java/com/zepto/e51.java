package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class e51 extends z0 {
    public int g;

    public e51(boolean z, a0[] a0VarArr) {
        super(n0(z), a0VarArr);
        this.g = -1;
    }

    public static boolean n0(boolean z) {
        if (z) {
            return z;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int o0() {
        if (this.g < 0) {
            int length = this.c.length;
            int iT = 0;
            for (int i = 0; i < length; i++) {
                iT += this.c[i].m().e0().T(true);
            }
            this.g = iT;
        }
        return this.g;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.s(z, 49);
        b51 b51VarD = s0Var.d();
        int length = this.c.length;
        int i = 0;
        if (this.g >= 0 || length > 16) {
            s0Var.k(o0());
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
        this.g = iT;
        s0Var.k(iT);
        while (i < length) {
            u0VarArr[i].B(b51VarD, true);
            i++;
        }
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, o0());
    }

    @Override // com.zepto.z0, com.zepto.u0
    public u0 e0() {
        return this.e ? this : super.e0();
    }

    @Override // com.zepto.z0, com.zepto.u0
    public u0 f0() {
        return this;
    }
}
