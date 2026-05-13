package com.zepto;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class s66 {
    public static s66 a(long j, long j2, long j3) {
        return new l10(j, j2, j3);
    }

    public static s66 e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
