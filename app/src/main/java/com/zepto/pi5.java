package com.zepto;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.r43;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class pi5 extends g2 {
    public static final /* synthetic */ r43.a r = null;
    public static final /* synthetic */ r43.a s = null;
    public static final /* synthetic */ r43.a t = null;
    public static final /* synthetic */ r43.a u = null;
    public List q;

    public static class a {
        public long a;
        public long b;
        public long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.c;
        }

        public long c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.b == aVar.b;
        }

        public int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.a + ", samplesPerChunk=" + this.b + ", sampleDescriptionIndex=" + this.c + '}';
        }
    }

    static {
        n();
    }

    public pi5() {
        super("stsc");
        this.q = Collections.emptyList();
    }

    private static /* synthetic */ void n() {
        o72 o72Var = new o72("SampleToChunkBox.java", pi5.class);
        r = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        s = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        t = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        u = o72Var.f("method-execution", o72Var.e(VContant.MAINSCREEN, "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    @Override // com.zepto.c2
    public void a(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int iA = pb0.a(m13.j(byteBuffer));
        this.q = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            this.q.add(new a(m13.j(byteBuffer), m13.j(byteBuffer), m13.j(byteBuffer)));
        }
    }

    @Override // com.zepto.c2
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        n13.g(byteBuffer, this.q.size());
        for (a aVar : this.q) {
            n13.g(byteBuffer, aVar.a());
            n13.g(byteBuffer, aVar.c());
            n13.g(byteBuffer, aVar.b());
        }
    }

    @Override // com.zepto.c2
    public long c() {
        return (this.q.size() * 12) + 8;
    }

    public String toString() {
        vc5.b().c(o72.c(t, this, this));
        return "SampleToChunkBox[entryCount=" + this.q.size() + "]";
    }

    public List u() {
        vc5.b().c(o72.c(r, this, this));
        return this.q;
    }

    public void v(List list) {
        vc5.b().c(o72.d(s, this, this, list));
        this.q = list;
    }
}
