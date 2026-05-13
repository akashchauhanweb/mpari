package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xr3 implements p70 {
    public hy0 c;
    public long e = 1073741824;
    public long f;

    public final long a() {
        return this.e;
    }

    public long b() {
        return this.f;
    }

    public final boolean c(long j) {
        return j + ((long) 8) < 4294967296L;
    }

    @Override // com.zepto.p70
    public void d(hy0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.c = parent;
    }

    @Override // com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        Intrinsics.checkNotNullParameter(writableByteChannel, "writableByteChannel");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        long j = j();
        if (!c(j) || j < 0 || j > 4294967296L) {
            n13.g(byteBufferAllocate, 1L);
        } else {
            n13.g(byteBufferAllocate, j);
        }
        byteBufferAllocate.put(l13.P("mdat"));
        if (c(j)) {
            byteBufferAllocate.put(new byte[8]);
        } else {
            if (j < 0) {
                j = 1;
            }
            n13.h(byteBufferAllocate, j);
        }
        byteBufferAllocate.rewind();
        writableByteChannel.write(byteBufferAllocate);
    }

    public final void f(long j) {
        this.e = j;
    }

    public final void g(long j) {
        this.f = j;
    }

    @Override // com.zepto.p70
    public long j() {
        return ((long) 16) + this.e;
    }
}
