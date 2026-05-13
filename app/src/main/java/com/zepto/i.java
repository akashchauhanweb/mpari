package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class i implements mk0 {
    public byte[] c;
    public byte[] e;
    public m63 f;
    public int g;

    public i(m63 m63Var, int i, byte[] bArr, byte[] bArr2) {
        this.f = m63Var;
        this.e = wx.d(bArr);
        this.g = i;
        this.c = wx.d(bArr2);
    }

    public byte[] a() {
        return wx.d(this.c);
    }

    public m63 b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public byte[] d() {
        return wx.d(this.e);
    }
}
