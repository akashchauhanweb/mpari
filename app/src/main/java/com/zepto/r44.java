package com.zepto;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r44 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Application app) {
            Intrinsics.checkNotNullParameter(app, "app");
            Object systemService = app.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        }
    }
}
