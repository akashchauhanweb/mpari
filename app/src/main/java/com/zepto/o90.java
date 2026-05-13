package com.zepto;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public class o90 implements gl4 {
    public final Annotation a;
    public final y62 b;
    public final String c;
    public final String d;
    public final String e;
    public final Class f;
    public final Object g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public o90(gl4 gl4Var, ma3 ma3Var) {
        this.a = gl4Var.a();
        this.b = gl4Var.d();
        this.k = gl4Var.f();
        this.i = gl4Var.c();
        this.j = ma3Var.e();
        this.e = gl4Var.toString();
        this.l = gl4Var.g();
        this.h = gl4Var.getIndex();
        this.c = gl4Var.getName();
        this.d = gl4Var.b();
        this.f = gl4Var.getType();
        this.g = ma3Var.getKey();
    }

    @Override // com.zepto.gl4
    public Annotation a() {
        return this.a;
    }

    @Override // com.zepto.gl4
    public String b() {
        return this.d;
    }

    @Override // com.zepto.gl4
    public boolean c() {
        return this.i;
    }

    @Override // com.zepto.gl4
    public y62 d() {
        return this.b;
    }

    @Override // com.zepto.gl4
    public boolean e() {
        return this.j;
    }

    @Override // com.zepto.gl4
    public boolean f() {
        return this.k;
    }

    @Override // com.zepto.gl4
    public boolean g() {
        return this.l;
    }

    @Override // com.zepto.gl4
    public int getIndex() {
        return this.h;
    }

    @Override // com.zepto.gl4
    public Object getKey() {
        return this.g;
    }

    @Override // com.zepto.gl4
    public String getName() {
        return this.c;
    }

    @Override // com.zepto.gl4
    public Class getType() {
        return this.f;
    }

    public String toString() {
        return this.e;
    }
}
