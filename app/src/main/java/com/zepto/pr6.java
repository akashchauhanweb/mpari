package com.zepto;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pr6 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;
    public final lx4 e;
    public final lx4 f;
    public final lx4 g;
    public final lx4 h;
    public final lx4 i;

    public pr6(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5, lx4 lx4Var6, lx4 lx4Var7, lx4 lx4Var8, lx4 lx4Var9) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
        this.e = lx4Var5;
        this.f = lx4Var6;
        this.g = lx4Var7;
        this.h = lx4Var8;
        this.i = lx4Var9;
    }

    public static pr6 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5, lx4 lx4Var6, lx4 lx4Var7, lx4 lx4Var8, lx4 lx4Var9) {
        return new pr6(lx4Var, lx4Var2, lx4Var3, lx4Var4, lx4Var5, lx4Var6, lx4Var7, lx4Var8, lx4Var9);
    }

    public static or6 c(Context context, s30 s30Var, d52 d52Var, vy7 vy7Var, Executor executor, w96 w96Var, uq0 uq0Var, uq0 uq0Var2, oq0 oq0Var) {
        return new or6(context, s30Var, d52Var, vy7Var, executor, w96Var, uq0Var, uq0Var2, oq0Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public or6 get() {
        return c((Context) this.a.get(), (s30) this.b.get(), (d52) this.c.get(), (vy7) this.d.get(), (Executor) this.e.get(), (w96) this.f.get(), (uq0) this.g.get(), (uq0) this.h.get(), (oq0) this.i.get());
    }
}
