package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class n82 extends of2 {
    public boolean e;
    public final Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n82(d36 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f = onException;
    }

    @Override // com.zepto.of2, com.zepto.d36
    public void Q(u70 source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.e) {
            source.skip(j);
            return;
        }
        try {
            super.Q(source, j);
        } catch (IOException e) {
            this.e = true;
            this.f.invoke(e);
        }
    }

    @Override // com.zepto.of2, com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.e = true;
            this.f.invoke(e);
        }
    }

    @Override // com.zepto.of2, com.zepto.d36, java.io.Flushable
    public void flush() {
        if (this.e) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.e = true;
            this.f.invoke(e);
        }
    }
}
