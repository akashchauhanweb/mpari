package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ni5 extends g2 {
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public static final /* synthetic */ r43.a x = null;
    public static final /* synthetic */ r43.a y = null;
    public static final /* synthetic */ r43.a z = null;
    public long q;
    public long[] r;
    public int s;

    static {
        n();
    }

    public ni5() {
        super("stsz");
        this.r = new long[0];
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("SampleSizeBox.java", ni5.class);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        x = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.q = m13.j(byteBuffer);
        int iA = pb0.a(m13.j(byteBuffer));
        this.s = iA;
        if (this.q == 0) {
            this.r = new long[iA];
            for (int i = 0; i < this.s; i++) {
                this.r[i] = m13.j(byteBuffer);
            }
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.q);
        if (this.q != 0) {
            n13.g(byteBuffer, this.s);
            return;
        }
        n13.g(byteBuffer, this.r.length);
        for (long j : this.r) {
            n13.g(byteBuffer, j);
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.q == 0 ? this.r.length * 4 : 0) + 12;
    }

    public String toString() {
        vc5.b().c(o72.c(z, this, this));
        return "SampleSizeBox[sampleSize=" + v() + ";sampleCount=" + u() + "]";
    }

    public long u() {
        vc5.b().c(o72.c(w, this, this));
        return this.q > 0 ? this.s : this.r.length;
    }

    public long v() {
        vc5.b().c(o72.c(t, this, this));
        return this.q;
    }

    public void w(long[] jArr) {
        vc5.b().c(o72.d(y, this, this, jArr));
        this.r = jArr;
    }
}
