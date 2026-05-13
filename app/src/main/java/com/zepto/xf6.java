package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class xf6 implements q72 {

    public static final class a {
        public static final xf6 a = new xf6();
    }

    public static xf6 a() {
        return a.a;
    }

    public static uq0 c() {
        return (uq0) hu4.c(vf6.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public uq0 get() {
        return c();
    }
}
