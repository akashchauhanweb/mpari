package com.zepto;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w34 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
