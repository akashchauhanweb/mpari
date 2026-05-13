package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class c76 extends gk0 {
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public long[] r;

    static {
        n();
    }

    public c76() {
        super("stco");
        this.r = new long[0];
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("StaticChunkOffsetBox.java", c76.class);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 48);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int iA = pb0.a(m13.j(byteBuffer));
        this.r = new long[iA];
        for (int i = 0; i < iA; i++) {
            this.r[i] = m13.j(byteBuffer);
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.r.length);
        for (long j : this.r) {
            n13.g(byteBuffer, j);
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.r.length * 4) + 8;
    }

    @Override // com.zepto.gk0
    public long[] u() {
        vc5.b().c(o72.c(s, this, this));
        return this.r;
    }

    public void v(long[] jArr) {
        vc5.b().c(o72.d(t, this, this, jArr));
        this.r = jArr;
    }
}
