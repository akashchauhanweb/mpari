package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class qx7 {
    public static final String a;
    public static final String[] b;

    static {
        String strI = rn3.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WrkDbPathHelper\")");
        a = strI;
        b = new String[]{"-journal", "-shm", "-wal"};
    }
}
