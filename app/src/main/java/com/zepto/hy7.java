package com.zepto;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hy7 implements gy7 {
    public final bw4 a;
    public final uc6 b;

    public hy7(bw4 processor, uc6 workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.a = processor;
        this.b = workTaskExecutor;
    }

    @Override // com.zepto.gy7
    public void b(o66 workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.b.c(new l76(this.a, workSpecId, false, i));
    }

    @Override // com.zepto.gy7
    public void d(o66 workSpecId, WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.b.c(new q66(this.a, workSpecId, aVar));
    }
}
