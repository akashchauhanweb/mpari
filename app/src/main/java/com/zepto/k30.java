package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class k30 implements a1 {
    public b1 c;

    public k30(b1 b1Var) {
        this.c = b1Var;
    }

    public static j30 a(b1 b1Var) {
        return new j30(b1Var.h());
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
        return a(this.c);
    }
}
