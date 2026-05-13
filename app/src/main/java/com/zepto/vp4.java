package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class vp4 {
    public tp4[] a;
    public float[] b;
    public float[] c;
    public float d;
    public boolean e;
    public int[] f;

    public vp4(tp4[] tp4VarArr) {
        this.d = 0.0f;
        this.e = false;
        this.a = tp4VarArr;
        this.b = new float[tp4VarArr.length];
        d();
    }

    public static float g(tr0 tr0Var, float f, float f2, float f3, float f4) {
        if (f > f3) {
            f3 = f;
        }
        if (f2 > f4) {
            f4 = f2;
        }
        tr0Var.E(f, f2, f3, f4);
        return f4;
    }

    public float a() {
        this.d = 0.0f;
        int i = 0;
        while (true) {
            tp4[] tp4VarArr = this.a;
            if (i >= tp4VarArr.length) {
                this.e = true;
                return this.d;
            }
            tp4 tp4Var = tp4VarArr[i];
            if (tp4Var != null) {
                float fB0 = tp4Var.b0();
                if (fB0 > this.d && tp4Var.d0() == 1) {
                    this.d = fB0;
                }
            }
            i++;
        }
    }

    public tp4[] b() {
        return this.a;
    }

    public float c() {
        return this.e ? this.d : a();
    }

    public void d() {
        this.c = new float[this.a.length];
        int i = 0;
        while (true) {
            float[] fArr = this.c;
            if (i >= fArr.length) {
                return;
            }
            fArr[i] = 0.0f;
            i++;
        }
    }

    public void e(po4[] po4VarArr) {
        for (int i = 0; i < 4; i++) {
            o80 o80VarP = po4VarArr[i].p();
            int iX0 = o80VarP.x0();
            po4VarArr[i].G();
            int[] iArr = this.f;
            int i2 = i * 2;
            if (iX0 == iArr[i2 + 1]) {
                o80VarP.p0(iArr[i2]);
            }
        }
    }

    public void f(po4[] po4VarArr, float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f == null) {
            this.f = new int[8];
        }
        for (int i = 0; i < 4; i++) {
            o80 o80VarP = po4VarArr[i].p();
            int i2 = i * 2;
            this.f[i2] = o80VarP.x0();
            po4VarArr[i].I();
            po4VarArr[i].i(f, f2, f3, f4, f5, f6);
            this.f[i2 + 1] = o80VarP.x0();
        }
    }

    public void h(int i, float f) {
        if (i < 0 || i >= this.a.length) {
            return;
        }
        this.c[i] = f;
    }

    public void i(float f) {
        this.d = f;
    }

    public boolean j(float[] fArr) {
        int length = fArr.length;
        tp4[] tp4VarArr = this.a;
        int i = 0;
        if (length != tp4VarArr.length) {
            return false;
        }
        System.arraycopy(fArr, 0, this.b, 0, tp4VarArr.length);
        this.e = false;
        float f = 0.0f;
        while (i < fArr.length) {
            tp4 tp4Var = this.a[i];
            if (tp4Var == null) {
                f += fArr[i];
            } else {
                tp4Var.I(f);
                int iQ = tp4Var.Q() + i;
                while (i < iQ) {
                    f += fArr[i];
                    i++;
                }
                i--;
                tp4Var.J(f);
                tp4Var.L(0.0f);
            }
            i++;
        }
        return true;
    }

    public vp4 k(wp4 wp4Var, int i, float f) {
        float fG;
        boolean z;
        wp4 wp4Var2 = wp4Var;
        int i2 = i;
        tp4[] tp4VarArr = this.a;
        tp4[] tp4VarArr2 = new tp4[tp4VarArr.length];
        float[] fArr = new float[tp4VarArr.length];
        float[] fArr2 = new float[tp4VarArr.length];
        int i3 = 0;
        boolean z2 = true;
        while (true) {
            tp4[] tp4VarArr3 = this.a;
            if (i3 >= tp4VarArr3.length) {
                break;
            }
            tp4 tp4Var = tp4VarArr3[i3];
            if (tp4Var != null) {
                fArr[i3] = tp4Var.X();
                fArr2[i3] = tp4Var.c0();
                tp4Var.Z();
                tp4 tp4Var2 = new tp4(tp4Var);
                tr0 tr0VarD = tr0.d(tp4Var.R());
                float fP = tp4Var.p() + tp4Var.U();
                float fW = (tp4Var.w() + tp4Var.S()) - f;
                float fS = tp4Var.s() - tp4Var.V();
                float fW2 = tp4Var.w() - tp4Var.W();
                int iV = tp4Var.v();
                if (iV == 90 || iV == 270) {
                    fG = g(tr0VarD, fW, fP, fW2, fS);
                } else {
                    float f2 = fW + 1.0E-5f;
                    if (tp4Var.i0()) {
                        fS = 20000.0f;
                    }
                    fG = g(tr0VarD, fP, f2, fS, fW2);
                }
                try {
                    int iP = tr0VarD.p(true);
                    boolean z3 = tr0VarD.n() == fG;
                    if (z3) {
                        tp4Var2.m0(tr0.d(tp4Var.R()));
                        tr0VarD.x(0.0f);
                        z = true;
                    } else {
                        z = true;
                        if ((iP & 1) == 0) {
                            tp4Var2.m0(tr0VarD);
                            tr0VarD.x(0.0f);
                        } else {
                            tp4Var2.r0(null);
                        }
                    }
                    z2 = (z2 && z3) ? z : false;
                    tp4VarArr2[i3] = tp4Var2;
                    tp4Var.n0(f);
                } catch (cu1 e) {
                    throw new p52(e);
                }
            } else if (wp4Var2.L(i2, i3)) {
                float fS2 = wp4Var.s(i) + f;
                int i4 = i2;
                while (true) {
                    i4--;
                    if (!wp4Var2.L(i4, i3)) {
                        break;
                    }
                    fS2 += wp4Var2.s(i4);
                }
                vp4 vp4VarQ = wp4Var2.q(i4);
                if (vp4VarQ != null && vp4VarQ.b()[i3] != null) {
                    tp4 tp4Var3 = new tp4(vp4VarQ.b()[i3]);
                    tp4VarArr2[i3] = tp4Var3;
                    tp4Var3.N(fS2);
                    tp4VarArr2[i3].s0((vp4VarQ.b()[i3].d0() - i2) + i4);
                    z2 = false;
                }
            }
            i3++;
            wp4Var2 = wp4Var;
            i2 = i;
        }
        if (!z2) {
            a();
            vp4 vp4Var = new vp4(tp4VarArr2);
            vp4Var.b = (float[]) this.b.clone();
            vp4Var.a();
            return vp4Var;
        }
        int i5 = 0;
        while (true) {
            tp4[] tp4VarArr4 = this.a;
            if (i5 >= tp4VarArr4.length) {
                return null;
            }
            tp4 tp4Var4 = tp4VarArr4[i5];
            if (tp4Var4 != null) {
                float f3 = fArr[i5];
                if (f3 > 0.0f) {
                    tp4Var4.n0(f3);
                } else {
                    tp4Var4.p0(fArr2[i5]);
                }
            }
            i5++;
        }
    }

    public void l(float f, float f2, float f3, tp4 tp4Var, po4[] po4VarArr) {
        p40 p40VarB = tp4Var.b();
        if (p40VarB != null || tp4Var.C()) {
            float fS = tp4Var.s() + f;
            float fW = tp4Var.w() + f2;
            float fP = tp4Var.p() + f;
            float f4 = fW - f3;
            if (p40VarB != null) {
                po4 po4Var = po4VarArr[1];
                po4Var.M(p40VarB);
                po4Var.z(fP, f4, fS - fP, fW - f4);
                po4Var.m();
            }
            if (tp4Var.C()) {
                i65 i65Var = new i65(fP, f4, fS, fW);
                i65Var.a(tp4Var);
                i65Var.E(null);
                po4VarArr[2].A(i65Var);
            }
        }
    }

    public void m(int i, int i2, float f, float f2, po4[] po4VarArr) {
        float fP;
        float fA;
        float fP2;
        int i3;
        float fW;
        float fW2;
        if (!this.e) {
            a();
        }
        int length = i2 < 0 ? this.a.length : Math.min(i2, this.a.length);
        int i4 = i < 0 ? 0 : i;
        if (i4 >= length) {
            return;
        }
        int i5 = i4;
        float fP3 = f;
        while (i5 >= 0 && this.a[i5] == null) {
            if (i5 > 0) {
                fP3 -= this.b[i5 - 1];
            }
            i5--;
        }
        int i6 = i5 >= 0 ? i5 : 0;
        tp4 tp4Var = this.a[i6];
        if (tp4Var != null) {
            fP3 -= tp4Var.p();
        }
        float f3 = fP3;
        for (int i7 = i6; i7 < length; i7++) {
            tp4 tp4Var2 = this.a[i7];
            if (tp4Var2 != null) {
                float f4 = this.d + this.c[i7];
                l(f3, f2, f4, tp4Var2, po4VarArr);
                tp4Var2.Z();
                float fW3 = (tp4Var2.w() + f2) - tp4Var2.W();
                if (tp4Var2.o() <= f4) {
                    int iF0 = tp4Var2.f0();
                    if (iF0 == 5) {
                        fW = tp4Var2.w() + f2 + ((tp4Var2.o() - f4) / 2.0f);
                        fW2 = tp4Var2.W();
                    } else if (iF0 == 6) {
                        fW = ((tp4Var2.w() + f2) - f4) + tp4Var2.o();
                        fW2 = tp4Var2.W();
                    }
                    fW3 = fW - fW2;
                }
                if (tp4Var2.v() == 90 || tp4Var2.v() == 270) {
                    float fW4 = (f4 - tp4Var2.W()) - tp4Var2.S();
                    float fA2 = (tp4Var2.A() - tp4Var2.U()) - tp4Var2.V();
                    tr0 tr0VarD = tr0.d(tp4Var2.R());
                    tr0VarD.v(po4VarArr);
                    tr0VarD.E(0.0f, 0.0f, 0.001f + fW4, -fA2);
                    try {
                        tr0VarD.p(true);
                        float fI = -tr0VarD.n();
                        if (fW4 <= 0.0f || fA2 <= 0.0f) {
                            fI = 0.0f;
                        }
                        if (fI > 0.0f) {
                            if (tp4Var2.k0()) {
                                fI -= tr0VarD.i();
                            }
                            tr0 tr0VarD2 = tr0.d(tp4Var2.R());
                            tr0VarD2.v(po4VarArr);
                            tr0VarD2.E(-0.003f, -0.001f, fW4 + 0.003f, fI);
                            if (tp4Var2.v() == 90) {
                                float fW5 = ((tp4Var2.w() + f2) - f4) + tp4Var2.S();
                                int iF02 = tp4Var2.f0();
                                f(po4VarArr, 0.0f, 1.0f, -1.0f, 0.0f, iF02 != 5 ? iF02 != 6 ? tp4Var2.p() + f3 + tp4Var2.U() + fI : ((tp4Var2.p() + f3) + tp4Var2.A()) - tp4Var2.V() : tp4Var2.p() + f3 + ((((tp4Var2.A() + tp4Var2.U()) - tp4Var2.V()) + fI) / 2.0f), fW5);
                            } else {
                                float fW6 = (tp4Var2.w() + f2) - tp4Var2.W();
                                int iF03 = tp4Var2.f0();
                                if (iF03 == 5) {
                                    fP = tp4Var2.p() + f3;
                                    fA = (((tp4Var2.A() + tp4Var2.U()) - tp4Var2.V()) - fI) / 2.0f;
                                } else if (iF03 != 6) {
                                    fP2 = (((tp4Var2.p() + f3) + tp4Var2.A()) - tp4Var2.V()) - fI;
                                    f(po4VarArr, 0.0f, -1.0f, 1.0f, 0.0f, fP2, fW6);
                                } else {
                                    fP = tp4Var2.p() + f3;
                                    fA = tp4Var2.U();
                                }
                                fP2 = fP + fA;
                                f(po4VarArr, 0.0f, -1.0f, 1.0f, 0.0f, fP2, fW6);
                            }
                            try {
                                try {
                                    tr0VarD2.o();
                                } finally {
                                    e(po4VarArr);
                                }
                            } catch (cu1 e) {
                                throw new p52(e);
                            }
                        }
                    } catch (cu1 e2) {
                        throw new p52(e2);
                    }
                } else {
                    float fX = tp4Var2.X();
                    float fS = (tp4Var2.s() + f3) - tp4Var2.V();
                    float fP4 = tp4Var2.p() + f3 + tp4Var2.U();
                    if (tp4Var2.i0()) {
                        int iY = tp4Var2.Y();
                        if (iY == 1) {
                            fS += 10000.0f;
                            fP4 -= 10000.0f;
                        } else if (iY == 2 ? tp4Var2.v() != 180 : tp4Var2.v() == 180) {
                            fP4 -= 20000.0f;
                        } else {
                            fS += 20000.0f;
                        }
                    }
                    tr0 tr0VarD3 = tr0.d(tp4Var2.R());
                    tr0VarD3.v(po4VarArr);
                    float fW7 = fW3 - ((f4 - tp4Var2.W()) - tp4Var2.S());
                    if (fX > 0.0f && tp4Var2.o() > f4) {
                        fW3 = (tp4Var2.w() + f2) - tp4Var2.W();
                        fW7 = tp4Var2.S() + ((tp4Var2.w() + f2) - f4);
                    }
                    if ((fW3 > fW7 || tr0VarD3.O()) && fP4 < fS) {
                        tr0VarD3.E(fP4, fW7 - 0.001f, fS, fW3);
                        if (tp4Var2.v() == 180) {
                            i3 = 180;
                            f(po4VarArr, -1.0f, 0.0f, 0.0f, -1.0f, fP4 + fS, (((f2 + f2) - f4) + tp4Var2.S()) - tp4Var2.W());
                        } else {
                            i3 = 180;
                        }
                        try {
                            try {
                                tr0VarD3.o();
                            } catch (cu1 e3) {
                                throw new p52(e3);
                            }
                        } finally {
                            if (tp4Var2.v() == i3) {
                            }
                        }
                    }
                }
                tp4Var2.P();
            }
        }
    }

    public vp4(vp4 vp4Var) {
        this.d = 0.0f;
        this.e = false;
        this.d = vp4Var.d;
        this.e = vp4Var.e;
        this.a = new tp4[vp4Var.a.length];
        int i = 0;
        while (true) {
            tp4[] tp4VarArr = this.a;
            if (i < tp4VarArr.length) {
                tp4 tp4Var = vp4Var.a[i];
                if (tp4Var != null) {
                    tp4VarArr[i] = new tp4(tp4Var);
                }
                i++;
            } else {
                float[] fArr = new float[tp4VarArr.length];
                this.b = fArr;
                System.arraycopy(vp4Var.b, 0, fArr, 0, tp4VarArr.length);
                d();
                return;
            }
        }
    }
}
