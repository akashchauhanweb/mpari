package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends u0 {
    public static final j1 e = new a(m0.class, 18);
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return m0.g0(z41Var.j0());
        }
    }

    public m0(byte[] bArr, boolean z) {
        this.c = z ? wx.d(bArr) : bArr;
    }

    public static m0 g0(byte[] bArr) {
        return new y41(bArr, false);
    }

    @Override // com.zepto.u0
    public final void B(s0 s0Var, boolean z) {
        s0Var.o(z, 18, this.c);
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public final int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    public final String h0() {
        return i86.b(this.c);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public final int hashCode() {
        return wx.k(this.c);
    }

    public String toString() {
        return h0();
    }

    @Override // com.zepto.u0
    public final boolean z(u0 u0Var) {
        if (u0Var instanceof m0) {
            return wx.a(this.c, ((m0) u0Var).c);
        }
        return false;
    }
}
