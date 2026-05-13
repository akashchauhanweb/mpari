package com.zepto;

import androidx.lifecycle.z;
import com.nic.mparivahan.Tax.ViewModel.PaytaxViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a14 implements z.b {
    public final wm4 b;

    public a14(wm4 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.b = repository;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(PaytaxViewModel.class)) {
            return new PaytaxViewModel(this.b);
        }
        throw new IllegalArgumentException("ViewModel Not Found");
    }
}
