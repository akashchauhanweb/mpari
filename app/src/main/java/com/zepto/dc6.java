package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dc6 implements z.b {
    public final cc6 b;

    public dc6(cc6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ec6.class)) {
            return new ec6(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
