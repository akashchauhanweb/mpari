package com.zepto;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class us4 {
    public static final e62 a;
    public static volatile e62 b;

    public static class b implements e62 {
        public b() {
        }

        @Override // com.zepto.e62
        public ExecutorService a(ThreadFactory threadFactory, of6 of6Var) {
            return b(1, threadFactory, of6Var);
        }

        public ExecutorService b(int i, ThreadFactory threadFactory, of6 of6Var) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        a = bVar;
        b = bVar;
    }

    public static e62 a() {
        return b;
    }
}
