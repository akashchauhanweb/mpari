package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p33 {
    public static l33 a(o33 o33Var) throws f33 {
        l33 l33VarE = o33Var.e();
        if (l33VarE != null) {
            return l33VarE;
        }
        throw new f33("The algorithm \"alg\" header parameter must not be null");
    }
}
