package com.zepto;

import android.R;
import android.content.Context;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class lz1 {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iB = sq3.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iB);
            }
            if (z3) {
                num2 = Integer.valueOf(iB);
            }
        }
        zu7.b(window, !z);
        int iC = c(window.getContext(), z);
        int iB2 = b(window.getContext(), z);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, sq3.h(num.intValue())));
        e(window, d(iB2, sq3.h(num2.intValue())));
    }

    public static int b(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return sq3.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return sq3.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i, boolean z) {
        return sq3.h(i) || (i == 0 && z);
    }

    public static void e(Window window, boolean z) {
        zu7.a(window, window.getDecorView()).b(z);
    }

    public static void f(Window window, boolean z) {
        zu7.a(window, window.getDecorView()).c(z);
    }
}
