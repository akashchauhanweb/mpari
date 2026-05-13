package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ti1 {
    public final i90 a;
    public final i90 b;
    public final i90 c;
    public final mg1 d;
    public final c96 e;

    public ti1(c96 c96Var) {
        this(c96Var, null);
    }

    public si1 a(Class cls) {
        si1 si1Var = (si1) this.c.b(cls);
        if (si1Var != null) {
            return si1Var;
        }
        ui1 ui1Var = new ui1(cls, this.d);
        this.c.a(cls, ui1Var);
        return ui1Var;
    }

    public wx0 b(Class cls) {
        si1 si1VarA;
        wx0 wx0Var = (wx0) this.b.b(cls);
        return (wx0Var != null || (si1VarA = a(cls)) == null) ? wx0Var : c(cls, si1VarA);
    }

    public final wx0 c(Class cls, si1 si1Var) {
        lb2 lb2Var = new lb2(si1Var, this.e);
        if (si1Var != null) {
            this.b.a(cls, lb2Var);
        }
        return lb2Var;
    }

    public wx0 d(Class cls) {
        si1 si1VarA;
        wx0 wx0Var = (wx0) this.a.b(cls);
        return (wx0Var != null || (si1VarA = a(cls)) == null) ? wx0Var : e(cls, si1VarA);
    }

    public final wx0 e(Class cls, si1 si1Var) {
        zt3 zt3Var = new zt3(si1Var, this.e);
        if (si1Var != null) {
            this.a.a(cls, zt3Var);
        }
        return zt3Var;
    }

    public ti1(c96 c96Var, mg1 mg1Var) {
        this.a = new tv0();
        this.b = new tv0();
        this.c = new tv0();
        this.d = mg1Var;
        this.e = c96Var;
    }
}
