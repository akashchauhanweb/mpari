package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fy7 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;

    public fy7(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
    }

    public static fy7 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4) {
        return new fy7(lx4Var, lx4Var2, lx4Var3, lx4Var4);
    }

    public static ey7 c(Executor executor, d52 d52Var, vy7 vy7Var, w96 w96Var) {
        return new ey7(executor, d52Var, vy7Var, w96Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ey7 get() {
        return c((Executor) this.a.get(), (d52) this.b.get(), (vy7) this.c.get(), (w96) this.d.get());
    }
}
