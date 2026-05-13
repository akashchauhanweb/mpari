package com.nic.mparivahan;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final C0058a a = new C0058a(null);

    /* JADX INFO: renamed from: com.nic.mparivahan.a$a, reason: collision with other inner class name */
    public static final class C0058a {
        public C0058a() {
        }

        public /* synthetic */ C0058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Context context) {
            NetworkCapabilities networkCapabilities;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
        }
    }
}
