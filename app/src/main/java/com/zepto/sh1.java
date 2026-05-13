package com.zepto;

import com.zepto.th1;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class sh1 implements ScheduledExecutorService {
    public final ExecutorService c;
    public final ScheduledExecutorService e;

    public sh1(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.c = executorService;
        this.e = scheduledExecutorService;
    }

    public static /* synthetic */ void o(Runnable runnable, th1.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void r(Callable callable, th1.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void u(Runnable runnable, th1.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
            throw e;
        }
    }

    public static /* synthetic */ void z(Runnable runnable, th1.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.c.isTerminated();
    }

    public final /* synthetic */ void p(final Runnable runnable, final th1.b bVar) {
        this.c.execute(new Runnable() { // from class: com.zepto.hh1
            @Override // java.lang.Runnable
            public final void run() {
                sh1.o(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture q(final Runnable runnable, long j, TimeUnit timeUnit, final th1.b bVar) {
        return this.e.schedule(new Runnable() { // from class: com.zepto.oh1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.p(runnable, bVar);
            }
        }, j, timeUnit);
    }

    public final /* synthetic */ Future s(final Callable callable, final th1.b bVar) {
        return this.c.submit(new Runnable() { // from class: com.zepto.qh1
            @Override // java.lang.Runnable
            public final void run() {
                sh1.r(callable, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new th1(new th1.c() { // from class: com.zepto.jh1
            @Override // com.zepto.th1.c
            public final ScheduledFuture a(th1.b bVar) {
                return this.a.q(runnable, j, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new th1(new th1.c() { // from class: com.zepto.lh1
            @Override // com.zepto.th1.c
            public final ScheduledFuture a(th1.b bVar) {
                return this.a.w(runnable, j, j2, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new th1(new th1.c() { // from class: com.zepto.kh1
            @Override // com.zepto.th1.c
            public final ScheduledFuture a(th1.b bVar) {
                return this.a.y(runnable, j, j2, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.c.submit(callable);
    }

    public final /* synthetic */ ScheduledFuture t(final Callable callable, long j, TimeUnit timeUnit, final th1.b bVar) {
        return this.e.schedule(new Callable() { // from class: com.zepto.ph1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s(callable, bVar);
            }
        }, j, timeUnit);
    }

    public final /* synthetic */ void v(final Runnable runnable, final th1.b bVar) {
        this.c.execute(new Runnable() { // from class: com.zepto.rh1
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                sh1.u(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final th1.b bVar) {
        return this.e.scheduleAtFixedRate(new Runnable() { // from class: com.zepto.mh1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.v(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    public final /* synthetic */ void x(final Runnable runnable, final th1.b bVar) {
        this.c.execute(new Runnable() { // from class: com.zepto.ih1
            @Override // java.lang.Runnable
            public final void run() {
                sh1.z(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture y(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final th1.b bVar) {
        return this.e.scheduleWithFixedDelay(new Runnable() { // from class: com.zepto.nh1
            @Override // java.lang.Runnable
            public final void run() {
                this.c.x(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new th1(new th1.c() { // from class: com.zepto.gh1
            @Override // com.zepto.th1.c
            public final ScheduledFuture a(th1.b bVar) {
                return this.a.t(callable, j, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.c.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.c.submit(runnable);
    }
}
