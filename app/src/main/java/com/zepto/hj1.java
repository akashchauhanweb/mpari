package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj1 {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            boolean z = false;
            if (ls4.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if (ls4.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context) && !ls4.f()) {
            return true;
        }
        if (d(context)) {
            return !ls4.g() || ls4.j();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (b == null) {
            boolean z = false;
            if (ls4.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}
