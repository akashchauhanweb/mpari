package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class i30 implements y0 {
    public b1 c;

    public i30(b1 b1Var) {
        this.c = b1Var;
    }

    public static h30 a(b1 b1Var) {
        return new h30(b1Var.h());
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return a(this.c);
    }

    @Override // com.zepto.y0
    public a0 readObject() {
        return this.c.g();
    }
}
