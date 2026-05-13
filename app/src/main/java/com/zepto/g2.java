package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 extends c2 {
    public static final /* synthetic */ r43.a o = null;
    public static final /* synthetic */ r43.a p = null;
    public int m;
    public int n;

    static {
        n();
    }

    public g2(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("AbstractFullBox.java", g2.class);
        o = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setVersion", "com.googlecode.mp4parser.AbstractFullBox", "int", "version", "", "void"), 51);
        p = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setFlags", "com.googlecode.mp4parser.AbstractFullBox", "int", "flags", "", "void"), 64);
    }

    public int o() {
        if (!this.g) {
            l();
        }
        return this.n;
    }

    public int p() {
        if (!this.g) {
            l();
        }
        return this.m;
    }

    public final long q(ByteBuffer byteBuffer) {
        this.m = m13.l(byteBuffer);
        this.n = m13.i(byteBuffer);
        return 4L;
    }

    public void r(int i) {
        vc5.b().c(o72.d(p, this, this, iz0.d(i)));
        this.n = i;
    }

    public void s(int i) {
        vc5.b().c(o72.d(o, this, this, iz0.d(i)));
        this.m = i;
    }

    public final void t(ByteBuffer byteBuffer) {
        n13.i(byteBuffer, this.m);
        n13.f(byteBuffer, this.n);
    }
}
