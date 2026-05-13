package com.zepto;

import android.util.Log;
import com.zepto.t40;
import com.zepto.yp;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m28 implements t40.c, i38 {
    public final yp.f a;
    public final iq b;
    public kw2 c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ ak2 f;

    public m28(ak2 ak2Var, yp.f fVar, iq iqVar) {
        this.f = ak2Var;
        this.a = fVar;
        this.b = iqVar;
    }

    @Override // com.zepto.i38
    public final void a(kw2 kw2Var, Set set) {
        if (kw2Var == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new lw0(4));
        } else {
            this.c = kw2Var;
            this.d = set;
            h();
        }
    }

    @Override // com.zepto.t40.c
    public final void b(lw0 lw0Var) {
        this.f.p.post(new l28(this, lw0Var));
    }

    @Override // com.zepto.i38
    public final void c(lw0 lw0Var) {
        i28 i28Var = (i28) this.f.l.get(this.b);
        if (i28Var != null) {
            i28Var.H(lw0Var);
        }
    }

    public final void h() {
        kw2 kw2Var;
        if (!this.e || (kw2Var = this.c) == null) {
            return;
        }
        this.a.d(kw2Var, this.d);
    }
}
