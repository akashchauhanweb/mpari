package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class y75 extends cy2 {
    public static final Object[] k;
    public static final y75 l;
    public final transient Object[] f;
    public final transient int g;
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    static {
        Object[] objArr = new Object[0];
        k = objArr;
        l = new y75(objArr, 0, objArr, 0, 0);
    }

    public y75(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f = objArr;
        this.g = i;
        this.h = objArr2;
        this.i = i2;
        this.j = i3;
    }

    @Override // com.zepto.cy2
    public ay2 P() {
        return ay2.w(this.f, this.j);
    }

    @Override // com.zepto.cy2
    public boolean T() {
        return true;
    }

    @Override // com.zepto.zx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.h;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = jl2.b(obj);
        while (true) {
            int i = iB & this.i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public yp6 iterator() {
        return z().iterator();
    }

    @Override // com.zepto.cy2, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.g;
    }

    @Override // com.zepto.zx2
    public int j(Object[] objArr, int i) {
        System.arraycopy(this.f, 0, objArr, i, this.j);
        return i + this.j;
    }

    @Override // com.zepto.zx2
    public Object[] m() {
        return this.f;
    }

    @Override // com.zepto.zx2
    public int n() {
        return this.j;
    }

    @Override // com.zepto.zx2
    public int r() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.j;
    }
}
