package com.zepto;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class xp6 extends sz0 {
    public static final xp6 e = new xp6();

    @Override // com.zepto.sz0
    public sz0 A0(int i) {
        kf3.a(i);
        return i >= hd6.d ? this : super.A0(i);
    }

    @Override // com.zepto.sz0
    public void x0(CoroutineContext coroutineContext, Runnable runnable) {
        yf1.k.C0(runnable, hd6.h, false);
    }

    @Override // com.zepto.sz0
    public void y0(CoroutineContext coroutineContext, Runnable runnable) {
        yf1.k.C0(runnable, hd6.h, true);
    }
}
