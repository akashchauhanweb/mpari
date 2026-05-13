package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class g28 implements Runnable {
    public final /* synthetic */ h28 c;

    public g28(h28 h28Var) {
        this.c = h28Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i28 i28Var = this.c.a;
        i28Var.b.c(i28Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
