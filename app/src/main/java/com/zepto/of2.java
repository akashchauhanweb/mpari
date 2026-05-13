package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class of2 implements d36 {
    public final d36 c;

    public of2(d36 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.c = delegate;
    }

    @Override // com.zepto.d36
    public void Q(u70 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.c.Q(source, j);
    }

    @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // com.zepto.d36, java.io.Flushable
    public void flush() {
        this.c.flush();
    }

    @Override // com.zepto.d36
    public cg6 timeout() {
        return this.c.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.c + ')';
    }
}
