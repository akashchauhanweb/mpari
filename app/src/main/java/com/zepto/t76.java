package com.zepto;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t76 extends IOException {
    public final y22 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t76(y22 errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.c = errorCode;
    }
}
