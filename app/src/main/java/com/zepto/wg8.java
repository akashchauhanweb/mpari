package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wg8 implements yg8 {
    public final Executor a;
    public final Object b = new Object();
    public final dh4 c;

    public wg8(Executor executor, dh4 dh4Var) {
        this.a = executor;
        this.c = dh4Var;
    }

    @Override // com.zepto.yg8
    public final void a(pc6 pc6Var) {
        if (pc6Var.h()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new sf8(this, pc6Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
