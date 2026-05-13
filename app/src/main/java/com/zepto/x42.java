package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class x42 extends y42 implements ah1 {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(x42.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(x42.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(x42.class, "_isCompleted");

    @Volatile
    private volatile Object _delayed;

    @Volatile
    private volatile int _isCompleted = 0;

    @Volatile
    private volatile Object _queue;

    public final class a extends b {
        public final ya0 f;

        public a(long j, ya0 ya0Var) {
            super(j);
            this.f = ya0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f.f(x42.this, Unit.INSTANCE);
        }

        @Override // com.zepto.x42.b
        public String toString() {
            return super.toString() + this.f;
        }
    }

    public static abstract class b implements Runnable, Comparable, uk1, qf6 {
        private volatile Object _heap;
        public long c;
        public int e = -1;

        public b(long j) {
            this.c = j;
        }

        @Override // com.zepto.qf6
        public void a(int i) {
            this.e = i;
        }

        @Override // com.zepto.uk1
        public final void b() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == a52.a) {
                        return;
                    }
                    c cVar = obj instanceof c ? (c) obj : null;
                    if (cVar != null) {
                        cVar.g(this);
                    }
                    this._heap = a52.a;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.zepto.qf6
        public void d(pf6 pf6Var) {
            if (this._heap == a52.a) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = pf6Var;
        }

        @Override // com.zepto.qf6
        public pf6 e() {
            Object obj = this._heap;
            if (obj instanceof pf6) {
                return (pf6) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j = this.c - bVar.c;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final int g(long j, c cVar, x42 x42Var) {
            synchronized (this) {
                if (this._heap == a52.a) {
                    return 2;
                }
                synchronized (cVar) {
                    try {
                        b bVar = (b) cVar.b();
                        if (x42Var.S0()) {
                            return 1;
                        }
                        if (bVar == null) {
                            cVar.c = j;
                        } else {
                            long j2 = bVar.c;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - cVar.c > 0) {
                                cVar.c = j;
                            }
                        }
                        long j3 = this.c;
                        long j4 = cVar.c;
                        if (j3 - j4 < 0) {
                            this.c = j4;
                        }
                        cVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.zepto.qf6
        public int getIndex() {
            return this.e;
        }

        public final boolean h(long j) {
            return j - this.c >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.c + ']';
        }
    }

    public static final class c extends pf6 {
        public long c;

        public c(long j) {
            this.c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean S0() {
        return j.get(this) != 0;
    }

    @Override // com.zepto.ah1
    public void D(long j2, ya0 ya0Var) {
        long jC = a52.c(j2);
        if (jC < DurationKt.MAX_MILLIS) {
            v2.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, ya0Var);
            X0(jNanoTime, aVar);
            bb0.a(ya0Var, aVar);
        }
    }

    @Override // com.zepto.w42
    public long E0() {
        b bVar;
        if (super.E0() == 0) {
            return 0L;
        }
        Object obj = h.get(this);
        if (obj != null) {
            if (!(obj instanceof hn3)) {
                if (obj == a52.b) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((hn3) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) i.get(this);
        if (cVar == null || (bVar = (b) cVar.e()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j2 = bVar.c;
        v2.a();
        return RangesKt___RangesKt.coerceAtLeast(j2 - System.nanoTime(), 0L);
    }

    public final void O0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (o2.a(h, this, null, a52.b)) {
                    return;
                }
            } else if (obj instanceof hn3) {
                ((hn3) obj).d();
                return;
            } else {
                if (obj == a52.b) {
                    return;
                }
                hn3 hn3Var = new hn3(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                hn3Var.a((Runnable) obj);
                if (o2.a(h, this, obj, hn3Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable P0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof hn3) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                hn3 hn3Var = (hn3) obj;
                Object objJ = hn3Var.j();
                if (objJ != hn3.h) {
                    return (Runnable) objJ;
                }
                o2.a(h, this, obj, hn3Var.i());
            } else {
                if (obj == a52.b) {
                    return null;
                }
                if (o2.a(h, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void Q0(Runnable runnable) {
        if (R0(runnable)) {
            M0();
        } else {
            hf1.k.Q0(runnable);
        }
    }

    public final boolean R0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (S0()) {
                return false;
            }
            if (obj == null) {
                if (o2.a(h, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof hn3) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                hn3 hn3Var = (hn3) obj;
                int iA = hn3Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    o2.a(h, this, obj, hn3Var.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == a52.b) {
                    return false;
                }
                hn3 hn3Var2 = new hn3(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                hn3Var2.a((Runnable) obj);
                hn3Var2.a(runnable);
                if (o2.a(h, this, obj, hn3Var2)) {
                    return true;
                }
            }
        }
    }

    public boolean T0() {
        if (!I0()) {
            return false;
        }
        c cVar = (c) i.get(this);
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = h.get(this);
        if (obj != null) {
            if (obj instanceof hn3) {
                return ((hn3) obj).g();
            }
            if (obj != a52.b) {
                return false;
            }
        }
        return true;
    }

    public long U0() {
        qf6 qf6VarH;
        if (J0()) {
            return 0L;
        }
        c cVar = (c) i.get(this);
        if (cVar != null && !cVar.d()) {
            v2.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    qf6 qf6VarB = cVar.b();
                    qf6VarH = null;
                    if (qf6VarB != null) {
                        b bVar = (b) qf6VarB;
                        if (bVar.h(jNanoTime) && R0(bVar)) {
                            qf6VarH = cVar.h(0);
                        }
                    }
                }
            } while (((b) qf6VarH) != null);
        }
        Runnable runnableP0 = P0();
        if (runnableP0 == null) {
            return E0();
        }
        runnableP0.run();
        return 0L;
    }

    public final void V0() {
        b bVar;
        v2.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) i.get(this);
            if (cVar == null || (bVar = (b) cVar.i()) == null) {
                return;
            } else {
                L0(jNanoTime, bVar);
            }
        }
    }

    public final void W0() {
        h.set(this, null);
        i.set(this, null);
    }

    public final void X0(long j2, b bVar) {
        int iY0 = Y0(j2, bVar);
        if (iY0 == 0) {
            if (a1(bVar)) {
                M0();
            }
        } else if (iY0 == 1) {
            L0(j2, bVar);
        } else if (iY0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int Y0(long j2, b bVar) {
        if (S0()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        c cVar = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar == null) {
            o2.a(atomicReferenceFieldUpdater, this, null, new c(j2));
            Object obj = atomicReferenceFieldUpdater.get(this);
            Intrinsics.checkNotNull(obj);
            cVar = (c) obj;
        }
        return bVar.g(j2, cVar, this);
    }

    public final void Z0(boolean z) {
        j.set(this, z ? 1 : 0);
    }

    public final boolean a1(b bVar) {
        c cVar = (c) i.get(this);
        return (cVar != null ? (b) cVar.e() : null) == bVar;
    }

    @Override // com.zepto.w42
    public void shutdown() {
        mf6.a.b();
        Z0(true);
        O0();
        while (U0() <= 0) {
        }
        V0();
    }

    @Override // com.zepto.sz0
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        Q0(runnable);
    }
}
