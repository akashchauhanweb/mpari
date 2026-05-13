package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class f03 {
    public static Context a;
    public static Boolean b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (ls4.g()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }
}
