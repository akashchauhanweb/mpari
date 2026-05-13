package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k94 implements z.b {
    public final i94 b;

    public k94(i94 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(j94.class)) {
            return new j94(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
