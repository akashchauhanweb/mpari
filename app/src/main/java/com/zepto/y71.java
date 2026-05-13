package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y71 {
    public static final fa1 a = new fa1();
    public static final pb1 b = new pb1();

    public static fa1 a(b0 b0Var) {
        return b0Var.f() < 1 ? a : new fa1(b0Var);
    }

    public static pb1 b(b0 b0Var) {
        return b0Var.f() < 1 ? b : new pb1(b0Var);
    }
}
