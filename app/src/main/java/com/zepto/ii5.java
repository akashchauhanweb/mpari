package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ii5 implements Executor {
    public final Executor c;

    public static class a implements Runnable {
        public final Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.c.run();
            } catch (Exception e) {
                yn3.c("Executor", "Background execution failure.", e);
            }
        }
    }

    public ii5(Executor executor) {
        this.c = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.c.execute(new a(runnable));
    }
}
