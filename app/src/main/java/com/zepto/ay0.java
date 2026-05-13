package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ay0 extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }
}
