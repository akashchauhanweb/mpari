package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class pj4 extends LinkedHashMap implements w94 {
    public final oj4 c;

    public pj4(oj4 oj4Var) {
        this.c = oj4Var;
    }

    @Override // com.zepto.w94, java.lang.Iterable
    public Iterator iterator() {
        return keySet().iterator();
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public oj4 get(String str) {
        return (oj4) super.get((Object) str);
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public oj4 K(String str, String str2) {
        jj4 jj4Var = new jj4(this.c, str, str2);
        if (this.c != null) {
            put(str, jj4Var);
        }
        return jj4Var;
    }

    @Override // com.zepto.w94
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public oj4 remove(String str) {
        return (oj4) super.remove((Object) str);
    }
}
