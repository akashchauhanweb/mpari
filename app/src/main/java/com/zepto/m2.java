package com.zepto;

import com.zepto.x03;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2 extends AbstractList implements x03.d {
    public boolean c = true;

    @Override // com.zepto.x03.d
    public boolean X() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        j();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        j();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public void j() {
        if (!this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.zepto.x03.d
    public final void q() {
        this.c = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        j();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        j();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        j();
        return super.addAll(i, collection);
    }
}
