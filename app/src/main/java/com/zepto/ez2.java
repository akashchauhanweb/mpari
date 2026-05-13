package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class ez2 implements gt4 {
    public b52 a;

    public ez2(b52 b52Var) {
        this.a = b52Var;
    }

    public int a() {
        return this.a.L();
    }

    public String toString() {
        return String.format("line %s", Integer.valueOf(a()));
    }
}
