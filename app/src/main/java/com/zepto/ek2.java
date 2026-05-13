package com.zepto;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ek2 {
    public static final int a = 12451000;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean c = new AtomicBoolean();

    public static String a(int i) {
        return lw0.h(i);
    }

    public static Context b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ek2.d(android.content.Context, int):int");
    }

    public static boolean e(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return h(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean f(Context context) {
        if (!ls4.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        iu4.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean h(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (ls4.e()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, ConstantsKt.DEFAULT_BUFFER_SIZE);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !f(context);
    }
}
