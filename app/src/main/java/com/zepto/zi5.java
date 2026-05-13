package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zi5 implements z.b {
    public final yi5 b;

    public zi5(yi5 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(aj5.class)) {
            return new aj5(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
