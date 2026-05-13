package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class bq0 implements cp5 {
    public final h03 a;
    public final we1 b;
    public final qu5 c;
    public final ip7 d;
    public final ma0 e;
    public final ma3 f;
    public final ma3 g;
    public final Class h;
    public final boolean i;

    public bq0(no5 no5Var, wy0 wy0Var) {
        this.e = no5Var.i(wy0Var);
        this.a = no5Var.b();
        this.d = no5Var.e();
        this.b = no5Var.j();
        this.i = no5Var.c();
        this.f = no5Var.getVersion();
        this.c = no5Var.d();
        this.g = no5Var.getText();
        this.h = no5Var.getType();
    }

    @Override // com.zepto.cp5
    public ma0 a() {
        return this.e;
    }

    @Override // com.zepto.cp5
    public h03 b() {
        return this.a;
    }

    @Override // com.zepto.cp5
    public boolean c() {
        return this.i;
    }

    @Override // com.zepto.cp5
    public qu5 d() {
        return this.c;
    }

    @Override // com.zepto.cp5
    public ip7 e() {
        return this.d;
    }

    @Override // com.zepto.cp5
    public ma3 getVersion() {
        return this.f;
    }

    public String toString() {
        return String.format("schema for %s", this.h);
    }
}
