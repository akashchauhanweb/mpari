package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class ix3 extends g2 {
    public static final /* synthetic */ r43.a E = null;
    public static final /* synthetic */ r43.a F = null;
    public static final /* synthetic */ r43.a G = null;
    public static final /* synthetic */ r43.a H = null;
    public static final /* synthetic */ r43.a I = null;
    public static final /* synthetic */ r43.a J = null;
    public static final /* synthetic */ r43.a K = null;
    public static final /* synthetic */ r43.a L = null;
    public static final /* synthetic */ r43.a M = null;
    public static final /* synthetic */ r43.a N = null;
    public static final /* synthetic */ r43.a O = null;
    public static final /* synthetic */ r43.a P = null;
    public static final /* synthetic */ r43.a Q = null;
    public static final /* synthetic */ r43.a R = null;
    public static final /* synthetic */ r43.a S = null;
    public static final /* synthetic */ r43.a T = null;
    public static final /* synthetic */ r43.a U = null;
    public static final /* synthetic */ r43.a V = null;
    public static final /* synthetic */ r43.a W = null;
    public static final /* synthetic */ r43.a X = null;
    public static final /* synthetic */ r43.a Y = null;
    public static final /* synthetic */ r43.a Z = null;
    public static final /* synthetic */ r43.a a0 = null;
    public static final /* synthetic */ r43.a b0 = null;
    public static final /* synthetic */ r43.a c0 = null;
    public static final /* synthetic */ r43.a d0 = null;
    public static final /* synthetic */ r43.a e0 = null;
    public static final /* synthetic */ r43.a f0 = null;
    public static final /* synthetic */ r43.a g0 = null;
    public int A;
    public int B;
    public int C;
    public int D;
    public Date q;
    public Date r;
    public long s;
    public long t;
    public double u;
    public float v;
    public gr3 w;
    public long x;
    public int y;
    public int z;

    static {
        n();
    }

    public ix3() {
        super("mvhd");
        this.u = 1.0d;
        this.v = 1.0f;
        this.w = gr3.j;
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("MovieHeaderBox.java", ix3.class);
        E = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        F = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        O = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        P = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), 211);
        Q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        R = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        S = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        T = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        U = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        V = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        W = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        X = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        G = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        Y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 250);
        Z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        a0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        b0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        c0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        d0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        e0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        f0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        g0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        H = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        I = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        J = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        K = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        L = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        M = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        N = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public float A() {
        vc5.b().c(o72.c(J, this, this));
        return this.v;
    }

    public void B(Date date) {
        vc5.b().c(o72.d(N, this, this, date));
        this.q = date;
        if (xd1.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void C(long j) {
        vc5.b().c(o72.d(Q, this, this, iz0.e(j)));
        this.t = j;
        if (j >= 4294967296L) {
            s(1);
        }
    }

    public void D(gr3 gr3Var) {
        vc5.b().c(o72.d(T, this, this, gr3Var));
        this.w = gr3Var;
    }

    public void E(Date date) {
        vc5.b().c(o72.d(O, this, this, date));
        this.r = date;
        if (xd1.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j) {
        vc5.b().c(o72.d(U, this, this, iz0.e(j)));
        this.x = j;
    }

    public void G(long j) {
        vc5.b().c(o72.d(P, this, this, iz0.e(j)));
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
        this.u = m13.d(byteBuffer);
        this.v = m13.e(byteBuffer);
        m13.h(byteBuffer);
        m13.j(byteBuffer);
        m13.j(byteBuffer);
        this.w = gr3.a(byteBuffer);
        this.y = byteBuffer.getInt();
        this.z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.D = byteBuffer.getInt();
        this.x = m13.j(byteBuffer);
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
        n13.b(byteBuffer, this.u);
        n13.c(byteBuffer, this.v);
        n13.e(byteBuffer, 0);
        n13.g(byteBuffer, 0L);
        n13.g(byteBuffer, 0L);
        this.w.c(byteBuffer);
        byteBuffer.putInt(this.y);
        byteBuffer.putInt(this.z);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.D);
        n13.g(byteBuffer, this.x);
    }

    @Override // com.zepto.c2
    public long c() {
        return (p() == 1 ? 32L : 20L) + 80;
    }

    public String toString() {
        vc5.b().c(o72.c(M, this, this));
        return "MovieHeaderBox[creationTime=" + u() + ";modificationTime=" + w() + ";timescale=" + z() + ";duration=" + v() + ";rate=" + y() + ";volume=" + A() + ";matrix=" + this.w + ";nextTrackId=" + x() + "]";
    }

    public Date u() {
        vc5.b().c(o72.c(E, this, this));
        return this.q;
    }

    public long v() {
        vc5.b().c(o72.c(H, this, this));
        return this.t;
    }

    public Date w() {
        vc5.b().c(o72.c(F, this, this));
        return this.r;
    }

    public long x() {
        vc5.b().c(o72.c(L, this, this));
        return this.x;
    }

    public double y() {
        vc5.b().c(o72.c(I, this, this));
        return this.u;
    }

    public long z() {
        vc5.b().c(o72.c(G, this, this));
        return this.s;
    }
}
