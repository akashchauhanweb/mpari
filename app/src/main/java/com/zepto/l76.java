package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l76 implements Runnable {
    public final bw4 c;
    public final o66 e;
    public final boolean f;
    public final int g;

    public l76(bw4 processor, o66 token, boolean z, int i) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.c = processor;
        this.e = token;
        this.f = z;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zV = this.f ? this.c.v(this.e, this.g) : this.c.w(this.e, this.g);
        rn3.e().a(rn3.i("StopWorkRunnable"), "StopWorkRunnable for " + this.e.a().b() + "; Processor.stopWork = " + zV);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l76(bw4 processor, o66 token, boolean z) {
        this(processor, token, z, -512);
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
    }
}
