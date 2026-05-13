package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class ni8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ wi8 e;

    public ni8(wi8 wi8Var, Task task) {
        this.e = wi8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                wi8 wi8Var = this.e;
                if (wi8Var.c != null) {
                    wi8Var.c.a((Exception) iu4.i(this.c.j()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
