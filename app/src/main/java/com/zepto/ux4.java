package com.zepto;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ux4 {
    public static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void c(Context context) {
        if (vx4.b(context)) {
            return;
        }
        e(new hw4(), context, f(context));
    }

    public static /* synthetic */ void d(Context context, boolean z, rc6 rc6Var) {
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            vx4.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            rc6Var.e(null);
        }
    }

    public static Task e(Executor executor, final Context context, final boolean z) {
        if (!ls4.i()) {
            return gd6.e(null);
        }
        final rc6 rc6Var = new rc6();
        executor.execute(new Runnable() { // from class: com.zepto.tx4
            @Override // java.lang.Runnable
            public final void run() {
                ux4.d(context, z, rc6Var);
            }
        });
        return rc6Var.a();
    }

    public static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
