package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class x96 implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
