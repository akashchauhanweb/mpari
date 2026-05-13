package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class jj4 implements oj4 {
    public q14 a;
    public oj4 b;
    public String c;
    public String d;
    public String e;

    public jj4(oj4 oj4Var, String str, String str2) {
        this.a = oj4Var.e();
        this.b = oj4Var;
        this.e = str2;
        this.d = str;
    }

    @Override // com.zepto.oj4
    public void b(String str) {
        this.c = str;
    }

    @Override // com.zepto.oj4
    public w94 c() {
        return new pj4(this);
    }

    @Override // com.zepto.oj4
    public void commit() {
    }

    @Override // com.zepto.oj4
    public q14 e() {
        return this.a;
    }

    @Override // com.zepto.oj4
    public String f() {
        return null;
    }

    @Override // com.zepto.oj4
    public void g(boolean z) {
    }

    @Override // com.zepto.r94
    public String getName() {
        return this.d;
    }

    @Override // com.zepto.oj4
    public String getPrefix() {
        return this.a.U(this.c);
    }

    @Override // com.zepto.r94
    public String getValue() {
        return this.e;
    }

    @Override // com.zepto.oj4
    public String h(boolean z) {
        return this.a.U(this.c);
    }

    @Override // com.zepto.oj4
    public void i(String str) {
        this.e = str;
    }

    @Override // com.zepto.oj4
    public oj4 j(String str, String str2) {
        return null;
    }

    @Override // com.zepto.oj4
    public oj4 k(String str) {
        return null;
    }

    @Override // com.zepto.oj4
    public lw3 m() {
        return lw3.INHERIT;
    }

    public String toString() {
        return String.format("attribute %s='%s'", this.d, this.e);
    }
}
