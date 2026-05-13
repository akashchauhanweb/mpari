package com.zepto;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r68 implements u68 {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ r68(n68 n68Var) {
    }

    @Override // com.zepto.rg4
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // com.zepto.eh4
    public final void b(Object obj) {
        this.a.countDown();
    }

    @Override // com.zepto.hg4
    public final void c() {
        this.a.countDown();
    }

    public final void d() throws InterruptedException {
        this.a.await();
    }

    public final boolean e(long j, TimeUnit timeUnit) {
        return this.a.await(j, timeUnit);
    }
}
