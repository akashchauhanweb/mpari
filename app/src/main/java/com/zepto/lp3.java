package com.zepto;

import com.zepto.x03;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lp3 extends LinkedHashMap {
    public static final lp3 e;
    public boolean c;

    static {
        lp3 lp3Var = new lp3();
        e = lp3Var;
        lp3Var.i();
    }

    public lp3() {
        this.c = true;
    }

    public static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return x03.d((byte[]) obj);
        }
        if (obj instanceof x03.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void c(Map map) {
        for (Object obj : map.keySet()) {
            x03.a(obj);
            x03.a(map.get(obj));
        }
    }

    public static lp3 d() {
        return e;
    }

    public static boolean f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!h()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && g(this, (Map) obj);
    }

    public boolean h() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public void i() {
        this.c = false;
    }

    public void k(lp3 lp3Var) {
        e();
        if (lp3Var.isEmpty()) {
            return;
        }
        putAll(lp3Var);
    }

    public lp3 l() {
        return isEmpty() ? new lp3() : new lp3(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        e();
        x03.a(obj);
        x03.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    public lp3(Map map) {
        super(map);
        this.c = true;
    }
}
