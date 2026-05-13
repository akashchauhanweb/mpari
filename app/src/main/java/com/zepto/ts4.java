package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ts4 {
    public ji2 a;
    public rs4 b;
    public rs4[] c;
    public rs4[] d;

    public ts4(ji2 ji2Var, rs4 rs4Var) {
        this.a = ji2Var;
        this.b = rs4Var;
        b();
        a();
    }

    public static void d(rs4[] rs4VarArr, int i, int i2) {
        rs4 rs4Var = rs4VarArr[i];
        rs4VarArr[i] = rs4VarArr[i2];
        rs4VarArr[i2] = rs4Var;
    }

    public final void a() {
        int iF;
        int iG = this.b.g();
        rs4[] rs4VarArr = new rs4[iG];
        int i = iG - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            rs4VarArr[i2] = new rs4(this.c[i2]);
        }
        this.d = new rs4[iG];
        while (i >= 0) {
            this.d[i] = new rs4(this.a, i);
            i--;
        }
        for (int i3 = 0; i3 < iG; i3++) {
            if (rs4VarArr[i3].f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < iG) {
                    if (rs4VarArr[i4].f(i3) != 0) {
                        d(rs4VarArr, i3, i4);
                        d(this.d, i3, i4);
                        i4 = iG;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iF2 = this.a.f(rs4VarArr[i3].f(i3));
            rs4VarArr[i3].m(iF2);
            this.d[i3].m(iF2);
            for (int i5 = 0; i5 < iG; i5++) {
                if (i5 != i3 && (iF = rs4VarArr[i5].f(i3)) != 0) {
                    rs4 rs4VarN = rs4VarArr[i3].n(iF);
                    rs4 rs4VarN2 = this.d[i3].n(iF);
                    rs4VarArr[i5].b(rs4VarN);
                    this.d[i5].b(rs4VarN2);
                }
            }
        }
    }

    public final void b() {
        int i;
        int iG = this.b.g();
        this.c = new rs4[iG];
        int i2 = 0;
        while (true) {
            i = iG >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.c[i2] = new rs4(this.a, iArr);
            i2++;
        }
        while (i < iG) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.c[i] = new rs4(this.a, iArr2).k(this.b);
            i++;
        }
    }

    public rs4[] c() {
        return this.d;
    }
}
