package com.zepto;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk1 extends nc6 {
    public int f;

    public mk1(int i) {
        this.f = i;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract Continuation d();

    public Throwable e(Object obj) {
        mt0 mt0Var = obj instanceof mt0 ? (mt0) obj : null;
        if (mt0Var != null) {
            return mt0Var.a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        wz0.a(d().get$context(), new c01("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object objM6constructorimpl;
        Object objM6constructorimpl2;
        sc6 sc6Var = this.e;
        try {
            Continuation continuationD = d();
            Intrinsics.checkNotNull(continuationD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            jk1 jk1Var = (jk1) continuationD;
            Continuation continuation = jk1Var.h;
            Object obj = jk1Var.j;
            CoroutineContext context = continuation.get$context();
            Object objC = lf6.c(context, obj);
            op6 op6VarG = objC != lf6.a ? qz0.g(continuation, context, objC) : null;
            try {
                CoroutineContext context2 = continuation.get$context();
                Object objI = i();
                Throwable thE = e(objI);
                e43 e43Var = (thE == null && nk1.b(this.f)) ? (e43) context2.get(e43.d) : null;
                if (e43Var != null && !e43Var.isActive()) {
                    CancellationException cancellationExceptionU = e43Var.U();
                    c(objI, cancellationExceptionU);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(cancellationExceptionU)));
                } else if (thE != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(thE)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m6constructorimpl(g(objI)));
                }
                Unit unit = Unit.INSTANCE;
                if (op6VarG == null || op6VarG.G0()) {
                    lf6.a(context, objC);
                }
                try {
                    sc6Var.a();
                    objM6constructorimpl2 = Result.m6constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM6constructorimpl2 = Result.m6constructorimpl(ResultKt.createFailure(th));
                }
                h(null, Result.m9exceptionOrNullimpl(objM6constructorimpl2));
            } catch (Throwable th2) {
                if (op6VarG == null || op6VarG.G0()) {
                    lf6.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion5 = Result.INSTANCE;
                sc6Var.a();
                objM6constructorimpl = Result.m6constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.INSTANCE;
                objM6constructorimpl = Result.m6constructorimpl(ResultKt.createFailure(th4));
            }
            h(th3, Result.m9exceptionOrNullimpl(objM6constructorimpl));
        }
    }
}
