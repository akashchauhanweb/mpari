package com.zepto;

import com.zepto.yf3;

/* JADX INFO: loaded from: classes.dex */
public final class f48 extends p38 {
    public final yf3.a c;

    public f48(yf3.a aVar, rc6 rc6Var) {
        super(4, rc6Var);
        this.c = aVar;
    }

    @Override // com.zepto.j48
    public final /* bridge */ /* synthetic */ void d(v18 v18Var, boolean z) {
    }

    @Override // com.zepto.q28
    public final boolean f(i28 i28Var) {
        a38 a38Var = (a38) i28Var.w().get(this.c);
        return a38Var != null && a38Var.a.f();
    }

    @Override // com.zepto.q28
    public final w82[] g(i28 i28Var) {
        a38 a38Var = (a38) i28Var.w().get(this.c);
        if (a38Var == null) {
            return null;
        }
        return a38Var.a.c();
    }

    @Override // com.zepto.p38
    public final void h(i28 i28Var) {
        a38 a38Var = (a38) i28Var.w().remove(this.c);
        if (a38Var == null) {
            this.b.e(Boolean.FALSE);
        } else {
            a38Var.b.b(i28Var.u(), this.b);
            a38Var.a.a();
        }
    }
}
