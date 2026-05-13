package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ag1 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;
    public final lx4 e;

    public ag1(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
        this.e = lx4Var5;
    }

    public static ag1 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        return new ag1(lx4Var, lx4Var2, lx4Var3, lx4Var4, lx4Var5);
    }

    public static zf1 c(Executor executor, s30 s30Var, vy7 vy7Var, d52 d52Var, w96 w96Var) {
        return new zf1(executor, s30Var, vy7Var, d52Var, w96Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zf1 get() {
        return c((Executor) this.a.get(), (s30) this.b.get(), (vy7) this.c.get(), (d52) this.d.get(), (w96) this.e.get());
    }
}
