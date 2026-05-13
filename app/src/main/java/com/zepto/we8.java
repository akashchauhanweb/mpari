package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class we8 extends se8 {
    public final af8 f;

    public we8(af8 af8Var, int i) {
        super(af8Var.size(), i);
        this.f = af8Var;
    }

    @Override // com.zepto.se8
    public final Object a(int i) {
        return this.f.get(i);
    }
}
