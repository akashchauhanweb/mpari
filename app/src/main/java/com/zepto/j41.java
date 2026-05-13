package com.zepto;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class j41 implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public j41(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.c);
        StrictMode.ThreadPolicy threadPolicy = this.d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = e.newThread(new Runnable() { // from class: com.zepto.i41
            @Override // java.lang.Runnable
            public final void run() {
                this.c.b(runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.a.getAndIncrement())));
        return threadNewThread;
    }
}
