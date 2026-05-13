package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nh8 implements uk8 {
    public final Executor a;
    public final Object b = new Object();
    public hg4 c;

    public nh8(Executor executor, hg4 hg4Var) {
        this.a = executor;
        this.c = hg4Var;
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        if (task.m()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new fh8(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
