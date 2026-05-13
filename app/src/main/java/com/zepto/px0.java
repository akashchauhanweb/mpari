package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class px0 extends InputStream {
    public final b1 c;
    public boolean e = true;
    public InputStream f;

    public px0(b1 b1Var) {
        this.c = b1Var;
    }

    public final r0 d() throws IOException {
        a0 a0VarG = this.c.g();
        if (a0VarG == null) {
            return null;
        }
        if (a0VarG instanceof r0) {
            return (r0) a0VarG;
        }
        throw new IOException("unknown object encountered: " + a0VarG.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        r0 r0VarD;
        if (this.f == null) {
            if (!this.e || (r0VarD = d()) == null) {
                return -1;
            }
            this.e = false;
            this.f = r0VarD.j();
        }
        while (true) {
            int i = this.f.read();
            if (i >= 0) {
                return i;
            }
            r0 r0VarD2 = d();
            if (r0VarD2 == null) {
                this.f = null;
                return -1;
            }
            this.f = r0VarD2.j();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        r0 r0VarD;
        int i3 = 0;
        if (this.f == null) {
            if (!this.e || (r0VarD = d()) == null) {
                return -1;
            }
            this.e = false;
            this.f = r0VarD.j();
        }
        while (true) {
            int i4 = this.f.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                r0 r0VarD2 = d();
                if (r0VarD2 == null) {
                    this.f = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f = r0VarD2.j();
            }
        }
    }
}
