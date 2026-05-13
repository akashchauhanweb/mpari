package com.zepto;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class la0 {
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
