package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kd7 implements z.b {
    public final jd7 b;

    public kd7(jd7 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ld7.class)) {
            return new ld7(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
