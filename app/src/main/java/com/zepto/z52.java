package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z52 implements q72 {

    public static final class a {
        public static final z52 a = new z52();
    }

    public static z52 a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) hu4.c(y52.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
