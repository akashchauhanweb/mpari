package com.zepto;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pf2 implements y46 {
    private final y46 delegate;

    public pf2(y46 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final y46 m1deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final y46 delegate() {
        return this.delegate;
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j);
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
