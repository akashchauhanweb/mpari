package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ae6 implements bc2 {
    public wy0 a;
    public bc2 b;

    public ae6(wy0 wy0Var, bc2 bc2Var) {
        this.a = wy0Var;
        this.b = bc2Var;
    }

    @Override // com.zepto.bc2
    public String a(String str) {
        Object objE = this.a.e(str);
        return objE != null ? objE.toString() : this.b.a(str);
    }
}
