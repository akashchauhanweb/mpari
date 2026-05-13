package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv {

    public static abstract class a {
        public abstract dv a();

        public abstract a b(boolean z);
    }

    public static dv c(int i) {
        return d(i).a();
    }

    public static a d(int i) {
        bm8 bm8Var = new bm8();
        bm8Var.c(i);
        bm8Var.b(false);
        return bm8Var;
    }

    public abstract boolean a();

    public abstract int b();
}
