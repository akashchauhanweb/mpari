package com.zepto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zt3 extends wx0 {
    public final yt3 c;
    public final c96 e;
    public final b f;
    public final b g;
    public final si1 h;

    public static class b extends LinkedHashMap implements Iterable {
        public b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return keySet().iterator();
        }

        public xt3 r(String str) {
            return (xt3) remove(str);
        }
    }

    public zt3(si1 si1Var, c96 c96Var) throws ut3 {
        this.c = new yt3(si1Var, c96Var);
        this.f = new b();
        this.g = new b();
        this.e = c96Var;
        this.h = si1Var;
        o0(si1Var);
    }

    private void T(Class cls, mg1 mg1Var) {
        Iterator<E> it = this.e.j(cls, mg1Var).iterator();
        while (it.hasNext()) {
            i0((st3) ((vx0) it.next()));
        }
    }

    private void a0(si1 si1Var) throws ut3 {
        for (tt3 tt3Var : si1Var.n()) {
            Annotation[] annotationArrA = tt3Var.a();
            Method methodB = tt3Var.b();
            for (Annotation annotation : annotationArrA) {
                p0(methodB, annotation, annotationArrA);
            }
        }
    }

    private void f0(si1 si1Var, mg1 mg1Var) {
        List<tt3> listN = si1Var.n();
        if (mg1Var == mg1.PROPERTY) {
            for (tt3 tt3Var : listN) {
                Annotation[] annotationArrA = tt3Var.a();
                Method methodB = tt3Var.b();
                if (this.c.j(methodB) != null) {
                    l0(methodB, annotationArrA);
                }
            }
        }
    }

    private void o0(si1 si1Var) throws ut3 {
        mg1 mg1VarI = si1Var.i();
        mg1 mg1VarK = si1Var.k();
        Class clsL = si1Var.l();
        if (clsL != null) {
            T(clsL, mg1VarI);
        }
        f0(si1Var, mg1VarK);
        a0(si1Var);
        r();
        q0();
    }

    private void r() throws ut3 {
        for (String str : this.g) {
            xt3 xt3Var = (xt3) this.g.get(str);
            if (xt3Var != null) {
                O(xt3Var, str);
            }
        }
    }

    public final void O(xt3 xt3Var, String str) throws ut3 {
        xt3 xt3VarR = this.f.r(str);
        if (xt3VarR != null) {
            z(xt3Var, xt3VarR);
        } else {
            u(xt3Var);
        }
    }

    public final void g0(xt3 xt3Var, b bVar) {
        String name = xt3Var.getName();
        xt3 xt3Var2 = (xt3) bVar.remove(name);
        if (xt3Var2 != null && h0(xt3Var)) {
            xt3Var = xt3Var2;
        }
        bVar.put(name, xt3Var);
    }

    public final boolean h0(xt3 xt3Var) {
        return xt3Var.a() instanceof oe6;
    }

    public final void i0(st3 st3Var) {
        xt3 xt3VarE = st3Var.e();
        xt3 xt3VarF = st3Var.f();
        if (xt3VarF != null) {
            g0(xt3VarF, this.f);
        }
        g0(xt3VarE, this.g);
    }

    public final void j0(xt3 xt3Var, b bVar) {
        String name = xt3Var.getName();
        if (name != null) {
            bVar.put(name, xt3Var);
        }
    }

    public final void k0(Method method, Annotation annotation, Annotation[] annotationArr) throws ut3 {
        xt3 xt3VarC = this.c.c(method, annotation, annotationArr);
        cu3 cu3VarE = xt3VarC.e();
        if (cu3VarE == cu3.GET) {
            j0(xt3VarC, this.g);
        }
        if (cu3VarE == cu3.IS) {
            j0(xt3VarC, this.g);
        }
        if (cu3VarE == cu3.SET) {
            j0(xt3VarC, this.f);
        }
    }

    public final void l0(Method method, Annotation[] annotationArr) {
        xt3 xt3VarD = this.c.d(method, annotationArr);
        cu3 cu3VarE = xt3VarD.e();
        if (cu3VarE == cu3.GET) {
            j0(xt3VarD, this.g);
        }
        if (cu3VarE == cu3.IS) {
            j0(xt3VarD, this.g);
        }
        if (cu3VarE == cu3.SET) {
            j0(xt3VarD, this.f);
        }
    }

    public final void m0(xt3 xt3Var, b bVar) {
        String name = xt3Var.getName();
        if (name != null) {
            bVar.remove(name);
        }
    }

    public final void n0(Method method, Annotation annotation, Annotation[] annotationArr) throws ut3 {
        xt3 xt3VarC = this.c.c(method, annotation, annotationArr);
        cu3 cu3VarE = xt3VarC.e();
        if (cu3VarE == cu3.GET) {
            m0(xt3VarC, this.g);
        }
        if (cu3VarE == cu3.IS) {
            m0(xt3VarC, this.g);
        }
        if (cu3VarE == cu3.SET) {
            m0(xt3VarC, this.f);
        }
    }

    public final void p0(Method method, Annotation annotation, Annotation[] annotationArr) throws ut3 {
        if (annotation instanceof cz) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof z02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof o02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof v02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof l02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof g02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof s02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof e02) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof ip7) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof oe6) {
            k0(method, annotation, annotationArr);
        }
        if (annotation instanceof en6) {
            n0(method, annotation, annotationArr);
        }
    }

    public final void q0() throws ut3 {
        for (String str : this.f) {
            xt3 xt3Var = (xt3) this.f.get(str);
            if (xt3Var != null) {
                r0(xt3Var, str);
            }
        }
    }

    public final void r0(xt3 xt3Var, String str) throws ut3 {
        xt3 xt3VarR = this.g.r(str);
        Method methodF = xt3Var.f();
        if (xt3VarR == null) {
            throw new ut3("No matching get method for %s in %s", methodF, this.h);
        }
    }

    public final void u(xt3 xt3Var) {
        add(new st3(xt3Var));
    }

    public final void z(xt3 xt3Var, xt3 xt3Var2) throws ut3 {
        Annotation annotationA = xt3Var.a();
        String name = xt3Var.getName();
        if (!xt3Var2.a().equals(annotationA)) {
            throw new ut3("Annotations do not match for '%s' in %s", name, this.h);
        }
        Class type = xt3Var.getType();
        if (type != xt3Var2.getType()) {
            throw new ut3("Method types do not match for %s in %s", name, type);
        }
        add(new st3(xt3Var, xt3Var2));
    }
}
