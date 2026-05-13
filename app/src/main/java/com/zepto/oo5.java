package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class oo5 {
    public final i90 a = new tv0();
    public final c96 b;

    public oo5(c96 c96Var) {
        this.b = c96Var;
    }

    public no5 a(Class cls) {
        no5 df4Var;
        no5 no5Var = (no5) this.a.b(cls);
        if (no5Var == null) {
            si1 si1VarC = this.b.c(cls);
            if (this.b.q(cls)) {
                df4Var = new cv4(si1VarC);
            } else {
                df4Var = new df4(si1VarC, this.b);
                if (df4Var.c() && !this.b.p(cls)) {
                    df4Var = new vf1(si1VarC, this.b);
                }
            }
            no5Var = df4Var;
            this.a.a(cls, no5Var);
        }
        return no5Var;
    }
}
