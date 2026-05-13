package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class z62 {
    public final i90 a = new if3();
    public final hf2 b;
    public final Class c;

    public z62(si1 si1Var, c96 c96Var) {
        this.b = c96Var.f();
        this.c = si1Var.getType();
    }

    public y62 a(String str) {
        y62 y62Var = (y62) this.a.b(str);
        return y62Var == null ? b(str) : y62Var;
    }

    public final y62 b(String str) {
        fm4 fm4Var = new fm4(str, new dq0(this.c), this.b);
        i90 i90Var = this.a;
        if (i90Var != null) {
            i90Var.a(str, fm4Var);
        }
        return fm4Var;
    }
}
