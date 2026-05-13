package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ui1 implements si1 {
    public p14 c;
    public n14 d;
    public Annotation[] e;
    public mg1 f;
    public mg1 g;
    public uh4 h;
    public ne5 i;
    public Class j;
    public String k;
    public boolean l;
    public List a = new LinkedList();
    public List b = new LinkedList();
    public boolean m = true;

    public ui1(Class cls, mg1 mg1Var) {
        this.e = cls.getDeclaredAnnotations();
        this.f = mg1Var;
        this.j = cls;
        s(cls);
    }

    @Override // com.zepto.si1
    public boolean a() {
        return this.m;
    }

    public final void b(Annotation annotation) {
        if (annotation != null) {
            af1 af1Var = (af1) annotation;
            this.l = af1Var.required();
            this.g = af1Var.value();
        }
    }

    @Override // com.zepto.si1
    public boolean c() {
        return this.j.isPrimitive();
    }

    public final void d(Class cls) {
        for (Annotation annotation : this.e) {
            if (annotation instanceof n14) {
                p(annotation);
            }
            if (annotation instanceof p14) {
                t(annotation);
            }
            if (annotation instanceof ne5) {
                r(annotation);
            }
            if (annotation instanceof uh4) {
                q(annotation);
            }
            if (annotation instanceof af1) {
                b(annotation);
            }
        }
    }

    @Override // com.zepto.si1
    public boolean e() {
        return this.l;
    }

    public final void f(Class cls) {
        for (Field field : cls.getDeclaredFields()) {
            this.b.add(new gb2(field));
        }
    }

    public final boolean g(String str) {
        return str.length() == 0;
    }

    @Override // com.zepto.si1
    public Constructor[] getConstructors() {
        return this.j.getDeclaredConstructors();
    }

    @Override // com.zepto.si1
    public String getName() {
        return this.k;
    }

    @Override // com.zepto.si1
    public n14 getNamespace() {
        return this.d;
    }

    @Override // com.zepto.si1
    public uh4 getOrder() {
        return this.h;
    }

    @Override // com.zepto.si1
    public ne5 getRoot() {
        return this.i;
    }

    @Override // com.zepto.si1
    public Class getType() {
        return this.j;
    }

    public final void h(Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            this.a.add(new tt3(method));
        }
    }

    @Override // com.zepto.si1
    public mg1 i() {
        return this.f;
    }

    @Override // com.zepto.si1
    public List j() {
        return this.b;
    }

    @Override // com.zepto.si1
    public mg1 k() {
        mg1 mg1Var = this.f;
        return mg1Var != null ? mg1Var : this.g;
    }

    @Override // com.zepto.si1
    public Class l() {
        Class superclass = this.j.getSuperclass();
        if (superclass == Object.class) {
            return null;
        }
        return superclass;
    }

    @Override // com.zepto.si1
    public boolean m() {
        if (Modifier.isStatic(this.j.getModifiers())) {
            return true;
        }
        return !this.j.isMemberClass();
    }

    @Override // com.zepto.si1
    public List n() {
        return this.a;
    }

    @Override // com.zepto.si1
    public p14 o() {
        return this.c;
    }

    public final void p(Annotation annotation) {
        if (annotation != null) {
            this.d = (n14) annotation;
        }
    }

    public final void q(Annotation annotation) {
        if (annotation != null) {
            this.h = (uh4) annotation;
        }
    }

    public final void r(Annotation annotation) {
        if (annotation != null) {
            ne5 ne5Var = (ne5) annotation;
            String simpleName = this.j.getSimpleName();
            String strName = ne5Var.name();
            if (g(strName)) {
                strName = o75.g(simpleName);
            }
            this.m = ne5Var.strict();
            this.i = ne5Var;
            this.k = strName;
        }
    }

    public final void s(Class cls) {
        h(cls);
        f(cls);
        d(cls);
    }

    public final void t(Annotation annotation) {
        if (annotation != null) {
            this.c = (p14) annotation;
        }
    }

    public String toString() {
        return this.j.toString();
    }
}
