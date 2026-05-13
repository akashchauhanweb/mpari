package com.zepto;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn6 implements Iterator {
    public final Iterator c;

    public bn6(Iterator it) {
        this.c = (Iterator) ju4.j(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.c.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
    }
}
