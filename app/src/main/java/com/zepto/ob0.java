package com.zepto;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob0 {
    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public abstract com.google.android.material.carousel.b c(kb0 kb0Var, View view);

    public abstract boolean d(kb0 kb0Var, int i);
}
