package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class od1 extends g2 {
    public static final /* synthetic */ r43.a q = null;

    static {
        n();
    }

    public od1() {
        super("url ");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("DataEntryUrlBox.java", od1.class);
        q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
    }

    @Override // com.zepto.c2
    public long c() {
        return 4L;
    }

    public String toString() {
        vc5.b().c(o72.c(q, this, this));
        return "DataEntryUrlBox[]";
    }
}
