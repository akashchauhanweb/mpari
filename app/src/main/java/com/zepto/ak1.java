package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ak1 {
    public static Map a = new HashMap();
    public static Map b = new HashMap();

    static {
        Map map = a;
        p0 p0Var = l14.c;
        map.put("SHA-256", p0Var);
        Map map2 = a;
        p0 p0Var2 = l14.e;
        map2.put("SHA-512", p0Var2);
        Map map3 = a;
        p0 p0Var3 = l14.m;
        map3.put("SHAKE128", p0Var3);
        Map map4 = a;
        p0 p0Var4 = l14.n;
        map4.put("SHAKE256", p0Var4);
        b.put(p0Var, "SHA-256");
        b.put(p0Var2, "SHA-512");
        b.put(p0Var3, "SHAKE128");
        b.put(p0Var4, "SHAKE256");
    }

    public static wj1 a(p0 p0Var) {
        if (p0Var.a0(l14.c)) {
            return new hg5();
        }
        if (p0Var.a0(l14.e)) {
            return new kg5();
        }
        if (p0Var.a0(l14.m)) {
            return new lg5(128);
        }
        if (p0Var.a0(l14.n)) {
            return new lg5(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + p0Var);
    }
}
