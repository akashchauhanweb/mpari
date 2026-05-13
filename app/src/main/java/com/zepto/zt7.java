package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class zt7 extends q2 {
    public int o;
    public int p;
    public double q;
    public double r;
    public int s;
    public String t;
    public int u;
    public long[] v;

    public zt7(String str) {
        super(str);
        this.q = 72.0d;
        this.r = 72.0d;
        this.s = 1;
        this.t = "";
        this.u = 24;
        this.v = new long[3];
    }

    public void A0(int i) {
        this.u = i;
    }

    public void B0(int i) {
        this.s = i;
    }

    public void C0(int i) {
        this.p = i;
    }

    public void D0(double d) {
        this.q = d;
    }

    public void E0(double d) {
        this.r = d;
    }

    public void F0(int i) {
        this.o = i;
    }

    public String d0() {
        return this.t;
    }

    @Override // com.zepto.d2, com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(P());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        n13.e(byteBufferAllocate, this.n);
        n13.e(byteBufferAllocate, 0);
        n13.e(byteBufferAllocate, 0);
        n13.g(byteBufferAllocate, this.v[0]);
        n13.g(byteBufferAllocate, this.v[1]);
        n13.g(byteBufferAllocate, this.v[2]);
        n13.e(byteBufferAllocate, y0());
        n13.e(byteBufferAllocate, m0());
        n13.b(byteBufferAllocate, p0());
        n13.b(byteBufferAllocate, x0());
        n13.g(byteBufferAllocate, 0L);
        n13.e(byteBufferAllocate, k0());
        n13.i(byteBufferAllocate, ys6.c(d0()));
        byteBufferAllocate.put(ys6.b(d0()));
        int iC = ys6.c(d0());
        while (iC < 31) {
            iC++;
            byteBufferAllocate.put((byte) 0);
        }
        n13.e(byteBufferAllocate, e0());
        n13.e(byteBufferAllocate, 65535);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        D(writableByteChannel);
    }

    public int e0() {
        return this.u;
    }

    @Override // com.zepto.d2, com.zepto.p70
    public long j() {
        long jW = w();
        return 78 + jW + ((long) ((this.m || jW + 86 >= 4294967296L) ? 16 : 8));
    }

    public int k0() {
        return this.s;
    }

    public int m0() {
        return this.p;
    }

    public double p0() {
        return this.q;
    }

    public double x0() {
        return this.r;
    }

    public int y0() {
        return this.o;
    }

    public void z0(String str) {
        this.t = str;
    }
}
