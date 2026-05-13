package com.zepto;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cf1 implements xw0 {
    public boolean a;
    public final int b;
    public final int c;
    public final Bitmap.CompressFormat d;
    public final int e;

    public cf1(int i, int i2, Bitmap.CompressFormat format, int i3) {
        Intrinsics.checkParameterIsNotNull(format, "format");
        this.b = i;
        this.c = i2;
        this.d = format;
        this.e = i3;
    }

    @Override // com.zepto.xw0
    public File a(File imageFile) throws Throwable {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        File fileI = it6.i(imageFile, it6.f(imageFile, it6.e(imageFile, this.b, this.c)), this.d, this.e);
        this.a = true;
        return fileI;
    }

    @Override // com.zepto.xw0
    public boolean b(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return this.a;
    }
}
