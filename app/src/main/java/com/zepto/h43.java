package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class h43 extends p43 implements jt0 {
    public final boolean f;

    public h43(e43 e43Var) {
        super(true);
        W(e43Var);
        this.f = C0();
    }

    public final boolean C0() {
        p43 p43VarS;
        xj0 xj0VarR = R();
        yj0 yj0Var = xj0VarR instanceof yj0 ? (yj0) xj0VarR : null;
        if (yj0Var != null && (p43VarS = yj0Var.s()) != null) {
            while (!p43VarS.N()) {
                xj0 xj0VarR2 = p43VarS.R();
                yj0 yj0Var2 = xj0VarR2 instanceof yj0 ? (yj0) xj0VarR2 : null;
                if (yj0Var2 == null || (p43VarS = yj0Var2.s()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.zepto.p43
    public boolean N() {
        return this.f;
    }

    @Override // com.zepto.p43
    public boolean O() {
        return true;
    }
}
