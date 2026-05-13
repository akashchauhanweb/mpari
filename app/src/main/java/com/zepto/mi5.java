package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public class mi5 extends d2 {
    public int n;
    public int o;

    public mi5() {
        super("stsd");
    }

    @Override // com.zepto.d2, com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(P());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        n13.i(byteBufferAllocate, this.n);
        n13.f(byteBufferAllocate, this.o);
        n13.g(byteBufferAllocate, n().size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        D(writableByteChannel);
    }

    @Override // com.zepto.d2, com.zepto.p70
    public long j() {
        long jW = w();
        return 8 + jW + ((long) ((this.m || jW + 16 >= 4294967296L) ? 16 : 8));
    }
}
