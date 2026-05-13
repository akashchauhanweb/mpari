package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class sl8 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
