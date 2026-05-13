package com.zepto;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class c62 extends b62 implements ah1 {
    public final Executor f;

    public c62(Executor executor) {
        this.f = executor;
        uv0.a(C0());
    }

    public final void B0(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        k43.c(coroutineContext, q52.a("The task was rejected", rejectedExecutionException));
    }

    public Executor C0() {
        return this.f;
    }

    @Override // com.zepto.ah1
    public void D(long j, ya0 ya0Var) {
        Executor executorC0 = C0();
        ScheduledExecutorService scheduledExecutorService = executorC0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorC0 : null;
        ScheduledFuture scheduledFutureD0 = scheduledExecutorService != null ? D0(scheduledExecutorService, new yd5(this, ya0Var), ya0Var.get$context(), j) : null;
        if (scheduledFutureD0 != null) {
            k43.e(ya0Var, scheduledFutureD0);
        } else {
            hf1.k.D(j, ya0Var);
        }
    }

    public final ScheduledFuture D0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            B0(coroutineContext, e);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorC0 = C0();
        ExecutorService executorService = executorC0 instanceof ExecutorService ? (ExecutorService) executorC0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof c62) && ((c62) obj).C0() == C0();
    }

    public int hashCode() {
        return System.identityHashCode(C0());
    }

    @Override // com.zepto.sz0
    public String toString() {
        return C0().toString();
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorC0 = C0();
            v2.a();
            executorC0.execute(runnable);
        } catch (RejectedExecutionException e) {
            v2.a();
            B0(coroutineContext, e);
            qk1.b().x0(coroutineContext, runnable);
        }
    }
}
