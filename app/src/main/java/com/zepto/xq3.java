package com.zepto;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class xq3 {
    public static pz0 a(int i) {
        return i != 0 ? i != 1 ? b() : new k41() : new ye5();
    }

    public static pz0 b() {
        return new ye5();
    }

    public static mz1 c() {
        return new mz1();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof wq3) {
            ((wq3) background).V(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof wq3) {
            f(view, (wq3) background);
        }
    }

    public static void f(View view, wq3 wq3Var) {
        if (wq3Var.O()) {
            wq3Var.Z(zr7.f(view));
        }
    }
}
