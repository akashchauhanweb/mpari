package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class un6 implements on6 {
    public final qn6 a;
    public final String b;
    public final c22 c;
    public final dn6 d;
    public final vn6 e;

    public un6(qn6 qn6Var, String str, c22 c22Var, dn6 dn6Var, vn6 vn6Var) {
        this.a = qn6Var;
        this.b = str;
        this.c = c22Var;
        this.d = dn6Var;
        this.e = vn6Var;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // com.zepto.on6
    public void a(o42 o42Var) {
        d(o42Var, new ao6() { // from class: com.zepto.tn6
            @Override // com.zepto.ao6
            public final void a(Exception exc) {
                un6.c(exc);
            }
        });
    }

    public void d(o42 o42Var, ao6 ao6Var) {
        this.e.a(oy5.a().e(this.a).c(o42Var).f(this.b).d(this.d).b(this.c).a(), ao6Var);
    }
}
