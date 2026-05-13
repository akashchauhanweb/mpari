package com.zepto;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l98 implements wc8 {
    public final wc8 a;
    public final wc8 b;
    public final wc8 c;
    public final wc8 d;
    public final wc8 e;
    public final wc8 f;
    public final wc8 g;
    public final wc8 h;
    public final wc8 i;

    public l98(wc8 wc8Var, wc8 wc8Var2, wc8 wc8Var3, wc8 wc8Var4, wc8 wc8Var5, wc8 wc8Var6, wc8 wc8Var7, wc8 wc8Var8, wc8 wc8Var9) {
        this.a = wc8Var;
        this.b = wc8Var2;
        this.c = wc8Var3;
        this.d = wc8Var4;
        this.e = wc8Var5;
        this.f = wc8Var6;
        this.g = wc8Var7;
        this.h = wc8Var8;
        this.i = wc8Var9;
    }

    @Override // com.zepto.wc8
    public final /* bridge */ /* synthetic */ Object a() {
        Context contextB = ((cm8) this.a).b();
        Object objA = this.b.a();
        Object objA2 = this.c.a();
        lc8 lc8VarB = rc8.b(this.d);
        Object objA3 = this.e.a();
        return new k98(contextB, (be8) objA, (cc8) objA2, lc8VarB, (mc8) objA3, (la8) this.f.a(), rc8.b(this.g), rc8.b(this.h), (vf8) this.i.a());
    }
}
