package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a51 implements r0 {
    public xg1 c;

    public a51(xg1 xg1Var) {
        this.c = xg1Var;
    }

    @Override // com.zepto.r0
    public InputStream j() {
        return this.c;
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return new z41(this.c.n());
    }
}
