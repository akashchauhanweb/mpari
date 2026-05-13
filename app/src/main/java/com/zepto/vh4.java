package com.zepto;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class vh4 implements Comparator {
    public static vh4 a(Comparator comparator) {
        return comparator instanceof vh4 ? (vh4) comparator : new xs0(comparator);
    }

    public vh4 b(wh2 wh2Var) {
        return new l80(wh2Var, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
