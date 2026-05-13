package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class eb2 implements vx0 {
    public final i90 a = new tv0();
    public final Annotation[] b;
    public final Annotation c;
    public final Field d;
    public final String e;
    public final int f;

    public eb2(Field field, Annotation annotation, Annotation[] annotationArr) {
        this.f = field.getModifiers();
        this.e = field.getName();
        this.c = annotation;
        this.d = field;
        this.b = annotationArr;
    }

    @Override // com.zepto.vx0
    public Annotation a() {
        return this.c;
    }

    @Override // com.zepto.lo6
    public Annotation b(Class cls) {
        return cls == this.c.annotationType() ? this.c : e(cls);
    }

    @Override // com.zepto.vx0
    public Class c() {
        return this.d.getDeclaringClass();
    }

    @Override // com.zepto.vx0
    public boolean d() {
        return !g() && f();
    }

    public final Annotation e(Class cls) {
        if (this.a.isEmpty()) {
            for (Annotation annotation : this.b) {
                this.a.a(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.a.b(cls);
    }

    public boolean f() {
        return Modifier.isFinal(this.f);
    }

    public boolean g() {
        return Modifier.isStatic(this.f);
    }

    @Override // com.zepto.vx0
    public Object get(Object obj) {
        return this.d.get(obj);
    }

    @Override // com.zepto.vx0
    public String getName() {
        return this.e;
    }

    @Override // com.zepto.lo6
    public Class getType() {
        return this.d.getType();
    }

    @Override // com.zepto.vx0
    public void set(Object obj, Object obj2) throws IllegalAccessException {
        if (f()) {
            return;
        }
        this.d.set(obj, obj2);
    }

    public String toString() {
        return String.format("field '%s' %s", getName(), this.d.toString());
    }
}
