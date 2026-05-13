package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qa6 implements z.b {
    public final oa6 b;

    public qa6(oa6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(pa6.class)) {
            return new pa6(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
