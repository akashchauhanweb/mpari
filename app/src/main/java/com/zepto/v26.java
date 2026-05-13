package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v26 {
    public final s26 a;
    public final hl4 b;
    public final il4 c;
    public final Constructor d;
    public final Class e;

    public v26(Constructor constructor, il4 il4Var, c96 c96Var) {
        this.a = new s26(constructor);
        this.b = new hl4(c96Var);
        Class declaringClass = constructor.getDeclaringClass();
        this.e = declaringClass;
        this.d = constructor;
        this.c = il4Var;
        g(declaringClass);
    }

    public final List a(Annotation annotation, int i) throws sx0 {
        gl4 gl4VarC = this.b.c(this.d, annotation, i);
        if (gl4VarC != null) {
            f(gl4VarC);
        }
        return Collections.singletonList(gl4VarC);
    }

    public final Annotation[] b(Annotation annotation) throws sp6 {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length == 1) {
            return (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]);
        }
        throw new sp6("Annotation '%s' is not a valid union for %s", annotation, this.e);
    }

    public List c() {
        return this.a.a();
    }

    public boolean d() {
        return this.a.h();
    }

    public final List e(Annotation annotation, int i) {
        if (!(annotation instanceof cz) && !(annotation instanceof e02) && !(annotation instanceof l02) && !(annotation instanceof g02) && !(annotation instanceof s02)) {
            if (!(annotation instanceof o02) && !(annotation instanceof v02) && !(annotation instanceof z02)) {
                return annotation instanceof oe6 ? a(annotation, i) : Collections.emptyList();
            }
            return i(annotation, i);
        }
        return a(annotation, i);
    }

    public final void f(gl4 gl4Var) throws sx0 {
        String strB = gl4Var.b();
        Object key = gl4Var.getKey();
        if (this.c.containsKey(key)) {
            j(gl4Var, key);
        }
        if (this.c.containsKey(strB)) {
            j(gl4Var, strB);
        }
        this.c.put(strB, gl4Var);
        this.c.put(key, gl4Var);
    }

    public final void g(Class cls) {
        Class<?>[] parameterTypes = this.d.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            h(parameterTypes[i], i);
        }
    }

    public final void h(Class cls, int i) {
        Annotation[][] parameterAnnotations = this.d.getParameterAnnotations();
        int i2 = 0;
        while (true) {
            Annotation[] annotationArr = parameterAnnotations[i];
            if (i2 >= annotationArr.length) {
                return;
            }
            Iterator it = e(annotationArr[i2], i).iterator();
            while (it.hasNext()) {
                this.a.g((gl4) it.next(), i);
            }
            i2++;
        }
    }

    public final List i(Annotation annotation, int i) throws sx0, sp6 {
        q26 q26Var = new q26(this.d);
        for (Annotation annotation2 : b(annotation)) {
            gl4 gl4VarD = this.b.d(this.d, annotation, annotation2, i);
            String strB = gl4VarD.b();
            if (q26Var.contains(strB)) {
                throw new sp6("Annotation name '%s' used more than once in %s for %s", strB, annotation, this.e);
            }
            q26Var.z(strB, gl4VarD);
            f(gl4VarD);
        }
        return q26Var.u();
    }

    public final void j(gl4 gl4Var, Object obj) throws sx0 {
        gl4 gl4Var2 = (gl4) this.c.get(obj);
        if (gl4Var.g() != gl4Var2.g()) {
            Annotation annotationA = gl4Var.a();
            Annotation annotationA2 = gl4Var2.a();
            String strB = gl4Var.b();
            if (!annotationA.equals(annotationA2)) {
                throw new sx0("Annotations do not match for '%s' in %s", strB, this.e);
            }
            if (gl4Var2.getType() != gl4Var.getType()) {
                throw new sx0("Parameter types do not match for '%s' in %s", strB, this.e);
            }
        }
    }
}
