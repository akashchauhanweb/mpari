package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bp5 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;

    public bp5(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
    }

    public static bp5 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4) {
        return new bp5(lx4Var, lx4Var2, lx4Var3, lx4Var4);
    }

    public static vy7 c(Context context, d52 d52Var, so5 so5Var, uq0 uq0Var) {
        return (vy7) hu4.c(ap5.a(context, d52Var, so5Var, uq0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vy7 get() {
        return c((Context) this.a.get(), (d52) this.b.get(), (so5) this.c.get(), (uq0) this.d.get());
    }
}
