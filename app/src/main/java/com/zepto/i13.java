package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i13 extends g43 {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(i13.class, "_invoked");

    @Volatile
    private volatile int _invoked;
    public final Function1 h;

    public i13(Function1 function1) {
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // com.zepto.ot0
    public void r(Throwable th) {
        if (i.compareAndSet(this, 0, 1)) {
            this.h.invoke(th);
        }
    }
}
