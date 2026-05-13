package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class xz0 implements Executor, Closeable {
    public static final a k = new a(null);
    public static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(xz0.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(xz0.class, "controlState");
    public static final AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(xz0.class, "_isTerminated");
    public static final s96 o = new s96("NOT_IN_STACK");

    @Volatile
    private volatile int _isTerminated;
    public final int c;

    @Volatile
    private volatile long controlState;
    public final int e;
    public final long f;
    public final String g;
    public final pj2 h;
    public final pj2 i;
    public final xc5 j;

    @Volatile
    private volatile long parkedWorkersStack;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public xz0(int i, int i2, long j, String str) {
        this.c = i;
        this.e = i2;
        this.f = j;
        this.g = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.h = new pj2();
        this.i = new pj2();
        this.j = new xc5((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ boolean C0(xz0 xz0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = m.get(xz0Var);
        }
        return xz0Var.B0(j);
    }

    public static /* synthetic */ void P(xz0 xz0Var, Runnable runnable, sc6 sc6Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            sc6Var = hd6.g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        xz0Var.D(runnable, sc6Var, z);
    }

    public final nc6 A0(c cVar, nc6 nc6Var, boolean z) {
        if (cVar == null || cVar.f == d.TERMINATED) {
            return nc6Var;
        }
        if (nc6Var.e.b() == 0 && cVar.f == d.BLOCKING) {
            return nc6Var;
        }
        cVar.j = true;
        return cVar.c.a(nc6Var, z);
    }

    public final c B() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.areEqual(xz0.this, this)) {
            return null;
        }
        return cVar;
    }

    public final boolean B0(long j) {
        if (RangesKt___RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.c) {
            int iN = n();
            if (iN == 1 && this.c > 1) {
                n();
            }
            if (iN > 0) {
                return true;
            }
        }
        return false;
    }

    public final void D(Runnable runnable, sc6 sc6Var, boolean z) {
        v2.a();
        nc6 nc6VarW = w(runnable, sc6Var);
        boolean z2 = false;
        boolean z3 = nc6VarW.e.b() == 1;
        long jAddAndGet = z3 ? m.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        c cVarB = B();
        nc6 nc6VarA0 = A0(cVarB, nc6VarW, z);
        if (nc6VarA0 != null && !j(nc6VarA0)) {
            throw new RejectedExecutionException(this.g + " was terminated");
        }
        if (z && cVarB != null) {
            z2 = true;
        }
        if (z3) {
            y0(jAddAndGet, z2);
        } else {
            if (z2) {
                return;
            }
            z0();
        }
    }

    public final boolean D0() {
        c cVarD0;
        do {
            cVarD0 = d0();
            if (cVarD0 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarD0, -1, 0));
        LockSupport.unpark(cVarD0);
        return true;
    }

    public final int U(c cVar) {
        Object objI = cVar.i();
        while (objI != o) {
            if (objI == null) {
                return 0;
            }
            c cVar2 = (c) objI;
            int iH = cVar2.h();
            if (iH != 0) {
                return iH;
            }
            objI = cVar2.i();
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        x0(10000L);
    }

    public final c d0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.j.b((int) (2097151 & j));
            if (cVar == null) {
                return null;
            }
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            int iU = U(cVar);
            if (iU >= 0 && l.compareAndSet(this, j, ((long) iU) | j2)) {
                cVar.r(o);
                return cVar;
            }
        }
    }

    public final boolean e0(c cVar) {
        long j;
        long j2;
        int iH;
        if (cVar.i() != o) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j = atomicLongFieldUpdater.get(this);
            j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            iH = cVar.h();
            cVar.r(this.j.b((int) (2097151 & j)));
        } while (!l.compareAndSet(this, j, j2 | ((long) iH)));
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        P(this, runnable, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return n.get(this) != 0;
    }

    public final boolean j(nc6 nc6Var) {
        return nc6Var.e.b() == 1 ? this.i.a(nc6Var) : this.h.a(nc6Var);
    }

    public final void k0(c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iU = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (iU == i) {
                iU = i2 == 0 ? U(cVar) : i2;
            }
            if (iU >= 0 && l.compareAndSet(this, j, j2 | ((long) iU))) {
                return;
            }
        }
    }

    public final int n() {
        synchronized (this.j) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
                if (iCoerceAtLeast >= this.c) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i2 = ((int) (m.get(this) & 2097151)) + 1;
                if (i2 <= 0 || this.j.b(i2) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i2);
                this.j.c(i2, cVar);
                if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i3 = iCoerceAtLeast + 1;
                cVar.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p0(nc6 nc6Var) {
        try {
            nc6Var.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.j.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            c cVar = (c) this.j.b(i6);
            if (cVar != null) {
                int iE = cVar.c.e();
                int i7 = b.a[cVar.f.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iE);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iE);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iE > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iE);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = m.get(this);
        return this.g + '@' + me1.b(this) + "[Pool Size {core = " + this.c + ", max = " + this.e + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.h.c() + ", global blocking queue size = " + this.i.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.c - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final nc6 w(Runnable runnable, sc6 sc6Var) {
        long jA = hd6.f.a();
        if (!(runnable instanceof nc6)) {
            return new yc6(runnable, jA, sc6Var);
        }
        nc6 nc6Var = (nc6) runnable;
        nc6Var.c = jA;
        nc6Var.e = sc6Var;
        return nc6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.zepto.xz0.n
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.zepto.xz0$c r0 = r7.B()
            com.zepto.xc5 r1 = r7.j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = d()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L23:
            com.zepto.xc5 r4 = r7.j
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            com.zepto.xz0$c r4 = (com.zepto.xz0.c) r4
            if (r4 == r0) goto L44
        L30:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L30
        L3d:
            com.zepto.ty7 r4 = r4.c
            com.zepto.pj2 r5 = r7.i
            r4.f(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            com.zepto.pj2 r8 = r7.i
            r8.b()
            com.zepto.pj2 r8 = r7.h
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            com.zepto.nc6 r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            com.zepto.pj2 r8 = r7.h
            java.lang.Object r8 = r8.d()
            com.zepto.nc6 r8 = (com.zepto.nc6) r8
            if (r8 != 0) goto L83
            com.zepto.pj2 r8 = r7.i
            java.lang.Object r8 = r8.d()
            com.zepto.nc6 r8 = (com.zepto.nc6) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            com.zepto.xz0$d r8 = com.zepto.xz0.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = com.zepto.xz0.l
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = com.zepto.xz0.m
            r8.set(r7, r0)
            return
        L83:
            r7.p0(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xz0.x0(long):void");
    }

    public final void y0(long j, boolean z) {
        if (z || D0() || B0(j)) {
            return;
        }
        D0();
    }

    public final void z0() {
        if (D0() || C0(this, 0L, 1, null)) {
            return;
        }
        D0();
    }

    public final class c extends Thread {
        public static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public final ty7 c;
        public final Ref.ObjectRef e;
        public d f;
        public long g;
        public long h;
        public int i;
        private volatile int indexInArray;
        public boolean j;
        private volatile Object nextParkedWorker;

        @Volatile
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.c = new ty7();
            this.e = new Ref.ObjectRef();
            this.f = d.DORMANT;
            this.nextParkedWorker = xz0.o;
            this.i = Random.INSTANCE.nextInt();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return l;
        }

        public final void b(int i) {
            if (i == 0) {
                return;
            }
            xz0.m.addAndGet(xz0.this, -2097152L);
            if (this.f != d.TERMINATED) {
                this.f = d.DORMANT;
            }
        }

        public final void c(int i) {
            if (i != 0 && u(d.BLOCKING)) {
                xz0.this.z0();
            }
        }

        public final void d(nc6 nc6Var) {
            int iB = nc6Var.e.b();
            k(iB);
            c(iB);
            xz0.this.p0(nc6Var);
            b(iB);
        }

        public final nc6 e(boolean z) {
            nc6 nc6VarO;
            nc6 nc6VarO2;
            if (z) {
                boolean z2 = m(xz0.this.c * 2) == 0;
                if (z2 && (nc6VarO2 = o()) != null) {
                    return nc6VarO2;
                }
                nc6 nc6VarG = this.c.g();
                if (nc6VarG != null) {
                    return nc6VarG;
                }
                if (!z2 && (nc6VarO = o()) != null) {
                    return nc6VarO;
                }
            } else {
                nc6 nc6VarO3 = o();
                if (nc6VarO3 != null) {
                    return nc6VarO3;
                }
            }
            return v(3);
        }

        public final nc6 f() {
            nc6 nc6VarH = this.c.h();
            if (nc6VarH != null) {
                return nc6VarH;
            }
            nc6 nc6Var = (nc6) xz0.this.i.d();
            return nc6Var == null ? v(1) : nc6Var;
        }

        public final nc6 g(boolean z) {
            return s() ? e(z) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i) {
            this.g = 0L;
            if (this.f == d.PARKING) {
                this.f = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != xz0.o;
        }

        public final int m(int i) {
            int i2 = this.i;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.i = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & IntCompanionObject.MAX_VALUE) % i;
        }

        public final void n() {
            if (this.g == 0) {
                this.g = System.nanoTime() + xz0.this.f;
            }
            LockSupport.parkNanos(xz0.this.f);
            if (System.nanoTime() - this.g >= 0) {
                this.g = 0L;
                w();
            }
        }

        public final nc6 o() {
            if (m(2) == 0) {
                nc6 nc6Var = (nc6) xz0.this.h.d();
                return nc6Var != null ? nc6Var : (nc6) xz0.this.i.d();
            }
            nc6 nc6Var2 = (nc6) xz0.this.i.d();
            return nc6Var2 != null ? nc6Var2 : (nc6) xz0.this.h.d();
        }

        public final void p() {
            loop0: while (true) {
                boolean z = false;
                while (!xz0.this.isTerminated() && this.f != d.TERMINATED) {
                    nc6 nc6VarG = g(this.j);
                    if (nc6VarG != null) {
                        this.h = 0L;
                        d(nc6VarG);
                    } else {
                        this.j = false;
                        if (this.h == 0) {
                            t();
                        } else if (z) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        public final void q(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(xz0.this.g);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j;
            if (this.f == d.CPU_ACQUIRED) {
                return true;
            }
            xz0 xz0Var = xz0.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = xz0.m;
            do {
                j = atomicLongFieldUpdater.get(xz0Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!xz0.m.compareAndSet(xz0Var, j, j - 4398046511104L));
            this.f = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                xz0.this.e0(this);
                return;
            }
            l.set(this, -1);
            while (l() && l.get(this) == -1 && !xz0.this.isTerminated() && this.f != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                xz0.m.addAndGet(xz0.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f = dVar;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final nc6 v(int i) {
            int i2 = (int) (xz0.m.get(xz0.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iM = m(i2);
            xz0 xz0Var = xz0.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iM++;
                if (iM > i2) {
                    iM = 1;
                }
                c cVar = (c) xz0Var.j.b(iM);
                if (cVar != null && cVar != this) {
                    long jN = cVar.c.n(i, this.e);
                    if (jN == -1) {
                        Ref.ObjectRef objectRef = this.e;
                        nc6 nc6Var = (nc6) objectRef.element;
                        objectRef.element = null;
                        return nc6Var;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == LongCompanionObject.MAX_VALUE) {
                jMin = 0;
            }
            this.h = jMin;
            return null;
        }

        public final void w() {
            xz0 xz0Var = xz0.this;
            synchronized (xz0Var.j) {
                try {
                    if (xz0Var.isTerminated()) {
                        return;
                    }
                    if (((int) (xz0.m.get(xz0Var) & 2097151)) <= xz0Var.c) {
                        return;
                    }
                    if (l.compareAndSet(this, -1, 1)) {
                        int i = this.indexInArray;
                        q(0);
                        xz0Var.k0(this, i, 0);
                        int andDecrement = (int) (xz0.m.getAndDecrement(xz0Var) & 2097151);
                        if (andDecrement != i) {
                            Object objB = xz0Var.j.b(andDecrement);
                            Intrinsics.checkNotNull(objB);
                            c cVar = (c) objB;
                            xz0Var.j.c(i, cVar);
                            cVar.q(i);
                            xz0Var.k0(cVar, andDecrement, i);
                        }
                        xz0Var.j.c(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.f = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(xz0 xz0Var, int i) {
            this();
            q(i);
        }
    }
}
