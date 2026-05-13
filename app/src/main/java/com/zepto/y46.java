package com.zepto;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface y46 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(u70 u70Var, long j);

    cg6 timeout();
}
