package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class mj4 implements oj4 {
    public q14 b;
    public z94 c;
    public oj4 d;
    public String e;
    public String f;
    public String g;
    public String h;
    public pj4 a = new pj4(this);
    public lw3 i = lw3.INHERIT;

    public mj4(oj4 oj4Var, z94 z94Var, String str) {
        this.b = new qu4(oj4Var);
        this.c = z94Var;
        this.d = oj4Var;
        this.h = str;
    }

    @Override // com.zepto.oj4
    public void b(String str) {
        this.e = str;
    }

    @Override // com.zepto.oj4
    public void commit() {
        this.c.a(this);
    }

    @Override // com.zepto.oj4
    public q14 e() {
        return this.b;
    }

    @Override // com.zepto.oj4
    public String f() {
        return this.f;
    }

    @Override // com.zepto.oj4
    public void g(boolean z) {
        if (z) {
            this.i = lw3.DATA;
        } else {
            this.i = lw3.ESCAPE;
        }
    }

    @Override // com.zepto.r94
    public String getName() {
        return this.h;
    }

    @Override // com.zepto.oj4
    public String getPrefix() {
        return h(true);
    }

    @Override // com.zepto.r94
    public String getValue() {
        return this.g;
    }

    @Override // com.zepto.oj4
    public String h(boolean z) {
        String strU = this.b.U(this.e);
        return (z && strU == null) ? this.d.getPrefix() : strU;
    }

    @Override // com.zepto.oj4
    public void i(String str) {
        this.g = str;
    }

    @Override // com.zepto.oj4
    public oj4 j(String str, String str2) {
        return this.a.K(str, str2);
    }

    @Override // com.zepto.oj4
    public oj4 k(String str) {
        return this.c.e(this, str);
    }

    @Override // com.zepto.oj4
    public lw3 m() {
        return this.i;
    }

    @Override // com.zepto.oj4
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public pj4 c() {
        return this.a;
    }

    public String toString() {
        return String.format("element %s", this.h);
    }
}
