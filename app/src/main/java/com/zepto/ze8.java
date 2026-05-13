package com.zepto;

import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ze8 {
    public byte[] a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;

    public ze8() {
        d();
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] bArr, int i, int i2) {
        int iE = e(30, bArr, i, i2);
        if (iE == -1) {
            return -1;
        }
        if (this.c == -1) {
            long jB = ga8.b(this.a, 0);
            this.c = jB;
            if (jB == 67324752) {
                this.h = false;
                this.d = ga8.b(this.a, 18);
                this.g = ga8.a(this.a, 8);
                this.e = ga8.a(this.a, 26);
                int iA = this.e + 30 + ga8.a(this.a, 28);
                this.f = iA;
                int length = this.a.length;
                if (length < iA) {
                    do {
                        length += length;
                    } while (length < iA);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.h = true;
            }
        }
        int iE2 = e(this.f, bArr, i + iE, i2 - iE);
        if (iE2 == -1) {
            return -1;
        }
        int i3 = iE + iE2;
        if (!this.h && this.i == null) {
            this.i = new String(this.a, 30, this.e);
        }
        return i3;
    }

    public final ng8 c() {
        int i = this.b;
        int i2 = this.f;
        if (i < i2) {
            return new fa8(this.i, this.d, this.g, true, this.h, Arrays.copyOf(this.a, i));
        }
        fa8 fa8Var = new fa8(this.i, this.d, this.g, false, this.h, Arrays.copyOf(this.a, i2));
        d();
        return fa8Var;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.i = null;
    }

    public final int e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.a, this.b, iMin);
        int i5 = this.b + iMin;
        this.b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }
}
