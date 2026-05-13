package com.zepto;

import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gf1 implements si1 {
    public final mg1 a;
    public final si1 b;

    public gf1(si1 si1Var, mg1 mg1Var) {
        this.b = si1Var;
        this.a = mg1Var;
    }

    @Override // com.zepto.si1
    public boolean a() {
        return this.b.a();
    }

    @Override // com.zepto.si1
    public boolean c() {
        return this.b.c();
    }

    @Override // com.zepto.si1
    public boolean e() {
        return this.b.e();
    }

    @Override // com.zepto.si1
    public Constructor[] getConstructors() {
        return this.b.getConstructors();
    }

    @Override // com.zepto.si1
    public String getName() {
        return this.b.getName();
    }

    @Override // com.zepto.si1
    public n14 getNamespace() {
        return this.b.getNamespace();
    }

    @Override // com.zepto.si1
    public uh4 getOrder() {
        return this.b.getOrder();
    }

    @Override // com.zepto.si1
    public ne5 getRoot() {
        return this.b.getRoot();
    }

    @Override // com.zepto.si1
    public Class getType() {
        return this.b.getType();
    }

    @Override // com.zepto.si1
    public mg1 i() {
        return this.a;
    }

    @Override // com.zepto.si1
    public List j() {
        return this.b.j();
    }

    @Override // com.zepto.si1
    public mg1 k() {
        return this.b.k();
    }

    @Override // com.zepto.si1
    public Class l() {
        return this.b.l();
    }

    @Override // com.zepto.si1
    public boolean m() {
        return this.b.m();
    }

    @Override // com.zepto.si1
    public List n() {
        return this.b.n();
    }

    @Override // com.zepto.si1
    public p14 o() {
        return this.b.o();
    }

    public String toString() {
        return this.b.toString();
    }
}
