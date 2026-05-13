package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tj0 implements z.b {
    public final uj0 b;

    public tj0(uj0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(vj0.class)) {
            return new vj0(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
