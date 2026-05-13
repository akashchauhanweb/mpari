package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class zz0 {
    public static final yz0 a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(e43.d) == null) {
            coroutineContext = coroutineContext.plus(m43.b(null, 1, null));
        }
        return new zy0(coroutineContext);
    }

    public static final yz0 b() {
        return new zy0(b96.b(null, 1, null).plus(qk1.c()));
    }

    public static final Object c(Function2 function2, Continuation continuation) {
        np5 np5Var = new np5(continuation.get$context(), continuation);
        Object objB = pp6.b(np5Var, np5Var, function2);
        if (objB == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objB;
    }

    public static final boolean d(yz0 yz0Var) {
        e43 e43Var = (e43) yz0Var.c().get(e43.d);
        if (e43Var != null) {
            return e43Var.isActive();
        }
        return true;
    }
}
