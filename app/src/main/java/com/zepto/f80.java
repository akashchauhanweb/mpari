package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f80 {
    public static final sg1 a(yz0 yz0Var, CoroutineContext coroutineContext, a01 a01Var, Function2 function2) {
        CoroutineContext coroutineContextD = qz0.d(yz0Var, coroutineContext);
        tg1 nb3Var = a01Var.c() ? new nb3(coroutineContextD, function2) : new tg1(coroutineContextD, true);
        nb3Var.F0(a01Var, nb3Var, function2);
        return nb3Var;
    }

    public static /* synthetic */ sg1 b(yz0 yz0Var, CoroutineContext coroutineContext, a01 a01Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            a01Var = a01.DEFAULT;
        }
        return e80.a(yz0Var, coroutineContext, a01Var, function2);
    }

    public static final e43 c(yz0 yz0Var, CoroutineContext coroutineContext, a01 a01Var, Function2 function2) {
        CoroutineContext coroutineContextD = qz0.d(yz0Var, coroutineContext);
        k66 qb3Var = a01Var.c() ? new qb3(coroutineContextD, function2) : new k66(coroutineContextD, true);
        qb3Var.F0(a01Var, qb3Var, function2);
        return qb3Var;
    }

    public static /* synthetic */ e43 d(yz0 yz0Var, CoroutineContext coroutineContext, a01 a01Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            a01Var = a01.DEFAULT;
        }
        return e80.c(yz0Var, coroutineContext, a01Var, function2);
    }

    public static final Object e(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) throws Throwable {
        Object objG0;
        CoroutineContext context = continuation.get$context();
        CoroutineContext coroutineContextE = qz0.e(context, coroutineContext);
        k43.g(coroutineContextE);
        if (coroutineContextE == context) {
            np5 np5Var = new np5(coroutineContextE, continuation);
            objG0 = pp6.b(np5Var, np5Var, function2);
        } else {
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextE.get(companion), context.get(companion))) {
                op6 op6Var = new op6(coroutineContextE, continuation);
                CoroutineContext context2 = op6Var.get$context();
                Object objC = lf6.c(context2, null);
                try {
                    Object objB = pp6.b(op6Var, op6Var, function2);
                    lf6.a(context2, objC);
                    objG0 = objB;
                } catch (Throwable th) {
                    lf6.a(context2, objC);
                    throw th;
                }
            } else {
                lk1 lk1Var = new lk1(coroutineContextE, continuation);
                cb0.d(function2, lk1Var, lk1Var, null, 4, null);
                objG0 = lk1Var.G0();
            }
        }
        if (objG0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objG0;
    }
}
