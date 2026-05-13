package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class uy2 implements cz2 {
    public cz2 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Object f;

    public uy2(cz2 cz2Var, String str, String str2) {
        this.a = cz2Var;
        this.e = str2;
        this.d = str;
    }

    @Override // com.zepto.cz2
    public cz2 a(String str) {
        return null;
    }

    @Override // com.zepto.cz2
    public w94 c() {
        return new dz2(this);
    }

    @Override // com.zepto.cz2
    public boolean d() {
        return false;
    }

    @Override // com.zepto.r94
    public String getName() {
        return this.d;
    }

    @Override // com.zepto.cz2
    public gt4 getPosition() {
        return this.a.getPosition();
    }

    @Override // com.zepto.r94
    public String getValue() {
        return this.e;
    }

    @Override // com.zepto.cz2
    public cz2 l() {
        return null;
    }

    @Override // com.zepto.cz2
    public void n() {
    }

    public String toString() {
        return String.format("attribute %s='%s'", this.d, this.e);
    }

    public uy2(cz2 cz2Var, bz bzVar) {
        this.b = bzVar.b();
        this.c = bzVar.getPrefix();
        this.f = bzVar.a();
        this.e = bzVar.getValue();
        this.d = bzVar.getName();
        this.a = cz2Var;
    }
}
