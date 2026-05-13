package com.zepto;

import java.util.concurrent.Future;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends ta0 {
    public final Future c;

    public sa0(Future future) {
        this.c = future;
    }

    @Override // com.zepto.ua0
    public void a(Throwable th) {
        if (th != null) {
            this.c.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.c + ']';
    }
}
