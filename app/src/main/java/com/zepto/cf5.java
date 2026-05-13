package com.zepto;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cf5 {
    public final Set a = new LinkedHashSet();

    public final synchronized void a(bf5 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.a.remove(route);
    }

    public final synchronized void b(bf5 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.a.add(failedRoute);
    }

    public final synchronized boolean c(bf5 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.a.contains(route);
    }
}
