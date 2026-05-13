package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qj8 implements uk8 {
    public final Executor a;
    public final Object b = new Object();
    public eh4 c;

    public qj8(Executor executor, eh4 eh4Var) {
        this.a = executor;
        this.c = eh4Var;
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        if (task.o()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new gj8(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
