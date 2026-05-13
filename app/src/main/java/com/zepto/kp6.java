package com.zepto;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public enum kp6 implements Executor {
    INSTANCE;

    public static final Handler e = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        e.post(runnable);
    }
}
