package com.zepto;

import java.nio.ByteBuffer;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g55 implements z70 {
    public final u70 c;
    public boolean e;
    public final d36 f;

    public g55(d36 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f = sink;
        this.c = new u70();
    }

    @Override // com.zepto.z70
    public long H(y46 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j2 = source.read(this.c, ConstantsKt.DEFAULT_BUFFER_SIZE);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            R();
        }
    }

    @Override // com.zepto.z70
    public z70 J(int i) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.J(i);
        return R();
    }

    @Override // com.zepto.z70
    public z70 O(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.O(source);
        return R();
    }

    @Override // com.zepto.d36
    public void Q(u70 source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.Q(source, j);
        R();
    }

    @Override // com.zepto.z70
    public z70 R() {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        long jU = this.c.U();
        if (jU > 0) {
            this.f.Q(this.c, jU);
        }
        return this;
    }

    @Override // com.zepto.z70
    public z70 a(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.a(source, i, i2);
        return R();
    }

    @Override // com.zepto.z70
    public u70 c() {
        return this.c;
    }

    @Override // com.zepto.d36, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.e) {
            return;
        }
        try {
            if (this.c.L0() > 0) {
                d36 d36Var = this.f;
                u70 u70Var = this.c;
                d36Var.Q(u70Var, u70Var.L0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.zepto.z70, com.zepto.d36, java.io.Flushable
    public void flush() {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.c.L0() > 0) {
            d36 d36Var = this.f;
            u70 u70Var = this.c;
            d36Var.Q(u70Var, u70Var.L0());
        }
        this.f.flush();
    }

    @Override // com.zepto.z70
    public z70 h0(t80 byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.h0(byteString);
        return R();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.e;
    }

    @Override // com.zepto.z70
    public z70 k(long j) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.k(j);
        return R();
    }

    @Override // com.zepto.z70
    public z70 l0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.l0(string);
        return R();
    }

    @Override // com.zepto.z70
    public z70 n0(long j) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.n0(j);
        return R();
    }

    @Override // com.zepto.z70
    public z70 t(int i) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.t(i);
        return R();
    }

    @Override // com.zepto.d36
    public cg6 timeout() {
        return this.f.timeout();
    }

    public String toString() {
        return "buffer(" + this.f + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.c.write(source);
        R();
        return iWrite;
    }

    @Override // com.zepto.z70
    public z70 writeInt(int i) {
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.writeInt(i);
        return R();
    }
}
