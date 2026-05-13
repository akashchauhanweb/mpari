package com.zepto;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class jf1 implements f62 {
    public static final int d = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    public final ev1 a = new ev1(d, new qv4(10));
    public final Executor b = Executors.newSingleThreadExecutor();
    public final Executor c = new fp3();

    @Override // com.zepto.f62
    public Executor a() {
        return this.c;
    }

    @Override // com.zepto.f62
    public Executor b() {
        return this.b;
    }

    @Override // com.zepto.f62
    public ev1 c() {
        return this.a;
    }
}
