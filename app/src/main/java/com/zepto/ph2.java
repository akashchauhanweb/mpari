package com.zepto;

import com.zepto.o96;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ph2 implements o96.c {
    @Override // com.zepto.o96.c
    public o96 a(o96.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new nh2(configuration.a, configuration.b, configuration.c, configuration.d, configuration.e);
    }
}
