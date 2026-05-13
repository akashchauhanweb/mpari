package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class d03 implements q72 {
    public static final d03 b = new d03(null);
    public final Object a;

    public d03(Object obj) {
        this.a = obj;
    }

    public static q72 a(Object obj) {
        return new d03(hu4.c(obj, "instance cannot be null"));
    }

    @Override // com.zepto.lx4
    public Object get() {
        return this.a;
    }
}
