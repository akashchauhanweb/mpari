package com.zepto;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 extends g43 implements xj0 {
    public final zj0 h;

    public yj0(zj0 zj0Var) {
        this.h = zj0Var;
    }

    @Override // com.zepto.xj0
    public boolean c(Throwable th) {
        return s().F(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        r((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // com.zepto.ot0
    public void r(Throwable th) {
        this.h.d0(s());
    }
}
