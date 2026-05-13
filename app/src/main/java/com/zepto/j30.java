package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class j30 extends z0 {
    public j30() {
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.r(z, 49, this.c);
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

    public j30(b0 b0Var) {
        super(b0Var, false);
    }

    public j30(boolean z, a0[] a0VarArr) {
        super(z, a0VarArr);
    }
}
