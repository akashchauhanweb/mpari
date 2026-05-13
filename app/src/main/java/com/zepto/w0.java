package com.zepto;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class w0 extends u0 {
    public static final j1 f = new a(w0.class, 13);
    public final String c;
    public byte[] e;

    public static class a extends j1 {
        public a(Class cls, int i) {
            super(cls, i);
        }

        @Override // com.zepto.j1
        public u0 d(z41 z41Var) {
            return w0.g0(z41Var.j0(), false);
        }
    }

    public w0(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j = 0;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & ByteCompanionObject.MAX_VALUE));
                if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j) : bigIntegerShiftLeft).or(BigInteger.valueOf(b & ByteCompanionObject.MAX_VALUE));
                if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        this.c = stringBuffer.toString();
        this.e = z ? wx.d(bArr) : bArr2;
    }

    public static w0 g0(byte[] bArr, boolean z) {
        return new w0(bArr, z);
    }

    private void h0(ByteArrayOutputStream byteArrayOutputStream) {
        ne4 ne4Var = new ne4(this.c);
        while (ne4Var.a()) {
            String strB = ne4Var.b();
            if (strB.length() <= 18) {
                l0(byteArrayOutputStream, Long.parseLong(strB));
            } else {
                m0(byteArrayOutputStream, new BigInteger(strB));
            }
        }
    }

    private synchronized byte[] i0() {
        try {
            if (this.e == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                h0(byteArrayOutputStream);
                this.e = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean k0(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = r1
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.w0.k0(java.lang.String, int):boolean");
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // com.zepto.u0
    public void B(s0 s0Var, boolean z) {
        s0Var.o(z, 13, i0());
    }

    @Override // com.zepto.u0
    public boolean D() {
        return false;
    }

    @Override // com.zepto.u0
    public int T(boolean z) {
        return s0.g(z, i0().length);
    }

    @Override // com.zepto.u0, com.zepto.n0
    public int hashCode() {
        return this.c.hashCode();
    }

    public String j0() {
        return this.c;
    }

    public String toString() {
        return j0();
    }

    @Override // com.zepto.u0
    public boolean z(u0 u0Var) {
        if (this == u0Var) {
            return true;
        }
        if (u0Var instanceof w0) {
            return this.c.equals(((w0) u0Var).c);
        }
        return false;
    }
}
