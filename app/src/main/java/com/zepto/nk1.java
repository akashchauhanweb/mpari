package com.zepto;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class nk1 {
    public static final void a(mk1 mk1Var, int i) {
        Continuation continuationD = mk1Var.d();
        boolean z = i == 4;
        if (z || !(continuationD instanceof jk1) || b(i) != b(mk1Var.f)) {
            d(mk1Var, continuationD, z);
            return;
        }
        sz0 sz0Var = ((jk1) continuationD).g;
        CoroutineContext context = continuationD.get$context();
        if (sz0Var.z0(context)) {
            sz0Var.x0(context, mk1Var);
        } else {
            e(mk1Var);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final void d(mk1 mk1Var, Continuation continuation, boolean z) {
        Object objG;
        Object objI = mk1Var.i();
        Throwable thE = mk1Var.e(objI);
        if (thE != null) {
            Result.Companion companion = Result.INSTANCE;
            objG = ResultKt.createFailure(thE);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objG = mk1Var.g(objI);
        }
        Object objM6constructorimpl = Result.m6constructorimpl(objG);
        if (!z) {
            continuation.resumeWith(objM6constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        jk1 jk1Var = (jk1) continuation;
        Continuation continuation2 = jk1Var.h;
        Object obj = jk1Var.j;
        CoroutineContext context = continuation2.get$context();
        Object objC = lf6.c(context, obj);
        op6 op6VarG = objC != lf6.a ? qz0.g(continuation2, context, objC) : null;
        try {
            jk1Var.h.resumeWith(objM6constructorimpl);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (op6VarG == null || op6VarG.G0()) {
                lf6.a(context, objC);
            }
        }
    }

    public static final void e(mk1 mk1Var) {
        w42 w42VarA = mf6.a.a();
        if (w42VarA.H0()) {
            w42VarA.D0(mk1Var);
            return;
        }
        w42VarA.F0(true);
        try {
            d(mk1Var, mk1Var.d(), true);
            do {
            } while (w42VarA.J0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
