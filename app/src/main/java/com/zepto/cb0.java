package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cb0 {
    public static final void a(Continuation continuation, Throwable th) throws Throwable {
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final void b(Continuation continuation, Continuation continuation2) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            kk1.c(continuationIntercepted, Result.m6constructorimpl(Unit.INSTANCE), null, 2, null);
        } catch (Throwable th) {
            a(continuation2, th);
        }
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation, Function1 function1) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, obj, continuation));
            Result.Companion companion = Result.INSTANCE;
            kk1.b(continuationIntercepted, Result.m6constructorimpl(Unit.INSTANCE), function1);
        } catch (Throwable th) {
            a(continuation, th);
        }
    }

    public static /* synthetic */ void d(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) throws Throwable {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c(function2, obj, continuation, function1);
    }
}
