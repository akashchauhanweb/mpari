package com.zepto;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ry5 implements qy5 {
    public final Executor e;
    public Runnable f;
    public final ArrayDeque c = new ArrayDeque();
    public final Object g = new Object();

    public static class a implements Runnable {
        public final ry5 c;
        public final Runnable e;

        public a(ry5 ry5Var, Runnable runnable) {
            this.c = ry5Var;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.e.run();
                synchronized (this.c.g) {
                    this.c.a();
                }
            } catch (Throwable th) {
                synchronized (this.c.g) {
                    this.c.a();
                    throw th;
                }
            }
        }
    }

    public ry5(Executor executor) {
        this.e = executor;
    }

    public void a() {
        Runnable runnable = (Runnable) this.c.poll();
        this.f = runnable;
        if (runnable != null) {
            this.e.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.g) {
            try {
                this.c.add(new a(this, runnable));
                if (this.f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.zepto.qy5
    public boolean m0() {
        boolean z;
        synchronized (this.g) {
            z = !this.c.isEmpty();
        }
        return z;
    }
}
