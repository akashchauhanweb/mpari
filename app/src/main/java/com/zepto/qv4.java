package com.zepto;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class qv4 implements ThreadFactory {
    public final int a;

    public class a implements Runnable {
        public final /* synthetic */ Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(qv4.this.a);
            } catch (Throwable unused) {
            }
            this.c.run();
        }
    }

    public qv4(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
