package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class ys0 {
    public final String[] a;

    public ys0() {
        this("name");
    }

    public boolean a(Annotation annotation, Annotation annotation2) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Class<? extends Annotation> clsAnnotationType2 = annotation2.annotationType();
        Method[] declaredMethods = clsAnnotationType.getDeclaredMethods();
        if (!clsAnnotationType.equals(clsAnnotationType2)) {
            return false;
        }
        for (Method method : declaredMethods) {
            if (!b(method) && !method.invoke(annotation, new Object[0]).equals(method.invoke(annotation2, new Object[0]))) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(Method method) {
        String name = method.getName();
        String[] strArr = this.a;
        if (strArr != null) {
            for (String str : strArr) {
                if (name.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public ys0(String... strArr) {
        this.a = strArr;
    }
}
