package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public abstract class me1 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation continuation) {
        Object objM6constructorimpl;
        if (continuation instanceof jk1) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(continuation + '@' + b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9exceptionOrNullimpl(objM6constructorimpl) != null) {
            objM6constructorimpl = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) objM6constructorimpl;
    }
}
