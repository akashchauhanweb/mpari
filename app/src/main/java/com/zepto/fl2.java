package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class fl2 implements Executor {
    public final Handler c;

    public fl2(Looper looper) {
        this.c = new th8(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
