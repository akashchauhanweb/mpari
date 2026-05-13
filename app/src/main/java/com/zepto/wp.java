package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class wp {
    public final hf2 a;
    public final boolean b;

    public wp(si1 si1Var, c96 c96Var) {
        this.b = si1Var.e();
        this.a = c96Var.f();
    }

    public final ClassLoader a() {
        return wp.class.getClassLoader();
    }

    public final Annotation b(Class cls) {
        ClassLoader classLoaderA = a();
        return cls.isArray() ? g(cls.getComponentType()) ? d(classLoaderA, e02.class) : d(classLoaderA, g02.class) : (g(cls) && f()) ? d(classLoaderA, cz.class) : d(classLoaderA, e02.class);
    }

    public Annotation c(Class cls, Class[] clsArr) {
        ClassLoader classLoaderA = a();
        return Map.class.isAssignableFrom(cls) ? (h(clsArr) && f()) ? e(classLoaderA, s02.class, true) : d(classLoaderA, s02.class) : Collection.class.isAssignableFrom(cls) ? d(classLoaderA, l02.class) : b(cls);
    }

    public final Annotation d(ClassLoader classLoader, Class cls) {
        return e(classLoader, cls, false);
    }

    public final Annotation e(ClassLoader classLoader, Class cls, boolean z) {
        return (Annotation) Proxy.newProxyInstance(classLoader, new Class[]{cls}, new xp(cls, this.b, z));
    }

    public final boolean f() {
        nn7 nn7VarD = this.a.d();
        return nn7VarD != null && nn7VarD == nn7.LOW;
    }

    public final boolean g(Class cls) {
        if (Number.class.isAssignableFrom(cls) || cls == Boolean.class || cls == Character.class) {
            return true;
        }
        return cls.isPrimitive();
    }

    public final boolean h(Class[] clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return false;
        }
        Class superclass = clsArr[0].getSuperclass();
        Class cls = clsArr[0];
        if (superclass == null || !(superclass.isEnum() || cls.isEnum())) {
            return g(cls);
        }
        return true;
    }
}
