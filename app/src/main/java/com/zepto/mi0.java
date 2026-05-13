package com.zepto;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mi0 extends e2 implements li0 {
    public final li0 g;

    public mi0(CoroutineContext coroutineContext, li0 li0Var, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.g = li0Var;
    }

    @Override // com.zepto.p43
    public void A(Throwable th) {
        CancellationException cancellationExceptionV0 = p43.v0(this, th, null, 1, null);
        this.g.d(cancellationExceptionV0);
        y(cancellationExceptionV0);
    }

    public final li0 G0() {
        return this;
    }

    public final li0 H0() {
        return this.g;
    }

    @Override // com.zepto.my5
    public boolean b(Throwable th) {
        return this.g.b(th);
    }

    @Override // com.zepto.p43, com.zepto.e43, com.zepto.t55
    public final void d(CancellationException cancellationException) {
        if (X()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new f43(E(), null, this);
        }
        A(cancellationException);
    }

    @Override // com.zepto.my5
    public void e(Function1 function1) {
        this.g.e(function1);
    }

    @Override // com.zepto.t55
    public Object g() {
        return this.g.g();
    }

    @Override // com.zepto.my5
    public Object h(Object obj) {
        return this.g.h(obj);
    }

    @Override // com.zepto.my5
    public Object i(Object obj, Continuation continuation) {
        return this.g.i(obj, continuation);
    }

    @Override // com.zepto.t55
    public qi0 iterator() {
        return this.g.iterator();
    }

    @Override // com.zepto.t55
    public Object k(Continuation continuation) {
        Object objK = this.g.k(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objK;
    }

    @Override // com.zepto.my5
    public boolean l() {
        return this.g.l();
    }
}
