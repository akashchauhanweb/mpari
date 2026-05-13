package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ar7 {
    public final Class a;
    public final Function1 b;

    public ar7(Class clazz, Function1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.a = clazz;
        this.b = initializer;
    }

    public final Class a() {
        return this.a;
    }

    public final Function1 b() {
        return this.b;
    }
}
