package com.zepto;

import java.math.BigInteger;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class k0 extends u0 {
    public static final j1 f = new a(k0.class, 2);
    public final byte[] c;
    public final int e;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return k0.g0(z41Var.j0());
        }
    }

    public k0(long j) {
        this.c = BigInteger.valueOf(j).toByteArray();
        this.e = 0;
    }

    public static k0 g0(byte[] bArr) {
        return new k0(bArr, false);
    }

    public static k0 h0(e1 e1Var, boolean z) {
        return (k0) f.e(e1Var, z);
    }

    public static k0 i0(Object obj) {
        if (obj == null || (obj instanceof k0)) {
            return (k0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (k0) f.b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static int l0(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i3 = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[iMax] & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public static boolean n0(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !uw4.b("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    public static long o0(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 8);
        long j = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[iMax] & UByte.MAX_VALUE));
        }
    }

    public static int q0(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 2, this.c);
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, this.c.length);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return wx.k(this.c);
    }

    public BigInteger j0() {
        return new BigInteger(this.c);
    }

    public boolean k0(int i) {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i2 = this.e;
        return length - i2 <= 4 && l0(bArr, i2, -1) == i;
    }

    public int m0() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.e;
        if (length - i <= 4) {
            return l0(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long p0() {
        byte[] bArr = this.c;
        int length = bArr.length;
        int i = this.e;
        if (length - i <= 8) {
            return o0(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return j0().toString();
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var instanceof k0) {
            return wx.a(this.c, ((k0) u0Var).c);
        }
        return false;
    }

    public k0(BigInteger bigInteger) {
        this.c = bigInteger.toByteArray();
        this.e = 0;
    }

    public k0(byte[] bArr, boolean z) {
        if (n0(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.c = z ? wx.d(bArr) : bArr;
        this.e = q0(bArr);
    }
}
