package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class b72 extends p40 {
    public int o;

    public b72(int i, float f, float f2, float f3) {
        super(h(f), h(f2), h(f3));
        this.o = i;
    }

    public static int g(p40 p40Var) {
        if (p40Var instanceof b72) {
            return ((b72) p40Var).f();
        }
        return 0;
    }

    public static final float h(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public int f() {
        return this.o;
    }
}
