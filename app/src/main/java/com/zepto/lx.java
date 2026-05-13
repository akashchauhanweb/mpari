package com.zepto;

import com.zepto.x03;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class lx {

    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final g72 d;

        public a(g72 g72Var) {
            g72Var.getClass();
            this.d = g72Var;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        eo3 eo3Var = (eo3) dVar;
        int iK = K(bArr, i2, aVar);
        eo3Var.m(fr0.c(aVar.b));
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            eo3Var.m(fr0.c(aVar.b));
        }
        return iK;
    }

    public static int B(byte[] bArr, int i, a aVar) throws b13 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw b13.g();
        }
        if (i2 == 0) {
            aVar.c = "";
            return iH;
        }
        aVar.c = new String(bArr, iH, i2, x03.b);
        return iH + i2;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) throws b13 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw b13.g();
        }
        if (i4 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, iH, i4, x03.b));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw b13.g();
            }
            if (i5 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, iH, i5, x03.b));
                iH += i5;
            }
        }
        return iH;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) throws b13 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw b13.g();
        }
        if (i4 == 0) {
            dVar.add("");
        } else {
            int i5 = iH + i4;
            if (!zs6.n(bArr, iH, i5)) {
                throw b13.d();
            }
            dVar.add(new String(bArr, iH, i4, x03.b));
            iH = i5;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i6 = aVar.a;
            if (i6 < 0) {
                throw b13.g();
            }
            if (i6 == 0) {
                dVar.add("");
            } else {
                int i7 = iH + i6;
                if (!zs6.n(bArr, iH, i7)) {
                    throw b13.d();
                }
                dVar.add(new String(bArr, iH, i6, x03.b));
                iH = i7;
            }
        }
        return iH;
    }

    public static int E(byte[] bArr, int i, a aVar) throws b13 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw b13.g();
        }
        if (i2 == 0) {
            aVar.c = "";
            return iH;
        }
        aVar.c = zs6.e(bArr, iH, i2);
        return iH + i2;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, vp6 vp6Var, a aVar) throws b13 {
        if (zw7.a(i) == 0) {
            throw b13.c();
        }
        int iB = zw7.b(i);
        if (iB == 0) {
            int iK = K(bArr, i2, aVar);
            vp6Var.n(i, Long.valueOf(aVar.b));
            return iK;
        }
        if (iB == 1) {
            vp6Var.n(i, Long.valueOf(i(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iH = H(bArr, i2, aVar);
            int i4 = aVar.a;
            if (i4 < 0) {
                throw b13.g();
            }
            if (i4 > bArr.length - iH) {
                throw b13.m();
            }
            if (i4 == 0) {
                vp6Var.n(i, s80.e);
            } else {
                vp6Var.n(i, s80.w(bArr, iH, i4));
            }
            return iH + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw b13.c();
            }
            vp6Var.n(i, Integer.valueOf(g(bArr, i2)));
            return i2 + 4;
        }
        vp6 vp6VarK = vp6.k();
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iH2 = H(bArr, i2, aVar);
            int i7 = aVar.a;
            if (i7 == i5) {
                i6 = i7;
                i2 = iH2;
                break;
            }
            i6 = i7;
            i2 = F(i7, bArr, iH2, i3, vp6VarK, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw b13.h();
        }
        vp6Var.n(i, vp6VarK);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int H(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return G(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        j03 j03Var = (j03) dVar;
        int iH = H(bArr, i2, aVar);
        j03Var.m(aVar.a);
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            j03Var.m(aVar.a);
        }
        return iH;
    }

    public static int J(long j, byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i3;
            i2 = i4;
            b = b2;
        }
        aVar.b = j2;
        return i2;
    }

    public static int K(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return J(j, bArr, i2, aVar);
        }
        aVar.b = j;
        return i2;
    }

    public static int L(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        eo3 eo3Var = (eo3) dVar;
        int iK = K(bArr, i2, aVar);
        eo3Var.m(aVar.b);
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            eo3Var.m(aVar.b);
        }
        return iK;
    }

    public static int M(Object obj, dp5 dp5Var, byte[] bArr, int i, int i2, int i3, a aVar) {
        int iF0 = ((et3) dp5Var).f0(obj, bArr, i, i2, i3, aVar);
        aVar.c = obj;
        return iF0;
    }

    public static int N(Object obj, dp5 dp5Var, byte[] bArr, int i, int i2, a aVar) throws b13 {
        int iG = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iG = G(i3, bArr, iG, aVar);
            i3 = aVar.a;
        }
        int i4 = iG;
        if (i3 < 0 || i3 > i2 - i4) {
            throw b13.m();
        }
        int i5 = i3 + i4;
        dp5Var.b(obj, bArr, i4, i5, aVar);
        aVar.c = obj;
        return i5;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        e70 e70Var = (e70) dVar;
        int iK = K(bArr, i2, aVar);
        e70Var.m(aVar.b != 0);
        while (iK < i3) {
            int iH = H(bArr, iK, aVar);
            if (i != aVar.a) {
                break;
            }
            iK = K(bArr, iH, aVar);
            e70Var.m(aVar.b != 0);
        }
        return iK;
    }

    public static int b(byte[] bArr, int i, a aVar) throws b13 {
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a;
        if (i2 < 0) {
            throw b13.g();
        }
        if (i2 > bArr.length - iH) {
            throw b13.m();
        }
        if (i2 == 0) {
            aVar.c = s80.e;
            return iH;
        }
        aVar.c = s80.w(bArr, iH, i2);
        return iH + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) throws b13 {
        int iH = H(bArr, i2, aVar);
        int i4 = aVar.a;
        if (i4 < 0) {
            throw b13.g();
        }
        if (i4 > bArr.length - iH) {
            throw b13.m();
        }
        if (i4 == 0) {
            dVar.add(s80.e);
        } else {
            dVar.add(s80.w(bArr, iH, i4));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            int i5 = aVar.a;
            if (i5 < 0) {
                throw b13.g();
            }
            if (i5 > bArr.length - iH) {
                throw b13.m();
            }
            if (i5 == 0) {
                dVar.add(s80.e);
            } else {
                dVar.add(s80.w(bArr, iH, i5));
                iH += i5;
            }
        }
        return iH;
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(i(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        hu1 hu1Var = (hu1) dVar;
        hu1Var.m(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            hu1Var.m(d(bArr, iH));
            i4 = iH + 8;
        }
        return i4;
    }

    public static int f(int i, byte[] bArr, int i2, int i3, Object obj, at3 at3Var, up6 up6Var, a aVar) {
        aVar.d.a(at3Var, i >>> 3);
        return F(i, bArr, i2, i3, et3.v(obj), aVar);
    }

    public static int g(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int h(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        j03 j03Var = (j03) dVar;
        j03Var.m(g(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            j03Var.m(g(bArr, iH));
            i4 = iH + 4;
        }
        return i4;
    }

    public static long i(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        eo3 eo3Var = (eo3) dVar;
        eo3Var.m(i(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            eo3Var.m(i(bArr, iH));
            i4 = iH + 8;
        }
        return i4;
    }

    public static float k(byte[] bArr, int i) {
        return Float.intBitsToFloat(g(bArr, i));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        jd2 jd2Var = (jd2) dVar;
        jd2Var.m(k(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            jd2Var.m(k(bArr, iH));
            i4 = iH + 4;
        }
        return i4;
    }

    public static int m(dp5 dp5Var, byte[] bArr, int i, int i2, int i3, a aVar) {
        Object objI = dp5Var.i();
        int iM = M(objI, dp5Var, bArr, i, i2, i3, aVar);
        dp5Var.e(objI);
        aVar.c = objI;
        return iM;
    }

    public static int n(dp5 dp5Var, int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        int i4 = (i & (-8)) | 4;
        int iM = m(dp5Var, bArr, i2, i3, i4, aVar);
        dVar.add(aVar.c);
        while (iM < i3) {
            int iH = H(bArr, iM, aVar);
            if (i != aVar.a) {
                break;
            }
            iM = m(dp5Var, bArr, iH, i3, i4, aVar);
            dVar.add(aVar.c);
        }
        return iM;
    }

    public static int o(dp5 dp5Var, byte[] bArr, int i, int i2, a aVar) throws b13 {
        Object objI = dp5Var.i();
        int iN = N(objI, dp5Var, bArr, i, i2, aVar);
        dp5Var.e(objI);
        aVar.c = objI;
        return iN;
    }

    public static int p(dp5 dp5Var, int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) throws b13 {
        int iO = o(dp5Var, bArr, i2, i3, aVar);
        dVar.add(aVar.c);
        while (iO < i3) {
            int iH = H(bArr, iO, aVar);
            if (i != aVar.a) {
                break;
            }
            iO = o(dp5Var, bArr, iH, i3, aVar);
            dVar.add(aVar.c);
        }
        return iO;
    }

    public static int q(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        e70 e70Var = (e70) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            e70Var.m(aVar.b != 0);
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int r(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        hu1 hu1Var = (hu1) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            hu1Var.m(d(bArr, iH));
            iH += 8;
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int s(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        j03 j03Var = (j03) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            j03Var.m(g(bArr, iH));
            iH += 4;
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int t(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        eo3 eo3Var = (eo3) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            eo3Var.m(i(bArr, iH));
            iH += 8;
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int u(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        jd2 jd2Var = (jd2) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            jd2Var.m(k(bArr, iH));
            iH += 4;
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int v(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        j03 j03Var = (j03) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, aVar);
            j03Var.m(fr0.b(aVar.a));
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int w(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        eo3 eo3Var = (eo3) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            eo3Var.m(fr0.c(aVar.b));
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int x(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        j03 j03Var = (j03) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, aVar);
            j03Var.m(aVar.a);
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int y(byte[] bArr, int i, x03.d dVar, a aVar) throws b13 {
        eo3 eo3Var = (eo3) dVar;
        int iH = H(bArr, i, aVar);
        int i2 = aVar.a + iH;
        while (iH < i2) {
            iH = K(bArr, iH, aVar);
            eo3Var.m(aVar.b);
        }
        if (iH == i2) {
            return iH;
        }
        throw b13.m();
    }

    public static int z(int i, byte[] bArr, int i2, int i3, x03.d dVar, a aVar) {
        j03 j03Var = (j03) dVar;
        int iH = H(bArr, i2, aVar);
        j03Var.m(fr0.b(aVar.a));
        while (iH < i3) {
            int iH2 = H(bArr, iH, aVar);
            if (i != aVar.a) {
                break;
            }
            iH = H(bArr, iH2, aVar);
            j03Var.m(fr0.b(aVar.a));
        }
        return iH;
    }
}
