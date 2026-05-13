package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i85 implements z.b {
    public final j85 b;

    public i85(j85 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(com.nic.mparivahan.dlservices.RenewalCOA.a.class)) {
            return new com.nic.mparivahan.dlservices.RenewalCOA.a(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
