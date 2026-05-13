package com.zepto;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class t24 {
    public static final r24 a(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        s24 s24Var = new s24();
        optionsBuilder.invoke(s24Var);
        return s24Var.b();
    }
}
