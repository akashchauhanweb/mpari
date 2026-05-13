package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class yh8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ gi8 e;

    public yh8(gi8 gi8Var, Task task) {
        this.e = gi8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                gi8 gi8Var = this.e;
                if (gi8Var.c != null) {
                    gi8Var.c.a(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
