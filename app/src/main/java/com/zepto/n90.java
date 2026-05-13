package com.zepto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public class n90 implements ma3 {
    public final Annotation a;
    public final y62 b;
    public final we1 c;
    public final vx0 d;
    public final String[] e;
    public final String[] f;
    public final Class g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final ma3 l;
    public final Object m;
    public final lo6 n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    public n90(ma3 ma3Var) {
        this.a = ma3Var.a();
        this.b = ma3Var.d();
        this.c = ma3Var.j();
        this.r = ma3Var.f();
        this.t = ma3Var.n();
        this.d = ma3Var.o();
        this.n = ma3Var.h();
        this.s = ma3Var.e();
        this.j = ma3Var.i();
        this.v = ma3Var.q();
        this.u = ma3Var.isInline();
        this.q = ma3Var.t();
        this.e = ma3Var.l();
        this.f = ma3Var.k();
        this.i = ma3Var.b();
        this.g = ma3Var.getType();
        this.k = ma3Var.getName();
        this.h = ma3Var.r();
        this.o = ma3Var.isData();
        this.p = ma3Var.g();
        this.m = ma3Var.getKey();
        this.l = ma3Var;
    }

    @Override // com.zepto.ma3
    public Annotation a() {
        return this.a;
    }

    @Override // com.zepto.ma3
    public String b() {
        return this.i;
    }

    @Override // com.zepto.ma3
    public y62 d() {
        return this.b;
    }

    @Override // com.zepto.ma3
    public boolean e() {
        return this.s;
    }

    @Override // com.zepto.ma3
    public boolean f() {
        return this.r;
    }

    @Override // com.zepto.ma3
    public boolean g() {
        return this.p;
    }

    @Override // com.zepto.ma3
    public Object getKey() {
        return this.m;
    }

    @Override // com.zepto.ma3
    public String getName() {
        return this.k;
    }

    @Override // com.zepto.ma3
    public Class getType() {
        return this.g;
    }

    @Override // com.zepto.ma3
    public lo6 h() {
        return this.n;
    }

    @Override // com.zepto.ma3
    public String i() {
        return this.j;
    }

    @Override // com.zepto.ma3
    public boolean isData() {
        return this.o;
    }

    @Override // com.zepto.ma3
    public boolean isInline() {
        return this.u;
    }

    @Override // com.zepto.ma3
    public we1 j() {
        return this.c;
    }

    @Override // com.zepto.ma3
    public String[] k() {
        return this.f;
    }

    @Override // com.zepto.ma3
    public String[] l() {
        return this.e;
    }

    @Override // com.zepto.ma3
    public ma3 m(Class cls) {
        return this.l.m(cls);
    }

    @Override // com.zepto.ma3
    public boolean n() {
        return this.t;
    }

    @Override // com.zepto.ma3
    public vx0 o() {
        return this.d;
    }

    @Override // com.zepto.ma3
    public lo6 p(Class cls) {
        return this.l.p(cls);
    }

    @Override // com.zepto.ma3
    public boolean q() {
        return this.v;
    }

    @Override // com.zepto.ma3
    public String r() {
        return this.h;
    }

    @Override // com.zepto.ma3
    public jz0 s(wy0 wy0Var) {
        return this.l.s(wy0Var);
    }

    @Override // com.zepto.ma3
    public boolean t() {
        return this.q;
    }

    public String toString() {
        return this.l.toString();
    }

    @Override // com.zepto.ma3
    public Object u(wy0 wy0Var) {
        return this.l.u(wy0Var);
    }
}
