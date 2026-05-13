package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class wj4 implements lo6 {
    public final Class a;
    public final lo6 b;

    public wj4(lo6 lo6Var, Class cls) {
        this.a = cls;
        this.b = lo6Var;
    }

    @Override // com.zepto.lo6
    public Class getType() {
        return this.a;
    }

    public String toString() {
        return this.b.toString();
    }
}
