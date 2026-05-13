package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qb1 implements a1 {
    public b1 c;

    public qb1(b1 b1Var) {
        this.c = b1Var;
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0(e.getMessage(), e);
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return y71.b(this.c.h());
    }
}
