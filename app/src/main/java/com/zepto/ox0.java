package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ox0 extends InputStream {
    public final b1 c;
    public final boolean e;
    public boolean f = true;
    public int g = 0;
    public y h;
    public InputStream i;

    public ox0(b1 b1Var, boolean z) {
        this.c = b1Var;
        this.e = z;
    }

    public final y d() throws IOException {
        a0 a0VarG = this.c.g();
        if (a0VarG == null) {
            if (!this.e || this.g == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.g);
        }
        if (a0VarG instanceof y) {
            if (this.g == 0) {
                return (y) a0VarG;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + a0VarG.getClass());
    }

    public int e() {
        return this.g;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.i == null) {
            if (!this.f) {
                return -1;
            }
            y yVarD = d();
            this.h = yVarD;
            if (yVarD == null) {
                return -1;
            }
            this.f = false;
            this.i = yVarD.u();
        }
        while (true) {
            int i = this.i.read();
            if (i >= 0) {
                return i;
            }
            this.g = this.h.n();
            y yVarD2 = d();
            this.h = yVarD2;
            if (yVarD2 == null) {
                this.i = null;
                return -1;
            }
            this.i = yVarD2.u();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.i == null) {
            if (!this.f) {
                return -1;
            }
            y yVarD = d();
            this.h = yVarD;
            if (yVarD == null) {
                return -1;
            }
            this.f = false;
            this.i = yVarD.u();
        }
        while (true) {
            int i4 = this.i.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.g = this.h.n();
                y yVarD2 = d();
                this.h = yVarD2;
                if (yVarD2 == null) {
                    this.i = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.i = yVarD2.u();
            }
        }
    }
}
