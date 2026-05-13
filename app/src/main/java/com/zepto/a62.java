package com.zepto;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a62 {

    public static class a implements Executor {
        public final Handler c;

        public a(Handler handler) {
            this.c = (Handler) lu4.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.c.post((Runnable) lu4.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.c + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
