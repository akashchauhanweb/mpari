package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class m80 {
    public byte[] a;
    public int b;

    public m80() {
        this.a = null;
        this.b = 0;
    }

    public int a(int i) {
        return this.a[i] & UByte.MAX_VALUE;
    }

    public void b(int i, int i2) {
        this.a[i] = (byte) i2;
    }

    public void c(byte[] bArr, int i, int i2) {
        this.a = new byte[i2];
        this.b = i2;
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i3] = bArr[i + i3];
        }
    }

    public int d() {
        return this.b;
    }

    public m80(int i) {
        this.a = new byte[i];
        this.b = i;
    }
}
