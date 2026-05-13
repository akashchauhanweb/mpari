package com.zepto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public class m86 {
    public i03 a;
    public z62 b;
    public ow3 c;
    public h03 d;
    public qa3 e;
    public qa3 f;
    public qa3 g;
    public no5 h;
    public c96 i;
    public ma3 j;
    public ma3 k;
    public nw3 l;
    public boolean m;

    public m86(no5 no5Var, si1 si1Var, c96 c96Var) {
        z62 z62Var = new z62(si1Var, c96Var);
        this.b = z62Var;
        this.c = new ow3(z62Var, si1Var, c96Var);
        this.a = new i03(no5Var, si1Var);
        this.l = new co6(no5Var, si1Var);
        this.e = new qa3(no5Var);
        this.f = new qa3(no5Var);
        this.g = new qa3(no5Var);
        this.h = no5Var;
        this.i = c96Var;
    }

    public void a(Class cls) {
        uh4 order = this.h.getOrder();
        if (order != null) {
            this.c.a(this.l, order);
        }
    }

    public l86 b(Class cls) {
        return new l86(this.d, this.l, this.j, this.k, this.m);
    }

    public void c(Class cls) {
        if (this.d == null) {
            this.d = this.a.a();
        }
    }

    public final nw3 d(y62 y62Var) {
        nw3 nw3VarI = this.l;
        while (nw3VarI != null) {
            String prefix = y62Var.getPrefix();
            String first = y62Var.getFirst();
            int index = y62Var.getIndex();
            if (first != null) {
                nw3VarI = nw3VarI.i(first, prefix, index);
            }
            if (!y62Var.x()) {
                break;
            }
            y62Var = y62Var.M(1);
        }
        return nw3VarI;
    }

    public final boolean e(String str) {
        y62 y62VarA = this.b.a(str);
        nw3 nw3VarH = h(y62VarA);
        if (nw3VarH != null) {
            return !y62VarA.x() ? nw3VarH.G(str) : nw3VarH.G(y62VarA.getLast());
        }
        return false;
    }

    public final boolean f(String str) {
        y62 y62VarA = this.b.a(str);
        nw3 nw3VarH = h(y62VarA);
        if (nw3VarH != null) {
            String last = y62VarA.getLast();
            int index = y62VarA.getIndex();
            if (nw3VarH.C(last)) {
                return true;
            }
            return nw3VarH.A(last) && !nw3VarH.y(last, index).isEmpty();
        }
        return false;
    }

    public final boolean g() {
        if (this.k != null) {
            return false;
        }
        return this.l.isEmpty();
    }

    public final nw3 h(y62 y62Var) {
        return y62Var.x() ? this.l.H(y62Var.V(0, 1)) : this.l;
    }

    public final void i(vx0 vx0Var, ma3 ma3Var, qa3 qa3Var) {
        y62 y62VarD = ma3Var.d();
        String strB = ma3Var.b();
        nw3 nw3VarL = this.l;
        if (!y62VarD.isEmpty()) {
            nw3VarL = l(y62VarD);
        }
        this.a.i(ma3Var);
        nw3VarL.k(ma3Var);
        qa3Var.put(strB, ma3Var);
    }

    public void j(vx0 vx0Var, Annotation annotation) {
        if (annotation instanceof cz) {
            k(vx0Var, annotation, this.e);
        }
        if (annotation instanceof z02) {
            n(vx0Var, annotation, this.f);
        }
        if (annotation instanceof o02) {
            n(vx0Var, annotation, this.f);
        }
        if (annotation instanceof v02) {
            n(vx0Var, annotation, this.f);
        }
        if (annotation instanceof l02) {
            k(vx0Var, annotation, this.f);
        }
        if (annotation instanceof g02) {
            k(vx0Var, annotation, this.f);
        }
        if (annotation instanceof s02) {
            k(vx0Var, annotation, this.f);
        }
        if (annotation instanceof e02) {
            k(vx0Var, annotation, this.f);
        }
        if (annotation instanceof ip7) {
            v(vx0Var, annotation);
        }
        if (annotation instanceof oe6) {
            m(vx0Var, annotation);
        }
    }

    public final void k(vx0 vx0Var, Annotation annotation, qa3 qa3Var) throws ir4 {
        ma3 ma3VarH = this.i.h(vx0Var, annotation);
        String strB = ma3VarH.b();
        String name = ma3VarH.getName();
        if (qa3Var.get(strB) != 0) {
            throw new ir4("Duplicate annotation of name '%s' on %s", name, vx0Var);
        }
        i(vx0Var, ma3VarH, qa3Var);
    }

    public final nw3 l(y62 y62Var) {
        nw3 nw3VarH = this.l.H(y62Var);
        return nw3VarH != null ? nw3VarH : d(y62Var);
    }

    public final void m(vx0 vx0Var, Annotation annotation) throws ve6 {
        ma3 ma3VarH = this.i.h(vx0Var, annotation);
        y62 y62VarD = ma3VarH.d();
        String strB = ma3VarH.b();
        nw3 nw3VarL = this.l;
        if (!y62VarD.isEmpty()) {
            nw3VarL = l(y62VarD);
        }
        if (this.g.get(strB) != 0) {
            throw new ve6("Multiple text annotations in %s", annotation);
        }
        this.a.i(ma3VarH);
        nw3VarL.k(ma3VarH);
        this.g.put(strB, ma3VarH);
    }

    public final void n(vx0 vx0Var, Annotation annotation, qa3 qa3Var) throws ir4 {
        for (ma3 ma3Var : this.i.i(vx0Var, annotation)) {
            String strB = ma3Var.b();
            String name = ma3Var.getName();
            if (qa3Var.get(strB) != 0) {
                throw new ir4("Duplicate annotation of name '%s' on %s", name, ma3Var);
            }
            i(vx0Var, ma3Var, qa3Var);
        }
    }

    public void o(Class cls) {
        uh4 order = this.h.getOrder();
        u(cls);
        q(cls, order);
        p(cls, order);
        r(cls);
        s(cls);
        t(cls);
    }

    public final void p(Class cls, uh4 uh4Var) throws dz {
        if (uh4Var != null) {
            for (String str : uh4Var.attributes()) {
                if (!e(str)) {
                    throw new dz("Ordered attribute '%s' missing in %s", str, cls);
                }
            }
        }
    }

    public final void q(Class cls, uh4 uh4Var) throws j02 {
        if (uh4Var != null) {
            for (String str : uh4Var.elements()) {
                if (!f(str)) {
                    throw new j02("Ordered element '%s' missing for %s", str, cls);
                }
            }
        }
    }

    public final void r(Class cls) {
        if (this.l.isEmpty()) {
            return;
        }
        this.l.F(cls);
    }

    public final void s(Class cls) throws ve6 {
        ma3 text = this.l.getText();
        if (text == null) {
            if (this.h.isEmpty()) {
                this.m = g();
            }
        } else {
            if (text.q()) {
                return;
            }
            if (!this.f.isEmpty()) {
                throw new ve6("Elements used with %s in %s", text, cls);
            }
            if (this.l.E()) {
                throw new ve6("Paths used with %s in %s", text, cls);
            }
        }
    }

    public final void t(Class cls) throws ve6 {
        ma3 text = this.l.getText();
        if (text == null || !text.q()) {
            return;
        }
        Object key = text.getKey();
        for (ma3 ma3Var : this.f) {
            if (!ma3Var.getKey().equals(key)) {
                throw new ve6("Elements used with %s in %s", text, cls);
            }
            Class type = ma3Var.h().getType();
            if (type == String.class) {
                throw new ve6("Illegal entry of %s with text annotations on %s in %s", type, text, cls);
            }
        }
        if (this.l.E()) {
            throw new ve6("Paths used with %s in %s", text, cls);
        }
    }

    public final void u(Class cls) throws sp6 {
        for (ma3 ma3Var : this.f) {
            String[] strArrK = ma3Var.k();
            vx0 vx0VarO = ma3Var.o();
            for (String str : strArrK) {
                Annotation annotationA = vx0VarO.a();
                ma3 ma3Var2 = (ma3) this.f.get(str);
                if (ma3Var.isInline() != ma3Var2.isInline()) {
                    throw new sp6("Inline must be consistent in %s for %s", annotationA, vx0VarO);
                }
                if (ma3Var.e() != ma3Var2.e()) {
                    throw new sp6("Required must be consistent in %s for %s", annotationA, vx0VarO);
                }
            }
        }
    }

    public final void v(vx0 vx0Var, Annotation annotation) throws dz {
        ma3 ma3VarH = this.i.h(vx0Var, annotation);
        if (this.j != null) {
            throw new dz("Multiple version annotations in %s", annotation);
        }
        this.j = ma3VarH;
    }
}
