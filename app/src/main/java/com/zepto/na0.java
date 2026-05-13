package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class na0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public na0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static na0 b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        na0 na0Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iP = e(f8, f2, f).p();
            float fB = oa0.b(iP);
            float fAbs = Math.abs(f3 - fB);
            if (fAbs < 0.2f) {
                na0 na0VarC = c(iP);
                float fA = na0VarC.a(e(na0VarC.k(), na0VarC.i(), f));
                if (fA <= 1.0f) {
                    na0Var = na0VarC;
                    f5 = fAbs;
                    f7 = fA;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fB < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return na0Var;
    }

    public static na0 c(int i) {
        return d(i, ps7.k);
    }

    public static na0 d(int i, ps7 ps7Var) {
        float[] fArrF = oa0.f(i);
        float[][] fArr = oa0.a;
        float f = fArrF[0];
        float[] fArr2 = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArrF[1];
        float f4 = f2 + (fArr2[1] * f3);
        float f5 = fArrF[2];
        float f6 = f4 + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f) + (fArr3[1] * f3) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f * fArr4[0]) + (f3 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = ps7Var.i()[0] * f6;
        float f10 = ps7Var.i()[1] * f7;
        float f11 = ps7Var.i()[2] * f8;
        float fPow = (float) Math.pow(((double) (ps7Var.c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (ps7Var.c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (ps7Var.c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * ps7Var.f()) / ps7Var.a(), ps7Var.b() * ps7Var.j())) * 100.0f;
        float fD = ps7Var.d() * (4.0f / ps7Var.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (ps7Var.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, ps7Var.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f17) < 20.14d ? 360.0f + f17 : f17)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ps7Var.g()) * ps7Var.h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fD2 = fPow5 * ps7Var.d();
        float fSqrt = ((float) Math.sqrt((r3 * ps7Var.b()) / (ps7Var.a() + 4.0f))) * 50.0f;
        float f19 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d2 = f18;
        return new na0(f17, fPow5, fPow4, fD, fD2, fSqrt, f19, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static na0 e(float f, float f2, float f3) {
        return f(f, f2, f3, ps7.k);
    }

    public static na0 f(float f, float f2, float f3, ps7 ps7Var) {
        float fB = (4.0f / ps7Var.b()) * ((float) Math.sqrt(((double) f) / 100.0d)) * (ps7Var.a() + 4.0f) * ps7Var.d();
        float fD = f2 * ps7Var.d();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * ps7Var.b()) / (ps7Var.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new na0(f3, f2, f, fB, fD, fSqrt, f4, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public static int m(float f, float f2, float f3) {
        return n(f, f2, f3, ps7.k);
    }

    public static int n(float f, float f2, float f3, ps7 ps7Var) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return oa0.a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        na0 na0Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            na0 na0VarB = b(fMin, f5, f3);
            if (!z) {
                if (na0VarB == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    na0Var = na0VarB;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (na0VarB != null) {
                    return na0VarB.o(ps7Var);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return na0Var == null ? oa0.a(f3) : na0Var.o(ps7Var);
    }

    public float a(na0 na0Var) {
        float fL = l() - na0Var.l();
        float fG = g() - na0Var.g();
        float fH = h() - na0Var.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(ps7 ps7Var) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, ps7Var.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = ps7Var.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) ps7Var.b())) / ((double) ps7Var.j())));
        float fG = fCos * 3846.1538f * ps7Var.g() * ps7Var.h();
        float f = fA / ps7Var.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f2 = (((0.305f + f) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float fSignum = Math.signum(f6) * (100.0f / ps7Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f7) * (100.0f / ps7Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / ps7Var.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f8 = fSignum / ps7Var.i()[0];
        float f9 = fSignum2 / ps7Var.i()[1];
        float f10 = fSignum3 / ps7Var.i()[2];
        float[][] fArr = oa0.b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return sr0.b(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    public int p() {
        return o(ps7.k);
    }
}
