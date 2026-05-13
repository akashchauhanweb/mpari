package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class lf2 implements z.b {
    public final gf2 b;

    public lf2(gf2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(mf2.class)) {
            return new mf2(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
