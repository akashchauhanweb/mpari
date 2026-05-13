package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pi0 extends oi0 {
    public final Function2 d;

    public pi0(Function2 function2, CoroutineContext coroutineContext, int i, w70 w70Var) {
        super(coroutineContext, i, w70Var);
        this.d = function2;
    }

    public static /* synthetic */ Object i(pi0 pi0Var, ew4 ew4Var, Continuation continuation) {
        Object objInvoke = pi0Var.d.invoke(ew4Var, continuation);
        return objInvoke == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    @Override // com.zepto.oi0
    public Object e(ew4 ew4Var, Continuation continuation) {
        return i(this, ew4Var, continuation);
    }

    @Override // com.zepto.oi0
    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
