package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class yt3 {
    public final wp a;

    public yt3(si1 si1Var, c96 c96Var) {
        this.a = new wp(si1Var, c96Var);
    }

    public final Annotation a(Method method) {
        Class[] clsArrB = b(method);
        Class clsJ = j(method);
        if (clsJ != null) {
            return this.a.c(clsJ, clsArrB);
        }
        return null;
    }

    public final Class[] b(Method method) {
        cu3 cu3VarE = e(method);
        if (cu3VarE == cu3.SET) {
            return o75.i(method, 0);
        }
        if (cu3VarE == cu3.GET || cu3VarE == cu3.IS) {
            return o75.l(method);
        }
        return null;
    }

    public xt3 c(Method method, Annotation annotation, Annotation[] annotationArr) throws ut3 {
        wt3 wt3VarF = f(method, annotation);
        return wt3VarF.c() == cu3.SET ? new lz5(wt3VarF, annotation, annotationArr) : new ij2(wt3VarF, annotation, annotationArr);
    }

    public xt3 d(Method method, Annotation[] annotationArr) {
        Annotation annotationA = a(method);
        if (annotationA != null) {
            return c(method, annotationA, annotationArr);
        }
        return null;
    }

    public final cu3 e(Method method) {
        String name = method.getName();
        return name.startsWith("get") ? cu3.GET : name.startsWith("is") ? cu3.IS : name.startsWith("set") ? cu3.SET : cu3.NONE;
    }

    public final wt3 f(Method method, Annotation annotation) throws ut3 {
        cu3 cu3VarE = e(method);
        if (cu3VarE != cu3.GET && cu3VarE != cu3.IS) {
            if (cu3VarE == cu3.SET) {
                return l(method, cu3VarE);
            }
            throw new ut3("Annotation %s must mark a set or get method", annotation);
        }
        return h(method, cu3VarE);
    }

    public final Class g(Method method) {
        if (method.getParameterTypes().length == 1) {
            return method.getParameterTypes()[0];
        }
        return null;
    }

    public final wt3 h(Method method, cu3 cu3Var) throws ut3 {
        Class<?>[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length != 0) {
            throw new ut3("Get method %s is not a valid property", method);
        }
        String strK = k(name, cu3Var);
        if (strK != null) {
            return new wt3(method, cu3Var, strK);
        }
        throw new ut3("Could not get name for %s", method);
    }

    public final Class i(Method method) {
        if (method.getParameterTypes().length == 0) {
            return method.getReturnType();
        }
        return null;
    }

    public Class j(Method method) {
        cu3 cu3VarE = e(method);
        if (cu3VarE == cu3.SET) {
            return g(method);
        }
        if (cu3VarE == cu3.GET || cu3VarE == cu3.IS) {
            return i(method);
        }
        return null;
    }

    public final String k(String str, cu3 cu3Var) {
        int iA = cu3Var.a();
        int length = str.length();
        if (length > iA) {
            str = str.substring(iA, length);
        }
        return o75.g(str);
    }

    public final wt3 l(Method method, cu3 cu3Var) throws ut3 {
        Class<?>[] parameterTypes = method.getParameterTypes();
        String name = method.getName();
        if (parameterTypes.length != 1) {
            throw new ut3("Set method %s is not a valid property", method);
        }
        String strK = k(name, cu3Var);
        if (strK != null) {
            return new wt3(method, cu3Var, strK);
        }
        throw new ut3("Could not get name for %s", method);
    }
}
