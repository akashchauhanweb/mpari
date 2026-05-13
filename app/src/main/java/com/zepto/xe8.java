package com.zepto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public final class xe8 extends InputStream {
    public final Enumeration c;
    public InputStream e;

    public xe8(Enumeration enumeration) throws IOException {
        this.c = enumeration;
        d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.e;
        if (inputStream != null) {
            inputStream.close();
            this.e = null;
        }
    }

    public final void d() throws IOException {
        InputStream inputStream = this.e;
        if (inputStream != null) {
            inputStream.close();
        }
        this.e = this.c.hasMoreElements() ? new FileInputStream((File) this.c.nextElement()) : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.e;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            d();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.e.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            d();
        } while (this.e != null);
        return -1;
    }
}
