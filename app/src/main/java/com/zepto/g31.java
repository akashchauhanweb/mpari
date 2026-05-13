package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class g31 implements q72 {
    public final lx4 a;
    public final lx4 b;
    public final lx4 c;

    public g31(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3) {
        this.a = lx4Var;
        this.b = lx4Var2;
        this.c = lx4Var3;
    }

    public static g31 a(lx4 lx4Var, lx4 lx4Var2, lx4 lx4Var3) {
        return new g31(lx4Var, lx4Var2, lx4Var3);
    }

    public static f31 c(Context context, uq0 uq0Var, uq0 uq0Var2) {
        return new f31(context, uq0Var, uq0Var2);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f31 get() {
        return c((Context) this.a.get(), (uq0) this.b.get(), (uq0) this.c.get());
    }
}
