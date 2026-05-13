package com.zepto;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vk1 extends ta0 {
    public final uk1 c;

    public vk1(uk1 uk1Var) {
        this.c = uk1Var;
    }

    @Override // com.zepto.ua0
    public void a(Throwable th) {
        this.c.b();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.c + ']';
    }
}
