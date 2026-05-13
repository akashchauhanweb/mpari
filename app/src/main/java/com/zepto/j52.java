package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class j52 implements q72 {

    public static final class a {
        public static final j52 a = new j52();
    }

    public static j52 a() {
        return a.a;
    }

    public static e52 c() {
        return (e52) hu4.c(f52.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e52 get() {
        return c();
    }
}
