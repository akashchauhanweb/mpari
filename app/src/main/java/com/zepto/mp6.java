package com.zepto;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class mp6 extends sz0 {
    public static final mp6 e = new mp6();

    @Override // com.zepto.sz0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        y08 y08Var = (y08) coroutineContext.get(y08.e);
        if (y08Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        y08Var.c = true;
    }

    @Override // com.zepto.sz0
    public boolean z0(CoroutineContext coroutineContext) {
        return false;
    }
}
