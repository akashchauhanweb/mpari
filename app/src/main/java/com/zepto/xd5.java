package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xd5 extends o43 {
    public final za0 h;

    public xd5(za0 za0Var) {
        this.h = za0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // com.zepto.ot0
    public void r(Throwable th) {
        Object objS = s().S();
        if (objS instanceof mt0) {
            za0 za0Var = this.h;
            Result.Companion companion = Result.INSTANCE;
            za0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(((mt0) objS).a)));
        } else {
            za0 za0Var2 = this.h;
            Result.Companion companion2 = Result.INSTANCE;
            za0Var2.resumeWith(Result.m6constructorimpl(q43.h(objS)));
        }
    }
}
