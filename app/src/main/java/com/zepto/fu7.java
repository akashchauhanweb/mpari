package com.zepto;

import com.zepto.pe4;

/* JADX INFO: loaded from: classes3.dex */
public final class fu7 {
    public final hu7 a;
    public final y63 b;
    public byte[] c;
    public byte[] d;

    public fu7(hu7 hu7Var) {
        if (hu7Var == null) {
            throw new NullPointerException("params == null");
        }
        this.a = hu7Var;
        int iC = hu7Var.c();
        this.b = new y63(hu7Var.b(), iC);
        this.c = new byte[iC];
        this.d = new byte[iC];
    }

    public final byte[] a(byte[] bArr, int i, int i2, pe4 pe4Var) {
        int iC = this.a.c();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iC) {
            throw new IllegalArgumentException("startHash needs to be " + iC + "bytes");
        }
        if (pe4Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (pe4Var.d() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i3 = i + i2;
        if (i3 > this.a.d() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i, i2 - 1, pe4Var);
        pe4 pe4Var2 = (pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(pe4Var.g()).n(pe4Var.e()).o(i3 - 1).f(0)).l();
        byte[] bArrC = this.b.c(this.d, pe4Var2.d());
        byte[] bArrC2 = this.b.c(this.d, ((pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var2.b())).h(pe4Var2.c())).p(pe4Var2.g()).n(pe4Var2.e()).o(pe4Var2.f()).f(1)).l()).d());
        byte[] bArr2 = new byte[iC];
        for (int i4 = 0; i4 < iC; i4++) {
            bArr2[i4] = (byte) (bArrA[i4] ^ bArrC2[i4]);
        }
        return this.b.a(bArrC, bArr2);
    }

    public final byte[] b(int i) {
        if (i < 0 || i >= this.a.a()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.b.c(this.c, v08.q(i, 32));
    }

    public y63 c() {
        return this.b;
    }

    public hu7 d() {
        return this.a;
    }

    public iu7 e(pe4 pe4Var) {
        if (pe4Var == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.a.a()][];
        for (int i = 0; i < this.a.a(); i++) {
            pe4Var = (pe4) ((pe4.b) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(pe4Var.g()).n(i).o(pe4Var.f()).f(pe4Var.a())).l();
            bArr[i] = a(b(i), 0, this.a.d() - 1, pe4Var);
        }
        return new iu7(this.a, bArr);
    }

    public byte[] f() {
        return wx.d(this.d);
    }

    public byte[] g(byte[] bArr, pe4 pe4Var) {
        return this.b.c(bArr, ((pe4) ((pe4.b) ((pe4.b) new pe4.b().g(pe4Var.b())).h(pe4Var.c())).p(pe4Var.g()).l()).d());
    }

    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.a.c()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.a.c()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.c = bArr;
        this.d = bArr2;
    }
}
