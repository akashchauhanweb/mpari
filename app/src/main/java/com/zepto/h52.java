package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h52 implements q72 {
    public final lx4 a;

    public h52(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static h52 a(lx4 lx4Var) {
        return new h52(lx4Var);
    }

    public static String c(Context context) {
        return (String) hu4.c(f52.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.a.get());
    }
}
