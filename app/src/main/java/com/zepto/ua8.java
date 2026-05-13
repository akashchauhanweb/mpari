package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class ua8 implements Runnable {
    public final /* synthetic */ pc6 c;
    public final /* synthetic */ id8 e;

    public ua8(id8 id8Var, pc6 pc6Var) {
        this.e = id8Var;
        this.c = pc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                id8 id8Var = this.e;
                if (id8Var.c != null) {
                    id8Var.c.a(this.c.e());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
