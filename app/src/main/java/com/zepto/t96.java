package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class t96 extends g2 {
    public static final /* synthetic */ r43.a r = null;
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public long[] q;

    static {
        n();
    }

    public t96() {
        super("stss");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("SyncSampleBox.java", t96.class);
        r = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int iA = pb0.a(m13.j(byteBuffer));
        this.q = new long[iA];
        for (int i = 0; i < iA; i++) {
            this.q[i] = m13.j(byteBuffer);
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.q.length);
        for (long j : this.q) {
            n13.g(byteBuffer, j);
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.q.length * 4) + 8;
    }

    public String toString() {
        vc5.b().c(o72.c(s, this, this));
        return "SyncSampleBox[entryCount=" + this.q.length + "]";
    }

    public void u(long[] jArr) {
        vc5.b().c(o72.d(t, this, this, jArr));
        this.q = jArr;
    }
}
