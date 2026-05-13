package com.zepto;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class nx extends w26 implements Map {
    public jp3 k;

    public class a extends jp3 {
        public a() {
        }

        @Override // com.zepto.jp3
        public void a() {
            nx.this.clear();
        }

        @Override // com.zepto.jp3
        public Object b(int i, int i2) {
            return nx.this.e[(i << 1) + i2];
        }

        @Override // com.zepto.jp3
        public Map c() {
            return nx.this;
        }

        @Override // com.zepto.jp3
        public int d() {
            return nx.this.f;
        }

        @Override // com.zepto.jp3
        public int e(Object obj) {
            return nx.this.f(obj);
        }

        @Override // com.zepto.jp3
        public int f(Object obj) {
            return nx.this.h(obj);
        }

        @Override // com.zepto.jp3
        public void g(Object obj, Object obj2) {
            nx.this.put(obj, obj2);
        }

        @Override // com.zepto.jp3
        public void h(int i) {
            nx.this.k(i);
        }

        @Override // com.zepto.jp3
        public Object i(int i, Object obj) {
            return nx.this.l(i, obj);
        }
    }

    public nx() {
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public final jp3 n() {
        if (this.k == null) {
            this.k = new a();
        }
        return this.k;
    }

    public boolean o(Collection collection) {
        return jp3.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public nx(int i) {
        super(i);
    }

    public nx(w26 w26Var) {
        super(w26Var);
    }
}
