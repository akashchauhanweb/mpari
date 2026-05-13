package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class zk4 {

    public static class a {
        public static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    public static class b {
        public static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.face");
        }

        public static boolean b(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
        }
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && b.a(context.getPackageManager());
    }

    public static boolean b(Context context) {
        return (context == null || context.getPackageManager() == null || !a.a(context.getPackageManager())) ? false : true;
    }

    public static boolean c(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && b.b(context.getPackageManager());
    }
}
