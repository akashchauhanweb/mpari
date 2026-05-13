package com.zepto;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends u0 {
    public static final j1 e = new a(w.class, 30);
    public final char[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return w.g0(z41Var.j0());
        }
    }

    public w(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & UByte.MAX_VALUE) | (bArr[i3] << 8));
        }
        this.c = cArr;
    }

    public static w g0(byte[] bArr) {
        return new p41(bArr);
    }

    public static w h0(char[] cArr) {
        return new p41(cArr);
    }

    @Override // com.zepto.u0
    public final void B(s0 s0Var, boolean z) throws IOException {
        int length = this.c.length;
        s0Var.s(z, 30);
        s0Var.k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.c;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            s0Var.j(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.c[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            s0Var.j(bArr, 0, i3);
        }
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public final int T(boolean z) {
        return s0.g(z, this.c.length * 2);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public final int hashCode() {
        return wx.m(this.c);
    }

    public final String i0() {
        return new String(this.c);
    }

    public String toString() {
        return i0();
    }

    @Override // com.zepto.u0
    public final boolean z(u0 u0Var) {
        if (u0Var instanceof w) {
            return wx.b(this.c, ((w) u0Var).c);
        }
        return false;
    }

    public w(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.c = cArr;
    }
}
