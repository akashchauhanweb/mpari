package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class z22 {
    public static final z22 d;
    public static final z22 e;
    public static final z22 f;
    public static final z22 g;
    public static final z22[] h;
    public final int a;
    public final int b;
    public final String c;

    static {
        z22 z22Var = new z22(0, 1, "L");
        d = z22Var;
        z22 z22Var2 = new z22(1, 0, "M");
        e = z22Var2;
        z22 z22Var3 = new z22(2, 3, "Q");
        f = z22Var3;
        z22 z22Var4 = new z22(3, 2, "H");
        g = z22Var4;
        h = new z22[]{z22Var2, z22Var, z22Var4, z22Var3};
    }

    public z22(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return this.c;
    }
}
