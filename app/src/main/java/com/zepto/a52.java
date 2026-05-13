package com.zepto;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a52 {
    public static final s96 a = new s96("REMOVED_TASK");
    public static final s96 b = new s96("CLOSED_EMPTY");

    public static final long c(long j) {
        if (j <= 0) {
            return 0L;
        }
        return j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j;
    }
}
