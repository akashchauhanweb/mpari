package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kk7 implements z.b {
    public final bg7 b;

    public kk7(bg7 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(lk7.class)) {
            return new lk7(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
