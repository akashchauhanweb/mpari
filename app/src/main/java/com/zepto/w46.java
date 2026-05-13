package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class w46 extends j2 {
    public static final /* synthetic */ r43.a r = null;
    public static final /* synthetic */ r43.a s = null;
    public float q;

    static {
        n();
    }

    public w46() {
        super("smhd");
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("SoundMediaHeaderBox.java", w46.class);
        r = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.q = m13.e(byteBuffer);
        m13.h(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.c(byteBuffer, this.q);
        n13.e(byteBuffer, 0);
    }

    @Override // com.zepto.c2
    public long c() {
        return 8L;
    }

    public String toString() {
        vc5.b().c(o72.c(s, this, this));
        return "SoundMediaHeaderBox[balance=" + u() + "]";
    }

    public float u() {
        vc5.b().c(o72.c(r, this, this));
        return this.q;
    }
}
