package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class cf8 extends af8 {
    public static final af8 h = new cf8(new Object[0], 0);
    public final transient Object[] f;
    public final transient int g;

    public cf8(Object[] objArr, int i) {
        this.f = objArr;
        this.g = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pe8.a(i, this.g, "index");
        Object obj = this.f[i];
        obj.getClass();
        return obj;
    }

    @Override // com.zepto.af8, com.zepto.ue8
    public final int j(Object[] objArr, int i) {
        System.arraycopy(this.f, 0, objArr, 0, this.g);
        return this.g;
    }

    @Override // com.zepto.ue8
    public final int m() {
        return this.g;
    }

    @Override // com.zepto.ue8
    public final int n() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    @Override // com.zepto.ue8
    public final boolean u() {
        return false;
    }

    @Override // com.zepto.ue8
    public final Object[] w() {
        return this.f;
    }
}
