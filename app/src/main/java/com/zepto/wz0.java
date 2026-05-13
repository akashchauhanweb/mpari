package com.zepto;

import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz0 {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            tz0 tz0Var = (tz0) coroutineContext.get(tz0.b);
            if (tz0Var != null) {
                tz0Var.k0(coroutineContext, th);
            } else {
                vz0.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            vz0.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
