package com.zepto;

import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class o20 implements PublicKey {
    public short[][] c;
    public short[][] e;
    public short[] f;
    public int g;

    public o20(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.g = i;
        this.c = sArr;
        this.e = sArr2;
        this.f = sArr3;
    }

    public short[][] a() {
        return this.c;
    }

    public short[] b() {
        return wx.e(this.f);
    }

    public short[][] c() {
        short[][] sArr = new short[this.e.length][];
        int i = 0;
        while (true) {
            short[][] sArr2 = this.e;
            if (i == sArr2.length) {
                return sArr;
            }
            sArr[i] = wx.e(sArr2[i]);
            i++;
        }
    }

    public int d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj;
        return this.g == o20Var.d() && g45.j(this.c, o20Var.a()) && g45.j(this.e, o20Var.c()) && g45.i(this.f, o20Var.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return w63.a(new eo(hk4.a, x41.e), new e45(this.g, this.c, this.e, this.f));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.g * 37) + wx.p(this.c)) * 37) + wx.p(this.e)) * 37) + wx.o(this.f);
    }

    public o20(f45 f45Var) {
        this(f45Var.d(), f45Var.a(), f45Var.c(), f45Var.b());
    }
}
