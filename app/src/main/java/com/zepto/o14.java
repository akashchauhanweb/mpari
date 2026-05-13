package com.zepto;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o14 implements we1 {
    public List a = new ArrayList();
    public n14 b;

    @Override // com.zepto.we1
    public void a(oj4 oj4Var) {
        b(oj4Var, null);
    }

    @Override // com.zepto.we1
    public void b(oj4 oj4Var, we1 we1Var) {
        if (we1Var != null) {
            we1Var.a(oj4Var);
        }
        e(oj4Var);
        d(oj4Var);
    }

    public void c(n14 n14Var) {
        this.a.add(n14Var);
    }

    public final void d(oj4 oj4Var) {
        n14 n14Var = this.b;
        if (n14Var != null) {
            oj4Var.b(n14Var.reference());
        }
    }

    public final void e(oj4 oj4Var) {
        q14 q14VarE = oj4Var.e();
        for (n14 n14Var : this.a) {
            q14VarE.J(n14Var.reference(), n14Var.prefix());
        }
    }

    public void f(n14 n14Var) {
        if (n14Var != null) {
            c(n14Var);
        }
        this.b = n14Var;
    }
}
