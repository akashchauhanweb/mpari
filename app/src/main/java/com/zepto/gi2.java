package com.zepto;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class gi2 {
    public static final gi2 e = new gi2(285);
    public static final gi2 f = new gi2(301);
    public final int[] a = new int[256];
    public final int[] b = new int[256];
    public final hi2 c;
    public final hi2 d;

    public gi2(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < 256; i3++) {
            this.a[i3] = i2;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= i;
            }
        }
        for (int i4 = 0; i4 < 255; i4++) {
            this.b[this.a[i4]] = i4;
        }
        this.c = new hi2(this, new int[]{0});
        this.d = new hi2(this, new int[]{1});
    }

    public static int a(int i, int i2) {
        return i ^ i2;
    }

    public hi2 b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new hi2(this, iArr);
    }

    public int c(int i) {
        return this.a[i];
    }

    public hi2 d() {
        return this.c;
    }

    public int e(int i) {
        if (i != 0) {
            return this.a[255 - this.b[i]];
        }
        throw new ArithmeticException();
    }

    public int f(int i) {
        if (i != 0) {
            return this.b[i];
        }
        throw new IllegalArgumentException();
    }

    public int g(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        if (i == 1) {
            return i2;
        }
        if (i2 == 1) {
            return i;
        }
        int[] iArr = this.a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i] + iArr2[i2]) % KotlinVersion.MAX_COMPONENT_VALUE];
    }
}
