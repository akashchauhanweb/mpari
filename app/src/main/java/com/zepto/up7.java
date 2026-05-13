package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class up7 extends j2 {
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public int q;
    public int[] r;

    static {
        n();
    }

    public up7() {
        super("vmhd");
        this.q = 0;
        this.r = new int[3];
        r(1);
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("VideoMediaHeaderBox.java", up7.class);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.q = m13.h(byteBuffer);
        this.r = new int[3];
        for (int i = 0; i < 3; i++) {
            this.r[i] = m13.h(byteBuffer);
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.e(byteBuffer, this.q);
        for (int i : this.r) {
            n13.e(byteBuffer, i);
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return 12L;
    }

    public String toString() {
        vc5.b().c(o72.c(u, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + u() + ";opcolor0=" + v()[0] + ";opcolor1=" + v()[1] + ";opcolor2=" + v()[2] + "]";
    }

    public int u() {
        vc5.b().c(o72.c(s, this, this));
        return this.q;
    }

    public int[] v() {
        vc5.b().c(o72.c(t, this, this));
        return this.r;
    }
}
