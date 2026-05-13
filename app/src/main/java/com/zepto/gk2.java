package com.zepto;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class gk2 {
    public static gk2 b;
    public final Context a;

    public gk2(Context context) {
        this.a = context.getApplicationContext();
    }

    public static gk2 a(Context context) {
        iu4.i(context);
        synchronized (gk2.class) {
            try {
                if (b == null) {
                    mj8.a(context);
                    b = new gk2(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static final ci8 b(PackageInfo packageInfo, ci8... ci8VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        ki8 ki8Var = new ki8(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < ci8VarArr.length; i++) {
            if (ci8VarArr[i].equals(ki8Var)) {
                return ci8VarArr[i];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? b(packageInfo, cj8.a) : b(packageInfo, cj8.a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
