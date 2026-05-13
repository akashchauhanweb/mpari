package com.zepto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i08 {
    public static final Map e;
    public final p08 a;
    public final q08 b;
    public final int c;
    public final int d;

    static {
        HashMap map = new HashMap();
        Integer numA = r03.a(1);
        p0 p0Var = l14.c;
        map.put(numA, new i08(20, 2, p0Var));
        map.put(r03.a(2), new i08(20, 4, p0Var));
        map.put(r03.a(3), new i08(40, 2, p0Var));
        map.put(r03.a(4), new i08(40, 4, p0Var));
        map.put(r03.a(5), new i08(40, 8, p0Var));
        map.put(r03.a(6), new i08(60, 3, p0Var));
        map.put(r03.a(7), new i08(60, 6, p0Var));
        map.put(r03.a(8), new i08(60, 12, p0Var));
        Integer numA2 = r03.a(9);
        p0 p0Var2 = l14.e;
        map.put(numA2, new i08(20, 2, p0Var2));
        map.put(r03.a(10), new i08(20, 4, p0Var2));
        map.put(r03.a(11), new i08(40, 2, p0Var2));
        map.put(r03.a(12), new i08(40, 4, p0Var2));
        map.put(r03.a(13), new i08(40, 8, p0Var2));
        map.put(r03.a(14), new i08(60, 3, p0Var2));
        map.put(r03.a(15), new i08(60, 6, p0Var2));
        map.put(r03.a(16), new i08(60, 12, p0Var2));
        Integer numA3 = r03.a(17);
        p0 p0Var3 = l14.m;
        map.put(numA3, new i08(20, 2, p0Var3));
        map.put(r03.a(18), new i08(20, 4, p0Var3));
        map.put(r03.a(19), new i08(40, 2, p0Var3));
        map.put(r03.a(20), new i08(40, 4, p0Var3));
        map.put(r03.a(21), new i08(40, 8, p0Var3));
        map.put(r03.a(22), new i08(60, 3, p0Var3));
        map.put(r03.a(23), new i08(60, 6, p0Var3));
        map.put(r03.a(24), new i08(60, 12, p0Var3));
        Integer numA4 = r03.a(25);
        p0 p0Var4 = l14.n;
        map.put(numA4, new i08(20, 2, p0Var4));
        map.put(r03.a(26), new i08(20, 4, p0Var4));
        map.put(r03.a(27), new i08(40, 2, p0Var4));
        map.put(r03.a(28), new i08(40, 4, p0Var4));
        map.put(r03.a(29), new i08(40, 8, p0Var4));
        map.put(r03.a(30), new i08(60, 3, p0Var4));
        map.put(r03.a(31), new i08(60, 6, p0Var4));
        map.put(r03.a(32), new i08(60, 12, p0Var4));
        e = Collections.unmodifiableMap(map);
    }

    public i08(int i, int i2, p0 p0Var) {
        this.c = i;
        this.d = i2;
        this.b = new q08(j(i, i2), p0Var);
        this.a = pg1.c(e(), f(), g(), c(), a(), i2);
    }

    public static i08 i(int i) {
        return (i08) e.get(r03.a(i));
    }

    public static int j(int i, int i2) {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 != 1) {
            return i3;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.b.d();
    }

    public p08 d() {
        return this.a;
    }

    public String e() {
        return this.b.f();
    }

    public int f() {
        return this.b.h();
    }

    public int g() {
        return this.b.j();
    }

    public q08 h() {
        return this.b;
    }

    public i08(int i, int i2, wj1 wj1Var) {
        this(i, i2, yj1.c(wj1Var.b()));
    }
}
