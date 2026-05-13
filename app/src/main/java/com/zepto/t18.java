package com.zepto;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t18 implements jg4 {
    public final /* synthetic */ rc6 a;
    public final /* synthetic */ v18 b;

    public t18(v18 v18Var, rc6 rc6Var) {
        this.b = v18Var;
        this.a = rc6Var;
    }

    @Override // com.zepto.jg4
    public final void a(Task task) {
        this.b.b.remove(this.a);
    }
}
