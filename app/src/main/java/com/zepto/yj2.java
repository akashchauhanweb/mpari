package com.zepto;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class yj2 {
    public static final int a = ek2.a;
    public static final yj2 b = new yj2();

    public static yj2 e() {
        return b;
    }

    public Intent a(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return ql8.c("com.google.android.gms");
        }
        if (context != null && hj1.c(context)) {
            return ql8.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(lz7.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return ql8.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent b(Context context, int i, int i2) {
        return c(context, i, i2, null);
    }

    public PendingIntent c(Context context, int i, int i2, String str) {
        Intent intentA = a(context, i, str);
        if (intentA == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentA, nd8.a | 134217728);
    }

    public String d(int i) {
        return ek2.a(i);
    }

    public int f(Context context) {
        return g(context, a);
    }

    public int g(Context context, int i) {
        int iD = ek2.d(context, i);
        if (ek2.e(context, iD)) {
            return 18;
        }
        return iD;
    }

    public boolean h(Context context, String str) {
        return ek2.h(context, str);
    }

    public boolean i(int i) {
        return ek2.g(i);
    }
}
