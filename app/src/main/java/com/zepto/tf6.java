package com.zepto;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tf6 {
    public final lf5 a;
    public final gy7 b;
    public final long c;
    public final Object d;
    public final Map e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tf6(lf5 runnableScheduler, gy7 launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
    }

    public static final void d(tf6 this$0, o66 token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        this$0.b.b(token, 3);
    }

    public final void b(o66 token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(token);
        }
        if (runnable != null) {
            this.a.b(runnable);
        }
    }

    public final void c(final o66 token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Runnable runnable = new Runnable() { // from class: com.zepto.sf6
            @Override // java.lang.Runnable
            public final void run() {
                tf6.d(this.c, token);
            }
        };
        synchronized (this.d) {
        }
        this.a.a(this.c, runnable);
    }

    public tf6(lf5 runnableScheduler, gy7 launcher, long j) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.a = runnableScheduler;
        this.b = launcher;
        this.c = j;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public /* synthetic */ tf6(lf5 lf5Var, gy7 gy7Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lf5Var, gy7Var, (i & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j);
    }
}
