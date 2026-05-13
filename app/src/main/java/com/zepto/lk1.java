package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends np5 {
    public static final AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(lk1.class, "_decision");

    @Volatile
    private volatile int _decision;

    public lk1(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean H0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!h.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean I0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!h.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // com.zepto.np5, com.zepto.e2
    public void C0(Object obj) {
        if (H0()) {
            return;
        }
        kk1.c(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.g), qt0.a(obj, this.g), null, 2, null);
    }

    public final Object G0() {
        if (I0()) {
            return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objH = q43.h(S());
        if (objH instanceof mt0) {
            throw ((mt0) objH).a;
        }
        return objH;
    }

    @Override // com.zepto.np5, com.zepto.p43
    public void u(Object obj) {
        C0(obj);
    }
}
