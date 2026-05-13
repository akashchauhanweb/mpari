package com.zepto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class ay2 extends zx2 implements List, RandomAccess {
    public static final aq6 e = new a(w75.h, 0);

    public static class a extends i2 {
        public final ay2 f;

        public a(ay2 ay2Var, int i) {
            super(ay2Var.size(), i);
            this.f = ay2Var;
        }

        @Override // com.zepto.i2
        public Object a(int i) {
            return this.f.get(i);
        }
    }

    public class b extends ay2 {
        public final transient int f;
        public final transient int g;

        public b(int i, int i2) {
            this.f = i;
            this.g = i2;
        }

        @Override // com.zepto.ay2, java.util.List
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public ay2 subList(int i, int i2) {
            ju4.m(i, i2, this.g);
            ay2 ay2Var = ay2.this;
            int i3 = this.f;
            return ay2Var.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public Object get(int i) {
            ju4.h(i, this.g);
            return ay2.this.get(i + this.f);
        }

        @Override // com.zepto.ay2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.zepto.ay2, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.zepto.zx2
        public Object[] m() {
            return ay2.this.m();
        }

        @Override // com.zepto.zx2
        public int n() {
            return ay2.this.r() + this.f + this.g;
        }

        @Override // com.zepto.zx2
        public int r() {
            return ay2.this.r() + this.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.g;
        }

        @Override // com.zepto.ay2, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static ay2 O() {
        return w75.h;
    }

    public static ay2 u(Object[] objArr) {
        return w(objArr, objArr.length);
    }

    public static ay2 w(Object[] objArr, int i) {
        return i == 0 ? O() : new w75(objArr, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public aq6 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public aq6 listIterator(int i) {
        ju4.k(i, size());
        return isEmpty() ? e : new a(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: P */
    public ay2 subList(int i, int i2) {
        ju4.m(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? O() : T(i, i2);
    }

    public ay2 T(int i, int i2) {
        return new b(i, i2 - i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.zepto.zx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return bg3.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return bg3.b(this, obj);
    }

    @Override // com.zepto.zx2
    public int j(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return bg3.d(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public yp6 iterator() {
        return listIterator();
    }
}
