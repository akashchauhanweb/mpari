package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class bs3 extends g2 {
    public static final /* synthetic */ r43.a A = null;
    public static final /* synthetic */ r43.a B = null;
    public static final /* synthetic */ r43.a C = null;
    public static final /* synthetic */ r43.a D = null;
    public static final /* synthetic */ r43.a E = null;
    public static final /* synthetic */ r43.a F = null;
    public static final /* synthetic */ r43.a v = null;
    public static final /* synthetic */ r43.a w = null;
    public static final /* synthetic */ r43.a x = null;
    public static final /* synthetic */ r43.a y = null;
    public static final /* synthetic */ r43.a z = null;
    public Date q;
    public Date r;
    public long s;
    public long t;
    public String u;

    static {
        n();
    }

    public bs3() {
        super("mdhd");
        this.q = new Date();
        this.r = new Date();
        this.u = "eng";
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("MediaHeaderBox.java", bs3.class);
        v = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        w = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        F = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        x = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        A = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        B = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        C = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        D = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        E = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
    }

    public void A(long j) {
        vc5.b().c(o72.d(D, this, this, iz0.e(j)));
        this.t = j;
    }

    public void B(String str) {
        vc5.b().c(o72.d(E, this, this, str));
        this.u = str;
    }

    public void C(long j) {
        vc5.b().c(o72.d(C, this, this, iz0.e(j)));
        this.s = j;
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.q = xd1.b(m13.k(byteBuffer));
            this.r = xd1.b(m13.k(byteBuffer));
            this.s = m13.j(byteBuffer);
            this.t = m13.k(byteBuffer);
        } else {
            this.q = xd1.b(m13.j(byteBuffer));
            this.r = xd1.b(m13.j(byteBuffer));
            this.s = m13.j(byteBuffer);
            this.t = m13.j(byteBuffer);
        }
        this.u = m13.f(byteBuffer);
        m13.h(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (p() == 1) {
            n13.h(byteBuffer, xd1.a(this.q));
            n13.h(byteBuffer, xd1.a(this.r));
            n13.g(byteBuffer, this.s);
            n13.h(byteBuffer, this.t);
        } else {
            n13.g(byteBuffer, xd1.a(this.q));
            n13.g(byteBuffer, xd1.a(this.r));
            n13.g(byteBuffer, this.s);
            n13.g(byteBuffer, this.t);
        }
        n13.d(byteBuffer, this.u);
        n13.e(byteBuffer, 0);
    }

    @Override // com.zepto.c2
    public long c() {
        return (p() == 1 ? 32L : 20L) + 4;
    }

    public String toString() {
        vc5.b().c(o72.c(F, this, this));
        return "MediaHeaderBox[creationTime=" + u() + ";modificationTime=" + x() + ";timescale=" + y() + ";duration=" + v() + ";language=" + w() + "]";
    }

    public Date u() {
        vc5.b().c(o72.c(v, this, this));
        return this.q;
    }

    public long v() {
        vc5.b().c(o72.c(y, this, this));
        return this.t;
    }

    public String w() {
        vc5.b().c(o72.c(z, this, this));
        return this.u;
    }

    public Date x() {
        vc5.b().c(o72.c(w, this, this));
        return this.r;
    }

    public long y() {
        vc5.b().c(o72.c(x, this, this));
        return this.s;
    }

    public void z(Date date) {
        vc5.b().c(o72.d(A, this, this, date));
        this.q = date;
    }
}
