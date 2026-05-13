package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ca3 {
    public static final ca3 h;
    public static final ca3 i;
    public static final ca3 j;
    public static final ca3 k;
    public static final Map l;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final p0 g;

    public static class a extends HashMap {
        public a() {
            ca3 ca3Var = ca3.h;
            put(Integer.valueOf(ca3Var.a), ca3Var);
            ca3 ca3Var2 = ca3.i;
            put(Integer.valueOf(ca3Var2.a), ca3Var2);
            ca3 ca3Var3 = ca3.j;
            put(Integer.valueOf(ca3Var3.a), ca3Var3);
            ca3 ca3Var4 = ca3.k;
            put(Integer.valueOf(ca3Var4.a), ca3Var4);
        }
    }

    static {
        p0 p0Var = l14.c;
        h = new ca3(1, 32, 1, 265, 7, 8516, p0Var);
        i = new ca3(2, 32, 2, 133, 6, 4292, p0Var);
        j = new ca3(3, 32, 4, 67, 4, 2180, p0Var);
        k = new ca3(4, 32, 8, 34, 0, 1124, p0Var);
        l = new a();
    }

    public ca3(int i2, int i3, int i4, int i5, int i6, int i7, p0 p0Var) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = p0Var;
    }

    public static ca3 e(int i2) {
        return (ca3) l.get(Integer.valueOf(i2));
    }

    public p0 b() {
        return this.g;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }
}
