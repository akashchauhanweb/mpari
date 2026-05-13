package com.zepto;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x80 {
    public final byte[] a;

    public x80(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static x80 a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static x80 b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new x80(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x80) {
            return Arrays.equals(((x80) obj).a, this.a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "Bytes(" + bm2.b(this.a) + ")";
    }
}
