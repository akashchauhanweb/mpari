package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ij2 implements xt3 {
    public final i90 a = new tv0();
    public final Annotation[] b;
    public final Annotation c;
    public final cu3 d;
    public final Method e;
    public final String f;

    public ij2(wt3 wt3Var, Annotation annotation, Annotation[] annotationArr) {
        this.e = wt3Var.a();
        this.f = wt3Var.b();
        this.d = wt3Var.c();
        this.c = annotation;
        this.b = annotationArr;
    }

    @Override // com.zepto.xt3
    public Annotation a() {
        return this.c;
    }

    @Override // com.zepto.xt3
    public Annotation b(Class cls) {
        if (this.a.isEmpty()) {
            for (Annotation annotation : this.b) {
                this.a.a(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.a.b(cls);
    }

    @Override // com.zepto.xt3
    public Class c() {
        return this.e.getDeclaringClass();
    }

    @Override // com.zepto.xt3
    public Class[] d() {
        return o75.l(this.e);
    }

    @Override // com.zepto.xt3
    public cu3 e() {
        return this.d;
    }

    @Override // com.zepto.xt3
    public Method f() {
        if (!this.e.isAccessible()) {
            this.e.setAccessible(true);
        }
        return this.e;
    }

    @Override // com.zepto.xt3
    public String getName() {
        return this.f;
    }

    @Override // com.zepto.xt3
    public Class getType() {
        return this.e.getReturnType();
    }

    @Override // com.zepto.xt3
    public Class h() {
        return o75.k(this.e);
    }

    public String toString() {
        return this.e.toGenericString();
    }
}
