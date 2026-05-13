package com.zepto;

import java.io.IOException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class df5 extends RuntimeException {
    public IOException c;
    public final IOException e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df5(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.e = firstConnectException;
        this.c = firstConnectException;
    }

    public final void a(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ExceptionsKt__ExceptionsKt.addSuppressed(this.e, e);
        this.c = e;
    }

    public final IOException b() {
        return this.e;
    }

    public final IOException c() {
        return this.c;
    }
}
