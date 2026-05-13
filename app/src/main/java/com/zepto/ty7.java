package com.zepto;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class ty7 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ty7.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ty7.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ty7.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ty7.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);

    @Volatile
    private volatile int blockingTasksInBuffer;

    @Volatile
    private volatile int consumerIndex;

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;

    public final nc6 a(nc6 nc6Var, boolean z) {
        if (z) {
            return b(nc6Var);
        }
        nc6 nc6Var2 = (nc6) b.getAndSet(this, nc6Var);
        if (nc6Var2 == null) {
            return null;
        }
        return b(nc6Var2);
    }

    public final nc6 b(nc6 nc6Var) {
        if (d() == 127) {
            return nc6Var;
        }
        if (nc6Var.e.b() == 1) {
            e.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, nc6Var);
        c.incrementAndGet(this);
        return null;
    }

    public final void c(nc6 nc6Var) {
        if (nc6Var == null || nc6Var.e.b() != 1) {
            return;
        }
        e.decrementAndGet(this);
    }

    public final int d() {
        return c.get(this) - d.get(this);
    }

    public final int e() {
        return b.get(this) != null ? d() + 1 : d();
    }

    public final void f(pj2 pj2Var) {
        nc6 nc6Var = (nc6) b.getAndSet(this, null);
        if (nc6Var != null) {
            pj2Var.a(nc6Var);
        }
        while (j(pj2Var)) {
        }
    }

    public final nc6 g() {
        nc6 nc6Var = (nc6) b.getAndSet(this, null);
        return nc6Var == null ? i() : nc6Var;
    }

    public final nc6 h() {
        return k(true);
    }

    public final nc6 i() {
        nc6 nc6Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (nc6Var = (nc6) this.a.getAndSet(i2, null)) != null) {
                c(nc6Var);
                return nc6Var;
            }
        }
    }

    public final boolean j(pj2 pj2Var) {
        nc6 nc6VarI = i();
        if (nc6VarI == null) {
            return false;
        }
        pj2Var.a(nc6VarI);
        return true;
    }

    public final nc6 k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        nc6 nc6Var;
        do {
            atomicReferenceFieldUpdater = b;
            nc6Var = (nc6) atomicReferenceFieldUpdater.get(this);
            if (nc6Var != null) {
                if ((nc6Var.e.b() == 1) == z) {
                }
            }
            int i = d.get(this);
            int i2 = c.get(this);
            while (i != i2) {
                if (z && e.get(this) == 0) {
                    return null;
                }
                i2--;
                nc6 nc6VarM = m(i2, z);
                if (nc6VarM != null) {
                    return nc6VarM;
                }
            }
            return null;
        } while (!o2.a(atomicReferenceFieldUpdater, this, nc6Var, null));
        return nc6Var;
    }

    public final nc6 l(int i) {
        int i2 = d.get(this);
        int i3 = c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            nc6 nc6VarM = m(i2, z);
            if (nc6VarM != null) {
                return nc6VarM;
            }
            i2 = i4;
        }
        return null;
    }

    public final nc6 m(int i, boolean z) {
        int i2 = i & 127;
        nc6 nc6Var = (nc6) this.a.get(i2);
        if (nc6Var != null) {
            if ((nc6Var.e.b() == 1) == z && ti0.a(this.a, i2, nc6Var, null)) {
                if (z) {
                    e.decrementAndGet(this);
                }
                return nc6Var;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i, Ref.ObjectRef objectRef) {
        T tI = i == 3 ? i() : l(i);
        if (tI == 0) {
            return o(i, objectRef);
        }
        objectRef.element = tI;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.zepto.nc6, java.lang.Object] */
    public final long o(int i, Ref.ObjectRef objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = b;
            r1 = (nc6) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.e.b() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long jA = hd6.f.a() - r1.c;
            long j = hd6.b;
            if (jA < j) {
                return j - jA;
            }
        } while (!o2.a(atomicReferenceFieldUpdater, this, r1, null));
        objectRef.element = r1;
        return -1L;
    }
}
