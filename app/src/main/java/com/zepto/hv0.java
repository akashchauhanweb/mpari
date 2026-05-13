package com.zepto;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hv0 {
    public final List a = new ArrayList();

    public final void a(xw0 constraint) {
        Intrinsics.checkParameterIsNotNull(constraint, "constraint");
        this.a.add(constraint);
    }

    public final List b() {
        return this.a;
    }
}
