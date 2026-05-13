package com.zepto;

import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o33 extends ls0 {
    public static final Set y;
    public final j22 p;
    public final iv0 q;
    public final h40 r;
    public final h40 s;
    public final h40 t;
    public final int u;
    public final h40 v;
    public final h40 w;
    public final String x;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        y = Collections.unmodifiableSet(hashSet);
    }

    public o33(l33 l33Var, j22 j22Var) {
        this(l33Var, j22Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null);
    }

    @Override // com.zepto.ls0, com.zepto.kl2
    public Map d() {
        Map mapD = super.d();
        j22 j22Var = this.p;
        if (j22Var != null) {
            mapD.put("enc", j22Var.toString());
        }
        iv0 iv0Var = this.q;
        if (iv0Var != null) {
            mapD.put("zip", iv0Var.toString());
        }
        h40 h40Var = this.r;
        if (h40Var != null) {
            mapD.put("apu", h40Var.toString());
        }
        h40 h40Var2 = this.s;
        if (h40Var2 != null) {
            mapD.put("apv", h40Var2.toString());
        }
        h40 h40Var3 = this.t;
        if (h40Var3 != null) {
            mapD.put("p2s", h40Var3.toString());
        }
        int i = this.u;
        if (i > 0) {
            mapD.put("p2c", Integer.valueOf(i));
        }
        h40 h40Var4 = this.v;
        if (h40Var4 != null) {
            mapD.put("iv", h40Var4.toString());
        }
        h40 h40Var5 = this.w;
        if (h40Var5 != null) {
            mapD.put("tag", h40Var5.toString());
        }
        String str = this.x;
        if (str != null) {
            mapD.put("skid", str);
        }
        return mapD;
    }

    public l33 e() {
        return (l33) super.a();
    }

    public iv0 f() {
        return this.q;
    }

    public j22 g() {
        return this.p;
    }

    public o33(Cdo cdo, j22 j22Var, h33 h33Var, String str, Set set, URI uri, t33 t33Var, URI uri2, h40 h40Var, h40 h40Var2, List list, String str2, t33 t33Var2, iv0 iv0Var, h40 h40Var3, h40 h40Var4, h40 h40Var5, int i, h40 h40Var6, h40 h40Var7, String str3, Map map, h40 h40Var8) {
        super(cdo, h33Var, str, set, uri, t33Var, uri2, h40Var, h40Var2, list, str2, map, h40Var8);
        if (cdo != null && cdo.a().equals(Cdo.f.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (j22Var == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        this.p = j22Var;
        this.q = iv0Var;
        this.r = h40Var3;
        this.s = h40Var4;
        this.t = h40Var5;
        this.u = i;
        this.v = h40Var6;
        this.w = h40Var7;
        this.x = str3;
    }
}
