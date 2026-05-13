package com.zepto;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cw4 {

    public static final class a extends ContinuationImpl {
        public Object c;
        public Object e;
        public /* synthetic */ Object f;
        public int g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.g |= IntCompanionObject.MIN_VALUE;
            return cw4.a(null, null, this);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ ya0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ya0 ya0Var) {
            super(1);
            this.c = ya0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            ya0 ya0Var = this.c;
            Result.Companion companion = Result.INSTANCE;
            ya0Var.resumeWith(Result.m6constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.zepto.ew4 r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.zepto.cw4.a
            if (r0 == 0) goto L13
            r0 = r6
            com.zepto.cw4$a r0 = (com.zepto.cw4.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            com.zepto.cw4$a r0 = new com.zepto.cw4$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.e
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.c
            com.zepto.ew4 r4 = (com.zepto.ew4) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.get$context()
            com.zepto.e43$b r2 = com.zepto.e43.d
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.c = r4     // Catch: java.lang.Throwable -> L32
            r0.e = r5     // Catch: java.lang.Throwable -> L32
            r0.g = r3     // Catch: java.lang.Throwable -> L32
            com.zepto.za0 r6 = new com.zepto.za0     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.z()     // Catch: java.lang.Throwable -> L32
            com.zepto.cw4$b r2 = new com.zepto.cw4$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.e(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.cw4.a(com.zepto.ew4, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final t55 b(yz0 yz0Var, CoroutineContext coroutineContext, int i, w70 w70Var, a01 a01Var, Function1 function1, Function2 function2) {
        dw4 dw4Var = new dw4(qz0.d(yz0Var, coroutineContext), ri0.b(i, w70Var, null, 4, null));
        if (function1 != null) {
            dw4Var.j(function1);
        }
        dw4Var.F0(a01Var, dw4Var, function2);
        return dw4Var;
    }

    public static /* synthetic */ t55 c(yz0 yz0Var, CoroutineContext coroutineContext, int i, w70 w70Var, a01 a01Var, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            w70Var = w70.SUSPEND;
        }
        w70 w70Var2 = w70Var;
        if ((i2 & 8) != 0) {
            a01Var = a01.DEFAULT;
        }
        a01 a01Var2 = a01Var;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return b(yz0Var, coroutineContext2, i3, w70Var2, a01Var2, function1, function2);
    }
}
