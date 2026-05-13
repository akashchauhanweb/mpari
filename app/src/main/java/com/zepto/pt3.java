package com.zepto;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class pt3 extends ic6 {
    public static pt3 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new pt3());
    }

    public static pt3 i(ByteBuffer byteBuffer, pt3 pt3Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return pt3Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public pt3 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public ot3 j(ot3 ot3Var, int i) {
        int iB = b(6);
        if (iB != 0) {
            return ot3Var.f(a(d(iB) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }
}
