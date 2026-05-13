package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rb6 implements z.b {
    public final qb6 b;

    public rb6(qb6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(sb6.class)) {
            return new sb6(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
