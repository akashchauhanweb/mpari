package com.zepto;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class te8 implements wc8 {
    public final wc8 a;
    public final wc8 b;
    public final wc8 c;
    public final wc8 d;
    public final wc8 e;
    public final wc8 f;
    public final wc8 g;

    public te8(wc8 wc8Var, wc8 wc8Var2, wc8 wc8Var3, wc8 wc8Var4, wc8 wc8Var5, wc8 wc8Var6, wc8 wc8Var7) {
        this.a = wc8Var;
        this.b = wc8Var2;
        this.c = wc8Var3;
        this.d = wc8Var4;
        this.e = wc8Var5;
        this.f = wc8Var6;
        this.g = wc8Var7;
    }

    @Override // com.zepto.wc8
    public final /* bridge */ /* synthetic */ Object a() {
        String str = (String) this.a.a();
        Object objA = this.b.a();
        Object objA2 = this.c.a();
        Context contextB = ((cm8) this.d).b();
        Object objA3 = this.e.a();
        return new re8(str != null ? new File(contextB.getExternalFilesDir(null), str) : contextB.getExternalFilesDir(null), (k98) objA, (mc8) objA2, contextB, (xf8) objA3, rc8.b(this.f), (vf8) this.g.a());
    }
}
