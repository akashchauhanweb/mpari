package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes3.dex */
public final class jf3 extends sz0 implements ah1 {
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(jf3.class, "runningWorkers");
    public final sz0 e;
    public final int f;
    public final /* synthetic */ ah1 g;
    public final gn3 h;
    public final Object i;

    @Volatile
    private volatile int runningWorkers;

    public final class a implements Runnable {
        public Runnable c;

        public a(Runnable runnable) {
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.c.run();
                } catch (Throwable th) {
                    wz0.a(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableD0 = jf3.this.D0();
                if (runnableD0 == null) {
                    return;
                }
                this.c = runnableD0;
                i++;
                if (i >= 16 && jf3.this.e.z0(jf3.this)) {
                    jf3.this.e.x0(jf3.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jf3(sz0 sz0Var, int i) {
        this.e = sz0Var;
        this.f = i;
        ah1 ah1Var = sz0Var instanceof ah1 ? (ah1) sz0Var : null;
        this.g = ah1Var == null ? if1.a() : ah1Var;
        this.h = new gn3(false);
        this.i = new Object();
    }

    @Override // com.zepto.ah1
    public void D(long j2, ya0 ya0Var) {
        this.g.D(j2, ya0Var);
    }

    public final Runnable D0() {
        while (true) {
            Runnable runnable = (Runnable) this.h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean E0() {
        synchronized (this.i) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            if (atomicIntegerFieldUpdater.get(this) >= this.f) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableD0;
        this.h.a(runnable);
        if (j.get(this) >= this.f || !E0() || (runnableD0 = D0()) == null) {
            return;
        }
        this.e.x0(this, new a(runnableD0));
    }

    @Override // com.zepto.sz0
    public void y0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableD0;
        this.h.a(runnable);
        if (j.get(this) >= this.f || !E0() || (runnableD0 = D0()) == null) {
            return;
        }
        this.e.y0(this, new a(runnableD0));
    }
}
