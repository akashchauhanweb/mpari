package com.zepto;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class w42 extends sz0 {
    public long e;
    public boolean f;
    public ArrayDeque g;

    public static /* synthetic */ void G0(w42 w42Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        w42Var.F0(z);
    }

    public final void B0(boolean z) {
        long jC0 = this.e - C0(z);
        this.e = jC0;
        if (jC0 <= 0 && this.f) {
            shutdown();
        }
    }

    public final long C0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void D0(mk1 mk1Var) {
        ArrayDeque arrayDeque = this.g;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.g = arrayDeque;
        }
        arrayDeque.addLast(mk1Var);
    }

    public long E0() {
        ArrayDeque arrayDeque = this.g;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public final void F0(boolean z) {
        this.e += C0(z);
        if (z) {
            return;
        }
        this.f = true;
    }

    public final boolean H0() {
        return this.e >= C0(true);
    }

    public final boolean I0() {
        ArrayDeque arrayDeque = this.g;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public final boolean J0() {
        mk1 mk1Var;
        ArrayDeque arrayDeque = this.g;
        if (arrayDeque == null || (mk1Var = (mk1) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        mk1Var.run();
        return true;
    }

    public abstract void shutdown();
}
