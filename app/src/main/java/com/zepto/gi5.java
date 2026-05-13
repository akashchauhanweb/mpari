package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class gi5 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;
    public final lx4 d;
    public final lx4 e;

    public gi5(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
        this.d = lx4Var4;
        this.e = lx4Var5;
    }

    public static gi5 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3, lx4 lx4Var4, lx4 lx4Var5) {
        return new gi5(lx4Var, lx4Var2, lx4Var3, lx4Var4, lx4Var5);
    }

    public static fi5 c(uq0 uq0Var, uq0 uq0Var2, Object obj, Object obj2, lx4 lx4Var) {
        return new fi5(uq0Var, uq0Var2, (e52) obj, (kp5) obj2, lx4Var);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fi5 get() {
        return c((uq0) this.a.get(), (uq0) this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
