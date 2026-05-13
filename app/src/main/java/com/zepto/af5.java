package com.zepto;

import com.zepto.ze5;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class af5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ze5.a.values().length];
        a = iArr;
        iArr[ze5.a.ALL.ordinal()] = 1;
        iArr[ze5.a.TOP_LEFT.ordinal()] = 2;
        iArr[ze5.a.TOP_RIGHT.ordinal()] = 3;
        iArr[ze5.a.BOTTOM_LEFT.ordinal()] = 4;
        iArr[ze5.a.BOTTOM_RIGHT.ordinal()] = 5;
        iArr[ze5.a.TOP.ordinal()] = 6;
        iArr[ze5.a.BOTTOM.ordinal()] = 7;
        iArr[ze5.a.LEFT.ordinal()] = 8;
        iArr[ze5.a.RIGHT.ordinal()] = 9;
        iArr[ze5.a.OTHER_TOP_LEFT.ordinal()] = 10;
        iArr[ze5.a.OTHER_TOP_RIGHT.ordinal()] = 11;
        iArr[ze5.a.OTHER_BOTTOM_LEFT.ordinal()] = 12;
        iArr[ze5.a.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
        iArr[ze5.a.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
        iArr[ze5.a.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
    }
}
