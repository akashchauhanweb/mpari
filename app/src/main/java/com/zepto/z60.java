package com.zepto;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z60 implements d36 {
    @Override // com.zepto.d36
    public void Q(u70 source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }

    @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.zepto.d36, java.io.Flushable
    public void flush() {
    }

    @Override // com.zepto.d36
    public cg6 timeout() {
        return cg6.d;
    }
}
