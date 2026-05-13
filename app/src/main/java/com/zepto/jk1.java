package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jk1 extends mk1 implements CoroutineStackFrame, Continuation {
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(jk1.class, Object.class, "_reusableCancellableContinuation");

    @Volatile
    private volatile Object _reusableCancellableContinuation;
    public final sz0 g;
    public final Continuation h;
    public Object i;
    public final Object j;

    public jk1(sz0 sz0Var, Continuation continuation) {
        super(-1);
        this.g = sz0Var;
        this.h = continuation;
        this.i = kk1.a;
        this.j = lf6.b(get$context());
    }

    @Override // com.zepto.mk1
    public void c(Object obj, Throwable th) {
        if (obj instanceof nt0) {
            ((nt0) obj).b.invoke(th);
        }
    }

    @Override // com.zepto.mk1
    public Continuation d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.h;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext get$context() {
        return this.h.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // com.zepto.mk1
    public Object i() {
        Object obj = this.i;
        this.i = kk1.a;
        return obj;
    }

    public final void j() {
        while (k.get(this) == kk1.b) {
        }
    }

    public final za0 k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                k.set(this, kk1.b);
                return null;
            }
            if (obj instanceof za0) {
                if (o2.a(k, this, obj, kk1.b)) {
                    return (za0) obj;
                }
            } else if (obj != kk1.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(CoroutineContext coroutineContext, Object obj) {
        this.i = obj;
        this.f = 1;
        this.g.y0(coroutineContext, this);
    }

    public final za0 m() {
        Object obj = k.get(this);
        if (obj instanceof za0) {
            return (za0) obj;
        }
        return null;
    }

    public final boolean n() {
        return k.get(this) != null;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            s96 s96Var = kk1.b;
            if (Intrinsics.areEqual(obj, s96Var)) {
                if (o2.a(k, this, s96Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (o2.a(k, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        j();
        za0 za0VarM = m();
        if (za0VarM != null) {
            za0VarM.r();
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        CoroutineContext context = this.h.get$context();
        Object objD = qt0.d(obj, null, 1, null);
        if (this.g.z0(context)) {
            this.i = objD;
            this.f = 0;
            this.g.x0(context, this);
            return;
        }
        w42 w42VarA = mf6.a.a();
        if (w42VarA.H0()) {
            this.i = objD;
            this.f = 0;
            w42VarA.D0(this);
            return;
        }
        w42VarA.F0(true);
        try {
            CoroutineContext context2 = get$context();
            Object objC = lf6.c(context2, this.j);
            try {
                this.h.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (w42VarA.J0()) {
                }
            } finally {
                lf6.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(ya0 ya0Var) {
        s96 s96Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            s96Var = kk1.b;
            if (obj != s96Var) {
                if (obj instanceof Throwable) {
                    if (o2.a(k, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!o2.a(k, this, s96Var, ya0Var));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.g + ", " + me1.c(this.h) + ']';
    }
}
