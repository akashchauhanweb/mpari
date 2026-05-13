package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class k41 extends pz0 {
    public float a = -1.0f;

    @Override // com.zepto.pz0
    public void a(g06 g06Var, float f, float f2, float f3) {
        g06Var.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        g06Var.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
