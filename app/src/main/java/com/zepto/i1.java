package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 extends u0 {
    public static final j1 e = new a(i1.class, 28);
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] c;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return i1.g0(z41Var.j0());
        }
    }

    public i1(byte[] bArr, boolean z) {
        this.c = z ? wx.d(bArr) : bArr;
    }

    public static i1 g0(byte[] bArr) {
        return new i51(bArr, false);
    }

    public static void h0(StringBuffer stringBuffer, int i) {
        char[] cArr = f;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    public static void i0(StringBuffer stringBuffer, int i) {
        int i2;
        if (i < 128) {
            h0(stringBuffer, i);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 5;
        while (true) {
            i2 = i3 - 1;
            bArr[i2] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                break;
            } else {
                i3 = i2;
            }
        }
        int i4 = i3 - 2;
        bArr[i4] = (byte) ((5 - i2) | 128);
        while (true) {
            int i5 = i4 + 1;
            h0(stringBuffer, bArr[i4]);
            if (i5 >= 5) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    @Override // com.zepto.u0
    public final void B(s0 s0Var, boolean z) {
        s0Var.o(z, 28, this.c);
    }

    @Override // com.zepto.u0
    public final boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public final int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public final int hashCode() {
        return wx.k(this.c);
    }

    public final String j0() {
        int length = this.c.length;
        StringBuffer stringBuffer = new StringBuffer(((s0.f(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        i0(stringBuffer, length);
        for (int i = 0; i < length; i++) {
            h0(stringBuffer, this.c[i]);
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return j0();
    }

    @Override // com.zepto.u0
    public final boolean z(u0 u0Var) {
        if (u0Var instanceof i1) {
            return wx.a(this.c, ((i1) u0Var).c);
        }
        return false;
    }
}
