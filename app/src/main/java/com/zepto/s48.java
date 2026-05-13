package com.zepto;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class s48 {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
