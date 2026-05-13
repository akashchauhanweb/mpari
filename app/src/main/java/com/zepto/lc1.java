package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lc1 implements z.b {
    public final ec1 b;

    public lc1(ec1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(mc1.class)) {
            return new mc1(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
