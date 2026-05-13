package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dc1 implements z.b {
    public final cc1 b;

    public dc1(cc1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(qs1.class)) {
            return new qs1(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
