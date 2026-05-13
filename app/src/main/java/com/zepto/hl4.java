package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public class hl4 {
    public final hf2 a;

    public static class a {
        public final Class a;
        public final Class b;
        public final Class c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, null);
        }

        public Constructor a() {
            Class cls = this.a;
            return cls != null ? c(this.b, cls) : b(this.b);
        }

        public Constructor b(Class cls) {
            return d(Constructor.class, cls, hf2.class, Integer.TYPE);
        }

        public Constructor c(Class cls, Class cls2) {
            return d(Constructor.class, cls, cls2, hf2.class, Integer.TYPE);
        }

        public final Constructor d(Class... clsArr) {
            return this.c.getConstructor(clsArr);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.b = cls2;
            this.a = cls3;
            this.c = cls;
        }
    }

    public hl4(c96 c96Var) {
        this.a = c96Var.f();
    }

    public final a a(Annotation annotation) throws ir4 {
        if (annotation instanceof e02) {
            return new a(y02.class, e02.class);
        }
        if (annotation instanceof l02) {
            return new a(n02.class, l02.class);
        }
        if (annotation instanceof g02) {
            return new a(i02.class, g02.class);
        }
        if (annotation instanceof v02) {
            return new a(x02.class, v02.class, s02.class);
        }
        if (annotation instanceof o02) {
            return new a(q02.class, o02.class, l02.class);
        }
        if (annotation instanceof z02) {
            return new a(b12.class, z02.class, e02.class);
        }
        if (annotation instanceof s02) {
            return new a(u02.class, s02.class);
        }
        if (annotation instanceof cz) {
            return new a(fz.class, cz.class);
        }
        if (annotation instanceof oe6) {
            return new a(bf6.class, oe6.class);
        }
        throw new ir4("Annotation %s not supported", annotation);
    }

    public final Constructor b(Annotation annotation) {
        Constructor constructorA = a(annotation).a();
        if (!constructorA.isAccessible()) {
            constructorA.setAccessible(true);
        }
        return constructorA;
    }

    public gl4 c(Constructor constructor, Annotation annotation, int i) {
        return d(constructor, annotation, null, i);
    }

    public gl4 d(Constructor constructor, Annotation annotation, Annotation annotation2, int i) {
        Constructor constructorB = b(annotation);
        return annotation2 != null ? (gl4) constructorB.newInstance(constructor, annotation, annotation2, this.a, Integer.valueOf(i)) : (gl4) constructorB.newInstance(constructor, annotation, this.a, Integer.valueOf(i));
    }
}
