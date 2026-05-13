package com.zepto;

import com.zepto.x42;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class hf1 extends x42 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final hf1 k;
    public static final long l;

    static {
        Long l2;
        hf1 hf1Var = new hf1();
        k = hf1Var;
        w42.G0(hf1Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = timeUnit.toNanos(l2.longValue());
    }

    @Override // com.zepto.y42
    public Thread K0() {
        Thread thread = _thread;
        return thread == null ? c1() : thread;
    }

    @Override // com.zepto.y42
    public void L0(long j, x42.b bVar) {
        g1();
    }

    @Override // com.zepto.x42
    public void Q0(Runnable runnable) {
        if (d1()) {
            g1();
        }
        super.Q0(runnable);
    }

    public final synchronized void b1() {
        if (e1()) {
            debugStatus = 3;
            W0();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread c1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean d1() {
        return debugStatus == 4;
    }

    public final boolean e1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final synchronized boolean f1() {
        if (e1()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void g1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zT0;
        mf6.a.c(this);
        v2.a();
        try {
            if (!f1()) {
                if (zT0) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jU0 = U0();
                if (jU0 == LongCompanionObject.MAX_VALUE) {
                    v2.a();
                    long jNanoTime = System.nanoTime();
                    if (j == LongCompanionObject.MAX_VALUE) {
                        j = l + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        b1();
                        v2.a();
                        if (T0()) {
                            return;
                        }
                        K0();
                        return;
                    }
                    jU0 = RangesKt___RangesKt.coerceAtMost(jU0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jU0 > 0) {
                    if (e1()) {
                        _thread = null;
                        b1();
                        v2.a();
                        if (T0()) {
                            return;
                        }
                        K0();
                        return;
                    }
                    v2.a();
                    LockSupport.parkNanos(this, jU0);
                }
            }
        } finally {
            _thread = null;
            b1();
            v2.a();
            if (!T0()) {
                K0();
            }
        }
    }

    @Override // com.zepto.x42, com.zepto.w42
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
