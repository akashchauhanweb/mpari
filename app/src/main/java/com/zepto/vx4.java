package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class vx4 {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean b(Context context) {
        return a(context).getBoolean("proxy_notification_initialized", false);
    }

    public static void c(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = a(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z);
        editorEdit.apply();
    }
}
