package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class zm2 extends j2 {
    public static final /* synthetic */ r43.a u = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public static final /* synthetic */ r43.a x = null;
    public static final /* synthetic */ r43.a y = null;
    public int q;
    public int r;
    public long s;
    public long t;

    static {
        n();
    }

    public zm2() {
        super("hmhd");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("HintMediaHeaderBox.java", zm2.class);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 50);
        x = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "long"), 54);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.q = m13.h(byteBuffer);
        this.r = m13.h(byteBuffer);
        this.s = m13.j(byteBuffer);
        this.t = m13.j(byteBuffer);
        m13.j(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.e(byteBuffer, this.q);
        n13.e(byteBuffer, this.r);
        n13.g(byteBuffer, this.s);
        n13.g(byteBuffer, this.t);
        n13.g(byteBuffer, 0L);
    }

    @Override // com.zepto.c2
    public long c() {
        return 20L;
    }

    public String toString() {
        vc5.b().c(o72.c(y, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.q + ", avgPduSize=" + this.r + ", maxBitrate=" + this.s + ", avgBitrate=" + this.t + '}';
    }
}
