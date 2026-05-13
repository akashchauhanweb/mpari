package com.zepto;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hd6 {
    public static final String a = la6.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = na6.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    public static final int c = na6.e("kotlinx.coroutines.scheduler.core.pool.size", RangesKt___RangesKt.coerceAtLeast(la6.a(), 2), 1, 0, 8, null);
    public static final int d = na6.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
    public static final long e = TimeUnit.SECONDS.toNanos(na6.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    public static uo5 f = r14.a;
    public static final sc6 g = new tc6(0);
    public static final sc6 h = new tc6(1);
}
