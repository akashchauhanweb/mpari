package com.zepto;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class qj1 extends RuntimeException {
    public final transient CoroutineContext c;

    public qj1(CoroutineContext coroutineContext) {
        this.c = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.c.toString();
    }
}
