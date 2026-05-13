package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ps7 {
    public static final ps7 k = k(oa0.c, (float) ((((double) oa0.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    public ps7(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }

    public static ps7 k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = oa0.a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fD = ((double) f12) >= 0.9d ? oa0.d(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : oa0.d(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f) * 5.0d)));
        float fH = oa0.h(f2) / fArr[1];
        double d2 = fH;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), fPow2};
        float f16 = fArr7[0];
        float f17 = fArr7[1];
        return new ps7(fH, ((((f16 * 400.0f) / (f16 + 27.13f)) * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fD, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.c;
    }

    public float[] i() {
        return this.g;
    }

    public float j() {
        return this.j;
    }
}
