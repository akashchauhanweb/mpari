package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 implements z.b {
    public final jj0 b;

    public oj0(jj0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(pj0.class)) {
            return new pj0(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
