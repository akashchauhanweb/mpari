package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends p43 implements Continuation, yz0 {
    public final CoroutineContext f;

    public e2(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            W((e43) coroutineContext.get(e43.d));
        }
        this.f = coroutineContext.plus(this);
    }

    public void C0(Object obj) {
        u(obj);
    }

    public void D0(Throwable th, boolean z) {
    }

    @Override // com.zepto.p43
    public String E() {
        return me1.a(this) + " was cancelled";
    }

    public void E0(Object obj) {
    }

    public final void F0(a01 a01Var, Object obj, Function2 function2) {
        a01Var.b(function2, obj, this);
    }

    @Override // com.zepto.p43
    public final void V(Throwable th) {
        wz0.a(this.f, th);
    }

    @Override // com.zepto.yz0
    public CoroutineContext c() {
        return this.f;
    }

    @Override // com.zepto.p43
    public String f0() {
        String strB = qz0.b(this.f);
        if (strB == null) {
            return super.f0();
        }
        return Typography.quote + strB + "\":" + super.f0();
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f;
    }

    @Override // com.zepto.p43, com.zepto.e43
    public boolean isActive() {
        return super.isActive();
    }

    @Override // com.zepto.p43
    public final void l0(Object obj) {
        if (!(obj instanceof mt0)) {
            E0(obj);
        } else {
            mt0 mt0Var = (mt0) obj;
            D0(mt0Var.a, mt0Var.a());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objB0 = b0(qt0.d(obj, null, 1, null));
        if (objB0 == q43.b) {
            return;
        }
        C0(objB0);
    }
}
