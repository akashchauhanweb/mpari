package com.zepto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class te3 extends OutputStream {
    public long c = 0;

    public long d() {
        return this.c;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.c += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.c += (long) i2;
    }
}
