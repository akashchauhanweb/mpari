package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class xu4 extends p72 {
    public xu4(wy0 wy0Var, lo6 lo6Var) {
        super(wy0Var, lo6Var);
    }

    public b03 h(cz2 cz2Var) throws g03 {
        im7 im7VarB = b(cz2Var);
        return im7VarB == null ? this.a.d(d()) : new af4(this.a, im7VarB);
    }

    public Object i(String str, Class cls) {
        return this.b.r(str, cls);
    }

    public String j(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.isEnum() ? this.b.s(obj, cls) : this.b.s(obj, cls);
    }

    public xu4(wy0 wy0Var, lo6 lo6Var, Class cls) {
        super(wy0Var, lo6Var, cls);
    }
}
