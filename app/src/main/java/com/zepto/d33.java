package com.zepto;

import androidx.lifecycle.z;
import com.nic.mparivahan.Citizen.ViewModel.ItmsMasterViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d33 implements z.b {
    public final c33 b;

    public d33(c33 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(ItmsMasterViewModel.class)) {
            return new ItmsMasterViewModel(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
