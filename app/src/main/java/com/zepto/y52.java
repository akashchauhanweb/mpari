package com.zepto;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public abstract class y52 {
    public static Executor a() {
        return new ii5(Executors.newSingleThreadExecutor());
    }
}
