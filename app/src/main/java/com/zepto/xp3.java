package com.zepto;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xp3 extends InputStream {
    public final InputStream c;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;

    public xp3(InputStream inputStream) {
        this(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    public void d(boolean z) {
        this.i = z;
    }

    public void e(long j) throws IOException {
        if (this.e > this.g || j < this.f) {
            throw new IOException("Cannot reset");
        }
        this.c.reset();
        n(this.f, j);
        this.e = j;
    }

    public long j(int i) {
        long j = this.e + ((long) i);
        if (this.g < j) {
            m(j);
        }
        return this.e;
    }

    public final void m(long j) {
        try {
            long j2 = this.f;
            long j3 = this.e;
            if (j2 >= j3 || j3 > this.g) {
                this.f = j3;
                this.c.mark((int) (j - j3));
            } else {
                this.c.reset();
                this.c.mark((int) (j - this.f));
                n(this.f, this.e);
            }
            this.g = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.h = j(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.c.markSupported();
    }

    public final void n(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.c.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.i) {
            long j = this.e + 1;
            long j2 = this.g;
            if (j > j2) {
                m(j2 + ((long) this.j));
            }
        }
        int i = this.c.read();
        if (i != -1) {
            this.e++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        e(this.h);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.i) {
            long j2 = this.e;
            if (j2 + j > this.g) {
                m(j2 + j + ((long) this.j));
            }
        }
        long jSkip = this.c.skip(j);
        this.e += jSkip;
        return jSkip;
    }

    public xp3(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    public xp3(InputStream inputStream, int i, int i2) {
        this.h = -1L;
        this.i = true;
        this.j = -1;
        this.c = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.j = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.i) {
            long j = this.e;
            if (((long) bArr.length) + j > this.g) {
                m(j + ((long) bArr.length) + ((long) this.j));
            }
        }
        int i = this.c.read(bArr);
        if (i != -1) {
            this.e += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.i) {
            long j = this.e;
            long j2 = i2;
            if (j + j2 > this.g) {
                m(j + j2 + ((long) this.j));
            }
        }
        int i3 = this.c.read(bArr, i, i2);
        if (i3 != -1) {
            this.e += (long) i3;
        }
        return i3;
    }
}
