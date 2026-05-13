package com.zepto;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class d98 {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
