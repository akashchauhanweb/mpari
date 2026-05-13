package com.zepto;

import com.zepto.hp7;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y12 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static final class a {
        public final m80 a;
        public final m80 b;

        public a(m80 m80Var, m80 m80Var2) {
            this.a = m80Var;
            this.b = m80Var2;
        }

        public m80 a() {
            return this.a;
        }

        public m80 b() {
            return this.b;
        }
    }

    public static void a(String str, n60 n60Var, String str2) throws oz7 {
        try {
            byte[] bytes = str.getBytes(str2);
            for (byte b : bytes) {
                n60Var.c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new oz7(e.toString());
        }
    }

    public static void b(String str, n60 n60Var) throws oz7 {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int iN = n(str.charAt(i));
            if (iN == -1) {
                throw new oz7();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iN2 = n(str.charAt(i2));
                if (iN2 == -1) {
                    throw new oz7();
                }
                n60Var.c((iN * 45) + iN2, 11);
                i += 2;
            } else {
                n60Var.c(iN, 6);
                i = i2;
            }
        }
    }

    public static void c(String str, mw3 mw3Var, n60 n60Var, String str2) throws oz7 {
        if (mw3Var.equals(mw3.e)) {
            g(str, n60Var);
            return;
        }
        if (mw3Var.equals(mw3.f)) {
            b(str, n60Var);
            return;
        }
        if (mw3Var.equals(mw3.h)) {
            a(str, n60Var, str2);
        } else {
            if (mw3Var.equals(mw3.j)) {
                d(str, n60Var);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid mode: ");
            stringBuffer.append(mw3Var);
            throw new oz7(stringBuffer.toString());
        }
    }

    public static void d(String str, n60 n60Var) throws oz7 {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & UByte.MAX_VALUE) << 8) | (bytes[i2 + 1] & UByte.MAX_VALUE);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i == -1) {
                    throw new oz7("Invalid byte sequence");
                }
                n60Var.c(((i >> 8) * 192) + (i & KotlinVersion.MAX_COMPONENT_VALUE), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new oz7(e.toString());
        }
    }

    public static void e(int i, int i2, mw3 mw3Var, n60 n60Var) throws oz7 {
        int iB = mw3Var.b(hp7.e(i2));
        int i3 = (1 << iB) - 1;
        if (i <= i3) {
            n60Var.c(i, iB);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        stringBuffer.append("is bigger than");
        stringBuffer.append(i3);
        throw new oz7(stringBuffer.toString());
    }

    public static void f(mw3 mw3Var, n60 n60Var) {
        n60Var.c(mw3Var.a(), 4);
    }

    public static void g(String str, n60 n60Var) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int iCharAt = str.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                n60Var.c((iCharAt * 100) + ((str.charAt(i + 1) - '0') * 10) + (str.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    n60Var.c((iCharAt * 10) + (str.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    n60Var.c(iCharAt, 4);
                }
            }
        }
    }

    public static int h(p80 p80Var) {
        return aq3.a(p80Var) + aq3.c(p80Var) + aq3.d(p80Var) + aq3.e(p80Var);
    }

    public static int i(n60 n60Var, z22 z22Var, int i, p80 p80Var) throws oz7 {
        int i2 = IntCompanionObject.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            ir3.a(n60Var, z22Var, i, i4, p80Var);
            int iH = h(p80Var);
            if (iH < i2) {
                i3 = i4;
                i2 = iH;
            }
        }
        return i3;
    }

    public static mw3 j(String str) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (n(cCharAt) == -1) {
                    return mw3.h;
                }
                z = true;
            }
        }
        return z ? mw3.f : z2 ? mw3.e : mw3.h;
    }

    public static void k(String str, z22 z22Var, dy4 dy4Var) throws oz7 {
        l(str, z22Var, null, dy4Var);
    }

    public static void l(String str, z22 z22Var, Hashtable hashtable, dy4 dy4Var) throws oz7 {
        String str2 = hashtable == null ? null : (String) hashtable.get(v12.b);
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        mw3 mw3VarJ = j(str);
        n60 n60Var = new n60();
        c(str, mw3VarJ, n60Var, str2);
        p(n60Var.h(), z22Var, mw3VarJ, dy4Var);
        n60 n60Var2 = new n60();
        f(mw3VarJ, n60Var2);
        e(str.length(), dy4Var.h(), mw3VarJ, n60Var2);
        n60Var2.b(n60Var);
        r(dy4Var.e(), n60Var2);
        n60 n60Var3 = new n60();
        q(n60Var2, dy4Var.g(), dy4Var.e(), dy4Var.f(), n60Var3);
        p80 p80Var = new p80(dy4Var.d(), dy4Var.d());
        dy4Var.l(i(n60Var3, dy4Var.a(), dy4Var.h(), p80Var));
        ir3.a(n60Var3, dy4Var.a(), dy4Var.h(), dy4Var.b(), p80Var);
        dy4Var.m(p80Var);
        if (dy4Var.i()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid QR code: ");
        stringBuffer.append(dy4Var.toString());
        throw new oz7(stringBuffer.toString());
    }

    public static m80 m(m80 m80Var, int i) {
        int iD = m80Var.d();
        int[] iArr = new int[iD + i];
        for (int i2 = 0; i2 < iD; i2++) {
            iArr[i2] = m80Var.a(i2);
        }
        new f75(gi2.e).b(iArr, i);
        m80 m80Var2 = new m80(i);
        for (int i3 = 0; i3 < i; i3++) {
            m80Var2.b(i3, iArr[iD + i3]);
        }
        return m80Var2;
    }

    public static int n(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static void o(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws oz7 {
        if (i4 >= i3) {
            throw new oz7("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new oz7("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new oz7("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new oz7("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    public static void p(int i, z22 z22Var, mw3 mw3Var, dy4 dy4Var) throws oz7 {
        dy4Var.k(z22Var);
        dy4Var.o(mw3Var);
        for (int i2 = 1; i2 <= 40; i2++) {
            hp7 hp7VarE = hp7.e(i2);
            int iD = hp7VarE.d();
            hp7.b bVarC = hp7VarE.c(z22Var);
            int iD2 = bVarC.d();
            int iC = bVarC.c();
            int i3 = iD - iD2;
            if (i3 >= i + 3) {
                dy4Var.t(i2);
                dy4Var.s(iD);
                dy4Var.p(i3);
                dy4Var.r(iC);
                dy4Var.q(iD2);
                dy4Var.n(hp7VarE.b());
                return;
            }
        }
        throw new oz7("Cannot find proper rs block info (input data too big?)");
    }

    public static void q(n60 n60Var, int i, int i2, int i3, n60 n60Var2) throws oz7 {
        if (n60Var.h() != i2) {
            throw new oz7("Number of bits and data bytes does not match");
        }
        Vector vector = new Vector(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            o(i, i2, i3, i5, iArr, iArr2);
            m80 m80Var = new m80();
            m80Var.c(n60Var.f(), i4, iArr[0]);
            m80 m80VarM = m(m80Var, iArr2[0]);
            vector.addElement(new a(m80Var, m80VarM));
            iMax = Math.max(iMax, m80Var.d());
            iMax2 = Math.max(iMax2, m80VarM.d());
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new oz7("Data bytes does not match offset");
        }
        for (int i6 = 0; i6 < iMax; i6++) {
            for (int i7 = 0; i7 < vector.size(); i7++) {
                m80 m80VarA = ((a) vector.elementAt(i7)).a();
                if (i6 < m80VarA.d()) {
                    n60Var2.c(m80VarA.a(i6), 8);
                }
            }
        }
        for (int i8 = 0; i8 < iMax2; i8++) {
            for (int i9 = 0; i9 < vector.size(); i9++) {
                m80 m80VarB = ((a) vector.elementAt(i9)).b();
                if (i8 < m80VarB.d()) {
                    n60Var2.c(m80VarB.a(i8), 8);
                }
            }
        }
        if (i == n60Var2.h()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Interleaving error: ");
        stringBuffer.append(i);
        stringBuffer.append(" and ");
        stringBuffer.append(n60Var2.h());
        stringBuffer.append(" differ.");
        throw new oz7(stringBuffer.toString());
    }

    public static void r(int i, n60 n60Var) throws oz7 {
        int i2 = i << 3;
        if (n60Var.g() > i2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("data bits cannot fit in the QR Code");
            stringBuffer.append(n60Var.g());
            stringBuffer.append(" > ");
            stringBuffer.append(i2);
            throw new oz7(stringBuffer.toString());
        }
        for (int i3 = 0; i3 < 4 && n60Var.g() < i2; i3++) {
            n60Var.a(0);
        }
        int iG = n60Var.g() % 8;
        if (iG > 0) {
            int i4 = 8 - iG;
            for (int i5 = 0; i5 < i4; i5++) {
                n60Var.a(0);
            }
        }
        if (n60Var.g() % 8 != 0) {
            throw new oz7("Number of bits is not a multiple of 8");
        }
        int iH = i - n60Var.h();
        for (int i6 = 0; i6 < iH; i6++) {
            if (i6 % 2 == 0) {
                n60Var.c(236, 8);
            } else {
                n60Var.c(17, 8);
            }
        }
        if (n60Var.g() != i2) {
            throw new oz7("Bits size does not equal capacity");
        }
    }
}
