package com.zepto;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs7 extends es7 {
    public static boolean d = true;
    public static boolean e = true;

    @Override // com.zepto.ns7
    public void g(View view, Matrix matrix) {
        if (d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    @Override // com.zepto.ns7
    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
