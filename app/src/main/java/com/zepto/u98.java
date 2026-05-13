package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u98 extends InputStream {
    public final InputStream c;
    public long e;

    public u98(InputStream inputStream, long j) {
        this.c = inputStream;
        this.e = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.c.close();
        this.e = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.e;
        if (j <= 0) {
            return -1;
        }
        this.e = j - 1;
        return this.c.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.e;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.c.read(bArr, i, (int) Math.min(i2, j));
        if (i3 != -1) {
            this.e -= (long) i3;
        }
        return i3;
    }
}
