package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class g0 extends u0 {
    public static final j1 e = new a(g0.class, 24);
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return g0.g0(z41Var.j0());
        }
    }

    public g0(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.c = bArr;
        if (!k0(0) || !k0(1) || !k0(2) || !k0(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }

    public static g0 g0(byte[] bArr) {
        return new g0(bArr);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 24, this.c);
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.u0
    public u0 e0() {
        return new u41(this.c);
    }

    @Override // com.zepto.u0
    public u0 f0() {
        return new u41(this.c);
    }

    public boolean h0() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return wx.k(this.c);
    }

    public boolean i0() {
        return k0(10) && k0(11);
    }

    public boolean j0() {
        return k0(12) && k0(13);
    }

    public final boolean k0(int i) {
        byte b;
        byte[] bArr = this.c;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof g0) {
            return wx.a(this.c, ((g0) u0Var).c);
        }
        return false;
    }
}
