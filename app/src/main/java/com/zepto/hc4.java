package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hc4 implements z.b {
    public final ic4 b;

    public hc4(ic4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(jc4.class)) {
            return new jc4(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
