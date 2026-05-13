package com.zepto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class af8 extends ue8 implements List, RandomAccess {
    public static final gf8 e = new we8(cf8.h, 0);

    public static af8 B(Object[] objArr, int i) {
        return i == 0 ? cf8.h : new cf8(objArr, i);
    }

    public static af8 D(Collection collection) {
        if (collection instanceof ue8) {
            af8 af8VarR = ((ue8) collection).r();
            if (!af8VarR.u()) {
                return af8VarR;
            }
            Object[] array = af8VarR.toArray();
            return B(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        return B(array2, length);
    }

    public static af8 O() {
        return cf8.h;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final gf8 listIterator(int i) {
        pe8.b(i, size(), "index");
        return isEmpty() ? e : new we8(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (oe8.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !oe8.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.zepto.ue8
    public int j(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.zepto.ue8
    public final af8 r() {
        return this;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public af8 subList(int i, int i2) {
        pe8.c(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? cf8.h : new ye8(this, i, i3);
    }
}
