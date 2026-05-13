package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uj3 implements z.b {
    public final hl3 b;

    public uj3(hl3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(dm3.class)) {
            return new dm3(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
