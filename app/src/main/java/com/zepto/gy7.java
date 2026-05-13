package com.zepto;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface gy7 {
    default void a(o66 workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        b(workSpecId, i);
    }

    void b(o66 o66Var, int i);

    default void c(o66 workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        d(workSpecId, null);
    }

    void d(o66 o66Var, WorkerParameters.a aVar);

    default void e(o66 workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        b(workSpecId, -512);
    }
}
