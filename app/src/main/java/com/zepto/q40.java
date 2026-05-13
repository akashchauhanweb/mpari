package com.zepto;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class q40 {
    public int a;
    public int b;
    public int c;

    public int a() {
        return this.b + 1 + this.c;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public final void d(int i, ByteBuffer byteBuffer) {
        this.a = i;
        int iL = m13.l(byteBuffer);
        this.b = iL & 127;
        int i2 = 1;
        while ((iL >>> 7) == 1) {
            iL = m13.l(byteBuffer);
            i2++;
            this.b = (this.b << 7) | (iL & 127);
        }
        this.c = i2;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.b);
        e(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + this.b);
    }

    public abstract void e(ByteBuffer byteBuffer);
}
