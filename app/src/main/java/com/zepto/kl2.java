package com.zepto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kl2 implements Serializable {
    public static final Map i = Collections.unmodifiableMap(new HashMap());
    public final Cdo c;
    public final String e;
    public final Set f;
    public final Map g;
    public final h40 h;

    public kl2(Cdo cdo, h33 h33Var, String str, Set set, Map map, h40 h40Var) {
        this.c = cdo;
        this.e = str;
        if (set != null) {
            this.f = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.f = null;
        }
        if (map != null) {
            this.g = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.g = i;
        }
        this.h = h40Var;
    }

    public Cdo a() {
        return this.c;
    }

    public Object b(String str) {
        return this.g.get(str);
    }

    public h40 c() {
        h40 h40Var = this.h;
        return h40Var == null ? h40.c(toString()) : h40Var;
    }

    public Map d() {
        Map mapA = j33.a();
        mapA.putAll(this.g);
        Cdo cdo = this.c;
        if (cdo != null) {
            mapA.put("alg", cdo.toString());
        }
        String str = this.e;
        if (str != null) {
            mapA.put("cty", str);
        }
        Set set = this.f;
        if (set != null && !set.isEmpty()) {
            mapA.put("crit", new ArrayList(this.f));
        }
        return mapA;
    }

    public String toString() {
        return j33.b(d());
    }
}
