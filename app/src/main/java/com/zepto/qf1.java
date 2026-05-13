package com.zepto;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qf1 extends b62 implements Executor {
    public static final qf1 f = new qf1();
    public static final sz0 g = xp6.e.A0(na6.e("kotlinx.coroutines.io.parallelism", RangesKt___RangesKt.coerceAtLeast(64, la6.a()), 0, 0, 12, null));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x0(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // com.zepto.sz0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        g.x0(coroutineContext, runnable);
    }

    @Override // com.zepto.sz0
    public void y0(CoroutineContext coroutineContext, Runnable runnable) {
        g.y0(coroutineContext, runnable);
    }
}
