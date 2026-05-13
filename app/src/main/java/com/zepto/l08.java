package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class l08 extends n0 {
    public final byte[] c;
    public final byte[] e;

    public l08(byte[] bArr, byte[] bArr2) {
        this.c = wx.d(bArr);
        this.e = wx.d(bArr2);
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(new k0(0L));
        b0Var.a(new z41(this.c));
        b0Var.a(new z41(this.e));
        return new d51(b0Var);
    }
}
