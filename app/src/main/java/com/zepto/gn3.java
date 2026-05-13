package com.zepto;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes3.dex */
public class gn3 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gn3.class, Object.class, "_cur");

    @Volatile
    private volatile Object _cur;

    public gn3(boolean z) {
        this._cur = new hn3(8, z);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            hn3 hn3Var = (hn3) atomicReferenceFieldUpdater.get(this);
            int iA = hn3Var.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                o2.a(a, this, hn3Var, hn3Var.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            hn3 hn3Var = (hn3) atomicReferenceFieldUpdater.get(this);
            if (hn3Var.d()) {
                return;
            } else {
                o2.a(a, this, hn3Var, hn3Var.i());
            }
        }
    }

    public final int c() {
        return ((hn3) a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            hn3 hn3Var = (hn3) atomicReferenceFieldUpdater.get(this);
            Object objJ = hn3Var.j();
            if (objJ != hn3.h) {
                return objJ;
            }
            o2.a(a, this, hn3Var, hn3Var.i());
        }
    }
}
