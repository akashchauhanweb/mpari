package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class bo6 {
    public final wy0 a;
    public final n86 b;

    public bo6(wy0 wy0Var) {
        this.b = wy0Var.l();
        this.a = wy0Var;
    }

    public final wu0 a(Class cls) throws qe5 {
        lo6 lo6VarD = d(cls);
        if (cls != null) {
            return new wu0(this.a, lo6VarD);
        }
        throw new qe5("Can not instantiate null class", new Object[0]);
    }

    public final we1 b(Class cls) {
        return this.a.c(cls);
    }

    public String c(Class cls) {
        return this.b.e(this.a.i(cls));
    }

    public final lo6 d(Class cls) {
        return new dq0(cls);
    }

    public Object e(cz2 cz2Var, Class cls) throws g03 {
        Object objC = a(cls).c(cz2Var);
        if (objC != null) {
            return f(cz2Var, objC.getClass(), objC);
        }
        return null;
    }

    public final Object f(cz2 cz2Var, Class cls, Object obj) throws qe5 {
        if (c(cls) != null) {
            return obj;
        }
        throw new qe5("Root annotation required for %s", cls);
    }

    public void g(oj4 oj4Var, Object obj) throws qe5 {
        h(oj4Var, obj, obj.getClass());
    }

    public void h(oj4 oj4Var, Object obj, Class cls) throws qe5 {
        Class<?> cls2 = obj.getClass();
        String strC = c(cls2);
        if (strC == null) {
            throw new qe5("Root annotation required for %s", cls2);
        }
        i(oj4Var, obj, cls, strC);
    }

    public void i(oj4 oj4Var, Object obj, Class cls, String str) {
        oj4 oj4VarK = oj4Var.k(str);
        lo6 lo6VarD = d(cls);
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            we1 we1VarB = b(cls2);
            if (we1VarB != null) {
                we1VarB.a(oj4VarK);
            }
            if (!this.a.m(lo6VarD, obj, oj4VarK)) {
                a(cls2).b(oj4VarK, obj);
            }
        }
        oj4VarK.commit();
    }
}
