package com.zepto;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h13 extends ta0 {
    public final Function1 c;

    public h13(Function1 function1) {
        this.c = function1;
    }

    @Override // com.zepto.ua0
    public void a(Throwable th) {
        this.c.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + me1.a(this.c) + '@' + me1.b(this) + ']';
    }
}
