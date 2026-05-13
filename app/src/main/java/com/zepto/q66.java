package com.zepto;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q66 implements Runnable {
    public final bw4 c;
    public final o66 e;
    public final WorkerParameters.a f;

    public q66(bw4 processor, o66 startStopToken, WorkerParameters.a aVar) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(startStopToken, "startStopToken");
        this.c = processor;
        this.e = startStopToken;
        this.f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.c.s(this.e, this.f);
    }
}
