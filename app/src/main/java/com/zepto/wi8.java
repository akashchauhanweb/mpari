package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wi8 implements uk8 {
    public final Executor a;
    public final Object b = new Object();
    public rg4 c;

    public wi8(Executor executor, rg4 rg4Var) {
        this.a = executor;
        this.c = rg4Var;
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        if (task.o() || task.m()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new ni8(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
