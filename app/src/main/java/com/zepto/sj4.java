package com.zepto;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class sj4 extends OutputStream {
    public OutputStream c;
    public int e = 0;

    public sj4(OutputStream outputStream) {
        this.c = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    public int d() {
        return this.e;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.c.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.e += bArr.length;
        this.c.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.e++;
        this.c.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.e += i2;
        this.c.write(bArr, i, i2);
    }
}
