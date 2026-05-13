package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class g1 extends u0 {
    public static final j1 e = new a(g1.class, 23);
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return g1.g0(z41Var.j0());
        }
    }

    public g1(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.c = bArr;
        if (!h0(0) || !h0(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }

    public static g1 g0(byte[] bArr) {
        return new g1(bArr);
    }

    private boolean h0(int i) {
        byte b;
        byte[] bArr = this.c;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 23, this.c);
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return wx.k(this.c);
    }

    public String toString() {
        return i86.b(this.c);
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof g1) {
            return wx.a(this.c, ((g1) u0Var).c);
        }
        return false;
    }
}
