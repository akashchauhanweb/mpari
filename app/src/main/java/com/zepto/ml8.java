package com.zepto;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ml8 implements wc8 {
    public final wc8 a;
    public final wc8 b;

    public ml8(wc8 wc8Var, wc8 wc8Var2) {
        this.a = wc8Var;
        this.b = wc8Var2;
    }

    @Override // com.zepto.wc8
    public final /* bridge */ /* synthetic */ Object a() {
        Object objA = this.a.a();
        Context contextB = ((cm8) this.b).b();
        yi8 yi8Var = (yi8) objA;
        mb8.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        mb8.a(contextB.getPackageManager(), new ComponentName(contextB.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        tc8.a(yi8Var);
        return yi8Var;
    }
}
