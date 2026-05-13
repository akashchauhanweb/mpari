package com.zepto;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class wu0 implements jz0 {
    public final ye4 a;
    public final vu4 b;
    public final k31 c;
    public final de5 d;
    public final wy0 e;
    public final lo6 f;

    public static class b {
        public final wu0 a;
        public final k31 b;
        public final cp5 c;
        public final b03 d;

        public b(wu0 wu0Var, k31 k31Var, cp5 cp5Var, b03 b03Var) {
            this.a = wu0Var;
            this.b = k31Var;
            this.c = cp5Var;
            this.d = b03Var;
        }

        public Object a(cz2 cz2Var) throws j02, dz, lm7 {
            Object objC = this.d.c();
            qu5 qu5VarD = this.c.d();
            this.d.b(objC);
            this.a.x(cz2Var, objC, this.c);
            this.a.t(cz2Var, objC, qu5VarD);
            this.a.m(cz2Var, objC, qu5VarD);
            this.a.o(cz2Var, objC, qu5VarD);
            this.b.b0(objC);
            return objC;
        }
    }

    public class c extends b {
        @Override // com.zepto.wu0.b
        public Object a(cz2 cz2Var) throws j02, dz, lm7 {
            qu5 qu5VarD = this.c.d();
            this.a.x(cz2Var, null, this.c);
            this.a.t(cz2Var, null, qu5VarD);
            this.a.m(cz2Var, null, qu5VarD);
            this.a.o(cz2Var, null, qu5VarD);
            return b(cz2Var);
        }

        public final Object b(cz2 cz2Var) {
            Object objA = this.c.b().a(this.b);
            this.d.b(objA);
            this.b.b0(objA);
            return objA;
        }

        public c(wu0 wu0Var, k31 k31Var, cp5 cp5Var, b03 b03Var) {
            super(wu0Var, k31Var, cp5Var, b03Var);
        }
    }

    public wu0(wy0 wy0Var, lo6 lo6Var) {
        this(wy0Var, lo6Var, null);
    }

    public final void A(oj4 oj4Var, Object obj, ma3 ma3Var) {
        if (obj != null) {
            ma3Var.j().a(oj4Var.j(ma3Var.getName(), this.a.j(obj)));
        }
    }

    public final void B(oj4 oj4Var, Object obj, qu5 qu5Var) throws dz {
        for (ma3 ma3Var : qu5Var.c()) {
            Object objU = ma3Var.o().get(obj);
            Class clsB = this.e.b(this.f, obj);
            if (objU == null) {
                objU = ma3Var.u(this.e);
            }
            if (objU == null && ma3Var.e()) {
                throw new dz("Value for %s is null in %s", ma3Var, clsB);
            }
            A(oj4Var, objU, ma3Var);
        }
    }

    public final void C(oj4 oj4Var, Object obj, jz0 jz0Var) {
        jz0Var.b(oj4Var, obj);
    }

    public final void D(oj4 oj4Var, Object obj, ma3 ma3Var) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            ma3 ma3VarM = ma3Var.m(cls);
            String name = ma3VarM.getName();
            lo6 lo6VarP = ma3Var.p(cls);
            oj4 oj4VarK = oj4Var.k(name);
            if (!ma3VarM.isInline()) {
                F(oj4VarK, lo6VarP, ma3VarM);
            }
            if (ma3VarM.isInline() || !h(oj4VarK, obj, lo6VarP)) {
                jz0 jz0VarS = ma3VarM.s(this.e);
                oj4VarK.g(ma3VarM.isData());
                C(oj4VarK, obj, jz0VarS);
            }
        }
    }

    public final void E(oj4 oj4Var, Object obj, qu5 qu5Var) throws j02, dz, ve6 {
        Iterator it = qu5Var.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            qu5 qu5VarV = qu5Var.v(str);
            if (qu5VarV != null) {
                H(oj4Var.k(str), obj, qu5VarV);
            } else {
                ma3 ma3VarE = qu5Var.e(qu5Var.R(str));
                Class clsB = this.e.b(this.f, obj);
                if (this.c.l(ma3VarE) != null) {
                    continue;
                } else {
                    if (ma3VarE == null) {
                        throw new j02("Element '%s' not defined in %s", str, clsB);
                    }
                    K(oj4Var, obj, qu5Var, ma3VarE);
                }
            }
        }
    }

    public final void F(oj4 oj4Var, lo6 lo6Var, ma3 ma3Var) {
        ma3Var.j().b(oj4Var, this.e.c(lo6Var.getType()));
    }

    public final Object G(Object obj) {
        if (obj == null) {
            return obj;
        }
        return this.e.g(obj.getClass()).d(obj);
    }

    public final void H(oj4 oj4Var, Object obj, qu5 qu5Var) throws j02, dz, ve6 {
        q14 q14VarE = oj4Var.e();
        String prefix = qu5Var.getPrefix();
        if (prefix != null) {
            String strZ = q14VarE.Z(prefix);
            if (strZ == null) {
                throw new j02("Namespace prefix '%s' in %s is not in scope", prefix, this.f);
            }
            oj4Var.b(strZ);
        }
        B(oj4Var, obj, qu5Var);
        E(oj4Var, obj, qu5Var);
        J(oj4Var, obj, qu5Var);
    }

    public final void I(oj4 oj4Var, Object obj, ma3 ma3Var) {
        if (obj == null || ma3Var.q()) {
            return;
        }
        String strJ = this.a.j(obj);
        oj4Var.g(ma3Var.isData());
        oj4Var.i(strJ);
    }

    public final void J(oj4 oj4Var, Object obj, qu5 qu5Var) throws ve6 {
        ma3 text = qu5Var.getText();
        if (text != null) {
            Object objU = text.o().get(obj);
            Class clsB = this.e.b(this.f, obj);
            if (objU == null) {
                objU = text.u(this.e);
            }
            if (objU == null && text.e()) {
                throw new ve6("Value for %s is null in %s", text, clsB);
            }
            I(oj4Var, objU, text);
        }
    }

    public final void K(oj4 oj4Var, Object obj, qu5 qu5Var, ma3 ma3Var) throws j02 {
        Object obj2 = ma3Var.o().get(obj);
        Class clsB = this.e.b(this.f, obj);
        if (obj2 == null && ma3Var.e()) {
            throw new j02("Value for %s is null in %s", ma3Var, clsB);
        }
        Object objG = G(obj2);
        if (objG != null) {
            D(oj4Var, objG, ma3Var);
        }
        this.c.Y(ma3Var, objG);
    }

    public final void L(oj4 oj4Var, Object obj, cp5 cp5Var) {
        ip7 ip7VarE = cp5Var.e();
        ma3 version = cp5Var.getVersion();
        if (ip7VarE != null) {
            Double dValueOf = Double.valueOf(this.d.b());
            Double dValueOf2 = Double.valueOf(ip7VarE.revision());
            if (!this.d.a(dValueOf2, dValueOf)) {
                A(oj4Var, dValueOf2, version);
            } else if (version.e()) {
                A(oj4Var, dValueOf2, version);
            }
        }
    }

    @Override // com.zepto.jz0
    public Object a(cz2 cz2Var, Object obj) throws dz, lm7 {
        cp5 cp5VarH = this.e.h(obj.getClass());
        ma0 ma0VarA = cp5VarH.a();
        k(cz2Var, obj, cp5VarH);
        this.c.b0(obj);
        ma0VarA.f(obj);
        ma0VarA.a(obj);
        return r(cz2Var, obj, ma0VarA);
    }

    @Override // com.zepto.jz0
    public void b(oj4 oj4Var, Object obj) {
        cp5 cp5VarH = this.e.h(obj.getClass());
        ma0 ma0VarA = cp5VarH.a();
        try {
            if (cp5VarH.c()) {
                this.b.b(oj4Var, obj);
            } else {
                ma0VarA.c(obj);
                z(oj4Var, obj, cp5VarH);
            }
            ma0VarA.b(obj);
        } catch (Throwable th) {
            ma0VarA.b(obj);
            throw th;
        }
    }

    @Override // com.zepto.jz0
    public Object c(cz2 cz2Var) throws g03 {
        b03 b03VarH = this.a.h(cz2Var);
        Class type = b03VarH.getType();
        return b03VarH.a() ? b03VarH.c() : this.e.o(type) ? q(cz2Var, b03VarH) : j(cz2Var, b03VarH, type);
    }

    public final boolean h(oj4 oj4Var, Object obj, lo6 lo6Var) {
        return this.a.g(lo6Var, obj, oj4Var);
    }

    public final b i(cp5 cp5Var, b03 b03Var) {
        return cp5Var.b().c() ? new b(this, this.c, cp5Var, b03Var) : new c(this, this.c, cp5Var, b03Var);
    }

    public final Object j(cz2 cz2Var, b03 b03Var, Class cls) throws j02, dz, lm7 {
        cp5 cp5VarH = this.e.h(cls);
        ma0 ma0VarA = cp5VarH.a();
        Object objA = i(cp5VarH, b03Var).a(cz2Var);
        ma0VarA.f(objA);
        ma0VarA.a(objA);
        b03Var.b(objA);
        return r(cz2Var, objA, ma0VarA);
    }

    public final void k(cz2 cz2Var, Object obj, cp5 cp5Var) throws dz, lm7 {
        qu5 qu5VarD = cp5Var.d();
        x(cz2Var, obj, cp5Var);
        s(cz2Var, obj, qu5VarD);
    }

    public final void l(cz2 cz2Var, Object obj, qu5 qu5Var, qa3 qa3Var) throws dz, lm7 {
        String strA = qu5Var.a(cz2Var.getName());
        ma3 ma3VarR = qa3Var.r(strA);
        if (ma3VarR != null) {
            p(cz2Var, obj, ma3VarR);
            return;
        }
        gt4 position = cz2Var.getPosition();
        Class clsB = this.e.b(this.f, obj);
        if (qa3Var.z(this.e) && this.d.c()) {
            throw new dz("Attribute '%s' does not have a match in %s at %s", strA, clsB, position);
        }
    }

    public final void m(cz2 cz2Var, Object obj, qu5 qu5Var) throws dz, lm7 {
        w94 w94VarC = cz2Var.c();
        qa3 qa3VarC = qu5Var.c();
        Iterator it = w94VarC.iterator();
        while (it.hasNext()) {
            cz2 cz2VarA = cz2Var.a((String) it.next());
            if (cz2VarA != null) {
                l(cz2VarA, obj, qu5Var, qa3VarC);
            }
        }
        y(cz2Var, qa3VarC, obj);
    }

    public final void n(cz2 cz2Var, Object obj, qu5 qu5Var, qa3 qa3Var) throws j02, lm7 {
        String strR = qu5Var.R(cz2Var.getName());
        ma3 ma3VarR = qa3Var.r(strR);
        if (ma3VarR == null) {
            ma3VarR = this.c.o(strR);
        }
        if (ma3VarR != null) {
            u(cz2Var, obj, qa3Var, ma3VarR);
            return;
        }
        gt4 position = cz2Var.getPosition();
        Class clsB = this.e.b(this.f, obj);
        if (qa3Var.z(this.e) && this.d.c()) {
            throw new j02("Element '%s' does not have a match in %s at %s", strR, clsB, position);
        }
        cz2Var.n();
    }

    public final void o(cz2 cz2Var, Object obj, qu5 qu5Var) throws j02, dz, lm7 {
        qa3 qa3VarH = qu5Var.h();
        cz2 cz2VarL = cz2Var.l();
        while (cz2VarL != null) {
            qu5 qu5VarV = qu5Var.v(cz2VarL.getName());
            if (qu5VarV != null) {
                s(cz2VarL, obj, qu5VarV);
            } else {
                n(cz2VarL, obj, qu5Var, qa3VarH);
            }
            cz2VarL = cz2Var.l();
        }
        y(cz2Var, qa3VarH, obj);
    }

    public final Object p(cz2 cz2Var, Object obj, ma3 ma3Var) throws lm7 {
        Object objV = v(cz2Var, obj, ma3Var);
        if (objV == null) {
            gt4 position = cz2Var.getPosition();
            Class clsB = this.e.b(this.f, obj);
            if (ma3Var.e() && this.d.c()) {
                throw new lm7("Empty value for %s in %s at %s", ma3Var, clsB, position);
            }
        } else if (objV != ma3Var.u(this.e)) {
            this.c.Y(ma3Var, objV);
        }
        return objV;
    }

    public final Object q(cz2 cz2Var, b03 b03Var) {
        Class type = b03Var.getType();
        Object objD = this.b.d(cz2Var, type);
        if (type != null) {
            b03Var.b(objD);
        }
        return objD;
    }

    public final Object r(cz2 cz2Var, Object obj, ma0 ma0Var) throws j02 {
        if (obj == null) {
            return obj;
        }
        gt4 position = cz2Var.getPosition();
        Object objE = ma0Var.e(obj);
        Class type = this.f.getType();
        Class<?> cls = objE.getClass();
        if (type.isAssignableFrom(cls)) {
            return objE;
        }
        throw new j02("Type %s does not match %s at %s", cls, type, position);
    }

    public final void s(cz2 cz2Var, Object obj, qu5 qu5Var) throws dz, lm7 {
        t(cz2Var, obj, qu5Var);
        m(cz2Var, obj, qu5Var);
        o(cz2Var, obj, qu5Var);
    }

    public final void t(cz2 cz2Var, Object obj, qu5 qu5Var) throws lm7 {
        ma3 text = qu5Var.getText();
        if (text != null) {
            p(cz2Var, obj, text);
        }
    }

    public final void u(cz2 cz2Var, Object obj, qa3 qa3Var, ma3 ma3Var) throws lm7 {
        Object objP = p(cz2Var, obj, ma3Var);
        for (String str : ma3Var.k()) {
            qa3Var.r(str);
        }
        if (ma3Var.isInline()) {
            this.c.Y(ma3Var, objP);
        }
    }

    public final Object v(cz2 cz2Var, Object obj, ma3 ma3Var) {
        Object obj2;
        jz0 jz0VarS = ma3Var.s(this.e);
        if (ma3Var.n()) {
            mm7 mm7VarL = this.c.l(ma3Var);
            vx0 vx0VarO = ma3Var.o();
            if (mm7VarL != null) {
                return jz0VarS.a(cz2Var, mm7VarL.c());
            }
            if (obj != null && (obj2 = vx0VarO.get(obj)) != null) {
                return jz0VarS.a(cz2Var, obj2);
            }
        }
        return jz0VarS.c(cz2Var);
    }

    public final void w(cz2 cz2Var, Object obj, ma3 ma3Var) throws lm7 {
        Object objP = p(cz2Var, obj, ma3Var);
        Class type = this.f.getType();
        if (objP != null) {
            Double dValueOf = Double.valueOf(this.e.n(type).revision());
            if (objP.equals(this.d)) {
                return;
            }
            this.d.a(dValueOf, objP);
        }
    }

    public final void x(cz2 cz2Var, Object obj, cp5 cp5Var) throws lm7 {
        ma3 version = cp5Var.getVersion();
        Class type = this.f.getType();
        if (version != null) {
            cz2 cz2Var2 = (cz2) cz2Var.c().remove(version.getName());
            if (cz2Var2 != null) {
                w(cz2Var2, obj, version);
                return;
            }
            ip7 ip7VarN = this.e.n(type);
            Double dValueOf = Double.valueOf(this.d.b());
            Double dValueOf2 = Double.valueOf(ip7VarN.revision());
            this.c.Y(version, dValueOf);
            this.d.a(dValueOf2, dValueOf);
        }
    }

    public final void y(cz2 cz2Var, qa3 qa3Var, Object obj) throws lm7 {
        Class clsB = this.e.b(this.f, obj);
        gt4 position = cz2Var.getPosition();
        Iterator it = qa3Var.iterator();
        while (it.hasNext()) {
            ma3 ma3Var = (ma3) it.next();
            if (ma3Var.e() && this.d.c()) {
                throw new lm7("Unable to satisfy %s for %s at %s", ma3Var, clsB, position);
            }
            Object objU = ma3Var.u(this.e);
            if (objU != null) {
                this.c.Y(ma3Var, objU);
            }
        }
    }

    public final void z(oj4 oj4Var, Object obj, cp5 cp5Var) throws j02, dz, ve6 {
        qu5 qu5VarD = cp5Var.d();
        L(oj4Var, obj, cp5Var);
        H(oj4Var, obj, qu5VarD);
    }

    public wu0(wy0 wy0Var, lo6 lo6Var, Class cls) {
        this.a = new ye4(wy0Var, lo6Var, cls);
        this.b = new vu4(wy0Var, lo6Var);
        this.c = new pr0();
        this.d = new de5();
        this.e = wy0Var;
        this.f = lo6Var;
    }
}
