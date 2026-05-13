package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class z41 extends q0 {
    public z41(a0 a0Var) {
        super(a0Var.m().w("DER"));
    }

    public static void k0(s0 s0Var, boolean z, byte[] bArr, int i, int i2) throws IOException {
        s0Var.p(z, 4, bArr, i, i2);
    }

    public static int l0(boolean z, int i) {
        return s0.g(z, i);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 4, this.c);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.q0, com.zepto.u0
    public u0 e0() {
        return this;
    }

    @Override // com.zepto.q0, com.zepto.u0
    public u0 f0() {
        return this;
    }

    public z41(byte[] bArr) {
        super(bArr);
    }
}
