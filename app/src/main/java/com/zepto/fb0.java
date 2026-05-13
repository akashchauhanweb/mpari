package com.zepto;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends mt0 {
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(fb0.class, "_resumed");

    @Volatile
    private volatile int _resumed;

    public fb0(Continuation continuation, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + continuation + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    public final boolean c() {
        return c.compareAndSet(this, 0, 1);
    }
}
