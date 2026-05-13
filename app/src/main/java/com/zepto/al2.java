package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class al2 extends g2 {
    public static final /* synthetic */ r43.a A = null;
    public static final /* synthetic */ r43.a B = null;
    public static final /* synthetic */ r43.a C = null;
    public static final /* synthetic */ r43.a D = null;
    public static final Map x;
    public static final /* synthetic */ r43.a y = null;
    public static final /* synthetic */ r43.a z = null;
    public String q;
    public String r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public long w;

    static {
        n();
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put("hint", "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        x = Collections.unmodifiableMap(map);
    }

    public al2() {
        super("hdlr");
        this.r = null;
        this.v = true;
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("HandlerBox.java", al2.class);
        y = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        z = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "name", "", "void"), 87);
        A = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", "void"), 91);
        B = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        C = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        D = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.w = m13.j(byteBuffer);
        this.q = m13.b(byteBuffer);
        this.s = m13.j(byteBuffer);
        this.t = m13.j(byteBuffer);
        this.u = m13.j(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.v = false;
            return;
        }
        String strG = m13.g(byteBuffer, byteBuffer.remaining());
        this.r = strG;
        if (!strG.endsWith("\u0000")) {
            this.v = false;
            return;
        }
        String str = this.r;
        this.r = str.substring(0, str.length() - 1);
        this.v = true;
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.w);
        byteBuffer.put(l13.P(this.q));
        n13.g(byteBuffer, this.s);
        n13.g(byteBuffer, this.t);
        n13.g(byteBuffer, this.u);
        String str = this.r;
        if (str != null) {
            byteBuffer.put(ys6.b(str));
        }
        if (this.v) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return this.v ? ys6.c(this.r) + 25 : ys6.c(this.r) + 24;
    }

    public String toString() {
        vc5.b().c(o72.c(D, this, this));
        return "HandlerBox[handlerType=" + u() + ";name=" + v() + "]";
    }

    public String u() {
        vc5.b().c(o72.c(y, this, this));
        return this.q;
    }

    public String v() {
        vc5.b().c(o72.c(B, this, this));
        return this.r;
    }

    public void w(String str) {
        vc5.b().c(o72.d(A, this, this, str));
        this.q = str;
    }

    public void x(String str) {
        vc5.b().c(o72.d(z, this, this, str));
        this.r = str;
    }
}
