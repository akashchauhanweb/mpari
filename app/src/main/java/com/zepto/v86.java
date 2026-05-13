package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class v86 extends j2 {
    public static final /* synthetic */ r43.a q = null;

    static {
        n();
    }

    public v86() {
        super("sthd");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("SubtitleMediaHeaderBox.java", v86.class);
        q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
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
        return "SubtitleMediaHeaderBox";
    }
}
