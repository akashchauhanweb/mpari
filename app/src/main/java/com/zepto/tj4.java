package com.zepto;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tj4 implements d36 {
    public final OutputStream c;
    public final cg6 e;

    public tj4(OutputStream out, cg6 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.c = out;
        this.e = timeout;
    }

    @Override // com.zepto.d36
    public void Q(u70 source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        g.b(source.L0(), 0L, j);
        while (j > 0) {
            this.e.f();
            vu5 vu5Var = source.c;
            Intrinsics.checkNotNull(vu5Var);
            int iMin = (int) Math.min(j, vu5Var.c - vu5Var.b);
            this.c.write(vu5Var.a, vu5Var.b, iMin);
            vu5Var.b += iMin;
            long j2 = iMin;
            j -= j2;
            source.K0(source.L0() - j2);
            if (vu5Var.b == vu5Var.c) {
                source.c = vu5Var.b();
                yu5.b(vu5Var);
            }
        }
    }

    @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    @Override // com.zepto.d36, java.io.Flushable
    public void flush() throws IOException {
        this.c.flush();
    }

    @Override // com.zepto.d36
    public cg6 timeout() {
        return this.e;
    }

    public String toString() {
        return "sink(" + this.c + ')';
    }
}
