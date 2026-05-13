package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class t08 extends n0 {
    public final byte[] c;
    public final byte[] e;

    public t08(x0 x0Var) {
        if (!k0.i0(x0Var.j0(0)).k0(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.c = wx.d(q0.i0(x0Var.j0(1)).j0());
        this.e = wx.d(q0.i0(x0Var.j0(2)).j0());
    }

    public static t08 z(Object obj) {
        if (obj instanceof t08) {
            return (t08) obj;
        }
        if (obj != null) {
            return new t08(x0.i0(obj));
        }
        return null;
    }

    public byte[] B() {
        return wx.d(this.c);
    }

    public byte[] D() {
        return wx.d(this.e);
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(0L));
        b0Var.a(new z41(this.c));
        b0Var.a(new z41(this.e));
        return new d51(b0Var);
    }

    public t08(byte[] bArr, byte[] bArr2) {
        this.c = wx.d(bArr);
        this.e = wx.d(bArr2);
    }
}
