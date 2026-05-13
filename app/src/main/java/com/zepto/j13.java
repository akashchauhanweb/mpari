package com.zepto;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j13 extends o43 {
    public final Function1 h;

    public j13(Function1 function1) {
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // com.zepto.ot0
    public void r(Throwable th) {
        this.h.invoke(th);
    }
}
