package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ga1 implements y0 {
    public b1 c;

    public ga1(b1 b1Var) {
        this.c = b1Var;
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
        return y71.a(this.c.h());
    }

    @Override // com.zepto.y0
    public a0 readObject() {
        return this.c.g();
    }
}
