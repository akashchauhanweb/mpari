package com.zepto;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class if3 extends LinkedHashMap implements i90 {
    public final int c;

    public if3() {
        this(50000);
    }

    @Override // com.zepto.i90
    public void a(Object obj, Object obj2) {
        put(obj, obj2);
    }

    @Override // com.zepto.i90
    public Object b(Object obj) {
        return get(obj);
    }

    @Override // com.zepto.i90
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.c;
    }

    public if3(int i) {
        this.c = i;
    }
}
