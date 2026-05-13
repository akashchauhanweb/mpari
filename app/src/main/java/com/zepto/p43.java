package com.zepto;

import com.zepto.e43;
import com.zepto.fn3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public class p43 implements e43, zj0, ol4 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(p43.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(p43.class, Object.class, "_parentHandle");

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;

    public static final class a extends za0 {
        public final p43 l;

        public a(Continuation continuation, p43 p43Var) {
            super(continuation, 1);
            this.l = p43Var;
        }

        @Override // com.zepto.za0
        public String G() {
            return "AwaitContinuation";
        }

        @Override // com.zepto.za0
        public Throwable u(e43 e43Var) {
            Throwable thE;
            Object objS = this.l.S();
            return (!(objS instanceof c) || (thE = ((c) objS).e()) == null) ? objS instanceof mt0 ? ((mt0) objS).a : e43Var.U() : thE;
        }
    }

    public static final class b extends o43 {
        public final p43 h;
        public final c i;
        public final yj0 j;
        public final Object k;

        public b(p43 p43Var, c cVar, yj0 yj0Var, Object obj) {
            this.h = p43Var;
            this.i = cVar;
            this.j = yj0Var;
            this.k = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return Unit.INSTANCE;
        }

        @Override // com.zepto.ot0
        public void r(Throwable th) {
            this.h.H(this.i, this.j, this.k);
        }
    }

    public static final class c implements gy2 {
        public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");
        public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");
        public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");

        @Volatile
        private volatile Object _exceptionsHolder;

        @Volatile
        private volatile int _isCompleting;

        @Volatile
        private volatile Object _rootCause;
        public final v94 c;

        public c(v94 v94Var, boolean z, Throwable th) {
            this.c = v94Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // com.zepto.gy2
        public v94 a() {
            return this.c;
        }

        public final void b(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                l(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                k(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th);
                k(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return g.get(this);
        }

        public final Throwable e() {
            return (Throwable) f.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return e.get(this) != 0;
        }

        public final boolean h() {
            return d() == q43.e;
        }

        public final List i(Throwable th) {
            ArrayList arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th != null && !Intrinsics.areEqual(th, thE)) {
                arrayListC.add(th);
            }
            k(q43.e);
            return arrayListC;
        }

        @Override // com.zepto.gy2
        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z) {
            e.set(this, z ? 1 : 0);
        }

        public final void k(Object obj) {
            g.set(this, obj);
        }

        public final void l(Throwable th) {
            f.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }
    }

    public static final class d extends fn3.a {
        public final /* synthetic */ p43 d;
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fn3 fn3Var, p43 p43Var, Object obj) {
            super(fn3Var);
            this.d = p43Var;
            this.e = obj;
        }

        @Override // com.zepto.my
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(fn3 fn3Var) {
            if (this.d.S() == this.e) {
                return null;
            }
            return en3.a();
        }
    }

    public p43(boolean z) {
        this._state = z ? q43.g : q43.f;
    }

    public static /* synthetic */ CancellationException v0(p43 p43Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return p43Var.u0(th, str);
    }

    public void A(Throwable th) throws Throwable {
        z(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object A0(gy2 gy2Var, Object obj) throws Throwable {
        v94 v94VarQ = Q(gy2Var);
        if (v94VarQ == null) {
            return q43.c;
        }
        c cVar = gy2Var instanceof c ? (c) gy2Var : null;
        if (cVar == null) {
            cVar = new c(v94VarQ, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.g()) {
                return q43.a;
            }
            cVar.j(true);
            if (cVar != gy2Var && !o2.a(c, this, gy2Var, cVar)) {
                return q43.c;
            }
            boolean zF = cVar.f();
            mt0 mt0Var = obj instanceof mt0 ? (mt0) obj : null;
            if (mt0Var != null) {
                cVar.b(mt0Var.a);
            }
            ?? E = Boolean.valueOf(true ^ zF).booleanValue() ? cVar.e() : 0;
            objectRef.element = E;
            Unit unit = Unit.INSTANCE;
            if (E != 0) {
                h0(v94VarQ, E);
            }
            yj0 yj0VarK = K(gy2Var);
            return (yj0VarK == null || !B0(cVar, yj0VarK, obj)) ? J(cVar, obj) : q43.b;
        }
    }

    @Override // com.zepto.ol4
    public CancellationException B() {
        Throwable thE;
        Object objS = S();
        if (objS instanceof c) {
            thE = ((c) objS).e();
        } else if (objS instanceof mt0) {
            thE = ((mt0) objS).a;
        } else {
            if (objS instanceof gy2) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objS).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new f43("Parent job is " + t0(objS), thE, this);
    }

    public final boolean B0(c cVar, yj0 yj0Var, Object obj) {
        while (e43.a.d(yj0Var.h, false, false, new b(this, cVar, yj0Var, obj), 1, null) == zb4.c) {
            yj0Var = g0(yj0Var);
            if (yj0Var == null) {
                return false;
            }
        }
        return true;
    }

    public final Object C(Object obj) {
        Object objZ0;
        do {
            Object objS = S();
            if (!(objS instanceof gy2) || ((objS instanceof c) && ((c) objS).g())) {
                return q43.a;
            }
            objZ0 = z0(objS, new mt0(I(obj), false, 2, null));
        } while (objZ0 == q43.c);
        return objZ0;
    }

    public final boolean D(Throwable th) {
        if (Z()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        xj0 xj0VarR = R();
        return (xj0VarR == null || xj0VarR == zb4.c) ? z : xj0VarR.c(th) || z;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && N();
    }

    public final void G(gy2 gy2Var, Object obj) throws Throwable {
        xj0 xj0VarR = R();
        if (xj0VarR != null) {
            xj0VarR.b();
            r0(zb4.c);
        }
        mt0 mt0Var = obj instanceof mt0 ? (mt0) obj : null;
        Throwable th = mt0Var != null ? mt0Var.a : null;
        if (!(gy2Var instanceof o43)) {
            v94 v94VarA = gy2Var.a();
            if (v94VarA != null) {
                i0(v94VarA, th);
                return;
            }
            return;
        }
        try {
            ((o43) gy2Var).r(th);
        } catch (Throwable th2) {
            V(new pt0("Exception in completion handler " + gy2Var + " for " + this, th2));
        }
    }

    public final void H(c cVar, yj0 yj0Var, Object obj) {
        yj0 yj0VarG0 = g0(yj0Var);
        if (yj0VarG0 == null || !B0(cVar, yj0VarG0, obj)) {
            u(J(cVar, obj));
        }
    }

    public final Throwable I(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new f43(E(), null, this) : th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ol4) obj).B();
    }

    public final Object J(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thM;
        DefaultConstructorMarker defaultConstructorMarker = null;
        mt0 mt0Var = obj instanceof mt0 ? (mt0) obj : null;
        Throwable th = mt0Var != null ? mt0Var.a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List listI = cVar.i(th);
            thM = M(cVar, listI);
            if (thM != null) {
                t(thM, listI);
            }
        }
        if (thM != null && thM != th) {
            obj = new mt0(thM, false, 2, defaultConstructorMarker);
        }
        if (thM != null && (D(thM) || T(thM))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((mt0) obj).b();
        }
        if (!zF) {
            j0(thM);
        }
        l0(obj);
        o2.a(c, this, cVar, q43.g(obj));
        G(cVar, obj);
        return obj;
    }

    public final yj0 K(gy2 gy2Var) {
        yj0 yj0Var = gy2Var instanceof yj0 ? (yj0) gy2Var : null;
        if (yj0Var != null) {
            return yj0Var;
        }
        v94 v94VarA = gy2Var.a();
        if (v94VarA != null) {
            return g0(v94VarA);
        }
        return null;
    }

    public final Throwable L(Object obj) {
        mt0 mt0Var = obj instanceof mt0 ? (mt0) obj : null;
        if (mt0Var != null) {
            return mt0Var.a;
        }
        return null;
    }

    public final Throwable M(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new f43(E(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    public boolean N() {
        return true;
    }

    public boolean O() {
        return false;
    }

    @Override // com.zepto.e43
    public final uk1 P(boolean z, boolean z2, Function1 function1) {
        o43 o43VarC0 = c0(function1, z);
        while (true) {
            Object objS = S();
            if (objS instanceof p12) {
                p12 p12Var = (p12) objS;
                if (!p12Var.isActive()) {
                    n0(p12Var);
                } else if (o2.a(c, this, objS, o43VarC0)) {
                    return o43VarC0;
                }
            } else {
                if (!(objS instanceof gy2)) {
                    if (z2) {
                        mt0 mt0Var = objS instanceof mt0 ? (mt0) objS : null;
                        function1.invoke(mt0Var != null ? mt0Var.a : null);
                    }
                    return zb4.c;
                }
                v94 v94VarA = ((gy2) objS).a();
                if (v94VarA == null) {
                    Intrinsics.checkNotNull(objS, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    o0((o43) objS);
                } else {
                    uk1 uk1Var = zb4.c;
                    if (z && (objS instanceof c)) {
                        synchronized (objS) {
                            try {
                                thE = ((c) objS).e();
                                if (thE == null || ((function1 instanceof yj0) && !((c) objS).g())) {
                                    if (s(objS, v94VarA, o43VarC0)) {
                                        if (thE == null) {
                                            return o43VarC0;
                                        }
                                        uk1Var = o43VarC0;
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z2) {
                            function1.invoke(thE);
                        }
                        return uk1Var;
                    }
                    if (s(objS, v94VarA, o43VarC0)) {
                        return o43VarC0;
                    }
                }
            }
        }
    }

    public final v94 Q(gy2 gy2Var) {
        v94 v94VarA = gy2Var.a();
        if (v94VarA != null) {
            return v94VarA;
        }
        if (gy2Var instanceof p12) {
            return new v94();
        }
        if (gy2Var instanceof o43) {
            o0((o43) gy2Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + gy2Var).toString());
    }

    public final xj0 R() {
        return (xj0) e.get(this);
    }

    public final Object S() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof jh4)) {
                return obj;
            }
            ((jh4) obj).a(this);
        }
    }

    public boolean T(Throwable th) {
        return false;
    }

    @Override // com.zepto.e43
    public final CancellationException U() {
        Object objS = S();
        if (!(objS instanceof c)) {
            if (objS instanceof gy2) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objS instanceof mt0) {
                return v0(this, ((mt0) objS).a, null, 1, null);
            }
            return new f43(me1.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objS).e();
        if (thE != null) {
            CancellationException cancellationExceptionU0 = u0(thE, me1.a(this) + " is cancelling");
            if (cancellationExceptionU0 != null) {
                return cancellationExceptionU0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public void V(Throwable th) throws Throwable {
        throw th;
    }

    public final void W(e43 e43Var) {
        if (e43Var == null) {
            r0(zb4.c);
            return;
        }
        e43Var.start();
        xj0 xj0VarW = e43Var.w(this);
        r0(xj0VarW);
        if (Y()) {
            xj0VarW.b();
            r0(zb4.c);
        }
    }

    public final boolean X() {
        Object objS = S();
        return (objS instanceof mt0) || ((objS instanceof c) && ((c) objS).f());
    }

    public final boolean Y() {
        return !(S() instanceof gy2);
    }

    public boolean Z() {
        return false;
    }

    public final Object a0(Object obj) throws Throwable {
        byte b2 = 0;
        Throwable thI = null;
        while (true) {
            Object objS = S();
            if (objS instanceof c) {
                synchronized (objS) {
                    if (((c) objS).h()) {
                        return q43.d;
                    }
                    boolean zF = ((c) objS).f();
                    if (obj != null || !zF) {
                        if (thI == null) {
                            thI = I(obj);
                        }
                        ((c) objS).b(thI);
                    }
                    Throwable thE = zF ^ true ? ((c) objS).e() : null;
                    if (thE != null) {
                        h0(((c) objS).a(), thE);
                    }
                    return q43.a;
                }
            }
            if (!(objS instanceof gy2)) {
                return q43.d;
            }
            if (thI == null) {
                thI = I(obj);
            }
            gy2 gy2Var = (gy2) objS;
            if (!gy2Var.isActive()) {
                Object objZ0 = z0(objS, new mt0(thI, false, 2, b2 == true ? 1 : 0));
                if (objZ0 == q43.a) {
                    throw new IllegalStateException(("Cannot happen in " + objS).toString());
                }
                if (objZ0 != q43.c) {
                    return objZ0;
                }
            } else if (y0(gy2Var, thI)) {
                return q43.a;
            }
        }
    }

    public final Object b0(Object obj) {
        Object objZ0;
        do {
            objZ0 = z0(S(), obj);
            if (objZ0 == q43.a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, L(obj));
            }
        } while (objZ0 == q43.c);
        return objZ0;
    }

    public final o43 c0(Function1 function1, boolean z) {
        o43 j13Var;
        if (z) {
            j13Var = function1 instanceof g43 ? (g43) function1 : null;
            if (j13Var == null) {
                j13Var = new i13(function1);
            }
        } else {
            j13Var = function1 instanceof o43 ? (o43) function1 : null;
            if (j13Var == null) {
                j13Var = new j13(function1);
            }
        }
        j13Var.t(this);
        return j13Var;
    }

    @Override // com.zepto.e43, com.zepto.t55
    public void d(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new f43(E(), null, this);
        }
        A(cancellationException);
    }

    @Override // com.zepto.zj0
    public final void d0(ol4 ol4Var) throws Throwable {
        z(ol4Var);
    }

    public String f0() {
        return me1.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return e43.a.b(this, obj, function2);
    }

    public final yj0 g0(fn3 fn3Var) {
        while (fn3Var.m()) {
            fn3Var = fn3Var.l();
        }
        while (true) {
            fn3Var = fn3Var.k();
            if (!fn3Var.m()) {
                if (fn3Var instanceof yj0) {
                    return (yj0) fn3Var;
                }
                if (fn3Var instanceof v94) {
                    return null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return e43.a.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return e43.d;
    }

    public final void h0(v94 v94Var, Throwable th) throws Throwable {
        j0(th);
        Object objJ = v94Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        pt0 pt0Var = null;
        for (fn3 fn3VarK = (fn3) objJ; !Intrinsics.areEqual(fn3VarK, v94Var); fn3VarK = fn3VarK.k()) {
            if (fn3VarK instanceof g43) {
                o43 o43Var = (o43) fn3VarK;
                try {
                    o43Var.r(th);
                } catch (Throwable th2) {
                    if (pt0Var != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(pt0Var, th2);
                    } else {
                        pt0Var = new pt0("Exception in completion handler " + o43Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (pt0Var != null) {
            V(pt0Var);
        }
        D(th);
    }

    public final void i0(v94 v94Var, Throwable th) throws Throwable {
        Object objJ = v94Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        pt0 pt0Var = null;
        for (fn3 fn3VarK = (fn3) objJ; !Intrinsics.areEqual(fn3VarK, v94Var); fn3VarK = fn3VarK.k()) {
            if (fn3VarK instanceof o43) {
                o43 o43Var = (o43) fn3VarK;
                try {
                    o43Var.r(th);
                } catch (Throwable th2) {
                    if (pt0Var != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(pt0Var, th2);
                    } else {
                        pt0Var = new pt0("Exception in completion handler " + o43Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (pt0Var != null) {
            V(pt0Var);
        }
    }

    @Override // com.zepto.e43
    public boolean isActive() {
        Object objS = S();
        return (objS instanceof gy2) && ((gy2) objS).isActive();
    }

    @Override // com.zepto.e43
    public final uk1 j(Function1 function1) {
        return P(false, true, function1);
    }

    public void j0(Throwable th) {
    }

    public void l0(Object obj) {
    }

    public void m0() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return e43.a.e(this, key);
    }

    public final void n0(p12 p12Var) {
        v94 v94Var = new v94();
        Object fy2Var = v94Var;
        if (!p12Var.isActive()) {
            fy2Var = new fy2(v94Var);
        }
        o2.a(c, this, p12Var, fy2Var);
    }

    public final void o0(o43 o43Var) {
        o43Var.f(new v94());
        o2.a(c, this, o43Var, o43Var.k());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return e43.a.f(this, coroutineContext);
    }

    public final void q0(o43 o43Var) {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof o43)) {
                if (!(objS instanceof gy2) || ((gy2) objS).a() == null) {
                    return;
                }
                o43Var.n();
                return;
            }
            if (objS != o43Var) {
                return;
            }
        } while (!o2.a(c, this, objS, q43.g));
    }

    public final void r0(xj0 xj0Var) {
        e.set(this, xj0Var);
    }

    public final boolean s(Object obj, v94 v94Var, o43 o43Var) {
        int iQ;
        d dVar = new d(o43Var, this, obj);
        do {
            iQ = v94Var.l().q(o43Var, v94Var, dVar);
            if (iQ == 1) {
                return true;
            }
        } while (iQ != 2);
        return false;
    }

    public final int s0(Object obj) {
        if (obj instanceof p12) {
            if (((p12) obj).isActive()) {
                return 0;
            }
            if (!o2.a(c, this, obj, q43.g)) {
                return -1;
            }
            m0();
            return 1;
        }
        if (!(obj instanceof fy2)) {
            return 0;
        }
        if (!o2.a(c, this, obj, ((fy2) obj).a())) {
            return -1;
        }
        m0();
        return 1;
    }

    @Override // com.zepto.e43
    public final boolean start() {
        int iS0;
        do {
            iS0 = s0(S());
            if (iS0 == 0) {
                return false;
            }
        } while (iS0 != 1);
        return true;
    }

    public final void t(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    public final String t0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof gy2 ? ((gy2) obj).isActive() ? "Active" : "New" : obj instanceof mt0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public String toString() {
        return w0() + '@' + me1.b(this);
    }

    public void u(Object obj) {
    }

    public final CancellationException u0(Throwable th, String str) {
        CancellationException f43Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (f43Var == null) {
            if (str == null) {
                str = E();
            }
            f43Var = new f43(str, th, this);
        }
        return f43Var;
    }

    public final Object v(Continuation continuation) throws Throwable {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof gy2)) {
                if (objS instanceof mt0) {
                    throw ((mt0) objS).a;
                }
                return q43.h(objS);
            }
        } while (s0(objS) < 0);
        return x(continuation);
    }

    @Override // com.zepto.e43
    public final xj0 w(zj0 zj0Var) {
        uk1 uk1VarD = e43.a.d(this, true, false, new yj0(zj0Var), 2, null);
        Intrinsics.checkNotNull(uk1VarD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (xj0) uk1VarD;
    }

    public final String w0() {
        return f0() + '{' + t0(S()) + '}';
    }

    public final Object x(Continuation continuation) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), this);
        aVar.z();
        bb0.a(aVar, j(new xd5(aVar)));
        Object objW = aVar.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW;
    }

    public final boolean x0(gy2 gy2Var, Object obj) throws Throwable {
        if (!o2.a(c, this, gy2Var, q43.g(obj))) {
            return false;
        }
        j0(null);
        l0(obj);
        G(gy2Var, obj);
        return true;
    }

    public final boolean y(Throwable th) {
        return z(th);
    }

    public final boolean y0(gy2 gy2Var, Throwable th) throws Throwable {
        v94 v94VarQ = Q(gy2Var);
        if (v94VarQ == null) {
            return false;
        }
        if (!o2.a(c, this, gy2Var, new c(v94VarQ, false, th))) {
            return false;
        }
        h0(v94VarQ, th);
        return true;
    }

    public final boolean z(Object obj) throws Throwable {
        Object objA0 = q43.a;
        if (O() && (objA0 = C(obj)) == q43.b) {
            return true;
        }
        if (objA0 == q43.a) {
            objA0 = a0(obj);
        }
        if (objA0 == q43.a || objA0 == q43.b) {
            return true;
        }
        if (objA0 == q43.d) {
            return false;
        }
        u(objA0);
        return true;
    }

    public final Object z0(Object obj, Object obj2) {
        return !(obj instanceof gy2) ? q43.a : ((!(obj instanceof p12) && !(obj instanceof o43)) || (obj instanceof yj0) || (obj2 instanceof mt0)) ? A0((gy2) obj, obj2) : x0((gy2) obj, obj2) ? obj2 : q43.c;
    }
}
