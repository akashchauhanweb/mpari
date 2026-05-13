package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ye4 extends xu4 {
    public ye4(wy0 wy0Var, lo6 lo6Var, Class cls) {
        super(wy0Var, lo6Var, cls);
    }

    @Override // com.zepto.xu4
    public b03 h(cz2 cz2Var) throws g03 {
        im7 im7VarB = b(cz2Var);
        Class clsD = d();
        if (im7VarB != null) {
            return new af4(this.a, im7VarB);
        }
        if (p72.f(clsD)) {
            return this.a.d(clsD);
        }
        throw new g03("Cannot instantiate %s for %s", clsD, this.d);
    }
}
