package com.zepto;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ly4 implements xw0 {
    public boolean a;
    public final int b;

    public ly4(int i) {
        this.b = i;
    }

    @Override // com.zepto.xw0
    public File a(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        File fileJ = it6.j(imageFile, it6.h(imageFile), null, this.b, 4, null);
        this.a = true;
        return fileJ;
    }

    @Override // com.zepto.xw0
    public boolean b(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return this.a;
    }
}
