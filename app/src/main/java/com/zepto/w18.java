package com.zepto;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: loaded from: classes.dex */
public final class w18 extends z48 {
    public final qx f;
    public final ak2 g;

    public w18(af3 af3Var, ak2 ak2Var, xj2 xj2Var) {
        super(af3Var, xj2Var);
        this.f = new qx();
        this.g = ak2Var;
        this.a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, ak2 ak2Var, iq iqVar) {
        af3 af3VarC = LifecycleCallback.c(activity);
        w18 w18Var = (w18) af3VarC.c("ConnectionlessLifecycleHelper", w18.class);
        if (w18Var == null) {
            w18Var = new w18(af3VarC, ak2Var, xj2.l());
        }
        iu4.j(iqVar, "ApiKey cannot be null");
        w18Var.f.add(iqVar);
        ak2Var.c(w18Var);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.zepto.z48, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.zepto.z48, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.g.d(this);
    }

    @Override // com.zepto.z48
    public final void m(lw0 lw0Var, int i) {
        this.g.H(lw0Var, i);
    }

    @Override // com.zepto.z48
    public final void n() {
        this.g.a();
    }

    public final qx t() {
        return this.f;
    }

    public final void v() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.c(this);
    }
}
