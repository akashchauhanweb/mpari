package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class hi2 {
    public final gi2 a;
    public final int[] b;

    public hi2(gi2 gi2Var, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = gi2Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = gi2Var.d().b;
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public hi2 a(hi2 hi2Var) {
        if (!this.a.equals(hi2Var.a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        }
        if (f()) {
            return hi2Var;
        }
        if (hi2Var.f()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = hi2Var.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = gi2.a(iArr2[i - length], iArr[i]);
        }
        return new hi2(this.a, iArr3);
    }

    public hi2[] b(hi2 hi2Var) {
        if (!this.a.equals(hi2Var.a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        }
        if (hi2Var.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        hi2 hi2VarD = this.a.d();
        int iE = this.a.e(hi2Var.c(hi2Var.e()));
        hi2 hi2VarA = this;
        while (hi2VarA.e() >= hi2Var.e() && !hi2VarA.f()) {
            int iE2 = hi2VarA.e() - hi2Var.e();
            int iG = this.a.g(hi2VarA.c(hi2VarA.e()), iE);
            hi2 hi2VarH = hi2Var.h(iE2, iG);
            hi2VarD = hi2VarD.a(this.a.b(iE2, iG));
            hi2VarA = hi2VarA.a(hi2VarH);
        }
        return new hi2[]{hi2VarD, hi2VarA};
    }

    public int c(int i) {
        return this.b[(r0.length - 1) - i];
    }

    public int[] d() {
        return this.b;
    }

    public int e() {
        return this.b.length - 1;
    }

    public boolean f() {
        return this.b[0] == 0;
    }

    public hi2 g(hi2 hi2Var) {
        if (!this.a.equals(hi2Var.a)) {
            throw new IllegalArgumentException("GF256Polys do not have same GF256 field");
        }
        if (f() || hi2Var.f()) {
            return this.a.d();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = hi2Var.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = gi2.a(iArr3[i4], this.a.g(i2, iArr2[i3]));
            }
        }
        return new hi2(this.a, iArr3);
    }

    public hi2 h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.d();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.g(this.b[i3], i2);
        }
        return new hi2(this.a, iArr);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(e() * 8);
        for (int iE = e(); iE >= 0; iE--) {
            int iC = c(iE);
            if (iC != 0) {
                if (iC < 0) {
                    stringBuffer.append(" - ");
                    iC = -iC;
                } else if (stringBuffer.length() > 0) {
                    stringBuffer.append(" + ");
                }
                if (iE == 0 || iC != 1) {
                    int iF = this.a.f(iC);
                    if (iF == 0) {
                        stringBuffer.append('1');
                    } else if (iF == 1) {
                        stringBuffer.append('a');
                    } else {
                        stringBuffer.append("a^");
                        stringBuffer.append(iF);
                    }
                }
                if (iE != 0) {
                    if (iE == 1) {
                        stringBuffer.append('x');
                    } else {
                        stringBuffer.append("x^");
                        stringBuffer.append(iE);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
