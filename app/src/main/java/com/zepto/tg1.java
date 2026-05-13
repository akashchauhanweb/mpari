package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes.dex */
public class tg1 extends e2 implements sg1 {
    public tg1(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    public static /* synthetic */ Object G0(tg1 tg1Var, Continuation continuation) throws Throwable {
        Object objV = tg1Var.v(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objV;
    }

    @Override // com.zepto.sg1
    public Object e0(Continuation continuation) {
        return G0(this, continuation);
    }
}
