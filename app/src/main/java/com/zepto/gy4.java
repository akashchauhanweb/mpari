package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class gy4 extends gy {
    public int e;
    public byte[] f;

    public gy4(int i, byte[] bArr) {
        super(true);
        if (bArr.length != iy4.b(i)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.e = i;
        this.f = wx.d(bArr);
    }

    public byte[] a() {
        return wx.d(this.f);
    }

    public int b() {
        return this.e;
    }
}
