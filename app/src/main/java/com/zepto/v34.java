package com.zepto;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class v34 {
    public static final Network a(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
