package com.zepto;

/* JADX INFO: loaded from: classes2.dex */
public final class m33 {
    public final o33 a;
    public final h40 b;
    public final h40 c;
    public final h40 d;
    public final h40 e;

    public m33(o33 o33Var, h40 h40Var, h40 h40Var2, h40 h40Var3, h40 h40Var4) {
        this.a = o33Var;
        this.b = h40Var;
        this.c = h40Var2;
        if (h40Var3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.d = h40Var3;
        this.e = h40Var4;
    }

    public h40 a() {
        return this.e;
    }

    public h40 b() {
        return this.d;
    }

    public h40 c() {
        return this.b;
    }

    public o33 d() {
        return this.a;
    }

    public h40 e() {
        return this.c;
    }
}
