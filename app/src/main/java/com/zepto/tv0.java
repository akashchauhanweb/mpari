package com.zepto;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class tv0 extends ConcurrentHashMap implements i90 {
    @Override // com.zepto.i90
    public void a(Object obj, Object obj2) {
        put(obj, obj2);
    }

    @Override // com.zepto.i90
    public Object b(Object obj) {
        return get(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, com.zepto.i90
    public boolean contains(Object obj) {
        return containsKey(obj);
    }
}
