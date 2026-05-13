package com.zepto;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jf2 {
    public static final void a(hv0 format, Bitmap.CompressFormat format2) {
        Intrinsics.checkParameterIsNotNull(format, "$this$format");
        Intrinsics.checkParameterIsNotNull(format2, "format");
        format.a(new if2(format2));
    }
}
