package com.zepto;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class sw0 {

    public static class a {
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }
}
