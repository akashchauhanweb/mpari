package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class hy4 extends gy {
    public int e;
    public byte[] f;

    public hy4(int i, byte[] bArr) {
        super(false);
        if (bArr.length != iy4.c(i)) {
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
