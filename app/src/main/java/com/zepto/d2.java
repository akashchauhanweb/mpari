package com.zepto;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 extends c50 implements p70 {
    public hy0 k;
    public String l;
    public boolean m;

    public d2(String str) {
        this.l = str;
    }

    public ByteBuffer P() {
        ByteBuffer byteBufferWrap;
        if (this.m || j() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.l.getBytes()[0];
            bArr[5] = this.l.getBytes()[1];
            bArr[6] = this.l.getBytes()[2];
            bArr[7] = this.l.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            n13.h(byteBufferWrap, j());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.l.getBytes()[0], this.l.getBytes()[1], this.l.getBytes()[2], this.l.getBytes()[3]});
            n13.g(byteBufferWrap, j());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    @Override // com.zepto.p70
    public void d(hy0 hy0Var) {
        this.k = hy0Var;
    }

    @Override // com.zepto.p70
    public void e(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(P());
        D(writableByteChannel);
    }

    @Override // com.zepto.p70
    public long j() {
        long jW = w();
        return jW + ((long) ((this.m || 8 + jW >= 4294967296L) ? 16 : 8));
    }
}
