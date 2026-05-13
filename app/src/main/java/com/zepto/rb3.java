package com.zepto;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class rb3 extends m2 implements sb3, RandomAccess {
    public static final rb3 f;
    public static final sb3 g;
    public final List e;

    static {
        rb3 rb3Var = new rb3();
        f = rb3Var;
        rb3Var.q();
        g = rb3Var;
    }

    public rb3() {
        this(10);
    }

    public static String n(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof s80 ? ((s80) obj).k0() : x03.i((byte[]) obj);
    }

    @Override // com.zepto.sb3
    public sb3 I() {
        return X() ? new zp6(this) : this;
    }

    @Override // com.zepto.sb3
    public Object N(int i) {
        return this.e.get(i);
    }

    @Override // com.zepto.sb3
    public List S() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // com.zepto.m2, com.zepto.x03.d
    public /* bridge */ /* synthetic */ boolean X() {
        return super.X();
    }

    @Override // com.zepto.m2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.zepto.sb3
    public void c0(s80 s80Var) {
        j();
        this.e.add(s80Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        j();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        j();
        this.e.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        Object obj = this.e.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof s80) {
            s80 s80Var = (s80) obj;
            String strK0 = s80Var.k0();
            if (s80Var.O()) {
                this.e.set(i, strK0);
            }
            return strK0;
        }
        byte[] bArr = (byte[]) obj;
        String strI = x03.i(bArr);
        if (x03.g(bArr)) {
            this.e.set(i, strI);
        }
        return strI;
    }

    @Override // com.zepto.m2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.zepto.m2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.e.size();
    }

    @Override // com.zepto.x03.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public rb3 t(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.e);
        return new rb3(arrayList);
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        j();
        Object objRemove = this.e.remove(i);
        ((AbstractList) this).modCount++;
        return n(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        j();
        return n(this.e.set(i, str));
    }

    public rb3(int i) {
        this(new ArrayList(i));
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        j();
        if (collection instanceof sb3) {
            collection = ((sb3) collection).S();
        }
        boolean zAddAll = this.e.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.zepto.m2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public rb3(ArrayList arrayList) {
        this.e = arrayList;
    }
}
