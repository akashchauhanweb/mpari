package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kk8 implements eh4, rg4, hg4, uk8 {
    public final Executor a;
    public final x86 b;
    public final mm8 c;

    public kk8(Executor executor, x86 x86Var, mm8 mm8Var) {
        this.a = executor;
        this.b = x86Var;
        this.c = mm8Var;
    }

    @Override // com.zepto.rg4
    public final void a(Exception exc) {
        this.c.q(exc);
    }

    @Override // com.zepto.eh4
    public final void b(Object obj) {
        this.c.r(obj);
    }

    @Override // com.zepto.hg4
    public final void c() {
        this.c.s();
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        this.a.execute(new ak8(this, task));
    }
}
