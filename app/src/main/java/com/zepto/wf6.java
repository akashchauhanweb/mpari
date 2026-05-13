package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class wf6 implements q72 {

    public static final class a {
        public static final wf6 a = new wf6();
    }

    public static wf6 a() {
        return a.a;
    }

    public static uq0 b() {
        return (uq0) hu4.c(vf6.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public uq0 get() {
        return b();
    }
}
