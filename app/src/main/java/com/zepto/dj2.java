package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class dj2 implements a76 {
    public final pt6 a;
    public final rc6 b;

    public dj2(pt6 pt6Var, rc6 rc6Var) {
        this.a = pt6Var;
        this.b = rc6Var;
    }

    @Override // com.zepto.a76
    public boolean a(hr4 hr4Var) {
        if (!hr4Var.k() || this.a.f(hr4Var)) {
            return false;
        }
        this.b.c(a03.a().b(hr4Var.b()).d(hr4Var.c()).c(hr4Var.h()).a());
        return true;
    }

    @Override // com.zepto.a76
    public boolean b(Exception exc) {
        this.b.d(exc);
        return true;
    }
}
