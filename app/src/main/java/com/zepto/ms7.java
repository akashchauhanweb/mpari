package com.zepto;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ms7 extends ls7 {
    @Override // com.zepto.es7, com.zepto.ns7
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.zepto.js7, com.zepto.ns7
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.zepto.es7, com.zepto.ns7
    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.zepto.ls7, com.zepto.ns7
    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.zepto.hs7, com.zepto.ns7
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.zepto.hs7, com.zepto.ns7
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
