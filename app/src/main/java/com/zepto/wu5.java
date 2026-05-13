package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wu5 extends wv0 implements gc4 {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(wu5.class, "cleanedAndPointers");

    @Volatile
    private volatile int cleanedAndPointers;
    public final long f;

    public wu5(long j, wu5 wu5Var, int i) {
        super(wu5Var);
        this.f = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // com.zepto.wv0
    public boolean h() {
        return g.get(this) == n() && !i();
    }

    public final boolean m() {
        return g.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i, Throwable th, CoroutineContext coroutineContext);

    public final void p() {
        if (g.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
