package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class qt0 {
    public static final Object a(Object obj, Continuation continuation) {
        if (!(obj instanceof mt0)) {
            return Result.m6constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m6constructorimpl(ResultKt.createFailure(((mt0) obj).a));
    }

    public static final Object b(Object obj, ya0 ya0Var) {
        Throwable thM9exceptionOrNullimpl = Result.m9exceptionOrNullimpl(obj);
        if (thM9exceptionOrNullimpl == null) {
            return obj;
        }
        return new mt0(thM9exceptionOrNullimpl, false, 2, null);
    }

    public static final Object c(Object obj, Function1 function1) {
        Throwable thM9exceptionOrNullimpl = Result.m9exceptionOrNullimpl(obj);
        if (thM9exceptionOrNullimpl == null) {
            return function1 != null ? new nt0(obj, function1) : obj;
        }
        return new mt0(thM9exceptionOrNullimpl, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return c(obj, function1);
    }
}
