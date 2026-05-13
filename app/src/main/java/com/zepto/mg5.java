package com.zepto;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class mg5 extends q40 {
    public int d;

    @Override // com.zepto.q40
    public void e(ByteBuffer byteBuffer) {
        this.d = m13.l(byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.d == ((mg5) obj).d;
    }

    public ByteBuffer f() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        n13.i(byteBufferAllocate, 6);
        n13.i(byteBufferAllocate, 1);
        n13.i(byteBufferAllocate, this.d);
        return byteBufferAllocate;
    }

    public int g() {
        return 3;
    }

    public void h(int i) {
        this.d = i;
    }

    public int hashCode() {
        return this.d;
    }

    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
