package com.zepto;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oy2 implements y46 {
    public int c;
    public boolean e;
    public final a80 f;
    public final Inflater g;

    public oy2(a80 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f = source;
        this.g = inflater;
    }

    @Override // com.zepto.y46, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        this.g.end();
        this.e = true;
        this.f.close();
    }

    public final long d(u70 sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            vu5 vu5VarO0 = sink.O0(1);
            int iMin = (int) Math.min(j, 8192 - vu5VarO0.c);
            e();
            int iInflate = this.g.inflate(vu5VarO0.a, vu5VarO0.c, iMin);
            j();
            if (iInflate > 0) {
                vu5VarO0.c += iInflate;
                long j2 = iInflate;
                sink.K0(sink.L0() + j2);
                return j2;
            }
            if (vu5VarO0.b == vu5VarO0.c) {
                sink.c = vu5VarO0.b();
                yu5.b(vu5VarO0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean e() {
        if (!this.g.needsInput()) {
            return false;
        }
        if (this.f.I()) {
            return true;
        }
        vu5 vu5Var = this.f.c().c;
        Intrinsics.checkNotNull(vu5Var);
        int i = vu5Var.c;
        int i2 = vu5Var.b;
        int i3 = i - i2;
        this.c = i3;
        this.g.setInput(vu5Var.a, i2, i3);
        return false;
    }

    public final void j() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.g.getRemaining();
        this.c -= remaining;
        this.f.skip(remaining);
    }

    @Override // com.zepto.y46
    public long read(u70 sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jD = d(sink, j);
            if (jD > 0) {
                return jD;
            }
            if (this.g.finished() || this.g.needsDictionary()) {
                return -1L;
            }
        } while (!this.f.I());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.zepto.y46
    public cg6 timeout() {
        return this.f.timeout();
    }
}
