package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class dj6 extends g2 {
    public static final /* synthetic */ r43.a A = null;
    public static final /* synthetic */ r43.a B = null;
    public static final /* synthetic */ r43.a C = null;
    public static final /* synthetic */ r43.a D = null;
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
    public Date q;
    public Date r;
    public long s;
    public long t;
    public int u;
    public int v;
    public float w;
    public gr3 x;
    public double y;
    public double z;

    static {
        n();
    }

    public dj6() {
        super("tkhd");
        this.x = gr3.j;
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("TrackHeaderBox.java", dj6.class);
        A = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        B = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        K = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        L = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 170);
        M = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        N = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        O = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), 211);
        P = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        Q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        R = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        S = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        T = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        C = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        U = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 238);
        V = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 242);
        W = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        X = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        Y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), KotlinVersion.MAX_COMPONENT_VALUE);
        Z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        a0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        b0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        c0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        d0 = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        D = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        E = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        F = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        G = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        H = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        I = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        J = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public long A() {
        vc5.b().c(o72.c(C, this, this));
        return this.s;
    }

    public float B() {
        vc5.b().c(o72.c(G, this, this));
        return this.w;
    }

    public double C() {
        vc5.b().c(o72.c(I, this, this));
        return this.y;
    }

    public void D(int i) {
        vc5.b().c(o72.d(R, this, this, iz0.d(i)));
        this.v = i;
    }

    public void E(Date date) {
        vc5.b().c(o72.d(M, this, this, date));
        this.q = date;
        if (xd1.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j) {
        vc5.b().c(o72.d(P, this, this, iz0.e(j)));
        this.t = j;
        if (j >= 4294967296L) {
            r(1);
        }
    }

    public void G(boolean z) {
        vc5.b().c(o72.d(a0, this, this, iz0.a(z)));
        if (z) {
            r(o() | 1);
        } else {
            r(o() & (-2));
        }
    }

    public void H(double d) {
        vc5.b().c(o72.d(V, this, this, iz0.b(d)));
        this.z = d;
    }

    public void I(boolean z) {
        vc5.b().c(o72.d(b0, this, this, iz0.a(z)));
        if (z) {
            r(o() | 2);
        } else {
            r(o() & (-3));
        }
    }

    public void J(boolean z) {
        vc5.b().c(o72.d(c0, this, this, iz0.a(z)));
        if (z) {
            r(o() | 4);
        } else {
            r(o() & (-5));
        }
    }

    public void K(int i) {
        vc5.b().c(o72.d(Q, this, this, iz0.d(i)));
        this.u = i;
    }

    public void L(gr3 gr3Var) {
        vc5.b().c(o72.d(T, this, this, gr3Var));
        this.x = gr3Var;
    }

    public void M(Date date) {
        vc5.b().c(o72.d(N, this, this, date));
        this.r = date;
        if (xd1.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void N(long j) {
        vc5.b().c(o72.d(O, this, this, iz0.e(j)));
        this.s = j;
    }

    public void O(float f) {
        vc5.b().c(o72.d(S, this, this, iz0.c(f)));
        this.w = f;
    }

    public void P(double d) {
        vc5.b().c(o72.d(U, this, this, iz0.b(d)));
        this.y = d;
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.q = xd1.b(m13.k(byteBuffer));
            this.r = xd1.b(m13.k(byteBuffer));
            this.s = m13.j(byteBuffer);
            m13.j(byteBuffer);
            long j = byteBuffer.getLong();
            this.t = j;
            if (j < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.q = xd1.b(m13.j(byteBuffer));
            this.r = xd1.b(m13.j(byteBuffer));
            this.s = m13.j(byteBuffer);
            m13.j(byteBuffer);
            this.t = m13.j(byteBuffer);
        }
        m13.j(byteBuffer);
        m13.j(byteBuffer);
        this.u = m13.h(byteBuffer);
        this.v = m13.h(byteBuffer);
        this.w = m13.e(byteBuffer);
        m13.h(byteBuffer);
        this.x = gr3.a(byteBuffer);
        this.y = m13.d(byteBuffer);
        this.z = m13.d(byteBuffer);
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        vc5.b().c(o72.d(K, this, this, byteBuffer));
        t(byteBuffer);
        if (p() == 1) {
            n13.h(byteBuffer, xd1.a(this.q));
            n13.h(byteBuffer, xd1.a(this.r));
            n13.g(byteBuffer, this.s);
            n13.g(byteBuffer, 0L);
            n13.h(byteBuffer, this.t);
        } else {
            n13.g(byteBuffer, xd1.a(this.q));
            n13.g(byteBuffer, xd1.a(this.r));
            n13.g(byteBuffer, this.s);
            n13.g(byteBuffer, 0L);
            n13.g(byteBuffer, this.t);
        }
        n13.g(byteBuffer, 0L);
        n13.g(byteBuffer, 0L);
        n13.e(byteBuffer, this.u);
        n13.e(byteBuffer, this.v);
        n13.c(byteBuffer, this.w);
        n13.e(byteBuffer, 0);
        this.x.c(byteBuffer);
        n13.b(byteBuffer, this.y);
        n13.b(byteBuffer, this.z);
    }

    @Override // com.zepto.c2
    public long c() {
        return (p() == 1 ? 36L : 24L) + 60;
    }

    public String toString() {
        vc5.b().c(o72.c(L, this, this));
        return "TrackHeaderBox[creationTime=" + v() + ";modificationTime=" + z() + ";trackId=" + A() + ";duration=" + w() + ";layer=" + y() + ";alternateGroup=" + u() + ";volume=" + B() + ";matrix=" + this.x + ";width=" + C() + ";height=" + x() + "]";
    }

    public int u() {
        vc5.b().c(o72.c(F, this, this));
        return this.v;
    }

    public Date v() {
        vc5.b().c(o72.c(A, this, this));
        return this.q;
    }

    public long w() {
        vc5.b().c(o72.c(D, this, this));
        return this.t;
    }

    public double x() {
        vc5.b().c(o72.c(J, this, this));
        return this.z;
    }

    public int y() {
        vc5.b().c(o72.c(E, this, this));
        return this.u;
    }

    public Date z() {
        vc5.b().c(o72.c(B, this, this));
        return this.r;
    }
}
