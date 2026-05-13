package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ea5 implements z.b {
    public final ca5 b;

    public ea5(ca5 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(da5.class)) {
            return new da5(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
