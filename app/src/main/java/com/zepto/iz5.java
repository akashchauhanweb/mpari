package com.zepto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iz5 implements Map {
    public final Map c = new HashMap();
    public final boolean e;

    public iz5(boolean z) {
        this.e = z;
    }

    public boolean a() {
        return this.e;
    }

    @Override // java.util.Map
    public void clear() {
        this.c.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.c.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.c.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.c.get(obj);
    }

    public Map getMap() {
        return this.c;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.c.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.c.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.c.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.c.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.c.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.c.values();
    }
}
