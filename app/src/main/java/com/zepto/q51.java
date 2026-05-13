package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class q51 implements y {
    public final xg1 c;
    public int e = 0;

    public q51(xg1 xg1Var) {
        this.c = xg1Var;
    }

    public final InputStream a(boolean z) throws IOException {
        int iJ = this.c.j();
        if (iJ < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int i = this.c.read();
        this.e = i;
        if (i > 0) {
            if (iJ < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (i > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
            if (z) {
                throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.e);
            }
        }
        return this.c;
    }

    @Override // com.zepto.a0
    public u0 m() {
        try {
            return r();
        } catch (IOException e) {
            throw new t0("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // com.zepto.y
    public int n() {
        return this.e;
    }

    @Override // com.zepto.ey2
    public u0 r() {
        return x.g0(this.c.n());
    }

    @Override // com.zepto.y
    public InputStream u() {
        return a(false);
    }
}
