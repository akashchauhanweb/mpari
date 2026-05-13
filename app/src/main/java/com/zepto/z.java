package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class z extends u0 {
    public static final j1 e = new a(z.class, 1);
    public static final z f = new z((byte) 0);
    public static final z g = new z((byte) -1);
    public final byte c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return z.g0(z41Var.j0());
        }
    }

    public z(byte b) {
        this.c = b;
    }

    public static z g0(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new z(b) : f : g;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) throws IOException {
        s0Var.m(z, 1, this.c);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, 1);
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return h0() ? g : f;
    }

    public boolean h0() {
        return this.c != 0;
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return h0() ? 1 : 0;
    }

    public String toString() {
        return h0() ? "TRUE" : "FALSE";
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        return (u0Var instanceof z) && h0() == ((z) u0Var).h0();
    }
}
