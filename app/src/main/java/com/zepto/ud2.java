package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ud2 {

    public static final class a extends ContinuationImpl {
        public Object c;
        public Object e;
        public Object f;
        public boolean g;
        public /* synthetic */ Object h;
        public int i;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= IntCompanionObject.MIN_VALUE;
            return ud2.c(null, null, false, this);
        }
    }

    public static final Object b(pd2 pd2Var, t55 t55Var, Continuation continuation) throws Throwable {
        Object objC = c(pd2Var, t55Var, true, continuation);
        return objC == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.zepto.pd2 r6, com.zepto.t55 r7, boolean r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof com.zepto.ud2.a
            if (r0 == 0) goto L13
            r0 = r9
            com.zepto.ud2$a r0 = (com.zepto.ud2.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.zepto.ud2$a r0 = new com.zepto.ud2$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.g
            java.lang.Object r6 = r0.f
            com.zepto.qi0 r6 = (com.zepto.qi0) r6
            java.lang.Object r7 = r0.e
            com.zepto.t55 r7 = (com.zepto.t55) r7
            java.lang.Object r2 = r0.c
            com.zepto.pd2 r2 = (com.zepto.pd2) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.g
            java.lang.Object r6 = r0.f
            com.zepto.qi0 r6 = (com.zepto.qi0) r6
            java.lang.Object r7 = r0.e
            com.zepto.t55 r7 = (com.zepto.t55) r7
            java.lang.Object r2 = r0.c
            com.zepto.pd2 r2 = (com.zepto.pd2) r2
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.ResultKt.throwOnFailure(r9)
            com.zepto.sd2.f(r6)
            com.zepto.qi0 r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.c = r6     // Catch: java.lang.Throwable -> L3c
            r0.e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f = r9     // Catch: java.lang.Throwable -> L3c
            r0.g = r8     // Catch: java.lang.Throwable -> L3c
            r0.i = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.c = r2     // Catch: java.lang.Throwable -> L3c
            r0.e = r7     // Catch: java.lang.Throwable -> L3c
            r0.f = r6     // Catch: java.lang.Throwable -> L3c
            r0.g = r8     // Catch: java.lang.Throwable -> L3c
            r0.i = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.c(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            com.zepto.vi0.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            com.zepto.vi0.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ud2.c(com.zepto.pd2, com.zepto.t55, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
