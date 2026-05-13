package com.zepto;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p72 {
    public wy0 a;
    public c96 b;
    public Class c;
    public lo6 d;

    public p72(wy0 wy0Var, lo6 lo6Var) {
        this(wy0Var, lo6Var, null);
    }

    public static boolean e(Class cls, Class cls2) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isAssignableFrom(cls2);
    }

    public static boolean f(Class cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return false;
        }
        return !Modifier.isInterface(r1);
    }

    public im7 a(cz2 cz2Var) {
        im7 im7VarJ = this.a.j(this.d, cz2Var);
        if (im7VarJ != null && this.c != null) {
            if (!e(this.c, im7VarJ.getType())) {
                return new xj4(im7VarJ, this.c);
            }
        }
        return im7VarJ;
    }

    public im7 b(cz2 cz2Var) throws g03 {
        im7 im7VarA = a(cz2Var);
        if (im7VarA != null) {
            gt4 position = cz2Var.getPosition();
            Class type = im7VarA.getType();
            if (!e(d(), type)) {
                throw new g03("Incompatible %s for %s at %s", type, this.d, position);
            }
        }
        return im7VarA;
    }

    public final lo6 c(lo6 lo6Var, Class cls) {
        Class clsL = c96.l(cls);
        return clsL != cls ? new wj4(lo6Var, clsL) : lo6Var;
    }

    public Class d() {
        Class cls = this.c;
        return cls != null ? cls : this.d.getType();
    }

    public boolean g(lo6 lo6Var, Object obj, oj4 oj4Var) {
        Class type = lo6Var.getType();
        if (type.isPrimitive()) {
            lo6Var = c(lo6Var, type);
        }
        return this.a.m(lo6Var, obj, oj4Var);
    }

    public p72(wy0 wy0Var, lo6 lo6Var, Class cls) {
        this.b = wy0Var.f();
        this.c = cls;
        this.a = wy0Var;
        this.d = lo6Var;
    }
}
