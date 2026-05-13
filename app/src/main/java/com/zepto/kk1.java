package com.zepto;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kk1 {
    public static final s96 a = new s96("UNDEFINED");
    public static final s96 b = new s96("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:44:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(kotlin.coroutines.Continuation r6, java.lang.Object r7, kotlin.jvm.functions.Function1 r8) {
        /*
            boolean r0 = r6 instanceof com.zepto.jk1
            if (r0 == 0) goto Lb2
            com.zepto.jk1 r6 = (com.zepto.jk1) r6
            java.lang.Object r8 = com.zepto.qt0.c(r7, r8)
            com.zepto.sz0 r0 = r6.g
            kotlin.coroutines.CoroutineContext r1 = r6.get$context()
            boolean r0 = r0.z0(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.i = r8
            r6.f = r1
            com.zepto.sz0 r7 = r6.g
            kotlin.coroutines.CoroutineContext r8 = r6.get$context()
            r7.x0(r8, r6)
            goto Lb5
        L26:
            com.zepto.mf6 r0 = com.zepto.mf6.a
            com.zepto.w42 r0 = r0.a()
            boolean r2 = r0.H0()
            if (r2 == 0) goto L3b
            r6.i = r8
            r6.f = r1
            r0.D0(r6)
            goto Lb5
        L3b:
            r0.F0(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.get$context()     // Catch: java.lang.Throwable -> L68
            com.zepto.e43$b r4 = com.zepto.e43.d     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L68
            com.zepto.e43 r3 = (com.zepto.e43) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.U()     // Catch: java.lang.Throwable -> L68
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L68
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = kotlin.Result.m6constructorimpl(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            kotlin.coroutines.Continuation r8 = r6.h     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.j     // Catch: java.lang.Throwable -> L68
            kotlin.coroutines.CoroutineContext r4 = r8.get$context()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = com.zepto.lf6.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            com.zepto.s96 r5 = com.zepto.lf6.a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            com.zepto.op6 r8 = com.zepto.qz0.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            kotlin.coroutines.Continuation r5 = r6.h     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.G0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            com.zepto.lf6.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.J0()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.B0(r1)
            goto Lb5
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.G0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            com.zepto.lf6.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.h(r7, r2)     // Catch: java.lang.Throwable -> Lad
            goto L98
        Lad:
            r6 = move-exception
            r0.B0(r1)
            throw r6
        Lb2:
            r6.resumeWith(r7)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.kk1.b(kotlin.coroutines.Continuation, java.lang.Object, kotlin.jvm.functions.Function1):void");
    }

    public static /* synthetic */ void c(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        b(continuation, obj, function1);
    }

    public static final boolean d(jk1 jk1Var) {
        Unit unit = Unit.INSTANCE;
        w42 w42VarA = mf6.a.a();
        if (w42VarA.I0()) {
            return false;
        }
        if (w42VarA.H0()) {
            jk1Var.i = unit;
            jk1Var.f = 1;
            w42VarA.D0(jk1Var);
            return true;
        }
        w42VarA.F0(true);
        try {
            jk1Var.run();
            do {
            } while (w42VarA.J0());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
