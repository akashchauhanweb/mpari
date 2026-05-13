package com.zepto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class p0 extends u0 {
    public static final j1 f = new a(p0.class, 6);
    public static final ConcurrentMap g = new ConcurrentHashMap();
    public final String c;
    public byte[] e;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return p0.h0(z41Var.j0(), false);
        }
    }

    public static class b {
        public final int a;
        public final byte[] b;

        public b(byte[] bArr) {
            this.a = wx.k(bArr);
            this.b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return wx.a(this.b, ((b) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    public p0(p0 p0Var, String str) {
        if (!w0.k0(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.c = p0Var.k0() + "." + str;
    }

    public static p0 h0(byte[] bArr, boolean z) {
        p0 p0Var = (p0) g.get(new b(bArr));
        return p0Var == null ? new p0(bArr, z) : p0Var;
    }

    public static p0 l0(Object obj) {
        if (obj == null || (obj instanceof p0)) {
            return (p0) obj;
        }
        if (obj instanceof a0) {
            u0 u0VarM = ((a0) obj).m();
            if (u0VarM instanceof p0) {
                return (p0) u0VarM;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (p0) f.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static boolean n0(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2') {
            return false;
        }
        return w0.k0(str, 2);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 6, j0());
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, j0().length);
    }

    public p0 g0(String str) {
        return new p0(this, str);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return this.c.hashCode();
    }

    public final void i0(ByteArrayOutputStream byteArrayOutputStream) {
        ne4 ne4Var = new ne4(this.c);
        int i = Integer.parseInt(ne4Var.b()) * 40;
        String strB = ne4Var.b();
        if (strB.length() <= 18) {
            w0.l0(byteArrayOutputStream, ((long) i) + Long.parseLong(strB));
        } else {
            w0.m0(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i)));
        }
        while (ne4Var.a()) {
            String strB2 = ne4Var.b();
            if (strB2.length() <= 18) {
                w0.l0(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                w0.m0(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
    }

    public final synchronized byte[] j0() {
        try {
            if (this.e == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                i0(byteArrayOutputStream);
                this.e = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    public String k0() {
        return this.c;
    }

    public p0 m0() {
        b bVar = new b(j0());
        ConcurrentMap concurrentMap = g;
        p0 p0Var = (p0) concurrentMap.get(bVar);
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0Var2 = (p0) concurrentMap.putIfAbsent(bVar, this);
        return p0Var2 == null ? this : p0Var2;
    }

    public boolean o0(p0 p0Var) {
        String strK0 = k0();
        String strK02 = p0Var.k0();
        return strK0.length() > strK02.length() && strK0.charAt(strK02.length()) == '.' && strK0.startsWith(strK02);
    }

    public String toString() {
        return k0();
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (u0Var == this) {
            return true;
        }
        if (u0Var instanceof p0) {
            return this.c.equals(((p0) u0Var).c);
        }
        return false;
    }

    public p0(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (n0(str)) {
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    public p0(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        BigInteger bigIntegerShiftLeft = null;
        int i2 = 0;
        long j = 0;
        while (i2 != bArr2.length) {
            byte b2 = bArr2[i2];
            if (j <= 72057594037927808L) {
                i = i2;
                long j2 = j + ((long) (b2 & ByteCompanionObject.MAX_VALUE));
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                i = i2;
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b2 & ByteCompanionObject.MAX_VALUE));
                if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            i2 = i + 1;
        }
        this.c = stringBuffer.toString();
        this.e = z ? wx.d(bArr) : bArr2;
    }
}
