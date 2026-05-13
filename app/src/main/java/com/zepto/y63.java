package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class y63 {
    public final wj1 a;
    public final int b;

    public y63(p0 p0Var, int i) {
        if (p0Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.a = yj1.a(p0Var);
        this.b = i;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i) {
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i * 2) {
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] d(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrQ = v08.q(i, this.b);
        this.a.d(bArrQ, 0, bArrQ.length);
        this.a.d(bArr, 0, bArr.length);
        this.a.d(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        wj1 wj1Var = this.a;
        if (wj1Var instanceof w08) {
            ((w08) wj1Var).f(bArr3, 0, i2);
        } else {
            wj1Var.a(bArr3, 0);
        }
        return bArr3;
    }
}
