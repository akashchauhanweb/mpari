package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class s41 implements a0, ey2 {
    public b1 c;

    public s41(b1 b1Var) {
        this.c = b1Var;
    }

    public static m71 a(b1 b1Var) throws d0 {
        try {
            return new m71(b1Var.h());
        } catch (IllegalArgumentException e) {
            throw new d0(e.getMessage(), e);
        }
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new t0("unable to get DER object", e2);
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return a(this.c);
    }
}
