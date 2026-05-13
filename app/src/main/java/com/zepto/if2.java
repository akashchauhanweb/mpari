package com.zepto;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class if2 implements xw0 {
    public final Bitmap.CompressFormat a;

    public if2(Bitmap.CompressFormat format) {
        Intrinsics.checkParameterIsNotNull(format, "format");
        this.a = format;
    }

    @Override // com.zepto.xw0
    public File a(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return it6.j(imageFile, it6.h(imageFile), this.a, 0, 8, null);
    }

    @Override // com.zepto.xw0
    public boolean b(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return this.a == it6.c(imageFile);
    }
}
