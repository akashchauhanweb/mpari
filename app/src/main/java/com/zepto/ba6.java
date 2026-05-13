package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ba6 implements bc2 {
    public bc2 a;

    public ba6() {
        this(null);
    }

    @Override // com.zepto.bc2
    public String a(String str) {
        String property = System.getProperty(str);
        if (property != null) {
            return property;
        }
        bc2 bc2Var = this.a;
        if (bc2Var != null) {
            return bc2Var.a(str);
        }
        return null;
    }

    public ba6(bc2 bc2Var) {
        this.a = bc2Var;
    }
}
