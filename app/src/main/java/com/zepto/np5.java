package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
public class np5 extends e2 implements CoroutineStackFrame {
    public final Continuation g;

    public np5(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, true, true);
        this.g = continuation;
    }

    @Override // com.zepto.e2
    public void C0(Object obj) {
        Continuation continuation = this.g;
        continuation.resumeWith(qt0.a(obj, continuation));
    }

    @Override // com.zepto.p43
    public final boolean Z() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.g;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // com.zepto.p43
    public void u(Object obj) {
        kk1.c(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.g), qt0.a(obj, this.g), null, 2, null);
    }
}
