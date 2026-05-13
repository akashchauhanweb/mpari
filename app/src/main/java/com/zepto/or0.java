package com.zepto;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class or0 {

    public static class a extends AbstractCollection {
        public final Collection c;
        public final wh2 e;

        public a(Collection collection, wh2 wh2Var) {
            this.c = (Collection) ju4.j(collection);
            this.e = (wh2) ju4.j(wh2Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.c.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return b33.c(this.c.iterator(), this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.c.size();
        }
    }

    public static StringBuilder a(int i) {
        lr0.b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static Collection b(Collection collection, wh2 wh2Var) {
        return new a(collection, wh2Var);
    }
}
