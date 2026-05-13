package com.zepto;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class tp6 extends q40 {
    public static Logger e = Logger.getLogger(tp6.class.getName());
    public ByteBuffer d;

    @Override // com.zepto.q40
    public void e(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(c());
    }

    public String toString() {
        return "UnknownDescriptor{tag=" + this.a + ", sizeOfInstance=" + this.b + ", data=" + this.d + '}';
    }
}
