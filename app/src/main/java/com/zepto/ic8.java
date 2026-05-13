package com.zepto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ic8 extends OutputStream {
    public final ze8 c = new ze8();
    public final File e;
    public final hg8 f;
    public long g;
    public long h;
    public FileOutputStream i;
    public ng8 j;

    public ic8(File file, hg8 hg8Var) {
        this.e = file;
        this.f = hg8Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        while (i2 > 0) {
            if (this.g == 0 && this.h == 0) {
                int iB = this.c.b(bArr, i, i2);
                if (iB == -1) {
                    return;
                }
                i += iB;
                i2 -= iB;
                ng8 ng8VarC = this.c.c();
                this.j = ng8VarC;
                if (ng8VarC.d()) {
                    this.g = 0L;
                    this.f.l(this.j.f(), 0, this.j.f().length);
                    this.h = this.j.f().length;
                } else if (this.j.h() && !this.j.g()) {
                    this.f.j(this.j.f());
                    File file = new File(this.e, this.j.c());
                    file.getParentFile().mkdirs();
                    this.g = this.j.b();
                    this.i = new FileOutputStream(file);
                } else {
                    byte[] bArrF = this.j.f();
                    this.f.l(bArrF, 0, bArrF.length);
                    this.g = this.j.b();
                }
            }
            if (!this.j.g()) {
                if (this.j.d()) {
                    this.f.e(this.h, bArr, i, i2);
                    this.h += (long) i2;
                    iMin = i2;
                } else if (this.j.h()) {
                    iMin = (int) Math.min(i2, this.g);
                    this.i.write(bArr, i, iMin);
                    long j = this.g - ((long) iMin);
                    this.g = j;
                    if (j == 0) {
                        this.i.close();
                    }
                } else {
                    iMin = (int) Math.min(i2, this.g);
                    int length = this.j.f().length;
                    this.f.e((((long) length) + this.j.b()) - this.g, bArr, i, iMin);
                    this.g -= (long) iMin;
                }
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
