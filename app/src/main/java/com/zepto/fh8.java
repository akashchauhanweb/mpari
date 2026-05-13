package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class fh8 implements Runnable {
    public final /* synthetic */ nh8 c;

    public fh8(nh8 nh8Var) {
        this.c = nh8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.b) {
            try {
                nh8 nh8Var = this.c;
                if (nh8Var.c != null) {
                    nh8Var.c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
