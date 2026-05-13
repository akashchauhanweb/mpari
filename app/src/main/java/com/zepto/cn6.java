package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class cn6 {
    public final i90 a = new tv0();
    public final i90 b = new tv0();
    public final eq3 c;

    public cn6(eq3 eq3Var) {
        this.c = new sf1(eq3Var);
    }

    public final xm6 a(Class cls) {
        if (this.b.contains(cls)) {
            return null;
        }
        xm6 xm6Var = (xm6) this.a.b(cls);
        return xm6Var != null ? xm6Var : b(cls);
    }

    public final xm6 b(Class cls) {
        xm6 xm6VarA = this.c.a(cls);
        if (xm6VarA != null) {
            this.a.a(cls, xm6VarA);
        } else {
            this.b.a(cls, this);
        }
        return xm6VarA;
    }

    public Object c(String str, Class cls) throws ym6 {
        xm6 xm6VarA = a(cls);
        if (xm6VarA != null) {
            return xm6VarA.b(str);
        }
        throw new ym6("Transform of %s not supported", cls);
    }

    public boolean d(Class cls) {
        return a(cls) != null;
    }

    public String e(Object obj, Class cls) throws ym6 {
        xm6 xm6VarA = a(cls);
        if (xm6VarA != null) {
            return xm6VarA.a(obj);
        }
        throw new ym6("Transform of %s not supported", cls);
    }
}
