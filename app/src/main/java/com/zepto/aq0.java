package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class aq0 {
    public o14 a = new o14();
    public tx0 b;
    public xh2 c;
    public xh2 d;
    public xh2 e;
    public xh2 f;
    public xh2 g;
    public xh2 h;
    public c96 i;
    public ne5 j;
    public uh4 k;

    public aq0(si1 si1Var, c96 c96Var) {
        this.b = new tx0(si1Var, c96Var);
        this.i = c96Var;
        y(si1Var);
    }

    public final void a(si1 si1Var) {
        n14 namespace = si1Var.getNamespace();
        if (namespace != null) {
            this.a.f(namespace);
        }
    }

    public final void b(Method method) {
        if (this.c == null) {
            this.c = h(method);
        }
    }

    public final void c(Method method) {
        if (this.f == null) {
            this.f = h(method);
        }
    }

    public final void d(si1 si1Var) {
        if (this.j == null) {
            this.j = si1Var.getRoot();
        }
        if (this.k == null) {
            this.k = si1Var.getOrder();
        }
    }

    public xh2 e() {
        return this.c;
    }

    public xh2 f() {
        return this.f;
    }

    public we1 g() {
        return this.a;
    }

    public final xh2 h(Method method) {
        boolean zR = r(method);
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return new xh2(method, zR);
    }

    public uh4 i() {
        return this.k;
    }

    public il4 j() {
        return this.b.a();
    }

    public xh2 k() {
        return this.e;
    }

    public xh2 l() {
        return this.g;
    }

    public xh2 m() {
        return this.h;
    }

    public ne5 n() {
        return this.j;
    }

    public q26 o() {
        return this.b.b();
    }

    public List p() {
        return this.b.c();
    }

    public xh2 q() {
        return this.d;
    }

    public final boolean r(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            return Map.class.equals(parameterTypes[0]);
        }
        return false;
    }

    public final void s(si1 si1Var) {
        Iterator it = si1Var.n().iterator();
        while (it.hasNext()) {
            t((tt3) it.next());
        }
    }

    public final void t(tt3 tt3Var) {
        Annotation[] annotationArrA = tt3Var.a();
        Method methodB = tt3Var.b();
        for (Annotation annotation : annotationArrA) {
            if (annotation instanceof hs0) {
                b(methodB);
            }
            if (annotation instanceof fm7) {
                z(methodB);
            }
            if (annotation instanceof er4) {
                v(methodB);
            }
            if (annotation instanceof kt0) {
                c(methodB);
            }
            if (annotation instanceof ga5) {
                w(methodB);
            }
            if (annotation instanceof ad5) {
                x(methodB);
            }
        }
    }

    public final void u(si1 si1Var) {
        p14 p14VarO = si1Var.o();
        n14 namespace = si1Var.getNamespace();
        if (namespace != null) {
            this.a.c(namespace);
        }
        if (p14VarO != null) {
            for (n14 n14Var : p14VarO.value()) {
                this.a.c(n14Var);
            }
        }
    }

    public final void v(Method method) {
        if (this.e == null) {
            this.e = h(method);
        }
    }

    public final void w(Method method) {
        if (this.g == null) {
            this.g = h(method);
        }
    }

    public final void x(Method method) {
        if (this.h == null) {
            this.h = h(method);
        }
    }

    public final void y(si1 si1Var) {
        mg1 mg1VarI = si1Var.i();
        Class type = si1Var.getType();
        while (type != null) {
            si1 si1VarD = this.i.d(type, mg1VarI);
            u(si1VarD);
            s(si1VarD);
            d(si1VarD);
            type = si1VarD.l();
        }
        a(si1Var);
    }

    public final void z(Method method) {
        if (this.d == null) {
            this.d = h(method);
        }
    }
}
