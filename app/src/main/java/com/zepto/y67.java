package com.zepto;

import androidx.lifecycle.z;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y67 implements z.b {
    public final sx3 b;

    public y67(sx3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(MultiSelectionViewModel.class)) {
            return new MultiSelectionViewModel(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
