package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class zd5 {
    public static Object a(int i, Object obj, vh2 vh2Var, ce5 ce5Var) {
        Object objA;
        if (i < 1) {
            return vh2Var.a(obj);
        }
        do {
            objA = vh2Var.a(obj);
            obj = ce5Var.a(obj, objA);
            if (obj == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return objA;
    }
}
