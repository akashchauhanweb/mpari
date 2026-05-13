package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pp6 {
    public static final void a(Function2 function2, Object obj, Continuation continuation) {
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext coroutineContext = continuation.get$context();
            Object objC = lf6.c(coroutineContext, null);
            try {
                Object objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, continuationProbeCoroutineCreated);
                if (objInvoke != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m6constructorimpl(objInvoke));
                }
            } finally {
                lf6.a(coroutineContext, objC);
            }
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public static final Object b(np5 np5Var, Object obj, Function2 function2) {
        Object mt0Var;
        Object objB0;
        try {
            mt0Var = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, np5Var);
        } catch (Throwable th) {
            mt0Var = new mt0(th, false, 2, null);
        }
        if (mt0Var != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() && (objB0 = np5Var.b0(mt0Var)) != q43.b) {
            if (objB0 instanceof mt0) {
                throw ((mt0) objB0).a;
            }
            return q43.h(objB0);
        }
        return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
