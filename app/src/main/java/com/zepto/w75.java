package com.zepto;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w75 extends ay2 {
    public static final ay2 h = new w75(new Object[0], 0);
    public final transient Object[] f;
    public final transient int g;

    public w75(Object[] objArr, int i) {
        this.f = objArr;
        this.g = i;
    }

    @Override // java.util.List
    public Object get(int i) {
        ju4.h(i, this.g);
        Object obj = this.f[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.zepto.ay2, com.zepto.zx2
    public int j(Object[] objArr, int i) {
        System.arraycopy(this.f, 0, objArr, i, this.g);
        return i + this.g;
    }

    @Override // com.zepto.zx2
    public Object[] m() {
        return this.f;
    }

    @Override // com.zepto.zx2
    public int n() {
        return this.g;
    }

    @Override // com.zepto.zx2
    public int r() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.g;
    }
}
