package com.zepto;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gz2 implements y46 {
    public final InputStream c;
    public final cg6 e;

    public gz2(InputStream input, cg6 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.c = input;
        this.e = timeout;
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.e.f();
            vu5 vu5VarO0 = sink.O0(1);
            int i = this.c.read(vu5VarO0.a, vu5VarO0.c, (int) Math.min(j, 8192 - vu5VarO0.c));
            if (i != -1) {
                vu5VarO0.c += i;
                long j2 = i;
                sink.K0(sink.L0() + j2);
                return j2;
            }
            if (vu5VarO0.b != vu5VarO0.c) {
                return -1L;
            }
            sink.c = vu5VarO0.b();
            yu5.b(vu5VarO0);
            return -1L;
        } catch (AssertionError e) {
            if (zf4.e(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return this.e;
    }

    public String toString() {
        return "source(" + this.c + ')';
    }
}
