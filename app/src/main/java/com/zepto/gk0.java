package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;

/* JADX INFO: loaded from: classes.dex */
public abstract class gk0 extends g2 {
    public static final /* synthetic */ r43.a q = null;

    static {
        n();
    }

    public gk0(String str) {
        super(str);
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("ChunkOffsetBox.java", gk0.class);
        q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public String toString() {
        vc5.b().c(o72.c(q, this, this));
        return getClass().getSimpleName() + "[entryCount=" + u().length + "]";
    }

    public abstract long[] u();
}
