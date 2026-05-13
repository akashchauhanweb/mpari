package com.zepto;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i03 {
    public h03 b;
    public no5 g;
    public si1 h;
    public List a = new ArrayList();
    public ys0 f = new ys0();
    public qa3 c = new qa3();
    public qa3 d = new qa3();
    public qa3 e = new qa3();

    public i03(no5 no5Var, si1 si1Var) {
        this.g = no5Var;
        this.h = si1Var;
    }

    public h03 a() throws sx0 {
        if (this.b == null) {
            g(this.h);
            b(this.h);
            m(this.h);
        }
        return this.b;
    }

    public final h03 b(si1 si1Var) {
        if (this.b == null) {
            this.b = e(si1Var);
        }
        return this.b;
    }

    public final boolean c(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 == str || str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final i31 d(q26 q26Var) {
        t26 t26Var = new t26(q26Var);
        if (q26Var != null) {
            this.a.add(t26Var);
        }
        return t26Var;
    }

    public final h03 e(si1 si1Var) {
        q26 q26VarF = this.g.f();
        return new zp0(this.a, q26VarF != null ? new t26(q26VarF) : null, this.g.getParameters(), si1Var);
    }

    public final gl4 f(gl4 gl4Var) {
        ma3 ma3VarK = k(gl4Var);
        if (ma3VarK != null) {
            return new o90(gl4Var, ma3VarK);
        }
        return null;
    }

    public final void g(si1 si1Var) {
        Iterator it = this.g.m().iterator();
        while (it.hasNext()) {
            h((q26) it.next());
        }
    }

    public final void h(q26 q26Var) {
        q26 q26Var2 = new q26(q26Var);
        Iterator it = q26Var.iterator();
        while (it.hasNext()) {
            gl4 gl4VarF = f((gl4) it.next());
            if (gl4VarF != null) {
                q26Var2.j(gl4VarF);
            }
        }
        d(q26Var2);
    }

    public void i(ma3 ma3Var) {
        if (ma3Var.f()) {
            j(ma3Var, this.c);
        } else if (ma3Var.g()) {
            j(ma3Var, this.e);
        } else {
            j(ma3Var, this.d);
        }
    }

    public final void j(ma3 ma3Var, qa3 qa3Var) {
        String name = ma3Var.getName();
        String strB = ma3Var.b();
        if (!qa3Var.containsKey(name)) {
            qa3Var.put(name, ma3Var);
        } else if (!((ma3) qa3Var.get(name)).b().equals(name)) {
            qa3Var.remove(name);
        }
        qa3Var.put(strB, ma3Var);
    }

    public final ma3 k(gl4 gl4Var) {
        return gl4Var.f() ? l(gl4Var, this.c) : gl4Var.g() ? l(gl4Var, this.e) : l(gl4Var, this.d);
    }

    public final ma3 l(gl4 gl4Var, qa3 qa3Var) {
        String name = gl4Var.getName();
        ma3 ma3Var = (ma3) qa3Var.get(gl4Var.b());
        return ma3Var == null ? (ma3) qa3Var.get(name) : ma3Var;
    }

    public final void m(si1 si1Var) throws sx0 {
        for (gl4 gl4Var : this.g.getParameters().r()) {
            ma3 ma3VarK = k(gl4Var);
            String strB = gl4Var.b();
            if (ma3VarK == null) {
                throw new sx0("Parameter '%s' does not have a match in %s", strB, si1Var);
            }
            t(ma3VarK, gl4Var);
        }
        p();
    }

    public final void n(ma3 ma3Var, gl4 gl4Var) throws sx0 {
        Annotation annotationA = ma3Var.a();
        Annotation annotationA2 = gl4Var.a();
        String name = gl4Var.getName();
        if (this.f.a(annotationA, annotationA2)) {
            return;
        }
        Class<? extends Annotation> clsAnnotationType = annotationA.annotationType();
        Class<? extends Annotation> clsAnnotationType2 = annotationA2.annotationType();
        if (!clsAnnotationType.equals(clsAnnotationType2)) {
            throw new sx0("Annotation %s does not match %s for '%s' in %s", clsAnnotationType2, clsAnnotationType, name, gl4Var);
        }
    }

    public final void o(ma3 ma3Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q26 q26VarF = ((i31) it.next()).f();
            vx0 vx0VarO = ma3Var.o();
            Object key = ma3Var.getKey();
            if (vx0VarO.d() && q26VarF.r(key) == null) {
                it.remove();
            }
        }
    }

    public final void p() throws sx0 {
        List listB = this.b.b();
        if (this.b.c()) {
            q(this.d);
            q(this.c);
        }
        if (listB.isEmpty()) {
            return;
        }
        r(this.d, listB);
        r(this.c, listB);
    }

    public final void q(qa3 qa3Var) throws sx0 {
        Iterator it = qa3Var.iterator();
        while (it.hasNext()) {
            ma3 ma3Var = (ma3) it.next();
            if (ma3Var != null && ma3Var.o().d()) {
                throw new sx0("Default constructor can not accept read only %s in %s", ma3Var, this.h);
            }
        }
    }

    public final void r(qa3 qa3Var, List list) throws sx0 {
        Iterator it = qa3Var.iterator();
        while (it.hasNext()) {
            ma3 ma3Var = (ma3) it.next();
            if (ma3Var != null) {
                o(ma3Var, list);
            }
        }
        if (list.isEmpty()) {
            throw new sx0("No constructor accepts all read only values in %s", this.h);
        }
    }

    public final void s(ma3 ma3Var, gl4 gl4Var) throws sx0 {
        String name;
        String[] strArrL = ma3Var.l();
        String name2 = gl4Var.getName();
        if (c(strArrL, name2) || name2 == (name = ma3Var.getName())) {
            return;
        }
        if (name2 == null || name == null) {
            throw new sx0("Annotation does not match %s for '%s' in %s", ma3Var, name2, gl4Var);
        }
        if (!name2.equals(name)) {
            throw new sx0("Annotation does not match %s for '%s' in %s", ma3Var, name2, gl4Var);
        }
    }

    public final void t(ma3 ma3Var, gl4 gl4Var) throws sx0 {
        vx0 vx0VarO = ma3Var.o();
        String name = gl4Var.getName();
        if (!c96.o(gl4Var.getType(), vx0VarO.getType())) {
            throw new sx0("Type is not compatible with %s for '%s' in %s", ma3Var, name, gl4Var);
        }
        s(ma3Var, gl4Var);
        n(ma3Var, gl4Var);
    }
}
