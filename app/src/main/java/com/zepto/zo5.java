package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class zo5 implements q72 {
    public final lx4 a;

    public zo5(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static so5 a(uq0 uq0Var) {
        return (so5) hu4.c(yo5.a(uq0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static zo5 b(lx4 lx4Var) {
        return new zo5(lx4Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public so5 get() {
        return a((uq0) this.a.get());
    }
}
