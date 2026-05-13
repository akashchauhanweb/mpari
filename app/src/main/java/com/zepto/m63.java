package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class m63 implements mk0 {
    public byte[] c;

    public m63(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.c;
    }

    public m63(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.c = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
