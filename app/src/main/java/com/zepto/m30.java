package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class m30 implements a0, ey2 {
    public final int c;
    public final int e;
    public final b1 f;

    public m30(int i, int i2, b1 b1Var) {
        this.c = i;
        this.e = i2;
        this.f = b1Var;
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0(e.getMessage());
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return this.f.c(this.c, this.e);
    }
}
