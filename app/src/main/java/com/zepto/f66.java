package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f66 {
    public static final StackTraceElement a = new xx().a();
    public static final String b;
    public static final String c;

    static {
        Object objM6constructorimpl;
        Object objM6constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9exceptionOrNullimpl(objM6constructorimpl) != null) {
            objM6constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objM6constructorimpl;
        try {
            objM6constructorimpl2 = Result.m6constructorimpl(f66.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM6constructorimpl2 = Result.m6constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m9exceptionOrNullimpl(objM6constructorimpl2) != null) {
            objM6constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objM6constructorimpl2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
