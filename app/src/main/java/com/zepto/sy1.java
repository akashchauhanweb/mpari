package com.zepto;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class sy1 extends q40 {
    public static Logger q = Logger.getLogger(sy1.class.getName());
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String j;
    public int k;
    public int l;
    public int m;
    public qe1 n;
    public mg5 o;
    public int i = 0;
    public List p = new ArrayList();

    @Override // com.zepto.q40
    public void e(ByteBuffer byteBuffer) {
        this.d = m13.h(byteBuffer);
        int iL = m13.l(byteBuffer);
        int i = iL >>> 7;
        this.e = i;
        this.f = (iL >>> 6) & 1;
        this.g = (iL >>> 5) & 1;
        this.h = iL & 31;
        if (i == 1) {
            this.l = m13.h(byteBuffer);
        }
        if (this.f == 1) {
            int iL2 = m13.l(byteBuffer);
            this.i = iL2;
            this.j = m13.g(byteBuffer, iL2);
        }
        if (this.g == 1) {
            this.m = m13.h(byteBuffer);
        }
        int iB = b() + 4 + (this.e == 1 ? 2 : 0) + (this.f == 1 ? this.i + 1 : 0) + (this.g == 1 ? 2 : 0);
        int iPosition = byteBuffer.position();
        if (a() > iB + 2) {
            q40 q40VarA = ve4.a(-1, byteBuffer);
            long jPosition = byteBuffer.position() - iPosition;
            Logger logger = q;
            StringBuilder sb = new StringBuilder();
            sb.append(q40VarA);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(jPosition);
            sb.append(", size: ");
            sb.append(q40VarA != null ? Integer.valueOf(q40VarA.a()) : null);
            logger.finer(sb.toString());
            if (q40VarA != null) {
                int iA = q40VarA.a();
                byteBuffer.position(iPosition + iA);
                iB += iA;
            } else {
                iB = (int) (((long) iB) + jPosition);
            }
            if (q40VarA instanceof qe1) {
                this.n = (qe1) q40VarA;
            }
        }
        int iPosition2 = byteBuffer.position();
        if (a() > iB + 2) {
            q40 q40VarA2 = ve4.a(-1, byteBuffer);
            long jPosition2 = byteBuffer.position() - iPosition2;
            Logger logger2 = q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q40VarA2);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(q40VarA2 != null ? Integer.valueOf(q40VarA2.a()) : null);
            logger2.finer(sb2.toString());
            if (q40VarA2 != null) {
                int iA2 = q40VarA2.a();
                byteBuffer.position(iPosition2 + iA2);
                iB += iA2;
            } else {
                iB = (int) (((long) iB) + jPosition2);
            }
            if (q40VarA2 instanceof mg5) {
                this.o = (mg5) q40VarA2;
            }
        } else {
            q.warning("SLConfigDescriptor is missing!");
        }
        while (a() - iB > 2) {
            int iPosition3 = byteBuffer.position();
            q40 q40VarA3 = ve4.a(-1, byteBuffer);
            long jPosition3 = byteBuffer.position() - iPosition3;
            Logger logger3 = q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(q40VarA3);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(jPosition3);
            sb3.append(", size: ");
            sb3.append(q40VarA3 != null ? Integer.valueOf(q40VarA3.a()) : null);
            logger3.finer(sb3.toString());
            if (q40VarA3 != null) {
                int iA3 = q40VarA3.a();
                byteBuffer.position(iPosition3 + iA3);
                iB += iA3;
            } else {
                iB = (int) (((long) iB) + jPosition3);
            }
            this.p.add(q40VarA3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sy1 sy1Var = (sy1) obj;
        if (this.f != sy1Var.f || this.i != sy1Var.i || this.l != sy1Var.l || this.d != sy1Var.d || this.m != sy1Var.m || this.g != sy1Var.g || this.k != sy1Var.k || this.e != sy1Var.e || this.h != sy1Var.h) {
            return false;
        }
        String str = this.j;
        if (str == null ? sy1Var.j != null : !str.equals(sy1Var.j)) {
            return false;
        }
        qe1 qe1Var = this.n;
        if (qe1Var == null ? sy1Var.n != null : !qe1Var.equals(sy1Var.n)) {
            return false;
        }
        List list = this.p;
        if (list == null ? sy1Var.p != null : !list.equals(sy1Var.p)) {
            return false;
        }
        mg5 mg5Var = this.o;
        mg5 mg5Var2 = sy1Var.o;
        return mg5Var == null ? mg5Var2 == null : mg5Var.equals(mg5Var2);
    }

    public ByteBuffer f() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(g());
        n13.i(byteBufferAllocate, 3);
        n13.i(byteBufferAllocate, g() - 2);
        n13.e(byteBufferAllocate, this.d);
        n13.i(byteBufferAllocate, (this.e << 7) | (this.f << 6) | (this.g << 5) | (this.h & 31));
        if (this.e > 0) {
            n13.e(byteBufferAllocate, this.l);
        }
        if (this.f > 0) {
            n13.i(byteBufferAllocate, this.i);
            n13.j(byteBufferAllocate, this.j);
        }
        if (this.g > 0) {
            n13.e(byteBufferAllocate, this.m);
        }
        ByteBuffer byteBufferF = this.n.f();
        ByteBuffer byteBufferF2 = this.o.f();
        byteBufferAllocate.put(byteBufferF.array());
        byteBufferAllocate.put(byteBufferF2.array());
        return byteBufferAllocate;
    }

    public int g() {
        int i = this.e > 0 ? 7 : 5;
        if (this.f > 0) {
            i += this.i + 1;
        }
        if (this.g > 0) {
            i += 2;
        }
        return i + this.n.g() + this.o.g();
    }

    public void h(qe1 qe1Var) {
        this.n = qe1Var;
    }

    public int hashCode() {
        int i = ((((((((((this.d * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str = this.j;
        int iHashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31;
        qe1 qe1Var = this.n;
        int iHashCode2 = (iHashCode + (qe1Var != null ? qe1Var.hashCode() : 0)) * 31;
        mg5 mg5Var = this.o;
        int iHashCode3 = (iHashCode2 + (mg5Var != null ? mg5Var.hashCode() : 0)) * 31;
        List list = this.p;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public void i(int i) {
        this.d = i;
    }

    public void j(mg5 mg5Var) {
        this.o = mg5Var;
    }

    public String toString() {
        return "ESDescriptor{esId=" + this.d + ", streamDependenceFlag=" + this.e + ", URLFlag=" + this.f + ", oCRstreamFlag=" + this.g + ", streamPriority=" + this.h + ", URLLength=" + this.i + ", URLString='" + this.j + "', remoteODFlag=" + this.k + ", dependsOnEsId=" + this.l + ", oCREsId=" + this.m + ", decoderConfigDescriptor=" + this.n + ", slConfigDescriptor=" + this.o + '}';
    }
}
