package com.zepto;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class zv0 {
    public static final int a = 8;

    public static final class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new Thread(runnable, (this.b ? "WM.task-" : "androidx.work-") + this.a.incrementAndGet());
        }
    }

    public static final Executor b(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final int c() {
        return a;
    }
}
