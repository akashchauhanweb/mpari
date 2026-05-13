package com.zepto;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rd8 implements uk8 {
    public final Executor a;
    public final cz0 b;
    public final mm8 c;

    public rd8(Executor executor, cz0 cz0Var, mm8 mm8Var) {
        this.a = executor;
        this.b = cz0Var;
        this.c = mm8Var;
    }

    @Override // com.zepto.uk8
    public final void d(Task task) {
        this.a.execute(new pa8(this, task));
    }
}
