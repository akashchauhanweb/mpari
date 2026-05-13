package com.zepto;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class op6 extends np5 {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public op6(CoroutineContext coroutineContext, Continuation continuation) {
        qp6 qp6Var = qp6.c;
        super(coroutineContext.get(qp6Var) == null ? coroutineContext.plus(qp6Var) : coroutineContext, continuation);
        this.h = new ThreadLocal();
        if (continuation.get$context().get(ContinuationInterceptor.INSTANCE) instanceof sz0) {
            return;
        }
        Object objC = lf6.c(coroutineContext, null);
        lf6.a(coroutineContext, objC);
        H0(coroutineContext, objC);
    }

    @Override // com.zepto.np5, com.zepto.e2
    public void C0(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.h.get();
            if (pair != null) {
                lf6.a((CoroutineContext) pair.component1(), pair.component2());
            }
            this.h.remove();
        }
        Object objA = qt0.a(obj, this.g);
        Continuation continuation = this.g;
        CoroutineContext coroutineContext = continuation.get$context();
        Object objC = lf6.c(coroutineContext, null);
        op6 op6VarG = objC != lf6.a ? qz0.g(continuation, coroutineContext, objC) : null;
        try {
            this.g.resumeWith(objA);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (op6VarG == null || op6VarG.G0()) {
                lf6.a(coroutineContext, objC);
            }
        }
    }

    public final boolean G0() {
        boolean z = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z;
    }

    public final void H0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(TuplesKt.to(coroutineContext, obj));
    }
}
