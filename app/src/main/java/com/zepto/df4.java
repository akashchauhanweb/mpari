package com.zepto;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class df4 implements no5 {
    public m86 a;
    public aq0 b;
    public l86 c;
    public c96 d;
    public si1 e;

    public df4(si1 si1Var, c96 c96Var) {
        this.b = new aq0(si1Var, c96Var);
        this.a = new m86(this, si1Var, c96Var);
        this.d = c96Var;
        this.e = si1Var;
        t(si1Var);
    }

    @Override // com.zepto.no5, com.zepto.ps4
    public boolean a() {
        return this.e.a();
    }

    @Override // com.zepto.no5
    public h03 b() {
        return this.c.a();
    }

    @Override // com.zepto.no5
    public boolean c() {
        return this.c.f();
    }

    @Override // com.zepto.no5
    public qu5 d() {
        return this.c.c();
    }

    @Override // com.zepto.no5
    public ip7 e() {
        return this.c.b();
    }

    @Override // com.zepto.no5
    public q26 f() {
        return this.b.o();
    }

    @Override // com.zepto.no5
    public xh2 g() {
        return this.b.m();
    }

    @Override // com.zepto.no5
    public String getName() {
        return this.e.getName();
    }

    @Override // com.zepto.no5
    public uh4 getOrder() {
        return this.b.i();
    }

    @Override // com.zepto.no5
    public il4 getParameters() {
        return this.b.j();
    }

    @Override // com.zepto.no5
    public ma3 getText() {
        return this.c.d();
    }

    @Override // com.zepto.no5
    public Class getType() {
        return this.e.getType();
    }

    @Override // com.zepto.no5
    public ma3 getVersion() {
        return this.c.e();
    }

    @Override // com.zepto.no5
    public xh2 h() {
        return this.b.k();
    }

    @Override // com.zepto.no5
    public ma0 i(wy0 wy0Var) {
        return new ma0(this, wy0Var);
    }

    @Override // com.zepto.no5
    public boolean isEmpty() {
        return this.b.n() == null;
    }

    @Override // com.zepto.no5
    public we1 j() {
        return this.b.g();
    }

    @Override // com.zepto.no5
    public xh2 k() {
        return this.b.l();
    }

    @Override // com.zepto.no5
    public xh2 l() {
        return this.b.q();
    }

    @Override // com.zepto.no5
    public List m() {
        return this.b.p();
    }

    @Override // com.zepto.no5
    public xh2 n() {
        return this.b.f();
    }

    @Override // com.zepto.no5
    public xh2 o() {
        return this.b.e();
    }

    public final void p(si1 si1Var) {
        Class type = si1Var.getType();
        if (this.c == null) {
            this.c = this.a.b(type);
        }
        this.a = null;
    }

    public final void q(si1 si1Var) {
        for (vx0 vx0Var : this.d.e(si1Var.getType(), si1Var.i())) {
            Annotation annotationA = vx0Var.a();
            if (annotationA != null) {
                this.a.j(vx0Var, annotationA);
            }
        }
    }

    public final void r(si1 si1Var) {
        for (vx0 vx0Var : this.d.j(si1Var.getType(), si1Var.i())) {
            Annotation annotationA = vx0Var.a();
            if (annotationA != null) {
                this.a.j(vx0Var, annotationA);
            }
        }
    }

    public final void s(si1 si1Var) {
        this.a.a(si1Var.getType());
    }

    public final void t(si1 si1Var) {
        s(si1Var);
        q(si1Var);
        r(si1Var);
        u(si1Var);
        p(si1Var);
    }

    public final void u(si1 si1Var) {
        Class type = si1Var.getType();
        this.a.c(type);
        this.a.o(type);
    }
}
