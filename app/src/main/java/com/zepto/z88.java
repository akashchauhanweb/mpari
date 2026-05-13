package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z88 implements yg8 {
    public final Executor a;
    public final Object b = new Object();
    public final ig4 c;

    public z88(Executor executor, ig4 ig4Var) {
        this.a = executor;
        this.c = ig4Var;
    }

    @Override // com.zepto.yg8
    public final void a(pc6 pc6Var) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new s58(this, pc6Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
