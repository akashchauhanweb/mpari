package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class xp implements InvocationHandler {
    public final ys0 a = new ys0();
    public final Class b;
    public final boolean c;
    public final boolean d;

    public xp(Class cls, boolean z, boolean z2) {
        this.c = z2;
        this.d = z;
        this.b = cls;
    }

    public final void a(StringBuilder sb) {
        Method[] declaredMethods = this.b.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            String name = declaredMethods[i].getName();
            Object objD = d(declaredMethods[i]);
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(name);
            sb.append('=');
            sb.append(objD);
        }
        sb.append(')');
    }

    public final boolean b(Object obj, Object[] objArr) throws ir4 {
        Annotation annotation = (Annotation) obj;
        Annotation annotation2 = (Annotation) objArr[0];
        if (annotation.annotationType() == annotation2.annotationType()) {
            return this.a.a(annotation, annotation2);
        }
        throw new ir4("Annotation %s is not the same as %s", annotation, annotation2);
    }

    public final void c(StringBuilder sb) {
        String name = this.b.getName();
        sb.append('@');
        sb.append(name);
        sb.append('(');
    }

    public final Object d(Method method) {
        String name = method.getName();
        return name.equals("required") ? Boolean.valueOf(this.d) : name.equals("attribute") ? Boolean.valueOf(this.c) : method.getDefaultValue();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        return name.equals("toString") ? toString() : name.equals("equals") ? Boolean.valueOf(b(obj, objArr)) : name.equals("annotationType") ? this.b : name.equals("required") ? Boolean.valueOf(this.d) : name.equals("attribute") ? Boolean.valueOf(this.c) : method.getDefaultValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.b != null) {
            c(sb);
            a(sb);
        }
        return sb.toString();
    }
}
