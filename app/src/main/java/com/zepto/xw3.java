package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xw3 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[dy2.values().length];
        a = iArr;
        dy2 dy2Var = dy2.ALL_MONTHS;
        iArr[dy2Var.ordinal()] = 1;
        dy2 dy2Var2 = dy2.FIRST_MONTH;
        iArr[dy2Var2.ordinal()] = 2;
        dy2 dy2Var3 = dy2.NONE;
        iArr[dy2Var3.ordinal()] = 3;
        int[] iArr2 = new int[dy2.values().length];
        b = iArr2;
        iArr2[dy2Var2.ordinal()] = 1;
        iArr2[dy2Var.ordinal()] = 2;
        iArr2[dy2Var3.ordinal()] = 3;
    }
}
