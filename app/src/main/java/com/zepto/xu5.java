package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xu5 {
    public static Object a(Object obj) {
        return obj;
    }

    public static final wu5 b(Object obj) {
        if (obj == vv0.a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (wu5) obj;
    }

    public static final boolean c(Object obj) {
        return obj == vv0.a;
    }
}
