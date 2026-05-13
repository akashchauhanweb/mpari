package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class pr0 implements k31 {
    public final b c;
    public final b e;

    public static class b extends LinkedHashMap {
        public b() {
        }

        public Iterator a() {
            return keySet().iterator();
        }
    }

    public pr0() {
        this.c = new b();
        this.e = new b();
    }

    @Override // com.zepto.k31
    public void Y(ma3 ma3Var, Object obj) {
        mm7 mm7Var = new mm7(ma3Var, obj);
        if (ma3Var != null) {
            String[] strArrK = ma3Var.k();
            Object key = ma3Var.getKey();
            for (String str : strArrK) {
                this.e.put(str, mm7Var);
            }
            this.c.put(key, mm7Var);
        }
    }

    @Override // com.zepto.k31
    public void b0(Object obj) {
        for (V v : this.c.values()) {
            v.o().set(obj, v.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.k31
    public mm7 get(Object obj) {
        return (mm7) this.c.get(obj);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.k31
    public mm7 l(ma3 ma3Var) {
        if (ma3Var == null) {
            return null;
        }
        return (mm7) this.c.get(ma3Var.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.k31
    public mm7 o(String str) {
        return (mm7) this.e.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zepto.k31
    public mm7 remove(Object obj) {
        return (mm7) this.c.remove(obj);
    }
}
