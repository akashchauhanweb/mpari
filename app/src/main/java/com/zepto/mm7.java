package com.zepto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public class mm7 implements ma3 {
    public final Object a;
    public final ma3 b;

    public static class a implements fa5 {
        public final jz0 a;
        public final Object b;
        public final ma3 c;

        public a(jz0 jz0Var, ma3 ma3Var, Object obj) {
            this.a = jz0Var;
            this.b = obj;
            this.c = ma3Var;
        }

        @Override // com.zepto.fa5, com.zepto.jz0
        public Object a(cz2 cz2Var, Object obj) throws ir4 {
            gt4 position = cz2Var.getPosition();
            String name = cz2Var.getName();
            jz0 jz0Var = this.a;
            if (jz0Var instanceof fa5) {
                return ((fa5) jz0Var).a(cz2Var, obj);
            }
            throw new ir4("Element '%s' is already used with %s at %s", name, this.c, position);
        }

        @Override // com.zepto.jz0
        public void b(oj4 oj4Var, Object obj) {
            b(oj4Var, obj);
        }

        @Override // com.zepto.jz0
        public Object c(cz2 cz2Var) {
            return a(cz2Var, this.b);
        }
    }

    public mm7(ma3 ma3Var, Object obj) {
        this.b = ma3Var;
        this.a = obj;
    }

    @Override // com.zepto.ma3
    public Annotation a() {
        return this.b.a();
    }

    @Override // com.zepto.ma3
    public String b() {
        return this.b.b();
    }

    public Object c() {
        return this.a;
    }

    @Override // com.zepto.ma3
    public y62 d() {
        return this.b.d();
    }

    @Override // com.zepto.ma3
    public boolean e() {
        return this.b.e();
    }

    @Override // com.zepto.ma3
    public boolean f() {
        return this.b.f();
    }

    @Override // com.zepto.ma3
    public boolean g() {
        return this.b.g();
    }

    @Override // com.zepto.ma3
    public Object getKey() {
        return this.b.getKey();
    }

    @Override // com.zepto.ma3
    public String getName() {
        return this.b.getName();
    }

    @Override // com.zepto.ma3
    public Class getType() {
        return this.b.getType();
    }

    @Override // com.zepto.ma3
    public lo6 h() {
        return this.b.h();
    }

    @Override // com.zepto.ma3
    public String i() {
        return this.b.i();
    }

    @Override // com.zepto.ma3
    public boolean isData() {
        return this.b.isData();
    }

    @Override // com.zepto.ma3
    public boolean isInline() {
        return this.b.isInline();
    }

    @Override // com.zepto.ma3
    public we1 j() {
        return this.b.j();
    }

    @Override // com.zepto.ma3
    public String[] k() {
        return this.b.k();
    }

    @Override // com.zepto.ma3
    public String[] l() {
        return this.b.l();
    }

    @Override // com.zepto.ma3
    public ma3 m(Class cls) {
        return this;
    }

    @Override // com.zepto.ma3
    public boolean n() {
        return this.b.n();
    }

    @Override // com.zepto.ma3
    public vx0 o() {
        return this.b.o();
    }

    @Override // com.zepto.ma3
    public lo6 p(Class cls) {
        return this.b.p(cls);
    }

    @Override // com.zepto.ma3
    public boolean q() {
        return this.b.q();
    }

    @Override // com.zepto.ma3
    public String r() {
        return this.b.r();
    }

    @Override // com.zepto.ma3
    public jz0 s(wy0 wy0Var) {
        jz0 jz0VarS = this.b.s(wy0Var);
        return jz0VarS instanceof a ? jz0VarS : new a(jz0VarS, this.b, this.a);
    }

    @Override // com.zepto.ma3
    public boolean t() {
        return this.b.t();
    }

    public String toString() {
        return this.b.toString();
    }

    @Override // com.zepto.ma3
    public Object u(wy0 wy0Var) {
        return this.b.u(wy0Var);
    }
}
