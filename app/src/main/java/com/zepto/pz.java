package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class pz extends q2 {
    public byte[] A;
    public int o;
    public int p;
    public long q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public int y;
    public long z;

    public pz(String str) {
        super(str);
    }

    public int d0() {
        return this.o;
    }

    @Override // com.zepto.d2, com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(P());
        int i = this.r;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        n13.e(byteBufferAllocate, this.n);
        n13.e(byteBufferAllocate, this.r);
        n13.e(byteBufferAllocate, this.y);
        n13.g(byteBufferAllocate, this.z);
        n13.e(byteBufferAllocate, this.o);
        n13.e(byteBufferAllocate, this.p);
        n13.e(byteBufferAllocate, this.s);
        n13.e(byteBufferAllocate, this.t);
        if (this.l.equals("mlpa")) {
            n13.g(byteBufferAllocate, e0());
        } else {
            n13.g(byteBufferAllocate, e0() << 16);
        }
        if (this.r == 1) {
            n13.g(byteBufferAllocate, this.u);
            n13.g(byteBufferAllocate, this.v);
            n13.g(byteBufferAllocate, this.w);
            n13.g(byteBufferAllocate, this.x);
        }
        if (this.r == 2) {
            n13.g(byteBufferAllocate, this.u);
            n13.g(byteBufferAllocate, this.v);
            n13.g(byteBufferAllocate, this.w);
            n13.g(byteBufferAllocate, this.x);
            byteBufferAllocate.put(this.A);
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        D(writableByteChannel);
    }

    public long e0() {
        return this.q;
    }

    @Override // com.zepto.d2, com.zepto.p70
    public long j() {
        int i = this.r;
        int i2 = 16;
        long jW = ((long) ((i == 1 ? 16 : 0) + 28 + (i == 2 ? 36 : 0))) + w();
        if (!this.m && 8 + jW < 4294967296L) {
            i2 = 8;
        }
        return jW + ((long) i2);
    }

    public void k0(int i) {
        this.o = i;
    }

    public void m0(long j) {
        this.q = j;
    }

    public void p0(int i) {
        this.p = i;
    }

    @Override // com.zepto.c50
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.x + ", bytesPerFrame=" + this.w + ", bytesPerPacket=" + this.v + ", samplesPerPacket=" + this.u + ", packetSize=" + this.t + ", compressionId=" + this.s + ", soundVersion=" + this.r + ", sampleRate=" + this.q + ", sampleSize=" + this.p + ", channelCount=" + this.o + ", boxes=" + n() + '}';
    }
}
