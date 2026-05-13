package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class fj2 implements a76 {
    public final rc6 a;

    public fj2(rc6 rc6Var) {
        this.a = rc6Var;
    }

    @Override // com.zepto.a76
    public boolean a(hr4 hr4Var) {
        if (!hr4Var.l() && !hr4Var.k() && !hr4Var.i()) {
            return false;
        }
        this.a.e(hr4Var.d());
        return true;
    }

    @Override // com.zepto.a76
    public boolean b(Exception exc) {
        return false;
    }
}
