package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class f28 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ i28 e;

    public f28(i28 i28Var, int i) {
        this.e = i28Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.k(this.c);
    }
}
