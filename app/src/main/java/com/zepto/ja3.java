package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ja3 {
    public static final ja3 e;
    public static final ja3 f;
    public static final ja3 g;
    public static final ja3 h;
    public static final ja3 i;
    public static Map j;
    public final int a;
    public final int b;
    public final int c;
    public final p0 d;

    public static class a extends HashMap {
        public a() {
            ja3 ja3Var = ja3.e;
            put(Integer.valueOf(ja3Var.a), ja3Var);
            ja3 ja3Var2 = ja3.f;
            put(Integer.valueOf(ja3Var2.a), ja3Var2);
            ja3 ja3Var3 = ja3.g;
            put(Integer.valueOf(ja3Var3.a), ja3Var3);
            ja3 ja3Var4 = ja3.h;
            put(Integer.valueOf(ja3Var4.a), ja3Var4);
            ja3 ja3Var5 = ja3.i;
            put(Integer.valueOf(ja3Var5.a), ja3Var5);
        }
    }

    static {
        p0 p0Var = l14.c;
        e = new ja3(5, 32, 5, p0Var);
        f = new ja3(6, 32, 10, p0Var);
        g = new ja3(7, 32, 15, p0Var);
        h = new ja3(8, 32, 20, p0Var);
        i = new ja3(9, 32, 25, p0Var);
        j = new a();
    }

    public ja3(int i2, int i3, int i4, p0 p0Var) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = p0Var;
    }

    public static ja3 e(int i2) {
        return (ja3) j.get(Integer.valueOf(i2));
    }

    public p0 b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public int f() {
        return this.a;
    }
}
