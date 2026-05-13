package com.zepto;

import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public final class y38 extends p38 {
    public final a38 c;

    public y38(a38 a38Var, rc6 rc6Var) {
        super(3, rc6Var);
        this.c = a38Var;
    }

    @Override // com.zepto.j48
    public final /* bridge */ /* synthetic */ void d(v18 v18Var, boolean z) {
    }

    @Override // com.zepto.q28
    public final boolean f(i28 i28Var) {
        return this.c.a.f();
    }

    @Override // com.zepto.q28
    public final w82[] g(i28 i28Var) {
        return this.c.a.c();
    }

    @Override // com.zepto.p38
    public final void h(i28 i28Var) {
        this.c.a.d(i28Var.u(), this.b);
        yf3.a aVarB = this.c.a.b();
        if (aVarB != null) {
            i28Var.w().put(aVarB, this.c);
        }
    }
}
