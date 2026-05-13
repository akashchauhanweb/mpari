package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class yy2 implements cz2 {
    public final dz2 a;
    public final x94 b;
    public final cz2 c;
    public final b52 d;

    public yy2(cz2 cz2Var, x94 x94Var, b52 b52Var) {
        this.a = new dz2(this, b52Var);
        this.b = x94Var;
        this.c = cz2Var;
        this.d = b52Var;
    }

    @Override // com.zepto.cz2
    public cz2 a(String str) {
        return this.a.get(str);
    }

    @Override // com.zepto.cz2
    public w94 c() {
        return this.a;
    }

    @Override // com.zepto.cz2
    public boolean d() {
        return true;
    }

    @Override // com.zepto.r94
    public String getName() {
        return this.d.getName();
    }

    @Override // com.zepto.cz2
    public gt4 getPosition() {
        return new ez2(this.d);
    }

    @Override // com.zepto.r94
    public String getValue() {
        return this.b.g(this);
    }

    @Override // com.zepto.cz2
    public cz2 l() {
        return this.b.c(this);
    }

    @Override // com.zepto.cz2
    public void n() {
        this.b.h(this);
    }

    public String toString() {
        return String.format("element %s", getName());
    }
}
