package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch1 implements Runnable {
    public final /* synthetic */ androidx.work.impl.background.systemalarm.c c;

    public /* synthetic */ ch1(androidx.work.impl.background.systemalarm.c cVar) {
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.i();
    }
}
