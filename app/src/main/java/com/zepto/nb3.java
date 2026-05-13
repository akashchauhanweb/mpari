package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends tg1 {
    public final Continuation g;

    public nb3(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.g = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // com.zepto.p43
    public void m0() throws Throwable {
        cb0.b(this.g, this);
    }
}
