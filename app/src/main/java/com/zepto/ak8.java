package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ak8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ kk8 e;

    public ak8(kk8 kk8Var, Task task) {
        this.e = kk8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskA = this.e.b.a(this.c.k());
            if (taskA == null) {
                this.e.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = xc6.b;
            taskA.g(executor, this.e);
            taskA.e(executor, this.e);
            taskA.a(executor, this.e);
        } catch (bg5 e) {
            if (e.getCause() instanceof Exception) {
                this.e.a((Exception) e.getCause());
            } else {
                this.e.a(e);
            }
        } catch (CancellationException unused) {
            this.e.c();
        } catch (Exception e2) {
            this.e.a(e2);
        }
    }
}
