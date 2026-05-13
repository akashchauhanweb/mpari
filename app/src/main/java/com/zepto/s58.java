package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class s58 implements Runnable {
    public final /* synthetic */ pc6 c;
    public final /* synthetic */ z88 e;

    public s58(z88 z88Var, pc6 pc6Var) {
        this.e = z88Var;
        this.c = pc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                z88 z88Var = this.e;
                if (z88Var.c != null) {
                    z88Var.c.a(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
