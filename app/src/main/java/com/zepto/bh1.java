package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh1 {
    public static final Object a(long j, Continuation continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        za0 za0Var = new za0(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        za0Var.z();
        if (j < LongCompanionObject.MAX_VALUE) {
            b(za0Var.get$context()).D(j, za0Var);
        }
        Object objW = za0Var.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : Unit.INSTANCE;
    }

    public static final ah1 b(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        ah1 ah1Var = element instanceof ah1 ? (ah1) element : null;
        return ah1Var == null ? if1.a() : ah1Var;
    }
}
