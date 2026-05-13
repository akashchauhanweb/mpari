package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class vu4 implements jz0 {
    public final xu4 a;
    public final wy0 b;
    public final String c;
    public final Class d;
    public final lo6 e;

    public vu4(wy0 wy0Var, lo6 lo6Var) {
        this(wy0Var, lo6Var, null);
    }

    @Override // com.zepto.jz0
    public Object a(cz2 cz2Var, Object obj) throws ir4 {
        if (obj == null) {
            return c(cz2Var);
        }
        throw new ir4("Can not read existing %s for %s", this.d, this.e);
    }

    @Override // com.zepto.jz0
    public void b(oj4 oj4Var, Object obj) {
        String strJ = this.a.j(obj);
        if (strJ != null) {
            oj4Var.i(strJ);
        }
    }

    @Override // com.zepto.jz0
    public Object c(cz2 cz2Var) {
        return cz2Var.d() ? e(cz2Var) : d(cz2Var, this.d);
    }

    public Object d(cz2 cz2Var, Class cls) {
        String value = cz2Var.getValue();
        if (value == null) {
            return null;
        }
        String str = this.c;
        return (str == null || !value.equals(str)) ? g(value, cls) : this.c;
    }

    public final Object e(cz2 cz2Var) throws g03 {
        b03 b03VarH = this.a.h(cz2Var);
        return !b03VarH.a() ? f(cz2Var, b03VarH) : b03VarH.c();
    }

    public final Object f(cz2 cz2Var, b03 b03Var) {
        Object objD = d(cz2Var, this.d);
        if (b03Var != null) {
            b03Var.b(objD);
        }
        return objD;
    }

    public final Object g(String str, Class cls) {
        String property = this.b.getProperty(str);
        if (property != null) {
            return this.a.i(property, cls);
        }
        return null;
    }

    public vu4(wy0 wy0Var, lo6 lo6Var, String str) {
        this.a = new xu4(wy0Var, lo6Var);
        this.d = lo6Var.getType();
        this.b = wy0Var;
        this.c = str;
        this.e = lo6Var;
    }
}
