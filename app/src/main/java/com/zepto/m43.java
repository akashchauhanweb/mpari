package com.zepto;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m43 {
    public static final jt0 a(e43 e43Var) {
        return new h43(e43Var);
    }

    public static /* synthetic */ jt0 b(e43 e43Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e43Var = null;
        }
        return k43.a(e43Var);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        e43 e43Var = (e43) coroutineContext.get(e43.d);
        if (e43Var != null) {
            e43Var.d(cancellationException);
        }
    }

    public static /* synthetic */ void d(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        k43.c(coroutineContext, cancellationException);
    }

    public static final void e(e43 e43Var) {
        if (!e43Var.isActive()) {
            throw e43Var.U();
        }
    }

    public static final void f(CoroutineContext coroutineContext) {
        e43 e43Var = (e43) coroutineContext.get(e43.d);
        if (e43Var != null) {
            k43.f(e43Var);
        }
    }
}
