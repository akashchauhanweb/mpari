package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class pb8 {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
