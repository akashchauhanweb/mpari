package com.zepto;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes3.dex */
public interface d36 extends Closeable, Flushable {
    void Q(u70 u70Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    cg6 timeout();
}
