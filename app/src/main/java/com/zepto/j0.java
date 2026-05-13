package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends FilterInputStream {
    public final int c;
    public final boolean e;
    public final byte[][] f;

    public j0(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public static int D(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i2) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = i2 & 127;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i4 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i4 = (i4 << 8) + i6;
            i5++;
        } while (i5 < i3);
        if (i4 < i || z) {
            return i4;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i4 + " >= " + i);
    }

    public static int U(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        if ((i3 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i4 = 0;
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            i4 = ((i3 & 127) | i4) << 7;
            i3 = inputStream.read();
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
        }
        return i4 | (i3 & 127);
    }

    public static u0 m(int i, xg1 xg1Var, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return z.g0(w(xg1Var, bArr));
            case 2:
                return k0.g0(xg1Var.n());
            case 3:
                return x.g0(xg1Var.n());
            case 4:
                return q0.g0(xg1Var.n());
            case 5:
                return l0.g0(xg1Var.n());
            case 6:
                return p0.h0(w(xg1Var, bArr), true);
            case 7:
                return o0.g0(xg1Var.n());
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException("unknown tag " + i + " encountered");
            case 10:
                return c0.g0(w(xg1Var, bArr), true);
            case 12:
                return h1.g0(xg1Var.n());
            case 13:
                return w0.g0(xg1Var.n(), false);
            case 18:
                return m0.g0(xg1Var.n());
            case 19:
                return v0.g0(xg1Var.n());
            case 20:
                return c1.g0(xg1Var.n());
            case 21:
                return l1.g0(xg1Var.n());
            case 22:
                return i0.g0(xg1Var.n());
            case 23:
                return g1.g0(xg1Var.n());
            case 24:
                return g0.g0(xg1Var.n());
            case 25:
                return h0.g0(xg1Var.n());
            case 26:
                return m1.g0(xg1Var.n());
            case 27:
                return f0.g0(xg1Var.n());
            case 28:
                return i1.g0(xg1Var.n());
            case 30:
                return w.h0(n(xg1Var));
        }
    }

    public static char[] n(xg1 xg1Var) throws IOException {
        int iJ = xg1Var.j();
        if ((iJ & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i = iJ / 2;
        char[] cArr = new char[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        int i3 = 0;
        while (iJ >= 8) {
            if (x76.d(xg1Var, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i3] = (char) ((bArr[0] << 8) | (bArr[1] & UByte.MAX_VALUE));
            cArr[i3 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UByte.MAX_VALUE));
            cArr[i3 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UByte.MAX_VALUE));
            cArr[i3 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UByte.MAX_VALUE));
            i3 += 4;
            iJ -= 8;
        }
        if (iJ > 0) {
            if (x76.d(xg1Var, bArr, 0, iJ) != iJ) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i4 = i2 + 1;
                int i5 = bArr[i2] << 8;
                i2 += 2;
                cArr[i3] = (char) ((bArr[i4] & UByte.MAX_VALUE) | i5);
                i3++;
            } while (i2 < iJ);
        }
        if (xg1Var.j() == 0 && i == i3) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    public static byte[] w(xg1 xg1Var, byte[][] bArr) throws IOException {
        int iJ = xg1Var.j();
        if (iJ >= bArr.length) {
            return xg1Var.n();
        }
        byte[] bArr2 = bArr[iJ];
        if (bArr2 == null) {
            bArr2 = new byte[iJ];
            bArr[iJ] = bArr2;
        }
        xg1Var.m(bArr2);
        return bArr2;
    }

    public int B() {
        return D(this, this.c, false);
    }

    public u0 P() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iU = U(this, i);
        int iB = B();
        if (iB >= 0) {
            try {
                return j(i, iU, iB);
            } catch (IllegalArgumentException e) {
                throw new d0("corrupted stream detected", e);
            }
        }
        if ((i & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        b1 b1Var = new b1(new jy2(this, this.c), this.c, this.f);
        int i2 = i & 192;
        if (i2 != 0) {
            return b1Var.c(i2, iU);
        }
        if (iU == 3) {
            return d30.a(b1Var);
        }
        if (iU == 4) {
            return g30.a(b1Var);
        }
        if (iU == 8) {
            return s41.a(b1Var);
        }
        if (iU == 16) {
            return i30.a(b1Var);
        }
        if (iU == 17) {
            return k30.a(b1Var);
        }
        throw new IOException("unknown BER object encountered");
    }

    public x d(b0 b0Var) throws d0 {
        int iF = b0Var.f();
        x[] xVarArr = new x[iF];
        for (int i = 0; i != iF; i++) {
            a0 a0VarD = b0Var.d(i);
            if (!(a0VarD instanceof x)) {
                throw new d0("unknown object encountered in constructed BIT STRING: " + a0VarD.getClass());
            }
            xVarArr[i] = (x) a0VarD;
        }
        return new c30(xVarArr);
    }

    public u0 d0(int i, int i2, boolean z, xg1 xg1Var) {
        return !z ? e1.j0(i, i2, xg1Var.n()) : e1.h0(i, i2, k0(xg1Var));
    }

    public q0 e(b0 b0Var) throws d0 {
        int iF = b0Var.f();
        q0[] q0VarArr = new q0[iF];
        for (int i = 0; i != iF; i++) {
            a0 a0VarD = b0Var.d(i);
            if (!(a0VarD instanceof q0)) {
                throw new d0("unknown object encountered in constructed OCTET STRING: " + a0VarD.getClass());
            }
            q0VarArr[i] = (q0) a0VarD;
        }
        return new f30(q0VarArr);
    }

    public b0 e0() {
        u0 u0VarP = P();
        if (u0VarP == null) {
            return new b0(0);
        }
        b0 b0Var = new b0();
        do {
            b0Var.a(u0VarP);
            u0VarP = P();
        } while (u0VarP != null);
        return b0Var;
    }

    public u0 j(int i, int i2, int i3) throws IOException {
        xg1 xg1Var = new xg1(this, i3, this.c);
        if ((i & 224) == 0) {
            return m(i2, xg1Var, this.f);
        }
        int i4 = i & 192;
        if (i4 != 0) {
            return d0(i4, i2, (i & 32) != 0, xg1Var);
        }
        if (i2 == 3) {
            return d(k0(xg1Var));
        }
        if (i2 == 4) {
            return e(k0(xg1Var));
        }
        if (i2 == 8) {
            return y71.a(k0(xg1Var)).n0();
        }
        if (i2 == 16) {
            return xg1Var.j() < 1 ? y71.a : this.e ? new ob3(xg1Var.n()) : y71.a(k0(xg1Var));
        }
        if (i2 == 17) {
            return y71.b(k0(xg1Var));
        }
        throw new IOException("unknown tag " + i2 + " encountered");
    }

    public b0 k0(xg1 xg1Var) {
        int iJ = xg1Var.j();
        return iJ < 1 ? new b0(0) : new j0(xg1Var, iJ, this.e, this.f).e0();
    }

    public j0(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    public j0(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.c = i;
        this.e = z;
        this.f = bArr;
    }

    public j0(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public j0(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }
}
