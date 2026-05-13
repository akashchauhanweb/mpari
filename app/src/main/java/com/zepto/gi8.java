package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gi8 implements uk8 {
    public final Executor a;
    public final Object b = new Object();
    public jg4 c;

    public gi8(Executor executor, jg4 jg4Var) {
        this.a = executor;
        this.c = jg4Var;
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new yh8(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
