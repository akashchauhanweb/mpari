package com.zepto;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class fl8 implements wc8 {
    @Override // com.zepto.wc8
    public final /* synthetic */ Object a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.zepto.sj8
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AssetPackBackgroundExecutor");
            }
        });
        tc8.a(executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }
}
