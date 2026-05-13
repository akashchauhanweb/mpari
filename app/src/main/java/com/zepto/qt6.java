package com.zepto;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qt6 {
    public static final eo a;
    public static final eo b;
    public static final eo c;
    public static final eo d;
    public static final eo e;
    public static final eo f;
    public static final eo g;
    public static final eo h;
    public static final Map i;

    static {
        p0 p0Var = hk4.X;
        a = new eo(p0Var);
        p0 p0Var2 = hk4.Y;
        b = new eo(p0Var2);
        c = new eo(l14.j);
        d = new eo(l14.h);
        e = new eo(l14.c);
        f = new eo(l14.e);
        g = new eo(l14.m);
        h = new eo(l14.n);
        HashMap map = new HashMap();
        i = map;
        map.put(p0Var, r03.a(5));
        map.put(p0Var2, r03.a(6));
    }

    public static eo a(String str) {
        if (str.equals("SHA-1")) {
            return new eo(oe4.i, x41.e);
        }
        if (str.equals("SHA-224")) {
            return new eo(l14.f);
        }
        if (str.equals("SHA-256")) {
            return new eo(l14.c);
        }
        if (str.equals("SHA-384")) {
            return new eo(l14.d);
        }
        if (str.equals("SHA-512")) {
            return new eo(l14.e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    public static wj1 b(p0 p0Var) {
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

    public static String c(p0 p0Var) {
        if (p0Var.a0(oe4.i)) {
            return "SHA-1";
        }
        if (p0Var.a0(l14.f)) {
            return "SHA-224";
        }
        if (p0Var.a0(l14.c)) {
            return "SHA-256";
        }
        if (p0Var.a0(l14.d)) {
            return "SHA-384";
        }
        if (p0Var.a0(l14.e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + p0Var);
    }

    public static eo d(int i2) {
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return b;
        }
        throw new IllegalArgumentException("unknown security category: " + i2);
    }

    public static int e(eo eoVar) {
        return ((Integer) i.get(eoVar.z())).intValue();
    }

    public static eo f(String str) {
        if (str.equals("SHA3-256")) {
            return c;
        }
        if (str.equals("SHA-512/256")) {
            return d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    public static String g(ng5 ng5Var) {
        eo eoVarB = ng5Var.B();
        if (eoVarB.z().a0(c.z())) {
            return "SHA3-256";
        }
        if (eoVarB.z().a0(d.z())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + eoVarB.z());
    }

    public static eo h(String str) {
        if (str.equals("SHA-256")) {
            return e;
        }
        if (str.equals("SHA-512")) {
            return f;
        }
        if (str.equals("SHAKE128")) {
            return g;
        }
        if (str.equals("SHAKE256")) {
            return h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
