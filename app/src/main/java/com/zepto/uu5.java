package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class uu5 {
    public final byte[] a;
    public final byte[] b;
    public final wj1 c;
    public int d;
    public int e;

    public uu5(byte[] bArr, byte[] bArr2, wj1 wj1Var) {
        this.a = bArr;
        this.b = bArr2;
        this.c = wj1Var;
    }

    public void a(byte[] bArr, boolean z, int i) {
        b(bArr, i);
        if (z) {
            this.e++;
        }
    }

    public byte[] b(byte[] bArr, int i) {
        if (bArr.length < this.c.c()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        wj1 wj1Var = this.c;
        byte[] bArr2 = this.a;
        wj1Var.d(bArr2, 0, bArr2.length);
        this.c.e((byte) (this.d >>> 24));
        this.c.e((byte) (this.d >>> 16));
        this.c.e((byte) (this.d >>> 8));
        this.c.e((byte) this.d);
        this.c.e((byte) (this.e >>> 8));
        this.c.e((byte) this.e);
        this.c.e((byte) -1);
        wj1 wj1Var2 = this.c;
        byte[] bArr3 = this.b;
        wj1Var2.d(bArr3, 0, bArr3.length);
        this.c.a(bArr, i);
        return bArr;
    }

    public void c(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.d = i;
    }
}
