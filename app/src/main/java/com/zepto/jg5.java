package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class jg5 extends d63 {
    public jg5(int i) {
        super(r(i));
    }

    private static int r(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
    }

    @Override // com.zepto.d63, com.zepto.wj1
    public int a(byte[] bArr, int i) {
        l(2, 2);
        return super.a(bArr, i);
    }

    @Override // com.zepto.wj1
    public String b() {
        return "SHA3-" + this.e;
    }
}
