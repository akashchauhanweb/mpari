package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class jy2 extends lf3 {
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    public jy2(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.h = false;
        this.i = true;
        this.f = inputStream.read();
        int i2 = inputStream.read();
        this.g = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        j();
    }

    public final boolean j() {
        if (!this.h && this.i && this.f == 0 && this.g == 0) {
            this.h = true;
            e(true);
        }
        return this.h;
    }

    public void m(boolean z) {
        this.i = z;
        j();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (j()) {
            return -1;
        }
        int i = this.c.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.f;
        this.f = this.g;
        this.g = i;
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.i || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.h) {
            return -1;
        }
        int i3 = this.c.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f;
        bArr[i + 1] = (byte) this.g;
        this.f = this.c.read();
        int i4 = this.c.read();
        this.g = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }
}
