package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends u0 {
    public static final j1 e = new a(l1.class, 21);
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return l1.g0(z41Var.j0());
        }
    }

    public l1(byte[] bArr, boolean z) {
        this.c = z ? wx.d(bArr) : bArr;
    }

    public static l1 g0(byte[] bArr) {
        return new j51(bArr, false);
    }

    @Override // com.zepto.u0
    public final void B(s0 s0Var, boolean z) {
        s0Var.o(z, 21, this.c);
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public final int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public final int hashCode() {
        return wx.k(this.c);
    }

    @Override // com.zepto.u0
    public final boolean z(u0 u0Var) {
        if (u0Var instanceof l1) {
            return wx.a(this.c, ((l1) u0Var).c);
        }
        return false;
    }
}
