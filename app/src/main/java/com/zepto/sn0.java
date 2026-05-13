package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 implements z.b {
    public final jl0 b;

    public sn0(jl0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(kl0.class)) {
            return new kl0(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
