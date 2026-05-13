package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cl7 implements z.b {
    public final cm7 b;

    public cl7(cm7 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(dm7.class)) {
            return new dm7(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
