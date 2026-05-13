package com.zepto;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class to5 extends b62 {
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public xz0 j = B0();

    public to5(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
    }

    public final xz0 B0() {
        return new xz0(this.f, this.g, this.h, this.i);
    }

    public final void C0(Runnable runnable, sc6 sc6Var, boolean z) {
        this.j.D(runnable, sc6Var, z);
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        xz0.P(this.j, runnable, null, false, 6, null);
    }

    @Override // com.zepto.sz0
    public void y0(CoroutineContext coroutineContext, Runnable runnable) {
        xz0.P(this.j, runnable, null, true, 2, null);
    }
}
