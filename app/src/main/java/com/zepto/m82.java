package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m82 {
    public static final boolean a = false;

    static {
        Object objM6constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM6constructorimpl = Result.m6constructorimpl(ResultKt.createFailure(th));
        }
        Result.m13isSuccessimpl(objM6constructorimpl);
    }

    public static final boolean a() {
        return a;
    }
}
