package com.zepto;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qa3 extends LinkedHashMap implements Iterable {
    public final ps4 c;

    public qa3() {
        this(null);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return values().iterator();
    }

    public ma3 r(String str) {
        return (ma3) remove(str);
    }

    public qa3 u() {
        qa3 qa3Var = new qa3(this.c);
        Iterator it = iterator();
        while (it.hasNext()) {
            ma3 ma3Var = (ma3) it.next();
            if (ma3Var != null) {
                qa3Var.put(ma3Var.b(), ma3Var);
            }
        }
        return qa3Var;
    }

    public boolean z(wy0 wy0Var) {
        return this.c == null ? wy0Var.a() : wy0Var.a() && this.c.a();
    }

    public qa3(ps4 ps4Var) {
        this.c = ps4Var;
    }
}
