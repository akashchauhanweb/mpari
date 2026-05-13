package com.zepto;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
public class x70 implements li0 {
    public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(x70.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(x70.class, "receivers");
    public static final AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(x70.class, "bufferEnd");
    public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(x70.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(x70.class, Object.class, "closeHandler");

    @Volatile
    private volatile Object _closeCause;

    @Volatile
    private volatile long bufferEnd;

    @Volatile
    private volatile Object bufferEndSegment;
    public final int c;

    @Volatile
    private volatile Object closeHandler;

    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    public final Function1 e;
    public final Function3 f;

    @Volatile
    private volatile Object receiveSegment;

    @Volatile
    private volatile long receivers;

    @Volatile
    private volatile Object sendSegment;

    @Volatile
    private volatile long sendersAndCloseStatus;

    public final class a implements qi0, ju7 {
        public Object c = y70.p;
        public za0 e;

        public a() {
        }

        @Override // com.zepto.qi0
        public Object a(Continuation continuation) {
            ui0 ui0Var;
            x70 x70Var = x70.this;
            ui0 ui0Var2 = (ui0) x70.l.get(x70Var);
            while (!x70Var.X()) {
                long andIncrement = x70.h.getAndIncrement(x70Var);
                int i = y70.b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (ui0Var2.f != j) {
                    ui0 ui0VarJ = x70Var.J(j, ui0Var2);
                    if (ui0VarJ == null) {
                        continue;
                    } else {
                        ui0Var = ui0VarJ;
                    }
                } else {
                    ui0Var = ui0Var2;
                }
                Object objC0 = x70Var.C0(ui0Var, i2, andIncrement, null);
                if (objC0 == y70.m) {
                    throw new IllegalStateException("unreachable".toString());
                }
                if (objC0 != y70.o) {
                    if (objC0 == y70.n) {
                        return f(ui0Var, i2, andIncrement, continuation);
                    }
                    ui0Var.b();
                    this.c = objC0;
                    return Boxing.boxBoolean(true);
                }
                if (andIncrement < x70Var.Q()) {
                    ui0Var.b();
                }
                ui0Var2 = ui0Var;
            }
            return Boxing.boxBoolean(g());
        }

        @Override // com.zepto.ju7
        public void b(wu5 wu5Var, int i) {
            za0 za0Var = this.e;
            if (za0Var != null) {
                za0Var.b(wu5Var, i);
            }
        }

        public final Object f(ui0 ui0Var, int i, long j, Continuation continuation) {
            Boolean boolBoxBoolean;
            x70 x70Var = x70.this;
            za0 za0VarB = bb0.b(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            try {
                this.e = za0VarB;
                Object objC0 = x70Var.C0(ui0Var, i, j, this);
                if (objC0 == y70.m) {
                    x70Var.n0(this, ui0Var, i);
                } else {
                    Function1 function1A = null;
                    if (objC0 == y70.o) {
                        if (j < x70Var.Q()) {
                            ui0Var.b();
                        }
                        ui0 ui0Var2 = (ui0) x70.l.get(x70Var);
                        while (true) {
                            if (x70Var.X()) {
                                h();
                                break;
                            }
                            long andIncrement = x70.h.getAndIncrement(x70Var);
                            int i2 = y70.b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (ui0Var2.f != j2) {
                                ui0 ui0VarJ = x70Var.J(j2, ui0Var2);
                                if (ui0VarJ != null) {
                                    ui0Var2 = ui0VarJ;
                                }
                            }
                            Object objC02 = x70Var.C0(ui0Var2, i3, andIncrement, this);
                            if (objC02 == y70.m) {
                                x70Var.n0(this, ui0Var2, i3);
                                break;
                            }
                            if (objC02 == y70.o) {
                                if (andIncrement < x70Var.Q()) {
                                    ui0Var2.b();
                                }
                            } else {
                                if (objC02 == y70.n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                ui0Var2.b();
                                this.c = objC02;
                                this.e = null;
                                boolBoxBoolean = Boxing.boxBoolean(true);
                                Function1 function1 = x70Var.e;
                                if (function1 != null) {
                                    function1A = gh4.a(function1, objC02, za0VarB.get$context());
                                }
                            }
                        }
                    } else {
                        ui0Var.b();
                        this.c = objC0;
                        this.e = null;
                        boolBoxBoolean = Boxing.boxBoolean(true);
                        Function1 function12 = x70Var.e;
                        if (function12 != null) {
                            function1A = gh4.a(function12, objC0, za0VarB.get$context());
                        }
                    }
                    za0VarB.K(boolBoxBoolean, function1A);
                }
                Object objW = za0VarB.w();
                if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objW;
            } catch (Throwable th) {
                za0VarB.I();
                throw th;
            }
        }

        public final boolean g() throws Throwable {
            this.c = y70.z();
            Throwable thM = x70.this.M();
            if (thM == null) {
                return false;
            }
            throw f66.a(thM);
        }

        public final void h() {
            za0 za0Var = this.e;
            Intrinsics.checkNotNull(za0Var);
            this.e = null;
            this.c = y70.z();
            Throwable thM = x70.this.M();
            if (thM == null) {
                Result.Companion companion = Result.INSTANCE;
                za0Var.resumeWith(Result.m6constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                za0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(thM)));
            }
        }

        public final boolean i(Object obj) {
            za0 za0Var = this.e;
            Intrinsics.checkNotNull(za0Var);
            this.e = null;
            this.c = obj;
            Boolean bool = Boolean.TRUE;
            Function1 function1 = x70.this.e;
            return y70.B(za0Var, bool, function1 != null ? gh4.a(function1, obj, za0Var.get$context()) : null);
        }

        public final void j() {
            za0 za0Var = this.e;
            Intrinsics.checkNotNull(za0Var);
            this.e = null;
            this.c = y70.z();
            Throwable thM = x70.this.M();
            if (thM == null) {
                Result.Companion companion = Result.INSTANCE;
                za0Var.resumeWith(Result.m6constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                za0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(thM)));
            }
        }

        @Override // com.zepto.qi0
        public Object next() throws Throwable {
            Object obj = this.c;
            if (obj == y70.p) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.c = y70.p;
            if (obj != y70.z()) {
                return obj;
            }
            throw f66.a(x70.this.N());
        }
    }

    public static final class b extends Lambda implements Function3 {

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ Object c;
            public final /* synthetic */ x70 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, x70 x70Var, hv5 hv5Var) {
                super(1);
                this.c = obj;
                this.e = x70Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th) {
                if (this.c == y70.z()) {
                    return;
                }
                Function1 function1 = this.e.e;
                throw null;
            }
        }

        public b() {
            super(3);
        }

        public final Function1 a(hv5 hv5Var, Object obj, Object obj2) {
            return new a(obj2, x70.this, hv5Var);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            wb0.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object c;
        public int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.c = obj;
            this.f |= IntCompanionObject.MIN_VALUE;
            Object objP0 = x70.p0(x70.this, this);
            return objP0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP0 : si0.b(objP0);
        }
    }

