package com.zepto;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface uc6 {
    Executor a();

    qy5 b();

    default void c(Runnable runnable) {
        b().execute(runnable);
    }

    sz0 d();
}
