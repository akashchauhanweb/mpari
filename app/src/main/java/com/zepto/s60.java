package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class s60 {
    public static vh8 a;

    public static void a(vh8 vh8Var) {
        if (a != null) {
            return;
        }
        a = (vh8) iu4.j(vh8Var, "delegate must not be null");
    }
}
