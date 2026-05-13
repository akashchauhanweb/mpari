package com.zepto;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o44 extends dx0 {
    public final ConnectivityManager f;
    public final a g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            rn3.e().a(p44.a, "Network capabilities changed: " + capabilities);
            o44 o44Var = o44.this;
            o44Var.g(p44.c(o44Var.f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            rn3.e().a(p44.a, "Network connection lost");
            o44 o44Var = o44.this;
            o44Var.g(p44.c(o44Var.f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o44(Context context, uc6 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new a();
    }

    @Override // com.zepto.dx0
    public void h() {
        try {
            rn3.e().a(p44.a, "Registering network callback");
            w34.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            rn3.e().d(p44.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            rn3.e().d(p44.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // com.zepto.dx0
    public void i() {
        try {
            rn3.e().a(p44.a, "Unregistering network callback");
            u34.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            rn3.e().d(p44.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            rn3.e().d(p44.a, "Received exception while unregistering network callback", e2);
        }
    }

    @Override // com.zepto.dx0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public n44 e() {
        return p44.c(this.f);
    }
}
