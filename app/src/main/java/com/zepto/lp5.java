package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class lp5 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;

    public lp5(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
    }

    public static lp5 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3) {
        return new lp5(lx4Var, lx4Var2, lx4Var3);
    }

    public static kp5 c(Context context, String str, int i) {
        return new kp5(context, str, i);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public kp5 get() {
        return c((Context) this.a.get(), (String) this.b.get(), ((Integer) this.c.get()).intValue());
    }
}
