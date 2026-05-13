package com.zepto;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ka8 extends FilterInputStream {
    public final ze8 c;
    public byte[] e;
    public long f;
    public boolean g;
    public boolean h;

    public ka8(InputStream inputStream) {
        super(inputStream);
        this.c = new ze8();
        this.e = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        this.g = false;
        this.h = false;
    }

    public final long d() {
        return this.f;
    }

    public final ng8 e() {
        byte[] bArr;
        if (this.f > 0) {
            do {
                bArr = this.e;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.g || this.h) {
            return new fa8(null, -1L, -1, false, false, null);
        }
        if (!w(30)) {
            this.g = true;
            return this.c.c();
        }
        ng8 ng8VarC = this.c.c();
        if (ng8VarC.d()) {
            this.h = true;
            return ng8VarC;
        }
        if (ng8VarC.b() == 4294967295L) {
            throw new bc8("Files bigger than 4GiB are not supported.");
        }
        int iA = this.c.a() - 30;
        long j = iA;
        int length = this.e.length;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.e = Arrays.copyOf(this.e, length);
        }
        if (!w(iA)) {
            this.g = true;
            return this.c.c();
        }
        ng8 ng8VarC2 = this.c.c();
        this.f = ng8VarC2.b();
        return ng8VarC2;
    }

    public final boolean j() {
        return this.h;
    }

    public final boolean m() {
        return this.g;
    }

    public final int n(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final boolean w(int i) {
        int iN = n(this.e, 0, i);
        if (iN != i) {
            int i2 = i - iN;
            if (n(this.e, iN, i2) != i2) {
                this.c.b(this.e, 0, iN);
                return false;
            }
        }
        this.c.b(this.e, 0, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f;
        if (j <= 0 || this.g) {
            return -1;
        }
        int iN = n(bArr, i, (int) Math.min(j, i2));
        this.f -= (long) iN;
        if (iN != 0) {
            return iN;
        }
        this.g = true;
        return 0;
    }
}
