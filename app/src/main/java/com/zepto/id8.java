package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class id8 implements yg8 {
    public final Executor a;
    public final Object b = new Object();
    public final qg4 c;

    public id8(Executor executor, qg4 qg4Var) {
        this.a = executor;
        this.c = qg4Var;
    }

    @Override // com.zepto.yg8
    public final void a(pc6 pc6Var) {
        if (pc6Var.h()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new ua8(this, pc6Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
