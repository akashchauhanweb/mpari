package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class g52 implements q72 {

    public static final class a {
        public static final g52 a = new g52();
    }

    public static g52 a() {
        return a.a;
    }

    public static String b() {
        return (String) hu4.c(f52.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
