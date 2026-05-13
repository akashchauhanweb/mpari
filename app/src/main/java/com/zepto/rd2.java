package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rd2 {
    public static final Object a(Function2 function2, Continuation continuation) {
        qd2 qd2Var = new qd2(continuation.get$context(), continuation);
        Object objB = pp6.b(qd2Var, qd2Var, function2);
        if (objB == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objB;
    }
}
