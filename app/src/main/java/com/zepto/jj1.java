package com.zepto;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj1 {
    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, ry4.a);
    }

    public static boolean b(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, ry4.d);
    }

    public static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, ry4.e);
    }

    public static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, ry4.c) || c(context, str2, ry4.b);
    }

    public static boolean h(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !d(context, str, ry4.f);
    }
}
