package com.zepto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q08 {
    public static final Map i;
    public final p08 a;
    public final int b;
    public final int c;
    public final p0 d;
    public final int e;
    public final String f;
    public final int g;
    public final hu7 h;

    static {
        HashMap map = new HashMap();
        Integer numA = r03.a(1);
        p0 p0Var = l14.c;
        map.put(numA, new q08(10, p0Var));
        map.put(r03.a(2), new q08(16, p0Var));
        map.put(r03.a(3), new q08(20, p0Var));
        Integer numA2 = r03.a(4);
        p0 p0Var2 = l14.e;
        map.put(numA2, new q08(10, p0Var2));
        map.put(r03.a(5), new q08(16, p0Var2));
        map.put(r03.a(6), new q08(20, p0Var2));
        Integer numA3 = r03.a(7);
        p0 p0Var3 = l14.m;
        map.put(numA3, new q08(10, p0Var3));
        map.put(r03.a(8), new q08(16, p0Var3));
        map.put(r03.a(9), new q08(20, p0Var3));
        Integer numA4 = r03.a(10);
        p0 p0Var4 = l14.n;
        map.put(numA4, new q08(10, p0Var4));
        map.put(r03.a(11), new q08(16, p0Var4));
        map.put(r03.a(12), new q08(20, p0Var4));
        i = Collections.unmodifiableMap(map);
    }

    public q08(int i2, p0 p0Var) {
        if (i2 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (p0Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = i2;
        this.c = a();
        String strB = yj1.b(p0Var);
        this.f = strB;
        this.d = p0Var;
        hu7 hu7Var = new hu7(p0Var);
        this.h = hu7Var;
        int iC = hu7Var.c();
        this.g = iC;
        int iD = hu7Var.d();
        this.e = iD;
        this.a = qg1.c(strB, iC, iD, hu7Var.a(), i2);
    }

    public static q08 k(int i2) {
        return (q08) i.get(r03.a(i2));
    }

    public final int a() {
        int i2 = 2;
        while (true) {
            int i3 = this.b;
            if (i2 > i3) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i3 - i2) % 2 == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.h.a();
    }

    public p08 e() {
        return this.a;
    }

    public String f() {
        return this.f;
    }

    public p0 g() {
        return this.d;
    }

    public int h() {
        return this.g;
    }

    public fu7 i() {
        return new fu7(this.h);
    }

    public int j() {
        return this.e;
    }

    public q08(int i2, wj1 wj1Var) {
        this(i2, yj1.c(wj1Var.b()));
    }
}
