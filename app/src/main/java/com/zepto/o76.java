package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o76 extends zw0 {
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o76(dx0 tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.b = 9;
    }

    @Override // com.zepto.zw0
    public int b() {
        return this.b;
    }

    @Override // com.zepto.zw0
    public boolean c(yy7 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.i();
    }

    @Override // com.zepto.zw0
    public /* bridge */ /* synthetic */ boolean e(Object obj) {
        return g(((Boolean) obj).booleanValue());
    }

    public boolean g(boolean z) {
        return !z;
    }
}
