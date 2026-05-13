package com.zepto;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class m14 implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public m14(String str) {
        iu4.j(str, "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.b.newThread(new v58(runnable, 0));
        threadNewThread.setName(this.a);
        return threadNewThread;
    }
}
