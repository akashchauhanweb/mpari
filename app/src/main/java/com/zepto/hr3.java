package com.zepto;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr3 implements TypeEvaluator {
    public final float[] a = new float[9];
    public final float[] b = new float[9];
    public final Matrix c = new Matrix();

    public Matrix a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float f3 = this.a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
