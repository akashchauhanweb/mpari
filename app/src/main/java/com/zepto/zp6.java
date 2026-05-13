package com.zepto;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class zp6 extends AbstractList implements sb3, RandomAccess {
    public final sb3 c;

    public class a implements ListIterator {
        public ListIterator c;
        public final /* synthetic */ int e;

        public a(int i) {
            this.e = i;
            this.c = zp6.this.c.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.c.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.c.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.c.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.c.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.c.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.c.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {
        public Iterator c;

        public b() {
            this.c = zp6.this.c.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.c.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zp6(sb3 sb3Var) {
        this.c = sb3Var;
    }

    @Override // com.zepto.sb3
    public sb3 I() {
        return this;
    }

    @Override // com.zepto.sb3
    public Object N(int i) {
        return this.c.N(i);
    }

    @Override // com.zepto.sb3
    public List S() {
        return this.c.S();
    }

    @Override // com.zepto.sb3
    public void c0(s80 s80Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.c.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c.size();
    }
}
