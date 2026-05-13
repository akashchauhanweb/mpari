package com.zepto;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class p44 {
    public static final String a;

    static {
        String strI = rn3.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        a = strI;
    }

    public static final dx0 a(Context context, uc6 taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new o44(context, taskExecutor);
    }

    public static final n44 c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zD = d(connectivityManager);
        boolean zA = sw0.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new n44(z2, zD, zA, z);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = u34.a(connectivityManager, v34.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return u34.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e) {
            rn3.e().d(a, "Unable to validate active network", e);
            return false;
        }
    }
}
