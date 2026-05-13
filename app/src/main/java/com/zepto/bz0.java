package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz0 {
    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
