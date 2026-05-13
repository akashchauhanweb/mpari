package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class zf6 extends g2 {
    public static Map r;
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public List q;

    public static class a {
        public long a;
        public long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public void c(long j) {
            this.a = j;
        }

        public String toString() {
            return "Entry{count=" + this.a + ", delta=" + this.b + '}';
        }
    }

    static {
        n();
        r = new WeakHashMap();
    }

    public zf6() {
        super("stts");
        this.q = Collections.emptyList();
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("TimeToSampleBox.java", zf6.class);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int iA = pb0.a(m13.j(byteBuffer));
        this.q = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            this.q.add(new a(m13.j(byteBuffer), m13.j(byteBuffer)));
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.q.size());
        for (a aVar : this.q) {
            n13.g(byteBuffer, aVar.a());
            n13.g(byteBuffer, aVar.b());
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.q.size() * 8) + 8;
    }

    public String toString() {
        vc5.b().c(o72.c(u, this, this));
        return "TimeToSampleBox[entryCount=" + this.q.size() + "]";
    }

    public void u(List list) {
        vc5.b().c(o72.d(t, this, this, list));
        this.q = list;
    }
}
