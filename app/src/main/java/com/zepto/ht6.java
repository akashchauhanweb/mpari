package com.zepto;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ht6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        a = iArr;
        iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
        iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
    }
}
