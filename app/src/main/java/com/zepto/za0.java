package com.zepto;

import com.zepto.e43;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class za0 extends mk1 implements ya0, CoroutineStackFrame, ju7 {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(za0.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(za0.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(za0.class, Object.class, "_parentHandle");

    @Volatile
    private volatile int _decisionAndIndex;

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;
    public final Continuation g;
    public final CoroutineContext h;

    public za0(Continuation continuation, int i2) {
        super(i2);
        this.g = continuation;
        this.h = continuation.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b6.c;
    }

    private final boolean D() {
        if (nk1.c(this.f)) {
            Continuation continuation = this.g;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((jk1) continuation).n()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void M(za0 za0Var, Object obj, int i2, Function1 function1, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        za0Var.L(obj, i2, function1);
    }

    public final uk1 A() {
        e43 e43Var = (e43) getContext().get(e43.d);
        if (e43Var == null) {
            return null;
        }
        uk1 uk1VarD = e43.a.d(e43Var, true, false, new wj0(this), 2, null);
        o2.a(k, this, null, uk1VarD);
        return uk1VarD;
    }

    public final void B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b6) {
                if (o2.a(j, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof ta0) || (obj2 instanceof wu5)) {
                F(obj, obj2);
            } else {
                boolean z = obj2 instanceof mt0;
                if (z) {
                    mt0 mt0Var = (mt0) obj2;
                    if (!mt0Var.b()) {
                        F(obj, obj2);
                    }
                    if (obj2 instanceof fb0) {
                        if (!z) {
                            mt0Var = null;
                        }
                        Throwable th = mt0Var != null ? mt0Var.a : null;
                        if (obj instanceof ta0) {
                            k((ta0) obj, th);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m((wu5) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof lt0) {
                    lt0 lt0Var = (lt0) obj2;
                    if (lt0Var.b != null) {
                        F(obj, obj2);
                    }
                    if (obj instanceof wu5) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    ta0 ta0Var = (ta0) obj;
                    if (lt0Var.c()) {
                        k(ta0Var, lt0Var.e);
                        return;
                    } else {
                        if (o2.a(j, this, obj2, lt0.b(lt0Var, null, ta0Var, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof wu5) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (o2.a(j, this, obj2, new lt0(obj2, (ta0) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public boolean C() {
        return !(x() instanceof gc4);
    }

    public final ta0 E(Function1 function1) {
        return function1 instanceof ta0 ? (ta0) function1 : new h13(function1);
    }

    public final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (q(th)) {
            return;
        }
        n(th);
        s();
    }

    public final void I() {
        Throwable thS;
        Continuation continuation = this.g;
        jk1 jk1Var = continuation instanceof jk1 ? (jk1) continuation : null;
        if (jk1Var == null || (thS = jk1Var.s(this)) == null) {
            return;
        }
        r();
        n(thS);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof lt0) && ((lt0) obj).d != null) {
            r();
            return false;
        }
        i.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, b6.c);
        return true;
    }

    public void K(Object obj, Function1 function1) {
        L(obj, this.f, function1);
    }

    public final void L(Object obj, int i2, Function1 function1) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof gc4)) {
                if (obj2 instanceof fb0) {
                    fb0 fb0Var = (fb0) obj2;
                    if (fb0Var.c()) {
                        if (function1 != null) {
                            l(function1, fb0Var.a);
                            return;
                        }
                        return;
                    }
                }
                j(obj);
                throw new KotlinNothingValueException();
            }
        } while (!o2.a(j, this, obj2, N((gc4) obj2, obj, i2, function1, null)));
        s();
        t(i2);
    }

    public final Object N(gc4 gc4Var, Object obj, int i2, Function1 function1, Object obj2) {
        if (obj instanceof mt0) {
            return obj;
        }
        if (!nk1.b(i2) && obj2 == null) {
            return obj;
        }
        if (function1 == null && !(gc4Var instanceof ta0) && obj2 == null) {
            return obj;
        }
        return new lt0(obj, gc4Var instanceof ta0 ? (ta0) gc4Var : null, function1, obj2, null, 16, null);
    }

    public final boolean O() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!i.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
        return true;
    }

    public final s96 P(Object obj, Object obj2, Function1 function1) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof gc4)) {
                if ((obj3 instanceof lt0) && obj2 != null && ((lt0) obj3).d == obj2) {
                    return ab0.a;
                }
                return null;
            }
        } while (!o2.a(j, this, obj3, N((gc4) obj3, obj, this.f, function1, obj2)));
        s();
        return ab0.a;
    }

    public final boolean Q() {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!i.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        return true;
    }

    @Override // com.zepto.ya0
    public Object a(Object obj, Object obj2, Function1 function1) {
        return P(obj, obj2, function1);
    }

    @Override // com.zepto.ju7
    public void b(wu5 wu5Var, int i2) {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        B(wu5Var);
    }

    @Override // com.zepto.mk1
    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof gc4) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof mt0) {
                return;
            }
            if (obj2 instanceof lt0) {
                lt0 lt0Var = (lt0) obj2;
                if (!(!lt0Var.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (o2.a(j, this, obj2, lt0.b(lt0Var, null, null, null, null, th, 15, null))) {
                    lt0Var.d(this, th);
                    return;
                }
            } else if (o2.a(j, this, obj2, new lt0(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // com.zepto.mk1
    public final Continuation d() {
        return this.g;
    }

    @Override // com.zepto.mk1
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // com.zepto.ya0
    public void f(sz0 sz0Var, Object obj) {
        Continuation continuation = this.g;
        jk1 jk1Var = continuation instanceof jk1 ? (jk1) continuation : null;
        M(this, obj, (jk1Var != null ? jk1Var.g : null) == sz0Var ? 4 : this.f, null, 4, null);
    }

    @Override // com.zepto.mk1
    public Object g(Object obj) {
        return obj instanceof lt0 ? ((lt0) obj).a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.g;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.h;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // com.zepto.mk1
    public Object i() {
        return x();
    }

    public final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void k(ta0 ta0Var, Throwable th) {
        try {
            ta0Var.a(th);
        } catch (Throwable th2) {
            wz0.a(getContext(), new pt0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            wz0.a(getContext(), new pt0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(wu5 wu5Var, Throwable th) {
        int i2 = i.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            wu5Var.o(i2, th, getContext());
        } catch (Throwable th2) {
            wz0.a(getContext(), new pt0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof gc4)) {
                return false;
            }
        } while (!o2.a(j, this, obj, new fb0(this, th, (obj instanceof ta0) || (obj instanceof wu5))));
        gc4 gc4Var = (gc4) obj;
        if (gc4Var instanceof ta0) {
            k((ta0) obj, th);
        } else if (gc4Var instanceof wu5) {
            m((wu5) obj, th);
        }
        s();
        t(this.f);
        return true;
    }

    @Override // com.zepto.ya0
    public void o(Function1 function1) {
        B(E(function1));
    }

    @Override // com.zepto.ya0
    public void p(Object obj) {
        t(this.f);
    }

    public final boolean q(Throwable th) {
        if (!D()) {
            return false;
        }
        Continuation continuation = this.g;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((jk1) continuation).q(th);
    }

    public final void r() {
        uk1 uk1VarV = v();
        if (uk1VarV == null) {
            return;
        }
        uk1VarV.b();
        k.set(this, zb4.c);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        M(this, qt0.b(obj, this), this.f, null, 4, null);
    }

    public final void s() {
        if (D()) {
            return;
        }
        r();
    }

    public final void t(int i2) {
        if (O()) {
            return;
        }
        nk1.a(this, i2);
    }

    public String toString() {
        return G() + '(' + me1.c(this.g) + "){" + y() + "}@" + me1.b(this);
    }

    public Throwable u(e43 e43Var) {
        return e43Var.U();
    }

    public final uk1 v() {
        return (uk1) k.get(this);
    }

    public final Object w() {
        e43 e43Var;
        boolean zD = D();
        if (Q()) {
            if (v() == null) {
                A();
            }
            if (zD) {
                I();
            }
            return IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zD) {
            I();
        }
        Object objX = x();
        if (objX instanceof mt0) {
            throw ((mt0) objX).a;
        }
        if (!nk1.b(this.f) || (e43Var = (e43) getContext().get(e43.d)) == null || e43Var.isActive()) {
            return g(objX);
        }
        CancellationException cancellationExceptionU = e43Var.U();
        c(objX, cancellationExceptionU);
        throw cancellationExceptionU;
    }

    public final Object x() {
        return j.get(this);
    }

    public final String y() {
        Object objX = x();
        return objX instanceof gc4 ? "Active" : objX instanceof fb0 ? "Cancelled" : "Completed";
    }

    public void z() {
        uk1 uk1VarA = A();
        if (uk1VarA != null && C()) {
            uk1VarA.b();
            k.set(this, zb4.c);
        }
    }
}
