package com.zepto;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class zu7 {

    public static class a {
        public static void a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static rw7 a(Window window, View view) {
        return new rw7(window, view);
    }

    public static void b(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
