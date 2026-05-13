package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class xg1 extends lf3 {
    public static final byte[] h = new byte[0];
    public final int f;
    public int g;

    public xg1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            e(true);
        }
        this.f = i;
        this.g = i;
    }

    public int j() {
        return this.g;
    }

    public void m(byte[] bArr) throws IOException {
        int i = this.g;
        if (i != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return;
        }
        int iD = d();
        int i2 = this.g;
        if (i2 >= iD) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.g + " >= " + iD);
        }
        int iD2 = i2 - x76.d(this.c, bArr, 0, bArr.length);
        this.g = iD2;
        if (iD2 == 0) {
            e(true);
            return;
        }
        throw new EOFException("DEF length " + this.f + " object truncated by " + this.g);
    }

    public byte[] n() throws IOException {
        if (this.g == 0) {
            return h;
        }
        int iD = d();
        int i = this.g;
        if (i >= iD) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.g + " >= " + iD);
        }
        byte[] bArr = new byte[i];
        int iD2 = i - x76.d(this.c, bArr, 0, i);
        this.g = iD2;
        if (iD2 == 0) {
            e(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f + " object truncated by " + this.g);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.g == 0) {
            return -1;
        }
        int i = this.c.read();
        if (i >= 0) {
            int i2 = this.g - 1;
            this.g = i2;
            if (i2 == 0) {
                e(true);
            }
            return i;
        }
        throw new EOFException("DEF length " + this.f + " object truncated by " + this.g);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.c.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.g - i4;
            this.g = i5;
            if (i5 == 0) {
                e(true);
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.f + " object truncated by " + this.g);
    }
}
