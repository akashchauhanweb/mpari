package com.zepto;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class uf1 implements lf5 {
    public final Handler a = bl2.a(Looper.getMainLooper());

    @Override // com.zepto.lf5
    public void a(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }

    @Override // com.zepto.lf5
    public void b(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}
