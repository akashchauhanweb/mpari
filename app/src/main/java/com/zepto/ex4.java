package com.zepto;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ex4 extends m2 implements RandomAccess {
    public static final ex4 g;
    public Object[] e;
    public int f;

    static {
        ex4 ex4Var = new ex4(new Object[0], 0);
        g = ex4Var;
        ex4Var.q();
    }

    public ex4(Object[] objArr, int i) {
        this.e = objArr;
        this.f = i;
    }

    public static Object[] m(int i) {
        return new Object[i];
    }

    public static ex4 n() {
        return g;
    }

    private void r(int i) {
        if (i < 0 || i >= this.f) {
            throw new IndexOutOfBoundsException(u(i));
        }
    }

    private String u(int i) {
        return "Index:" + i + ", Size:" + this.f;
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        j();
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            this.e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        r(i);
        return this.e[i];
    }

    @Override // com.zepto.m2, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        j();
        r(i);
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (i < this.f - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        j();
        r(i);
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f;
    }

    @Override // com.zepto.x03.d
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ex4 t(int i) {
        if (i >= this.f) {
            return new ex4(Arrays.copyOf(this.e, i), this.f);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        j();
        if (i >= 0 && i <= (i2 = this.f)) {
            Object[] objArr = this.e;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArrM = m(((i2 * 3) / 2) + 1);
                System.arraycopy(this.e, 0, objArrM, 0, i);
                System.arraycopy(this.e, i, objArrM, i + 1, this.f - i);
                this.e = objArrM;
            }
            this.e[i] = obj;
            this.f++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(u(i));
    }
}
