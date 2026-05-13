package com.zepto;

import androidx.lifecycle.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tk4 implements z.b {
    public final uk4 b;

    public tk4(uk4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(sk4.class)) {
            return new sk4(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
