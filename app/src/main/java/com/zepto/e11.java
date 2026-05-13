package com.zepto;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class e11 {
    public static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            iu4.i(context);
            iu4.i(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
