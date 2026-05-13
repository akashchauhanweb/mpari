package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class mt0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(mt0.class, "_handled");

    @Volatile
    private volatile int _handled;
    public final Throwable a;

    public mt0(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public final boolean a() {
        return b.get(this) != 0;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return me1.a(this) + '[' + this.a + ']';
    }

    public /* synthetic */ mt0(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
