package com.zepto;

import com.zepto.x42;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class y42 extends w42 {
    public abstract Thread K0();

    public void L0(long j, x42.b bVar) {
        hf1.k.X0(j, bVar);
    }

    public final void M0() {
        Thread threadK0 = K0();
        if (Thread.currentThread() != threadK0) {
            v2.a();
            LockSupport.unpark(threadK0);
        }
    }
}
