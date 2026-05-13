package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ez5 implements z.b {
    public final gz5 b;

    public ez5(gz5 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(hz5.class)) {
            return new hz5(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
