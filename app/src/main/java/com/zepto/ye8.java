package com.zepto;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ye8 extends af8 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ af8 h;

    public ye8(af8 af8Var, int i, int i2) {
        this.h = af8Var;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pe8.a(i, this.g, "index");
        return this.h.get(i + this.f);
    }

    @Override // com.zepto.ue8
    public final int m() {
        return this.h.n() + this.f + this.g;
    }

    @Override // com.zepto.ue8
    public final int n() {
        return this.h.n() + this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }

    @Override // com.zepto.af8, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.zepto.ue8
    public final boolean u() {
        return true;
    }

    @Override // com.zepto.ue8
    public final Object[] w() {
        return this.h.w();
    }

    @Override // com.zepto.af8
    /* JADX INFO: renamed from: z */
    public final af8 subList(int i, int i2) {
        pe8.c(i, i2, this.g);
        af8 af8Var = this.h;
        int i3 = this.f;
        return af8Var.subList(i + i3, i2 + i3);
    }
}
