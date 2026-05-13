package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class lj4 implements oj4 {
    public z94 b;
    public rj4 c;
    public String d;
    public String e;
    public String f;
    public pj4 a = new pj4(this);
    public lw3 g = lw3.INHERIT;

    public lj4(z94 z94Var, rj4 rj4Var) {
        this.b = z94Var;
        this.c = rj4Var;
    }

    @Override // com.zepto.oj4
    public void b(String str) {
        this.d = str;
    }

    @Override // com.zepto.oj4
    public w94 c() {
        return this.a;
    }

    @Override // com.zepto.oj4
    public void commit() throws t94 {
        if (this.c.isEmpty()) {
            throw new t94("No root node");
        }
        this.c.r().commit();
    }

    @Override // com.zepto.oj4
    public q14 e() {
        return null;
    }

    @Override // com.zepto.oj4
    public String f() {
        return this.e;
    }

    @Override // com.zepto.oj4
    public void g(boolean z) {
        if (z) {
            this.g = lw3.DATA;
        } else {
            this.g = lw3.ESCAPE;
        }
    }

    @Override // com.zepto.r94
    public String getName() {
        return null;
    }

    @Override // com.zepto.oj4
    public String getPrefix() {
        return null;
    }

    @Override // com.zepto.r94
    public String getValue() {
        return this.f;
    }

    @Override // com.zepto.oj4
    public String h(boolean z) {
        return null;
    }

    @Override // com.zepto.oj4
    public void i(String str) {
        this.f = str;
    }

    @Override // com.zepto.oj4
    public oj4 j(String str, String str2) {
        return this.a.K(str, str2);
    }

    @Override // com.zepto.oj4
    public oj4 k(String str) {
        return this.b.e(this, str);
    }

    @Override // com.zepto.oj4
    public lw3 m() {
        return this.g;
    }
}
