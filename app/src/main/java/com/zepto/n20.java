package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class n20 implements PrivateKey {
    public short[][] c;
    public short[] e;
    public short[][] f;
    public short[] g;
    public cb3[] h;
    public int[] i;

    public n20(d45 d45Var) {
        this(d45Var.c(), d45Var.a(), d45Var.d(), d45Var.b(), d45Var.f(), d45Var.e());
    }

    public short[] a() {
        return this.e;
    }

    public short[] b() {
        return this.g;
    }

    public short[][] c() {
        return this.c;
    }

    public short[][] d() {
        return this.f;
    }

    public cb3[] e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n20)) {
            return false;
        }
        n20 n20Var = (n20) obj;
        boolean zEquals = g45.j(this.c, n20Var.c()) && g45.j(this.f, n20Var.d()) && g45.i(this.e, n20Var.a()) && g45.i(this.g, n20Var.b()) && Arrays.equals(this.i, n20Var.f());
        if (this.h.length != n20Var.e().length) {
            return false;
        }
        for (int length = this.h.length - 1; length >= 0; length--) {
            zEquals &= this.h[length].equals(n20Var.e()[length]);
        }
        return zEquals;
    }

    public int[] f() {
        return this.i;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new sv4(new eo(hk4.a, x41.e), new c45(this.c, this.e, this.f, this.g, this.i, this.h)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.h.length * 37) + wx.p(this.c)) * 37) + wx.o(this.e)) * 37) + wx.p(this.f)) * 37) + wx.o(this.g)) * 37) + wx.n(this.i);
        for (int length2 = this.h.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.h[length2].hashCode();
        }
        return length;
    }

    public n20(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, cb3[] cb3VarArr) {
        this.c = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
        this.i = iArr;
        this.h = cb3VarArr;
    }
}