    public static final class d extends ContinuationImpl {
        public Object c;
        public Object e;
        public int f;
        public long g;
        public /* synthetic */ Object h;
        public int j;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.h = obj;
            this.j |= IntCompanionObject.MIN_VALUE;
            Object objQ0 = x70.this.q0(null, 0, 0L, this);
            return objQ0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ0 : si0.b(objQ0);
        }
    }

    public x70(int i2, Function1 function1) {
        this.c = i2;
        this.e = function1;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        this.bufferEnd = y70.A(i2);
        this.completedExpandBuffersAndPauseFlag = L();
        ui0 ui0Var = new ui0(0L, null, this, 3);
        this.sendSegment = ui0Var;
        this.receiveSegment = ui0Var;
        if (b0()) {
            ui0Var = y70.a;
            Intrinsics.checkNotNull(ui0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = ui0Var;
        this.f = function1 != null ? new b() : null;
        this._closeCause = y70.s;
    }

    public static /* synthetic */ void T(x70 x70Var, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        x70Var.S(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object p0(com.zepto.x70 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof com.zepto.x70.c
            if (r0 == 0) goto L14
            r0 = r15
            com.zepto.x70$c r0 = (com.zepto.x70.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.zepto.x70$c r0 = new com.zepto.x70$c
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            kotlin.ResultKt.throwOnFailure(r15)
            com.zepto.si0 r15 = (com.zepto.si0) r15
            java.lang.Object r14 = r15.k()
            goto Lb7
        L32:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3a:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = j()
            java.lang.Object r1 = r1.get(r14)
            com.zepto.ui0 r1 = (com.zepto.ui0) r1
        L48:
            boolean r3 = r14.X()
            if (r3 == 0) goto L5a
            com.zepto.si0$b r15 = com.zepto.si0.b
            java.lang.Throwable r14 = r14.M()
            java.lang.Object r14 = r15.a(r14)
            goto Lb7
        L5a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = n()
            long r4 = r3.getAndIncrement(r14)
            int r3 = com.zepto.y70.b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L7a
            com.zepto.ui0 r7 = a(r14, r7, r1)
            if (r7 != 0) goto L78
            goto L48
        L78:
            r13 = r7
            goto L7b
        L7a:
            r13 = r1
        L7b:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = w(r7, r8, r9, r10, r12)
            com.zepto.s96 r7 = com.zepto.y70.r()
            if (r1 == r7) goto Lb8
            com.zepto.s96 r7 = com.zepto.y70.h()
            if (r1 != r7) goto L9d
            long r7 = r14.Q()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9b
            r13.b()
        L9b:
            r1 = r13
            goto L48
        L9d:
            com.zepto.s96 r15 = com.zepto.y70.s()
            if (r1 != r15) goto Lae
            r6.f = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.q0(r2, r3, r4, r6)
            if (r14 != r0) goto Lb7
            return r0
        Lae:
            r13.b()
            com.zepto.si0$b r14 = com.zepto.si0.b
            java.lang.Object r14 = r14.c(r1)
        Lb7:
            return r14
        Lb8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.p0(com.zepto.x70, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object v0(x70 x70Var, Object obj, Continuation continuation) {
        ui0 ui0Var;
        ui0 ui0Var2 = (ui0) k.get(x70Var);
        while (true) {
            long andIncrement = g.getAndIncrement(x70Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean Z = x70Var.Z(andIncrement);
            int i2 = y70.b;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            if (ui0Var2.f != j3) {
                ui0 ui0VarK = x70Var.K(j3, ui0Var2);
                if (ui0VarK != null) {
                    ui0Var = ui0VarK;
                } else if (Z) {
                    Object objJ0 = x70Var.j0(obj, continuation);
                    if (objJ0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objJ0;
                    }
                }
            } else {
                ui0Var = ui0Var2;
            }
            int iE0 = x70Var.E0(ui0Var, i3, obj, j2, null, Z);
            if (iE0 == 0) {
                ui0Var.b();
                break;
            }
            if (iE0 == 1) {
                break;
            }
            if (iE0 != 2) {
                if (iE0 == 3) {
                    Object objW0 = x70Var.w0(ui0Var, i3, obj, j2, continuation);
                    if (objW0 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objW0;
                    }
                } else if (iE0 != 4) {
                    if (iE0 == 5) {
                        ui0Var.b();
                    }
                    ui0Var2 = ui0Var;
                } else {
                    if (j2 < x70Var.O()) {
                        ui0Var.b();
                    }
                    Object objJ02 = x70Var.j0(obj, continuation);
                    if (objJ02 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objJ02;
                    }
                }
            } else if (Z) {
                ui0Var.p();
                Object objJ03 = x70Var.j0(obj, continuation);
                if (objJ03 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objJ03;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void A(ui0 ui0Var, long j2) {
        Object objB = ty2.b(null, 1, null);
        loop0: while (ui0Var != null) {
            for (int i2 = y70.b - 1; -1 < i2; i2--) {
                if ((ui0Var.f * ((long) y70.b)) + ((long) i2) < j2) {
                    break loop0;
                }
                while (true) {
                    Object objW = ui0Var.w(i2);
                    if (objW != null && objW != y70.e) {
                        if (!(objW instanceof ku7)) {
                            if (!(objW instanceof ju7)) {
                                break;
                            }
                            if (ui0Var.r(i2, objW, y70.z())) {
                                objB = ty2.c(objB, objW);
                                ui0Var.x(i2, true);
                                break;
                            }
                        } else {
                            if (ui0Var.r(i2, objW, y70.z())) {
                                objB = ty2.c(objB, ((ku7) objW).a);
                                ui0Var.x(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (ui0Var.r(i2, objW, y70.z())) {
                            ui0Var.p();
                            break;
                        }
                    }
                }
            }
            ui0Var = (ui0) ui0Var.g();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                s0((ju7) objB);
                return;
            }
            Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                s0((ju7) arrayList.get(size));
            }
        }
    }

    public final boolean A0(ui0 ui0Var, int i2, long j2) {
        Object objW = ui0Var.w(i2);
        if (!(objW instanceof ju7) || j2 < h.get(this) || !ui0Var.r(i2, objW, y70.g)) {
            return B0(ui0Var, i2, j2);
        }
        if (z0(objW, ui0Var, i2)) {
            ui0Var.A(i2, y70.d);
            return true;
        }
        ui0Var.A(i2, y70.j);
        ui0Var.x(i2, false);
        return false;
    }

    public final ui0 B() {
        Object obj = m.get(this);
        ui0 ui0Var = (ui0) k.get(this);
        if (ui0Var.f > ((ui0) obj).f) {
            obj = ui0Var;
        }
        ui0 ui0Var2 = (ui0) l.get(this);
        if (ui0Var2.f > ((ui0) obj).f) {
            obj = ui0Var2;
        }
        return (ui0) vv0.b((wv0) obj);
    }

    public final boolean B0(ui0 ui0Var, int i2, long j2) {
        while (true) {
            Object objW = ui0Var.w(i2);
            if (objW instanceof ju7) {
                if (j2 < h.get(this)) {
                    if (ui0Var.r(i2, objW, new ku7((ju7) objW))) {
                        return true;
                    }
                } else if (ui0Var.r(i2, objW, y70.g)) {
                    if (z0(objW, ui0Var, i2)) {
                        ui0Var.A(i2, y70.d);
                        return true;
                    }
                    ui0Var.A(i2, y70.j);
                    ui0Var.x(i2, false);
                    return false;
                }
            } else {
                if (objW == y70.j) {
                    return false;
                }
                if (objW == null) {
                    if (ui0Var.r(i2, objW, y70.e)) {
                        return true;
                    }
                } else {
                    if (objW == y70.d || objW == y70.h || objW == y70.i || objW == y70.k || objW == y70.z()) {
                        return true;
                    }
                    if (objW != y70.f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    public boolean C(Throwable th, boolean z) {
        if (z) {
            d0();
        }
        boolean zA = o2.a(n, this, y70.s, th);
        if (z) {
            e0();
        } else {
            f0();
        }
        F();
        h0();
        if (zA) {
            U();
        }
        return zA;
    }

    public final Object C0(ui0 ui0Var, int i2, long j2, Object obj) {
        Object objW = ui0Var.w(i2);
        if (objW == null) {
            if (j2 >= (g.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return y70.n;
                }
                if (ui0Var.r(i2, objW, obj)) {
                    H();
                    return y70.m;
                }
            }
        } else if (objW == y70.d && ui0Var.r(i2, objW, y70.i)) {
            H();
            return ui0Var.y(i2);
        }
        return D0(ui0Var, i2, j2, obj);
    }

    public final void D(long j2) {
        r0(E(j2));
    }

    public final Object D0(ui0 ui0Var, int i2, long j2, Object obj) {
        while (true) {
            Object objW = ui0Var.w(i2);
            if (objW == null || objW == y70.e) {
                if (j2 < (g.get(this) & 1152921504606846975L)) {
                    if (ui0Var.r(i2, objW, y70.h)) {
                        H();
                        return y70.o;
                    }
                } else {
                    if (obj == null) {
                        return y70.n;
                    }
                    if (ui0Var.r(i2, objW, obj)) {
                        H();
                        return y70.m;
                    }
                }
            } else {
                if (objW != y70.d) {
                    if (objW != y70.j && objW != y70.h) {
                        if (objW == y70.z()) {
                            H();
                            return y70.o;
                        }
                        if (objW != y70.g && ui0Var.r(i2, objW, y70.f)) {
                            boolean z = objW instanceof ku7;
                            if (z) {
                                objW = ((ku7) objW).a;
                            }
                            if (z0(objW, ui0Var, i2)) {
                                ui0Var.A(i2, y70.i);
                                H();
                                return ui0Var.y(i2);
                            }
                            ui0Var.A(i2, y70.j);
                            ui0Var.x(i2, false);
                            if (z) {
                                H();
                            }
                            return y70.o;
                        }
                    }
                    return y70.o;
                }
                if (ui0Var.r(i2, objW, y70.i)) {
                    H();
                    return ui0Var.y(i2);
                }
            }
        }
    }

    public final ui0 E(long j2) {
        ui0 ui0VarB = B();
        if (a0()) {
            long jC0 = c0(ui0VarB);
            if (jC0 != -1) {
                G(jC0);
            }
        }
        A(ui0VarB, j2);
        return ui0VarB;
    }

    public final int E0(ui0 ui0Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        ui0Var.B(i2, obj);
        if (z) {
            return F0(ui0Var, i2, obj, j2, obj2, z);
        }
        Object objW = ui0Var.w(i2);
        if (objW == null) {
            if (y(j2)) {
                if (ui0Var.r(i2, null, y70.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ui0Var.r(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objW instanceof ju7) {
            ui0Var.s(i2);
            if (y0(objW, obj)) {
                ui0Var.A(i2, y70.i);
                l0();
                return 0;
            }
            if (ui0Var.t(i2, y70.k) != y70.k) {
                ui0Var.x(i2, true);
            }
            return 5;
        }
        return F0(ui0Var, i2, obj, j2, obj2, z);
    }

    public final void F() {
        l();
    }

    public final int F0(ui0 ui0Var, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objW = ui0Var.w(i2);
            if (objW == null) {
                if (!y(j2) || z) {
                    if (z) {
                        if (ui0Var.r(i2, null, y70.j)) {
                            ui0Var.x(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (ui0Var.r(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (ui0Var.r(i2, null, y70.d)) {
                    return 1;
                }
            } else {
                if (objW != y70.e) {
                    if (objW == y70.k) {
                        ui0Var.s(i2);
                        return 5;
                    }
                    if (objW == y70.h) {
                        ui0Var.s(i2);
                        return 5;
                    }
                    if (objW == y70.z()) {
                        ui0Var.s(i2);
                        F();
                        return 4;
                    }
                    ui0Var.s(i2);
                    if (objW instanceof ku7) {
                        objW = ((ku7) objW).a;
                    }
                    if (y0(objW, obj)) {
                        ui0Var.A(i2, y70.i);
                        l0();
                        return 0;
                    }
                    if (ui0Var.t(i2, y70.k) != y70.k) {
                        ui0Var.x(i2, true);
                    }
                    return 5;
                }
                if (ui0Var.r(i2, objW, y70.d)) {
                    return 1;
                }
            }
        }
    }

    public final void G(long j2) {
        np6 np6VarD;
        ui0 ui0Var = (ui0) l.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.c) + j3, L())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                int i2 = y70.b;
                long j4 = j3 / ((long) i2);
                int i3 = (int) (j3 % ((long) i2));
                if (ui0Var.f != j4) {
                    ui0 ui0VarJ = J(j4, ui0Var);
                    if (ui0VarJ == null) {
                        continue;
                    } else {
                        ui0Var = ui0VarJ;
                    }
                }
                Object objC0 = C0(ui0Var, i3, j3, null);
                if (objC0 != y70.o) {
                    ui0Var.b();
                    Function1 function1 = this.e;
                    if (function1 != null && (np6VarD = gh4.d(function1, objC0, null, 2, null)) != null) {
                        throw np6VarD;
                    }
                } else if (j3 < Q()) {
                    ui0Var.b();
                }
            }
        }
    }

    public final void G0(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j2) {
                return;
            }
        } while (!h.compareAndSet(this, j3, j2));
    }

    public final void H() {
        if (b0()) {
            return;
        }
        ui0 ui0Var = (ui0) m.get(this);
        while (true) {
            long andIncrement = i.getAndIncrement(this);
            int i2 = y70.b;
            long j2 = andIncrement / ((long) i2);
            if (Q() <= andIncrement) {
                if (ui0Var.f < j2 && ui0Var.e() != null) {
                    g0(j2, ui0Var);
                }
                T(this, 0L, 1, null);
                return;
            }
            if (ui0Var.f != j2) {
                ui0 ui0VarI = I(j2, ui0Var, andIncrement);
                if (ui0VarI == null) {
                    continue;
                } else {
                    ui0Var = ui0VarI;
                }
            }
            if (A0(ui0Var, (int) (andIncrement % ((long) i2)), andIncrement)) {
                T(this, 0L, 1, null);
                return;
            }
            T(this, 0L, 1, null);
        }
    }

    public final void H0(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                return;
            }
        } while (!g.compareAndSet(this, j3, y70.w(j4, (int) (j3 >> 60))));
    }

    public final ui0 I(long j2, ui0 ui0Var, long j3) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        Function2 function2 = (Function2) y70.y();
        loop0: while (true) {
            objC = vv0.c(ui0Var, j2, function2);
            if (!xu5.c(objC)) {
                wu5 wu5VarB = xu5.b(objC);
                while (true) {
                    wu5 wu5Var = (wu5) atomicReferenceFieldUpdater.get(this);
                    if (wu5Var.f >= wu5VarB.f) {
                        break loop0;
                    }
                    if (!wu5VarB.q()) {
                        break;
                    }
                    if (o2.a(atomicReferenceFieldUpdater, this, wu5Var, wu5VarB)) {
                        if (wu5Var.m()) {
                            wu5Var.k();
                        }
                    } else if (wu5VarB.m()) {
                        wu5VarB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (xu5.c(objC)) {
            F();
            g0(j2, ui0Var);
            T(this, 0L, 1, null);
            return null;
        }
        ui0 ui0Var2 = (ui0) xu5.b(objC);
        long j4 = ui0Var2.f;
        if (j4 <= j2) {
            return ui0Var2;
        }
        int i2 = y70.b;
        if (i.compareAndSet(this, j3 + 1, ((long) i2) * j4)) {
            S((ui0Var2.f * ((long) i2)) - j3);
            return null;
        }
        T(this, 0L, 1, null);
        return null;
    }

    public final void I0(long j2) {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        if (b0()) {
            return;
        }
        while (L() <= j2) {
        }
        int i2 = y70.c;
        for (int i3 = 0; i3 < i2; i3++) {
            long jL = L();
            if (jL == (DurationKt.MAX_MILLIS & j.get(this)) && jL == L()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, y70.v(j3 & DurationKt.MAX_MILLIS, true)));
        while (true) {
            long jL2 = L();
            atomicLongFieldUpdater = j;
            long j5 = atomicLongFieldUpdater.get(this);
            long j6 = j5 & DurationKt.MAX_MILLIS;
            boolean z = (4611686018427387904L & j5) != 0;
            if (jL2 == j6 && jL2 == L()) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater.compareAndSet(this, j5, y70.v(j6, true));
            }
        }
        do {
            j4 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, y70.v(j4 & DurationKt.MAX_MILLIS, false)));
    }

    public final ui0 J(long j2, ui0 ui0Var) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        Function2 function2 = (Function2) y70.y();
        loop0: while (true) {
            objC = vv0.c(ui0Var, j2, function2);
            if (!xu5.c(objC)) {
                wu5 wu5VarB = xu5.b(objC);
                while (true) {
                    wu5 wu5Var = (wu5) atomicReferenceFieldUpdater.get(this);
                    if (wu5Var.f >= wu5VarB.f) {
                        break loop0;
                    }
                    if (!wu5VarB.q()) {
                        break;
                    }
                    if (o2.a(atomicReferenceFieldUpdater, this, wu5Var, wu5VarB)) {
                        if (wu5Var.m()) {
                            wu5Var.k();
                        }
                    } else if (wu5VarB.m()) {
                        wu5VarB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (xu5.c(objC)) {
            F();
            if (ui0Var.f * ((long) y70.b) >= Q()) {
                return null;
            }
            ui0Var.b();
            return null;
        }
        ui0 ui0Var2 = (ui0) xu5.b(objC);
        if (!b0() && j2 <= L() / ((long) y70.b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
            while (true) {
                wu5 wu5Var2 = (wu5) atomicReferenceFieldUpdater2.get(this);
                if (wu5Var2.f >= ui0Var2.f || !ui0Var2.q()) {
                    break;
                }
                if (o2.a(atomicReferenceFieldUpdater2, this, wu5Var2, ui0Var2)) {
                    if (wu5Var2.m()) {
                        wu5Var2.k();
                    }
                } else if (ui0Var2.m()) {
                    ui0Var2.k();
                }
            }
        }
        long j3 = ui0Var2.f;
        if (j3 <= j2) {
            return ui0Var2;
        }
        int i2 = y70.b;
        G0(j3 * ((long) i2));
        if (ui0Var2.f * ((long) i2) >= Q()) {
            return null;
        }
        ui0Var2.b();
        return null;
    }

    public final ui0 K(long j2, ui0 ui0Var) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        Function2 function2 = (Function2) y70.y();
        loop0: while (true) {
            objC = vv0.c(ui0Var, j2, function2);
            if (!xu5.c(objC)) {
                wu5 wu5VarB = xu5.b(objC);
                while (true) {
                    wu5 wu5Var = (wu5) atomicReferenceFieldUpdater.get(this);
                    if (wu5Var.f >= wu5VarB.f) {
                        break loop0;
                    }
                    if (!wu5VarB.q()) {
                        break;
                    }
                    if (o2.a(atomicReferenceFieldUpdater, this, wu5Var, wu5VarB)) {
                        if (wu5Var.m()) {
                            wu5Var.k();
                        }
                    } else if (wu5VarB.m()) {
                        wu5VarB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (xu5.c(objC)) {
            F();
            if (ui0Var.f * ((long) y70.b) >= O()) {
                return null;
            }
            ui0Var.b();
            return null;
        }
        ui0 ui0Var2 = (ui0) xu5.b(objC);
        long j3 = ui0Var2.f;
        if (j3 <= j2) {
            return ui0Var2;
        }
        int i2 = y70.b;
        H0(j3 * ((long) i2));
        if (ui0Var2.f * ((long) i2) >= O()) {
            return null;
        }
        ui0Var2.b();
        return null;
    }

    public final long L() {
        return i.get(this);
    }

    public final Throwable M() {
        return (Throwable) n.get(this);
    }

    public final Throwable N() {
        Throwable thM = M();
        return thM == null ? new zq0("Channel was closed") : thM;
    }

    public final long O() {
        return h.get(this);
    }

    public final Throwable P() {
        Throwable thM = M();
        return thM == null ? new ar0("Channel was closed") : thM;
    }

    public final long Q() {
        return g.get(this) & 1152921504606846975L;
    }

    public final boolean R() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            ui0 ui0VarJ = (ui0) atomicReferenceFieldUpdater.get(this);
            long jO = O();
            if (Q() <= jO) {
                return false;
            }
            int i2 = y70.b;
            long j2 = jO / ((long) i2);
            if (ui0VarJ.f == j2 || (ui0VarJ = J(j2, ui0VarJ)) != null) {
                ui0VarJ.b();
                if (V(ui0VarJ, (int) (jO % ((long) i2)), jO)) {
                    return true;
                }
                h.compareAndSet(this, jO, jO + 1);
            } else if (((ui0) atomicReferenceFieldUpdater.get(this)).f < j2) {
                return false;
            }
        }
    }

    public final void S(long j2) {
        if ((j.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((j.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void U() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!o2.a(atomicReferenceFieldUpdater, this, obj, obj == null ? y70.q : y70.r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(M());
    }

    public final boolean V(ui0 ui0Var, int i2, long j2) {
        Object objW;
        do {
            objW = ui0Var.w(i2);
            if (objW != null && objW != y70.e) {
                if (objW == y70.d) {
                    return true;
                }
                if (objW == y70.j || objW == y70.z() || objW == y70.i || objW == y70.h) {
                    return false;
                }
                if (objW == y70.g) {
                    return true;
                }
                return objW != y70.f && j2 == O();
            }
        } while (!ui0Var.r(i2, objW, y70.h));
        H();
        return false;
    }

    public final boolean W(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            E(j2 & 1152921504606846975L);
            if (z && R()) {
                return false;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            D(j2 & 1152921504606846975L);
        }
        return true;
    }

    public boolean X() {
        return Y(g.get(this));
    }

    public final boolean Y(long j2) {
        return W(j2, true);
    }

    public final boolean Z(long j2) {
        return W(j2, false);
    }

    public boolean a0() {
        return false;
    }

    @Override // com.zepto.my5
    public boolean b(Throwable th) {
        return C(th, false);
    }

    public final boolean b0() {
        long jL = L();
        return jL == 0 || jL == LongCompanionObject.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (com.zepto.ui0) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c0(com.zepto.ui0 r8) {
        /*
            r7 = this;
        L0:
            int r0 = com.zepto.y70.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f
            int r5 = com.zepto.y70.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.O()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            com.zepto.s96 r2 = com.zepto.y70.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            com.zepto.s96 r2 = com.zepto.y70.d
            if (r1 != r2) goto L39
            return r3
        L2c:
            com.zepto.s96 r2 = com.zepto.y70.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            com.zepto.wv0 r8 = r8.g()
            com.zepto.ui0 r8 = (com.zepto.ui0) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.c0(com.zepto.ui0):long");
    }

    @Override // com.zepto.t55
    public final void d(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final void d0() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, y70.w(1152921504606846975L & j2, 1)));
    }

    @Override // com.zepto.my5
    public void e(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        if (o2.a(atomicReferenceFieldUpdater, this, null, function1)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != y70.q) {
                if (obj == y70.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!o2.a(o, this, y70.q, y70.r));
        function1.invoke(M());
    }

    public final void e0() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, y70.w(1152921504606846975L & j2, 3)));
    }

    public final void f0() {
        long j2;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                jW = y70.w(j2 & 1152921504606846975L, 2);
            } else if (i2 != 1) {
                return;
            } else {
                jW = y70.w(j2 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, jW));
    }

    @Override // com.zepto.t55
    public Object g() {
        ui0 ui0Var;
        long j2 = h.get(this);
        long j3 = g.get(this);
        if (Y(j3)) {
            return si0.b.a(M());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return si0.b.b();
        }
        Object obj = y70.k;
        ui0 ui0Var2 = (ui0) l.get(this);
        while (!X()) {
            long andIncrement = h.getAndIncrement(this);
            int i2 = y70.b;
            long j4 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (ui0Var2.f != j4) {
                ui0 ui0VarJ = J(j4, ui0Var2);
                if (ui0VarJ == null) {
                    continue;
                } else {
                    ui0Var = ui0VarJ;
                }
            } else {
                ui0Var = ui0Var2;
            }
            Object objC0 = C0(ui0Var, i3, andIncrement, obj);
            if (objC0 == y70.m) {
                ju7 ju7Var = obj instanceof ju7 ? (ju7) obj : null;
                if (ju7Var != null) {
                    n0(ju7Var, ui0Var, i3);
                }
                I0(andIncrement);
                ui0Var.p();
                return si0.b.b();
            }
            if (objC0 != y70.o) {
                if (objC0 == y70.n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                ui0Var.b();
                return si0.b.c(objC0);
            }
            if (andIncrement < Q()) {
                ui0Var.b();
            }
            ui0Var2 = ui0Var;
        }
        return si0.b.a(M());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0(long r5, com.zepto.ui0 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            com.zepto.wv0 r0 = r7.e()
            com.zepto.ui0 r0 = (com.zepto.ui0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            com.zepto.wv0 r5 = r7.e()
            com.zepto.ui0 r5 = (com.zepto.ui0) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.zepto.x70.m
        L24:
            java.lang.Object r6 = r5.get(r4)
            com.zepto.wu5 r6 = (com.zepto.wu5) r6
            long r0 = r6.f
            long r2 = r7.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = com.zepto.o2.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.g0(long, com.zepto.ui0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return com.zepto.si0.b.c(kotlin.Unit.INSTANCE);
     */
    @Override // com.zepto.my5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.zepto.x70.g
            long r0 = r0.get(r14)
            boolean r0 = r14.x0(r0)
            if (r0 == 0) goto L13
            com.zepto.si0$b r15 = com.zepto.si0.b
            java.lang.Object r15 = r15.b()
            return r15
        L13:
            com.zepto.s96 r8 = com.zepto.y70.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r14)
            com.zepto.ui0 r0 = (com.zepto.ui0) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = q(r14, r1)
            int r1 = com.zepto.y70.b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L59
            com.zepto.ui0 r1 = c(r14, r2, r0)
            if (r1 != 0) goto L57
            if (r11 == 0) goto L21
        L4b:
            com.zepto.si0$b r15 = com.zepto.si0.b
            java.lang.Throwable r0 = r14.P()
            java.lang.Object r15 = r15.a(r0)
            goto Lbe
        L57:
            r13 = r1
            goto L5a
        L59:
            r13 = r0
        L5a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = x(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lba
            r1 = 1
            if (r0 == r1) goto Lb1
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L88
            r1 = 4
            if (r0 == r1) goto L7c
            r1 = 5
            if (r0 == r1) goto L77
            goto L7a
        L77:
            r13.b()
        L7a:
            r0 = r13
            goto L21
        L7c:
            long r0 = r14.O()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4b
            r13.b()
            goto L4b
        L88:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L94:
            if (r11 == 0) goto L9a
            r13.p()
            goto L4b
        L9a:
            boolean r15 = r8 instanceof com.zepto.ju7
            if (r15 == 0) goto La1
            com.zepto.ju7 r8 = (com.zepto.ju7) r8
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto La7
            u(r14, r8, r13, r12)
        La7:
            r13.p()
            com.zepto.si0$b r15 = com.zepto.si0.b
            java.lang.Object r15 = r15.b()
            goto Lbe
        Lb1:
            com.zepto.si0$b r15 = com.zepto.si0.b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r15 = r15.c(r0)
            goto Lbe
        Lba:
            r13.b()
            goto Lb1
        Lbe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.h(java.lang.Object):java.lang.Object");
    }

    public void h0() {
    }

    @Override // com.zepto.my5
    public Object i(Object obj, Continuation continuation) {
        return v0(this, obj, continuation);
    }

    public final void i0(ya0 ya0Var) {
        Result.Companion companion = Result.INSTANCE;
        ya0Var.resumeWith(Result.m6constructorimpl(si0.b(si0.b.a(M()))));
    }

    @Override // com.zepto.t55
    public qi0 iterator() {
        return new a();
    }

    public final Object j0(Object obj, Continuation continuation) {
        np6 np6VarD;
        za0 za0Var = new za0(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        za0Var.z();
        Function1 function1 = this.e;
        if (function1 == null || (np6VarD = gh4.d(function1, obj, null, 2, null)) == null) {
            Throwable thP = P();
            Result.Companion companion = Result.INSTANCE;
            za0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(thP)));
        } else {
            ExceptionsKt__ExceptionsKt.addSuppressed(np6VarD, P());
            Result.Companion companion2 = Result.INSTANCE;
            za0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(np6VarD)));
        }
        Object objW = za0Var.w();
        if (objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objW == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : Unit.INSTANCE;
    }

    @Override // com.zepto.t55
    public Object k(Continuation continuation) {
        return p0(this, continuation);
    }

    public final void k0(Object obj, ya0 ya0Var) {
        Function1 function1 = this.e;
        if (function1 != null) {
            gh4.b(function1, obj, ya0Var.get$context());
        }
        Throwable thP = P();
        Result.Companion companion = Result.INSTANCE;
        ya0Var.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(thP)));
    }

    @Override // com.zepto.my5
    public boolean l() {
        return Z(g.get(this));
    }

    public void l0() {
    }

    public void m0() {
    }

    public final void n0(ju7 ju7Var, ui0 ui0Var, int i2) {
        m0();
        ju7Var.b(ui0Var, i2);
    }

    public final void o0(ju7 ju7Var, ui0 ui0Var, int i2) {
        ju7Var.b(ui0Var, i2 + y70.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q0(com.zepto.ui0 r11, int r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.q0(com.zepto.ui0, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (com.zepto.ui0) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(com.zepto.ui0 r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.r0(com.zepto.ui0):void");
    }

    public final void s0(ju7 ju7Var) {
        u0(ju7Var, true);
    }

    public final void t0(ju7 ju7Var) {
        u0(ju7Var, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b4, code lost:
    
        r3 = (com.zepto.ui0) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.toString():java.lang.String");
    }

    public final void u0(ju7 ju7Var, boolean z) {
        if (ju7Var instanceof ya0) {
            Continuation continuation = (Continuation) ju7Var;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m6constructorimpl(ResultKt.createFailure(z ? N() : P())));
        } else if (ju7Var instanceof s55) {
            za0 za0Var = ((s55) ju7Var).c;
            Result.Companion companion2 = Result.INSTANCE;
            za0Var.resumeWith(Result.m6constructorimpl(si0.b(si0.b.a(M()))));
        } else {
            if (ju7Var instanceof a) {
                ((a) ju7Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + ju7Var).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w0(com.zepto.ui0 r21, int r22, java.lang.Object r23, long r24, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.x70.w0(com.zepto.ui0, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean x0(long j2) {
        if (Z(j2)) {
            return false;
        }
        return !y(j2 & 1152921504606846975L);
    }

    public final boolean y(long j2) {
        return j2 < L() || j2 < O() + ((long) this.c);
    }

    public final boolean y0(Object obj, Object obj2) {
        if (obj instanceof s55) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            s55 s55Var = (s55) obj;
            za0 za0Var = s55Var.c;
            si0 si0VarB = si0.b(si0.b.c(obj2));
            Function1 function1 = this.e;
            return y70.B(za0Var, si0VarB, function1 != null ? gh4.a(function1, obj2, s55Var.c.get$context()) : null);
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof ya0) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            ya0 ya0Var = (ya0) obj;
            Function1 function12 = this.e;
            return y70.B(ya0Var, obj2, function12 != null ? gh4.a(function12, obj2, ya0Var.get$context()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public boolean z(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return C(th, true);
    }

    public final boolean z0(Object obj, ui0 ui0Var, int i2) {
        if (obj instanceof ya0) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return y70.C((ya0) obj, Unit.INSTANCE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }
}
