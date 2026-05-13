package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vb2 extends c2 {
    public static final /* synthetic */ r43.a p = null;
    public static final /* synthetic */ r43.a q = null;
    public static final /* synthetic */ r43.a r = null;
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public String m;
    public long n;
    public List o;

    static {
        n();
    }

    public vb2(String str, long j, List list) {
        super("ftyp");
        Collections.emptyList();
        this.m = str;
        this.n = j;
        this.o = list;
    }

    public static /* synthetic */ void n() {
        o72 o72Var = new o72("FileTypeBox.java", vb2.class);
        p = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        q = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        r = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "", "void"), 103);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        this.m = m13.b(byteBuffer);
        this.n = m13.j(byteBuffer);
        int iRemaining = byteBuffer.remaining() / 4;
        this.o = new LinkedList();
        for (int i = 0; i < iRemaining; i++) {
            this.o.add(m13.b(byteBuffer));
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        byteBuffer.put(l13.P(this.m));
        n13.g(byteBuffer, this.n);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            byteBuffer.put(l13.P((String) it.next()));
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.o.size() * 4) + 8;
    }

    public String o() {
        vc5.b().c(o72.c(p, this, this));
        return this.m;
    }

    public long p() {
        vc5.b().c(o72.c(s, this, this));
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FileTypeBox[");
        sb.append("majorBrand=");
        sb.append(o());
        sb.append(";");
        sb.append("minorVersion=");
        sb.append(p());
        for (String str : this.o) {
            sb.append(";");
            sb.append("compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
