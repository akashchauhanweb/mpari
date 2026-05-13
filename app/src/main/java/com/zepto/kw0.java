package com.zepto;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kw0 {
    public final l55 a;

    public kw0(l55 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    public final l55 a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kw0(int i, long j, TimeUnit timeUnit) {
        this(new l55(cd6.h, i, j, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public kw0() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
