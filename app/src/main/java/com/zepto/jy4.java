package com.zepto;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum jy4 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    public static final SparseArray k;
    public final int c;

    static {
        jy4 jy4Var = DEFAULT;
        jy4 jy4Var2 = UNMETERED_ONLY;
        jy4 jy4Var3 = UNMETERED_OR_DAILY;
        jy4 jy4Var4 = FAST_IF_RADIO_AWAKE;
        jy4 jy4Var5 = NEVER;
        jy4 jy4Var6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        k = sparseArray;
        sparseArray.put(0, jy4Var);
        sparseArray.put(1, jy4Var2);
        sparseArray.put(2, jy4Var3);
        sparseArray.put(3, jy4Var4);
        sparseArray.put(4, jy4Var5);
        sparseArray.put(-1, jy4Var6);
    }

    jy4(int i) {
        this.c = i;
    }
}
