package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class rj4 extends ArrayList {
    public final Set c;

    public class a implements Iterator {
        public int c;

        public a() {
            this.c = rj4.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public oj4 next() {
            if (!hasNext()) {
                return null;
            }
            rj4 rj4Var = rj4.this;
            int i = this.c - 1;
            this.c = i;
            return (oj4) rj4Var.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            rj4.this.z(this.c);
        }
    }

    public rj4(Set set) {
        this.c = set;
    }

    public oj4 O(oj4 oj4Var) {
        this.c.add(oj4Var);
        add(oj4Var);
        return oj4Var;
    }

    public oj4 T() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return (oj4) get(size - 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public oj4 r() {
        if (size() <= 0) {
            return null;
        }
        return (oj4) get(0);
    }

    public oj4 u() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return z(size - 1);
    }

    public oj4 z(int i) {
        oj4 oj4Var = (oj4) remove(i);
        if (oj4Var != null) {
            this.c.remove(oj4Var);
        }
        return oj4Var;
    }
}
