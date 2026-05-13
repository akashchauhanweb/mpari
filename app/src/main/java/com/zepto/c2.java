package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 implements p70 {
    public static sn3 l = sn3.a(c2.class);
    public String c;
    public byte[] e;
    public hy0 f;
    public ByteBuffer i;
    public long j = -1;
    public ByteBuffer k = null;
    public boolean h = true;
    public boolean g = true;

    public c2(String str) {
        this.c = str;
    }

    public abstract void a(ByteBuffer byteBuffer);

    public abstract void b(ByteBuffer byteBuffer);

    public abstract long c();

    @Override // com.zepto.p70
    public void d(hy0 hy0Var) {
        this.f = hy0Var;
    }

    @Override // com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        if (!this.h) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((k() ? 8 : 16) + ("uuid".equals(g()) ? 16 : 0));
            f(byteBufferAllocate);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
            throw null;
        }
        if (!this.g) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((k() ? 8 : 16) + ("uuid".equals(g()) ? 16 : 0));
            f(byteBufferAllocate2);
            writableByteChannel.write((ByteBuffer) byteBufferAllocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.i.position(0));
            return;
        }
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(pb0.a(j()));
        f(byteBufferAllocate3);
        b(byteBufferAllocate3);
        ByteBuffer byteBuffer = this.k;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            while (this.k.remaining() > 0) {
                byteBufferAllocate3.put(this.k);
            }
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate3.rewind());
    }

    public final void f(ByteBuffer byteBuffer) {
        if (k()) {
            n13.g(byteBuffer, j());
            byteBuffer.put(l13.P(g()));
        } else {
            n13.g(byteBuffer, 1L);
            byteBuffer.put(l13.P(g()));
            n13.h(byteBuffer, j());
        }
        if ("uuid".equals(g())) {
            byteBuffer.put(h());
        }
    }

    public String g() {
        return this.c;
    }

    public byte[] h() {
        return this.e;
    }

    public boolean i() {
        return this.g;
    }

    @Override // com.zepto.p70
    public long j() {
        long jLimit;
        if (!this.h) {
            jLimit = this.j;
        } else if (this.g) {
            jLimit = c();
        } else {
            ByteBuffer byteBuffer = this.i;
            jLimit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        long j = jLimit + ((long) ((jLimit >= 4294967288L ? 8 : 0) + 8 + ("uuid".equals(g()) ? 16 : 0)));
        ByteBuffer byteBuffer2 = this.k;
        return j + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0));
    }

    public final boolean k() {
        int i = "uuid".equals(g()) ? 24 : 8;
        if (!this.h) {
            return this.j + ((long) i) < 4294967296L;
        }
        if (!this.g) {
            return ((long) (this.i.limit() + i)) < 4294967296L;
        }
        long jC = c();
        ByteBuffer byteBuffer = this.k;
        return (jC + ((long) (byteBuffer != null ? byteBuffer.limit() : 0))) + ((long) i) < 4294967296L;
    }

    public final synchronized void l() {
        try {
            m();
            l.b("parsing details of " + g());
            ByteBuffer byteBuffer = this.i;
            if (byteBuffer != null) {
                this.g = true;
                byteBuffer.rewind();
                a(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.k = byteBuffer.slice();
                }
                this.i = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m() {
        try {
            if (!this.h) {
                try {
                    l.b("mem mapping " + g());
                    throw null;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
