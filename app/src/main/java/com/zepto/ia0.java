package com.zepto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ia0 extends pi0 {
    public final Function2 e;

    public static final class a extends ContinuationImpl {
        public Object c;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return ia0.this.e(null, this);
        }
    }

    public /* synthetic */ ia0(Function2 function2, CoroutineContext coroutineContext, int i, w70 w70Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? w70.SUSPEND : w70Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zepto.pi0, com.zepto.oi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(com.zepto.ew4 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zepto.ia0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.zepto.ia0$a r0 = (com.zepto.ia0.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.zepto.ia0$a r0 = new com.zepto.ia0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.c
            com.zepto.ew4 r5 = (com.zepto.ew4) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.c = r5
            r0.g = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.l()
            if (r5 == 0) goto L4c
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ia0.e(com.zepto.ew4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ia0(Function2 function2, CoroutineContext coroutineContext, int i, w70 w70Var) {
        super(function2, coroutineContext, i, w70Var);
        this.e = function2;
    }
}
