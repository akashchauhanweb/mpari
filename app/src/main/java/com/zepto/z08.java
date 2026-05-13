package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class z08 {
    public static final Object a(Continuation continuation) {
        Object coroutine_suspended;
        CoroutineContext coroutineContext = continuation.get$context();
        k43.g(coroutineContext);
        Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        jk1 jk1Var = continuationIntercepted instanceof jk1 ? (jk1) continuationIntercepted : null;
        if (jk1Var == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (jk1Var.g.z0(coroutineContext)) {
                jk1Var.l(coroutineContext, Unit.INSTANCE);
            } else {
                y08 y08Var = new y08();
                CoroutineContext coroutineContextPlus = coroutineContext.plus(y08Var);
                Unit unit = Unit.INSTANCE;
                jk1Var.l(coroutineContextPlus, unit);
                coroutine_suspended = (!y08Var.c || kk1.d(jk1Var)) ? IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() : unit;
            }
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
