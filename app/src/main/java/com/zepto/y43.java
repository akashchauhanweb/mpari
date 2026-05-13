package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class y43 extends e53 implements Iterable {
    public final ArrayList c = new ArrayList();

    public void B(e53 e53Var) {
        if (e53Var == null) {
            e53Var = j53.c;
        }
        this.c.add(e53Var);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof y43) && ((y43) obj).c.equals(this.c));
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.iterator();
    }
}
