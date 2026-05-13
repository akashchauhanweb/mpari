package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class zn6 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;
    public final lx4 e;

    public zn6(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
        this.e = lx4Var5;
    }

    public static zn6 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        return new zn6(lx4Var, lx4Var2, lx4Var3, lx4Var4, lx4Var5);
    }

    public static xn6 c(uq0 uq0Var, uq0 uq0Var2, qo5 qo5Var, or6 or6Var, ey7 ey7Var) {
        return new xn6(uq0Var, uq0Var2, qo5Var, or6Var, ey7Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public xn6 get() {
        return c((uq0) this.a.get(), (uq0) this.b.get(), (qo5) this.c.get(), (or6) this.d.get(), (ey7) this.e.get());
    }
}
