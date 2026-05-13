package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class dr4 {
    public int[] a;

    public dr4(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iE = cg3.e(bArr, 0);
        int iA = n03.a(iE - 1);
        if (bArr.length != (iE * iA) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[iE];
        for (int i = 0; i < iE; i++) {
            this.a[i] = cg3.f(bArr, (i * iA) + 4, iA);
        }
        if (!b(this.a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public byte[] a() {
        int length = this.a.length;
        int iA = n03.a(length - 1);
        byte[] bArr = new byte[(length * iA) + 4];
        cg3.a(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            cg3.b(this.a[i], bArr, (i * iA) + 4, iA);
        }
        return bArr;
    }

    public final boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dr4) {
            return m03.b(this.a, ((dr4) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return wx.n(this.a);
    }

    public String toString() {
        String str = "[" + this.a[0];
        for (int i = 1; i < this.a.length; i++) {
            str = str + ", " + this.a[i];
        }
        return str + "]";
    }
}
