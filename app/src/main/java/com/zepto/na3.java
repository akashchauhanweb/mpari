package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class na3 {
    public final i90 a = new tv0();
    public final hf2 b;

    public static class a {
        public final Class a;
        public final Class b;
        public final Class c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, null);
        }

        public Constructor a() {
            Class cls = this.b;
            return cls != null ? c(this.a, cls) : b(this.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Constructor b(Class cls) {
            return this.c.getConstructor(vx0.class, cls, hf2.class);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Constructor c(Class cls, Class cls2) {
            return this.c.getConstructor(vx0.class, cls, cls2, hf2.class);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.b = cls3;
            this.a = cls2;
            this.c = cls;
        }
    }

    public na3(hf2 hf2Var) {
        this.b = hf2Var;
    }

    public final Annotation[] a(Annotation annotation) {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        return declaredMethods.length > 0 ? (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]) : new Annotation[0];
    }

    public final a b(Annotation annotation) throws ir4 {
        if (annotation instanceof e02) {
            return new a(k02.class, e02.class);
        }
        if (annotation instanceof l02) {
            return new a(m02.class, l02.class);
        }
        if (annotation instanceof g02) {
            return new a(h02.class, g02.class);
        }
        if (annotation instanceof s02) {
            return new a(t02.class, s02.class);
        }
        if (annotation instanceof z02) {
            return new a(a12.class, z02.class, e02.class);
        }
        if (annotation instanceof o02) {
            return new a(p02.class, o02.class, l02.class);
        }
        if (annotation instanceof v02) {
            return new a(w02.class, v02.class, s02.class);
        }
        if (annotation instanceof cz) {
            return new a(ez.class, cz.class);
        }
        if (annotation instanceof ip7) {
            return new a(jp7.class, ip7.class);
        }
        if (annotation instanceof oe6) {
            return new a(af6.class, oe6.class);
        }
        throw new ir4("Annotation %s not supported", annotation);
    }

    public final Constructor c(Annotation annotation) {
        Constructor constructorA = b(annotation).a();
        if (!constructorA.isAccessible()) {
            constructorA.setAccessible(true);
        }
        return constructorA;
    }

    public final oa3 d(vx0 vx0Var, Annotation annotation, Object obj) {
        oa3 oa3Var = (oa3) this.a.b(obj);
        if (oa3Var != null) {
            return oa3Var;
        }
        oa3 oa3VarH = h(vx0Var, annotation);
        if (oa3VarH != null) {
            this.a.a(obj, oa3VarH);
        }
        return oa3VarH;
    }

    public final Object e(vx0 vx0Var, Annotation annotation) {
        return new pa3(vx0Var, annotation);
    }

    public ma3 f(vx0 vx0Var, Annotation annotation) {
        oa3 oa3VarD = d(vx0Var, annotation, e(vx0Var, annotation));
        if (oa3VarD != null) {
            return oa3VarD.b();
        }
        return null;
    }

    public final ma3 g(vx0 vx0Var, Annotation annotation, Annotation annotation2) {
        Constructor constructorC = c(annotation);
        return annotation2 != null ? (ma3) constructorC.newInstance(vx0Var, annotation, annotation2, this.b) : (ma3) constructorC.newInstance(vx0Var, annotation, this.b);
    }

    public final oa3 h(vx0 vx0Var, Annotation annotation) {
        if (!(annotation instanceof z02) && !(annotation instanceof o02) && !(annotation instanceof v02)) {
            return j(vx0Var, annotation);
        }
        return k(vx0Var, annotation);
    }

    public List i(vx0 vx0Var, Annotation annotation) {
        oa3 oa3VarD = d(vx0Var, annotation, e(vx0Var, annotation));
        return oa3VarD != null ? oa3VarD.a() : Collections.emptyList();
    }

    public final oa3 j(vx0 vx0Var, Annotation annotation) {
        ma3 ma3VarG = g(vx0Var, annotation, null);
        if (ma3VarG != null) {
            ma3VarG = new n90(ma3VarG);
        }
        return new oa3(ma3VarG);
    }

    public final oa3 k(vx0 vx0Var, Annotation annotation) {
        Annotation[] annotationArrA = a(annotation);
        if (annotationArrA.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Annotation annotation2 : annotationArrA) {
            ma3 ma3VarG = g(vx0Var, annotation, annotation2);
            if (ma3VarG != null) {
                ma3VarG = new n90(ma3VarG);
            }
            linkedList.add(ma3VarG);
        }
        return new oa3(linkedList);
    }
}
