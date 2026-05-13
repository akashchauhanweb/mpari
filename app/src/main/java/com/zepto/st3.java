package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class st3 implements vx0 {
    public Annotation a;
    public xt3 b;
    public xt3 c;
    public Class[] d;
    public Class e;
    public Class f;
    public Class g;
    public String h;

    public st3(xt3 xt3Var) {
        this(xt3Var, null);
    }

    @Override // com.zepto.vx0
    public Annotation a() {
        return this.a;
    }

    @Override // com.zepto.lo6
    public Annotation b(Class cls) {
        xt3 xt3Var;
        Annotation annotationB = this.c.b(cls);
        return cls == this.a.annotationType() ? this.a : (annotationB != null || (xt3Var = this.b) == null) ? annotationB : xt3Var.b(cls);
    }

    @Override // com.zepto.vx0
    public Class c() {
        return this.e;
    }

    @Override // com.zepto.vx0
    public boolean d() {
        return this.b == null;
    }

    public xt3 e() {
        return this.c;
    }

    public xt3 f() {
        return this.b;
    }

    @Override // com.zepto.vx0
    public Object get(Object obj) {
        return this.c.f().invoke(obj, new Object[0]);
    }

    @Override // com.zepto.vx0
    public String getName() {
        return this.h;
    }

    @Override // com.zepto.lo6
    public Class getType() {
        return this.g;
    }

    @Override // com.zepto.vx0
    public void set(Object obj, Object obj2) throws IllegalAccessException, ut3, InvocationTargetException {
        Class<?> declaringClass = this.c.f().getDeclaringClass();
        xt3 xt3Var = this.b;
        if (xt3Var == null) {
            throw new ut3("Property '%s' is read only in %s", this.h, declaringClass);
        }
        xt3Var.f().invoke(obj, obj2);
    }

    public String toString() {
        return String.format("method '%s'", this.h);
    }

    public st3(xt3 xt3Var, xt3 xt3Var2) {
        this.e = xt3Var.c();
        this.a = xt3Var.a();
        this.d = xt3Var.d();
        this.f = xt3Var.h();
        this.g = xt3Var.getType();
        this.h = xt3Var.getName();
        this.b = xt3Var2;
        this.c = xt3Var;
    }
}
