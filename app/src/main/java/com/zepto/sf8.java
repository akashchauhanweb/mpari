package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class sf8 implements Runnable {
    public final /* synthetic */ pc6 c;
    public final /* synthetic */ wg8 e;

    public sf8(wg8 wg8Var, pc6 pc6Var) {
        this.e = wg8Var;
        this.c = pc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                wg8 wg8Var = this.e;
                if (wg8Var.c != null) {
                    wg8Var.c.b(this.c.f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
