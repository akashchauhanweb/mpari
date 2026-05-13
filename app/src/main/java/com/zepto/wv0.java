package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wv0 {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(wv0.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(wv0.class, Object.class, "_prev");

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile Object _prev;

    public wv0(wv0 wv0Var) {
        this._prev = wv0Var;
    }

    public final void b() {
        e.lazySet(this, null);
    }

    public final wv0 c() {
        wv0 wv0VarG = g();
        while (wv0VarG != null && wv0VarG.h()) {
            wv0VarG = (wv0) e.get(wv0VarG);
        }
        return wv0VarG;
    }

    public final wv0 d() {
        wv0 wv0VarE;
        wv0 wv0VarE2 = e();
        Intrinsics.checkNotNull(wv0VarE2);
        while (wv0VarE2.h() && (wv0VarE = wv0VarE2.e()) != null) {
            wv0VarE2 = wv0VarE;
        }
        return wv0VarE2;
    }

    public final wv0 e() {
        Object objF = f();
        if (objF == vv0.a) {
            return null;
        }
        return (wv0) objF;
    }

    public final Object f() {
        return c.get(this);
    }

    public final wv0 g() {
        return (wv0) e.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return o2.a(c, this, null, vv0.a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            wv0 wv0VarC = c();
            wv0 wv0VarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            do {
                obj = atomicReferenceFieldUpdater.get(wv0VarD);
            } while (!o2.a(atomicReferenceFieldUpdater, wv0VarD, obj, ((wv0) obj) == null ? null : wv0VarC));
            if (wv0VarC != null) {
                c.set(wv0VarC, wv0VarD);
            }
            if (!wv0VarD.h() || wv0VarD.i()) {
                if (wv0VarC == null || !wv0VarC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(wv0 wv0Var) {
        return o2.a(c, this, null, wv0Var);
    }
}
