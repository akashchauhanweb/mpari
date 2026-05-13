package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class am8 implements Executor {
    public final Handler c = new g58(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
