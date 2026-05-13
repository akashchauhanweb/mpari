package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class c36 extends cy2 {
    public final transient Object f;

    public c36(Object obj) {
        this.f = ju4.j(obj);
    }

    @Override // com.zepto.zx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public yp6 iterator() {
        return b33.b(this.f);
    }

    @Override // com.zepto.cy2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // com.zepto.zx2
    public int j(Object[] objArr, int i) {
        objArr[i] = this.f;
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
