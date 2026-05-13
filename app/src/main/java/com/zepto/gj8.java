package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class gj8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ qj8 e;

    public gj8(qj8 qj8Var, Task task) {
        this.e = qj8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.e.b) {
            try {
                qj8 qj8Var = this.e;
                if (qj8Var.c != null) {
                    qj8Var.c.b(this.c.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
