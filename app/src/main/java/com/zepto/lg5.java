package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class lg5 extends d63 implements w08 {
    public lg5(int i) {
        super(r(i));
    }

    public static int r(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // com.zepto.d63, com.zepto.wj1
    public int a(byte[] bArr, int i) {
        return f(bArr, i, c());
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHAKE" + this.e;
    }

    @Override // com.zepto.d63, com.zepto.wj1
    public int c() {
        return this.e / 4;
    }

    @Override // com.zepto.w08
    public int f(byte[] bArr, int i, int i2) {
        int iS = s(bArr, i, i2);
        p();
        return iS;
    }

    public int s(byte[] bArr, int i, int i2) {
        if (!this.f) {
            l(15, 4);
        }
        q(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
