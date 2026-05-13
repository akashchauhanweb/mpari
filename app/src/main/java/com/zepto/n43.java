package com.zepto;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class n43 implements xf3 {
    public final e43 c;
    public final nz5 e;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!n43.this.e.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    n43.this.e.cancel(true);
                    return;
                }
                nz5 nz5Var = n43.this.e;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                nz5Var.q(th);
            }
        }
    }

    public n43(e43 job, nz5 underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.c = job;
        this.e = underlying;
        job.j(new a());
    }

    @Override // com.zepto.xf3
    public void a(Runnable runnable, Executor executor) {
        this.e.a(runnable, executor);
    }

    public final void c(Object obj) {
        this.e.p(obj);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.e.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.e.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.e.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.e.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n43(e43 e43Var, nz5 nz5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            nz5Var = nz5.t();
            Intrinsics.checkNotNullExpressionValue(nz5Var, "create()");
        }
        this(e43Var, nz5Var);
    }
}
