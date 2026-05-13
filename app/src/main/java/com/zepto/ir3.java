package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class ir3 {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{0, 0, 0, 0, 0, 0, 0, 0}};
    public static final int[][] c = {new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}};
    public static final int[][] d = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] e = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] f = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(n60 n60Var, z22 z22Var, int i, int i2, p80 p80Var) throws oz7 {
        c(p80Var);
        d(i, p80Var);
        l(z22Var, i2, p80Var);
        t(i, p80Var);
        f(n60Var, i2, p80Var);
    }

    public static int b(int i, int i2) {
        int iN = n(i2);
        int iN2 = i << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i2 << (n(iN2) - iN);
        }
        return iN2;
    }

    public static void c(p80 p80Var) {
        p80Var.a((byte) -1);
    }

    public static void d(int i, p80 p80Var) throws oz7 {
        j(p80Var);
        e(p80Var);
        s(i, p80Var);
        k(p80Var);
    }

    public static void e(p80 p80Var) throws oz7 {
        if (p80Var.b(p80Var.d() - 8, 8) == 0) {
            throw new oz7();
        }
        p80Var.e(p80Var.d() - 8, 8, 1);
    }

    public static void f(n60 n60Var, int i, p80 p80Var) throws oz7 {
        int iE;
        int iF = p80Var.f() - 1;
        int iD = p80Var.d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iF > 0) {
            if (iF == 6) {
                iF--;
            }
            while (iD >= 0 && iD < p80Var.d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iF - i4;
                    if (o(p80Var.b(iD, i5))) {
                        if (i2 < n60Var.g()) {
                            iE = n60Var.e(i2);
                            i2++;
                        } else {
                            iE = 0;
                        }
                        if (i != -1 && aq3.f(i, i5, iD)) {
                            iE ^= 1;
                        }
                        p80Var.e(iD, i5, iE);
                    }
                }
                iD += i3;
            }
            i3 = -i3;
            iD += i3;
            iF -= 2;
        }
        if (i2 == n60Var.g()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Not all bits consumed: ");
        stringBuffer.append(i2);
        stringBuffer.append('/');
        stringBuffer.append(n60Var.g());
        throw new oz7(stringBuffer.toString());
    }

    public static void g(int i, int i2, p80 p80Var) throws oz7 {
        int[][] iArr = b;
        if (iArr[0].length != 8 || iArr.length != 1) {
            throw new oz7("Bad horizontal separation pattern");
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!o(p80Var.b(i2, i4))) {
                throw new oz7();
            }
            p80Var.e(i2, i4, b[0][i3]);
        }
    }

    public static void h(int i, int i2, p80 p80Var) throws oz7 {
        int[][] iArr = d;
        if (iArr[0].length != 5 || iArr.length != 5) {
            throw new oz7("Bad position adjustment");
        }
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = i2 + i3;
                int i6 = i + i4;
                if (!o(p80Var.b(i5, i6))) {
                    throw new oz7();
                }
                p80Var.e(i5, i6, d[i3][i4]);
            }
        }
    }

    public static void i(int i, int i2, p80 p80Var) throws oz7 {
        int[][] iArr = a;
        if (iArr[0].length != 7 || iArr.length != 7) {
            throw new oz7("Bad position detection pattern");
        }
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                int i5 = i2 + i3;
                int i6 = i + i4;
                if (!o(p80Var.b(i5, i6))) {
                    throw new oz7();
                }
                p80Var.e(i5, i6, a[i3][i4]);
            }
        }
    }

    public static void j(p80 p80Var) throws oz7 {
        int length = a[0].length;
        i(0, 0, p80Var);
        i(p80Var.f() - length, 0, p80Var);
        i(0, p80Var.f() - length, p80Var);
        int length2 = b[0].length;
        int i = length2 - 1;
        g(0, i, p80Var);
        g(p80Var.f() - length2, i, p80Var);
        g(0, p80Var.f() - length2, p80Var);
        int length3 = c.length;
        m(length3, 0, p80Var);
        m((p80Var.d() - length3) - 1, 0, p80Var);
        m(length3, p80Var.d() - length3, p80Var);
    }

    public static void k(p80 p80Var) throws oz7 {
        int i = 8;
        while (i < p80Var.f() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (!p(p80Var.b(6, i))) {
                throw new oz7();
            }
            if (o(p80Var.b(6, i))) {
                p80Var.e(6, i, i3);
            }
            if (!p(p80Var.b(i, 6))) {
                throw new oz7();
            }
            if (o(p80Var.b(i, 6))) {
                p80Var.e(i, 6, i3);
            }
            i = i2;
        }
    }

    public static void l(z22 z22Var, int i, p80 p80Var) throws oz7 {
        n60 n60Var = new n60();
        q(z22Var, i, n60Var);
        for (int i2 = 0; i2 < n60Var.g(); i2++) {
            int iE = n60Var.e((n60Var.g() - 1) - i2);
            int[] iArr = f[i2];
            p80Var.e(iArr[1], iArr[0], iE);
            if (i2 < 8) {
                p80Var.e(8, (p80Var.f() - i2) - 1, iE);
            } else {
                p80Var.e((p80Var.d() - 7) + (i2 - 8), 8, iE);
            }
        }
    }

    public static void m(int i, int i2, p80 p80Var) throws oz7 {
        int[][] iArr = c;
        if (iArr[0].length != 1 || iArr.length != 7) {
            throw new oz7("Bad vertical separation pattern");
        }
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!o(p80Var.b(i4, i))) {
                throw new oz7();
            }
            p80Var.e(i4, i, c[i3][0]);
        }
    }

    public static int n(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static boolean o(int i) {
        return i == -1;
    }

    public static boolean p(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    public static void q(z22 z22Var, int i, n60 n60Var) throws oz7 {
        if (!dy4.j(i)) {
            throw new oz7("Invalid mask pattern");
        }
        int iA = (z22Var.a() << 3) | i;
        n60Var.c(iA, 5);
        n60Var.c(b(iA, 1335), 10);
        n60 n60Var2 = new n60();
        n60Var2.c(21522, 15);
        n60Var.i(n60Var2);
        if (n60Var.g() == 15) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("should not happen but we got: ");
        stringBuffer.append(n60Var.g());
        throw new oz7(stringBuffer.toString());
    }

    public static void r(int i, n60 n60Var) throws oz7 {
        n60Var.c(i, 6);
        n60Var.c(b(i, 7973), 12);
        if (n60Var.g() == 18) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("should not happen but we got: ");
        stringBuffer.append(n60Var.g());
        throw new oz7(stringBuffer.toString());
    }

    public static void s(int i, p80 p80Var) throws oz7 {
        if (i < 2) {
            return;
        }
        int[] iArr = e[i - 1];
        for (int i2 : iArr) {
            for (int i3 : iArr) {
                if (i3 != -1 && i2 != -1 && o(p80Var.b(i2, i3))) {
                    h(i3 - 2, i2 - 2, p80Var);
                }
            }
        }
    }

    public static void t(int i, p80 p80Var) throws oz7 {
        if (i < 7) {
            return;
        }
        n60 n60Var = new n60();
        r(i, n60Var);
        int i2 = 17;
        for (int i3 = 0; i3 < 6; i3++) {
            for (int i4 = 0; i4 < 3; i4++) {
                int iE = n60Var.e(i2);
                i2--;
                p80Var.e((p80Var.d() - 11) + i4, i3, iE);
                p80Var.e(i3, (p80Var.d() - 11) + i4, iE);
            }
        }
    }
}
