package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z43 extends f53 implements Iterable {
    public final ArrayList c = new ArrayList();

    public void D(f53 f53Var) {
        if (f53Var == null) {
            f53Var = k53.c;
        }
        this.c.add(f53Var);
    }

    public final f53 O() {
        int size = this.c.size();
        if (size == 1) {
            return (f53) this.c.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof z43) && ((z43) obj).c.equals(this.c));
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.c.iterator();
    }

    @Override // com.zepto.f53
    public String r() {
        return O().r();
    }
}
