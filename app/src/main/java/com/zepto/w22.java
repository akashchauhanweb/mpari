package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class w22 implements bc2 {
    public bc2 a;

    public w22() {
        this(null);
    }

    @Override // com.zepto.bc2
    public String a(String str) {
        String str2 = System.getenv(str);
        if (str2 != null) {
            return str2;
        }
        bc2 bc2Var = this.a;
        if (bc2Var != null) {
            return bc2Var.a(str);
        }
        return null;
    }

    public w22(bc2 bc2Var) {
        this.a = bc2Var;
    }
}
