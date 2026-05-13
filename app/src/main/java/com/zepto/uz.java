package com.zepto;

import com.zepto.v03;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uz implements v03 {
    @Override // com.zepto.v03
    public ld5 a(v03.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.a(chain.request().i().a("Authorization", "Bearer " + va3.a.o0()).b());
    }
}
