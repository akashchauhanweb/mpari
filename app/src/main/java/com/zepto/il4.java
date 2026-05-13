package com.zepto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class il4 extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }

    public List r() {
        Collection<V> collectionValues = values();
        return !collectionValues.isEmpty() ? new ArrayList(collectionValues) : Collections.emptyList();
    }
}
