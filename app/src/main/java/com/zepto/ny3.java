package com.zepto;

import com.zepto.h31;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ny3 extends h31 {
    public ny3() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.zepto.h31
    public Object a(h31.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b().get(key);
    }

    public final void c(h31.b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b().put(key, obj);
    }

    public ny3(h31 initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ ny3(h31 h31Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? h31.a.b : h31Var);
    }
}
