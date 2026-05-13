package com.zepto;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class v58 implements Runnable {
    public final Runnable c;

    public v58(Runnable runnable, int i) {
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.c.run();
    }
}
