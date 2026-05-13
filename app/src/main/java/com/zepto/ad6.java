package com.zepto;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class ad6 extends oc6 {
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad6(Function0 function0, String str, boolean z, String str2, boolean z2) {
        super(str2, z2);
        this.e = function0;
        this.f = str;
        this.g = z;
    }

    @Override // com.zepto.oc6
    public long f() {
        this.e.invoke();
        return -1L;
    }
}
