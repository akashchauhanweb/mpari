package com.zepto;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t44 extends zw0 {
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t44(dx0 tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.b = 7;
    }

    @Override // com.zepto.zw0
    public int b() {
        return this.b;
    }

    @Override // com.zepto.zw0
    public boolean c(yy7 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        s44 s44VarD = workSpec.j.d();
        return s44VarD == s44.UNMETERED || (Build.VERSION.SDK_INT >= 30 && s44VarD == s44.TEMPORARILY_UNMETERED);
    }

    @Override // com.zepto.zw0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean e(n44 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a() || value.b();
    }
}
