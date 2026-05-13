package com.zepto;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class df1 {
    public static final void a(hv0 hv0Var, int i, int i2, Bitmap.CompressFormat format, int i3) {
        Intrinsics.checkParameterIsNotNull(hv0Var, "$this$default");
        Intrinsics.checkParameterIsNotNull(format, "format");
        hv0Var.a(new cf1(i, i2, format, i3));
    }

    public static /* synthetic */ void b(hv0 hv0Var, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 612;
        }
        if ((i4 & 2) != 0) {
            i2 = 816;
        }
        if ((i4 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i4 & 8) != 0) {
            i3 = 80;
        }
        a(hv0Var, i, i2, compressFormat, i3);
    }
}
