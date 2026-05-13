package com.zepto;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ev1 extends ThreadPoolExecutor {
    public ev1(int i, ThreadFactory threadFactory) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        bw1 bw1Var = new bw1((qw1) runnable);
        execute(bw1Var);
        return bw1Var;
    }
}
