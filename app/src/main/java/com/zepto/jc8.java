package com.zepto;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class jc8 extends gc8 {
    public final gc8 c;
    public final long e;
    public final long f;

    public jc8(gc8 gc8Var, long j, long j2) {
        this.c = gc8Var;
        long jM = m(j);
        this.e = jM;
        this.f = m(jM + j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.zepto.gc8
    public final long d() {
        return this.f - this.e;
    }

    @Override // com.zepto.gc8
    public final InputStream e(long j, long j2) {
        long jM = m(this.e);
        return this.c.e(jM, m(j2 + jM) - jM);
    }

    public final long m(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.c.d() ? this.c.d() : j;
    }
}
