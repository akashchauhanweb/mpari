package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qf8 implements Runnable {
    public final /* synthetic */ Task c;
    public final /* synthetic */ tg8 e;

    public qf8(tg8 tg8Var, Task task) {
        this.e = tg8Var;
        this.c = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.e.b.a(this.c);
            if (task == null) {
                this.e.a(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = xc6.b;
            task.g(executor, this.e);
            task.e(executor, this.e);
            task.a(executor, this.e);
        } catch (bg5 e) {
            if (e.getCause() instanceof Exception) {
                this.e.c.q((Exception) e.getCause());
            } else {
                this.e.c.q(e);
            }
        } catch (Exception e2) {
            this.e.c.q(e2);
        }
    }
}
