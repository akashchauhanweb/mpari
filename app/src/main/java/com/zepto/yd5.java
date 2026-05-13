package com.zepto;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yd5 implements Runnable {
    public final sz0 c;
    public final ya0 e;

    public yd5(sz0 sz0Var, ya0 ya0Var) {
        this.c = sz0Var;
        this.e = ya0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.e.f(this.c, Unit.INSTANCE);
    }
}
