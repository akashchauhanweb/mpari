package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rm3 implements z.b {
    public final vm3 b;

    public rm3(vm3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(cn3.class)) {
            return new cn3(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
