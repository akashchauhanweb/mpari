package com.zepto;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class c96 implements bc2 {
    public final na3 e;
    public final cn6 f;
    public final eq3 g;
    public final bc2 h;
    public final hf2 i;
    public final ti1 c = new ti1(this, mg1.FIELD);
    public final oo5 b = new oo5(this);
    public final ti1 d = new ti1(this);
    public final c03 a = new c03();

    public c96(bc2 bc2Var, eq3 eq3Var, hf2 hf2Var) {
        this.f = new cn6(eq3Var);
        this.e = new na3(hf2Var);
        this.g = eq3Var;
        this.h = bc2Var;
        this.i = hf2Var;
    }

    public static Class l(Class cls) {
        return cls == Double.TYPE ? Double.class : cls == Float.TYPE ? Float.class : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Character.TYPE ? Character.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            cls = l(cls);
        }
        boolean zIsPrimitive = cls2.isPrimitive();
        Class clsL = cls2;
        if (zIsPrimitive) {
            clsL = l(cls2);
        }
        return clsL.isAssignableFrom(cls);
    }

    @Override // com.zepto.bc2
    public String a(String str) {
        return this.h.a(str);
    }

    public final String b(Class cls) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        String simpleName = cls.getSimpleName();
        return cls.isPrimitive() ? simpleName : o75.g(simpleName);
    }

    public si1 c(Class cls) {
        return d(cls, null);
    }

    public si1 d(Class cls, mg1 mg1Var) {
        return mg1Var != null ? this.c.a(cls) : this.d.a(cls);
    }

    public wx0 e(Class cls, mg1 mg1Var) {
        return mg1Var != null ? this.c.b(cls) : this.d.b(cls);
    }

    public hf2 f() {
        return this.i;
    }

    public b03 g(Class cls) {
        return this.a.a(cls);
    }

    public ma3 h(vx0 vx0Var, Annotation annotation) {
        return this.e.f(vx0Var, annotation);
    }

    public List i(vx0 vx0Var, Annotation annotation) {
        return this.e.i(vx0Var, annotation);
    }

    public wx0 j(Class cls, mg1 mg1Var) {
        return mg1Var != null ? this.c.d(cls) : this.d.d(cls);
    }

    public String k(Class cls) {
        String name = m(cls).getName();
        return name != null ? name : b(cls);
    }

    public no5 m(Class cls) {
        return this.b.a(cls);
    }

    public n86 n() {
        return this.i.c();
    }

    public boolean p(Class cls) {
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return true;
        }
        return cls.isArray();
    }

    public boolean q(Class cls) {
        if (cls == String.class || cls == Float.class || cls == Double.class || cls == Long.class || cls == Integer.class || cls == Boolean.class || cls.isEnum() || cls.isPrimitive()) {
            return true;
        }
        return this.f.d(cls);
    }

    public Object r(String str, Class cls) {
        return this.f.c(str, cls);
    }

    public String s(Object obj, Class cls) {
        return this.f.e(obj, cls);
    }
}
