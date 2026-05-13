package com.zepto;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class bf1 implements vq0 {
    public static final bf1 a = new bf1();

    public static vq0 b() {
        return a;
    }

    @Override // com.zepto.vq0
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
