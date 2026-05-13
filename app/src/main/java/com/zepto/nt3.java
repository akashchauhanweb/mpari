package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nt3 implements q72 {
    public final lx4 a;
    public final lx4 b;

    public nt3(lx4 lx4Var, lx4 lx4Var2) {
        this.a = lx4Var;
        this.b = lx4Var2;
    }

    public static nt3 a(lx4 lx4Var, lx4 lx4Var2) {
        return new nt3(lx4Var, lx4Var2);
    }

    public static mt3 c(Context context, Object obj) {
        return new mt3(context, (f31) obj);
    }

    @Override // com.zepto.lx4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mt3 get() {
        return c((Context) this.a.get(), this.b.get());
    }
}
