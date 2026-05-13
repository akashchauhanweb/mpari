package com.zepto;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class ek8 implements ok8 {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ ek8(uj8 uj8Var) {
    }

    @Override // com.zepto.qg4
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // com.zepto.dh4
    public final void b(Object obj) {
        this.a.countDown();
    }

    public final void c() throws InterruptedException {
        this.a.await();
    }
}
