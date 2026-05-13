package com.zepto;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cf4 {
    public final String a;

    public cf4(String valString) {
        Intrinsics.checkNotNullParameter(valString, "valString");
        this.a = valString;
    }

    public final HashMap a() {
        return new bf4(new ze4()).a(this.a);
    }
}
