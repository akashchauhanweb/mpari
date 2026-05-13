package com.zepto;

import com.zepto.vo4;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class pq4 extends wt1 {
    public static final lp4 b0 = new lp4("1.2");
    public static final lp4 c0 = new lp4("1.3");
    public static final lp4 d0 = new lp4("1.4");
    public static final lp4 e0 = new lp4("1.5");
    public static final lp4 f0 = new lp4("1.6");
    public static final lp4 g0 = new lp4("1.7");
    public static final lp4 h0 = lp4.gb;
    public static final lp4 i0 = lp4.rb;
    public static final lp4 j0 = lp4.n2;
    public static final lp4 k0 = lp4.qb;
    public static final lp4 l0 = lp4.l2;
    public static final lp4 m0 = lp4.p6;
    public static final lp4 n0 = lp4.w0;
    public HashMap A;
    public HashMap B;
    public int C;
    public HashMap D;
    public int E;
    public HashSet F;
    public HashSet G;
    public HashMap H;
    public HashMap I;
    public boolean J;
    public iq4 K;
    public HashSet L;
    public ArrayList M;
    public qp4 N;
    public ko4 O;
    public ko4 P;
    public uo4 Q;
    public float R;
    public int S;
    public float T;
    public uo4 U;
    public HashMap V;
    public uo4 W;
    public HashMap X;
    public HashMap Y;
    public boolean Z;
    public boolean a0;
    public vo4 g;
    public po4 h;
    public po4 i;
    public a j;
    public uo4 k;
    public aq4 l;
    public ArrayList m;
    public int n;
    public lp4 o;
    public int p;
    public List q;
    public lq4 r;
    public byte[] s;
    public rq4 t;
    public boolean u;
    public int v;
    public LinkedHashMap w;
    public int x;
    public HashMap y;
    public int z;

    public static class a {
        public TreeSet a;
        public int b;
        public int c;
        public pq4 d;
        public o80 e;
        public o80 f;
        public int g;
        public int h = 0;

        /* JADX INFO: renamed from: com.zepto.pq4$a$a, reason: collision with other inner class name */
        public static class C0115a implements Comparable {
            public int c;
            public int e;
            public int f;
            public int g;

            public C0115a(int i, int i2, int i3) {
                this.c = 0;
                this.e = i2;
                this.f = i;
                this.g = i3;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(C0115a c0115a) {
                int i = this.f;
                int i2 = c0115a.f;
                if (i < i2) {
                    return -1;
                }
                return i == i2 ? 0 : 1;
            }

            public int b() {
                return this.f;
            }

            public void c(int i, OutputStream outputStream) throws IOException {
                outputStream.write((byte) this.c);
                while (true) {
                    i--;
                    if (i < 0) {
                        outputStream.write((byte) ((this.g >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                        outputStream.write((byte) (this.g & KotlinVersion.MAX_COMPONENT_VALUE));
                        return;
                    }
                    outputStream.write((byte) ((this.e >>> (i * 8)) & KotlinVersion.MAX_COMPONENT_VALUE));
                }
            }

            public void d(OutputStream outputStream) throws IOException {
                StringBuffer stringBuffer = new StringBuffer("0000000000");
                stringBuffer.append(this.e);
                stringBuffer.delete(0, stringBuffer.length() - 10);
                StringBuffer stringBuffer2 = new StringBuffer("00000");
                stringBuffer2.append(this.g);
                stringBuffer2.delete(0, stringBuffer2.length() - 5);
                stringBuffer.append(' ');
                stringBuffer.append(stringBuffer2);
                stringBuffer.append(this.g == 65535 ? " f \n" : " n \n");
                outputStream.write(wt1.f(stringBuffer.toString()));
            }

            public boolean equals(Object obj) {
                return (obj instanceof C0115a) && this.f == ((C0115a) obj).f;
            }

            public int hashCode() {
                return this.f;
            }

            public C0115a(int i, int i2) {
                this.c = 1;
                this.e = i2;
                this.f = i;
                this.g = 0;
            }

            public C0115a(int i, int i2, int i3, int i4) {
                this.c = i;
                this.e = i3;
                this.f = i2;
                this.g = i4;
            }
        }

        public a(pq4 pq4Var) {
            TreeSet treeSet = new TreeSet();
            this.a = treeSet;
            treeSet.add(new C0115a(0, 0, 65535));
            this.c = pq4Var.F().d();
            this.b = 1;
            this.d = pq4Var;
        }

        public fp4 b(rp4 rp4Var) {
            return c(rp4Var, j());
        }

        public fp4 c(rp4 rp4Var, int i) {
            return d(rp4Var, i, true);
        }

        public fp4 d(rp4 rp4Var, int i, boolean z) throws IOException {
            if (z && rp4Var.a() && this.d.Q()) {
                C0115a c0115aH = h(rp4Var, i);
                fp4 fp4Var = new fp4(i, rp4Var, this.d);
                if (!this.a.add(c0115aH)) {
                    this.a.remove(c0115aH);
                    this.a.add(c0115aH);
                }
                return fp4Var;
            }
            fp4 fp4Var2 = new fp4(i, rp4Var, this.d);
            C0115a c0115a = new C0115a(i, this.c);
            if (!this.a.add(c0115a)) {
                this.a.remove(c0115a);
                this.a.add(c0115a);
            }
            fp4Var2.b(this.d.F());
            this.c = this.d.F().d();
            return fp4Var2;
        }

        public fp4 e(rp4 rp4Var, gp4 gp4Var) {
            return c(rp4Var, gp4Var.m());
        }

        public fp4 f(rp4 rp4Var, gp4 gp4Var, boolean z) {
            return d(rp4Var, gp4Var.m(), z);
        }

        public fp4 g(rp4 rp4Var, boolean z) {
            return d(rp4Var, j(), z);
        }

        public final C0115a h(rp4 rp4Var, int i) throws IOException {
            if (this.h >= 200) {
                i();
            }
            if (this.e == null) {
                this.e = new o80();
                this.f = new o80();
                this.g = j();
                this.h = 0;
            }
            int iX0 = this.f.x0();
            int i2 = this.h;
            this.h = i2 + 1;
            this.d.getClass();
            this.d.getClass();
            rp4Var.k(this.d, this.f);
            this.d.getClass();
            this.f.e(' ');
            this.e.n(i).e(' ').n(iX0).e(' ');
            return new C0115a(2, i, this.g, i2);
        }

        public final void i() {
            if (this.h == 0) {
                return;
            }
            int iX0 = this.e.x0();
            this.e.w(this.f);
            gq4 gq4Var = new gq4(this.e.y0());
            gq4Var.v(this.d.u());
            gq4Var.r(lp4.sa, lp4.s6);
            gq4Var.r(lp4.R5, new op4(this.h));
            gq4Var.r(lp4.d3, new op4(iX0));
            c(gq4Var, this.g);
            this.e = null;
            this.f = null;
            this.h = 0;
        }

        public int j() {
            int i = this.b;
            this.b = i + 1;
            this.a.add(new C0115a(i, 0, 65535));
            return i;
        }

        public gp4 k() {
            return new gp4(0, j());
        }

        public int l() {
            return this.c;
        }

        public int m() {
            return Math.max(((C0115a) this.a.last()).b() + 1, this.b);
        }

        public void n(OutputStream outputStream, gp4 gp4Var, gp4 gp4Var2, gp4 gp4Var3, rp4 rp4Var, int i) throws IOException {
            int iJ;
            int i2 = 0;
            if (this.d.Q()) {
                i();
                iJ = j();
                this.a.add(new C0115a(iJ, this.c));
            } else {
                iJ = 0;
            }
            int iB = ((C0115a) this.a.first()).b();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (C0115a c0115a : this.a) {
                if (iB + i3 == c0115a.b()) {
                    i3++;
                } else {
                    arrayList.add(Integer.valueOf(iB));
                    arrayList.add(Integer.valueOf(i3));
                    iB = c0115a.b();
                    i3 = 1;
                }
            }
            arrayList.add(Integer.valueOf(iB));
            arrayList.add(Integer.valueOf(i3));
            if (!this.d.Q()) {
                outputStream.write(wt1.f("xref\n"));
                Iterator it = this.a.iterator();
                while (i2 < arrayList.size()) {
                    int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                    int iIntValue2 = ((Integer) arrayList.get(i2 + 1)).intValue();
                    outputStream.write(wt1.f(String.valueOf(iIntValue)));
                    outputStream.write(wt1.f(" "));
                    outputStream.write(wt1.f(String.valueOf(iIntValue2)));
                    outputStream.write(10);
                    while (true) {
                        int i4 = iIntValue2 - 1;
                        if (iIntValue2 > 0) {
                            ((C0115a) it.next()).d(outputStream);
                            iIntValue2 = i4;
                        }
                    }
                    i2 += 2;
                }
                return;
            }
            int i5 = 4;
            int i6 = -16777216;
            while (i5 > 1 && (this.c & i6) == 0) {
                i6 >>>= 8;
                i5--;
            }
            o80 o80Var = new o80();
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((C0115a) it2.next()).c(i5, o80Var);
            }
            gq4 gq4Var = new gq4(o80Var.y0());
            gq4Var.v(this.d.u());
            gq4Var.r(lp4.V8, new op4(m()));
            gq4Var.r(lp4.y8, gp4Var);
            if (gp4Var2 != null) {
                gq4Var.r(lp4.H4, gp4Var2);
            }
            if (gp4Var3 != null) {
                gq4Var.r(lp4.F2, gp4Var3);
            }
            if (rp4Var != null) {
                gq4Var.r(lp4.w4, rp4Var);
            }
            gq4Var.r(lp4.db, new ko4(new int[]{1, i5, 2}));
            gq4Var.r(lp4.sa, lp4.zb);
            ko4 ko4Var = new ko4();
            while (i2 < arrayList.size()) {
                ko4Var.m(new op4(((Integer) arrayList.get(i2)).intValue()));
                i2++;
            }
            gq4Var.r(lp4.F4, ko4Var);
            if (i > 0) {
                gq4Var.r(lp4.B7, new op4(i));
            }
            this.d.getClass();
            this.d.getClass();
            new fp4(iJ, gq4Var, this.d).b(this.d.F());
            this.d.getClass();
        }
    }

    public static class b extends uo4 {
        public int m;

        public b(int i, int i2, gp4 gp4Var, gp4 gp4Var2, gp4 gp4Var3, rp4 rp4Var, int i3) {
            this.m = i2;
            r(lp4.V8, new op4(i));
            r(lp4.y8, gp4Var);
            if (gp4Var2 != null) {
                r(lp4.H4, gp4Var2);
            }
            if (gp4Var3 != null) {
                r(lp4.F2, gp4Var3);
            }
            if (rp4Var != null) {
                r(lp4.w4, rp4Var);
            }
            if (i3 > 0) {
                r(lp4.B7, new op4(i3));
            }
        }

        @Override // com.zepto.uo4, com.zepto.rp4
        public void k(pq4 pq4Var, OutputStream outputStream) throws IOException {
            outputStream.write(wt1.f("trailer\n"));
            super.k(null, outputStream);
            outputStream.write(wt1.f("\nstartxref\n"));
            outputStream.write(wt1.f(String.valueOf(this.m)));
            outputStream.write(wt1.f("\n%%EOF\n"));
        }
    }

    public pq4(vo4 vo4Var, OutputStream outputStream) {
        super(vo4Var, outputStream);
        this.l = new aq4(this);
        this.m = new ArrayList();
        this.n = 1;
        this.o = null;
        this.p = 0;
        this.r = new lq4();
        this.s = null;
        this.t = new rq4();
        this.u = false;
        this.v = -1;
        this.w = new LinkedHashMap();
        this.x = 1;
        this.y = new HashMap();
        this.z = 1;
        this.A = new HashMap();
        this.B = new HashMap();
        this.C = 1;
        this.D = new HashMap();
        this.E = 1;
        this.F = new HashSet();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = false;
        this.L = new HashSet();
        this.M = new ArrayList();
        this.O = new ko4();
        this.P = new ko4();
        this.R = 2.5f;
        this.S = 1;
        this.T = 0.0f;
        this.U = new uo4();
        this.V = new HashMap();
        this.W = new uo4();
        this.X = new HashMap();
        this.Y = new HashMap();
        this.g = vo4Var;
        this.h = new po4(this);
        this.i = new po4(this);
    }

    public static pq4 D(bu1 bu1Var, OutputStream outputStream) {
        vo4 vo4Var = new vo4();
        bu1Var.h(vo4Var);
        pq4 pq4Var = new pq4(vo4Var, outputStream);
        vo4Var.y(pq4Var);
        return pq4Var;
    }

    public static void E(ko4 ko4Var, hp4 hp4Var) {
        throw null;
    }

    public yo4 A() {
        return null;
    }

    public uo4 B() {
        if (this.k == null) {
            this.k = new uo4();
        }
        return this.k;
    }

    public uo4 C() {
        return this.g.G();
    }

    public sj4 F() {
        return this.c;
    }

    public int G() {
        return this.t.d();
    }

    public zp4 H() {
        return null;
    }

    public gp4 I(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(dt3.b("the.page.number.must.be.gt.eq.1", new Object[0]));
        }
        if (i2 < this.m.size()) {
            gp4 gp4Var = (gp4) this.m.get(i2);
            if (gp4Var != null) {
                return gp4Var;
            }
            gp4 gp4VarK = this.j.k();
            this.m.set(i2, gp4VarK);
            return gp4VarK;
        }
        int size = i2 - this.m.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.m.add(null);
        }
        gp4 gp4VarK2 = this.j.k();
        this.m.add(gp4VarK2);
        return gp4VarK2;
    }

    public vo4 J() {
        return this.g;
    }

    public gp4 K() {
        return this.j.k();
    }

    public lq4 L() {
        return this.r;
    }

    public float M() {
        return this.R;
    }

    public iq4 N() {
        if (this.J && this.K == null) {
            this.K = new iq4(this);
        }
        return this.K;
    }

    public lp4 O() {
        return this.o;
    }

    public float P() {
        return this.T;
    }

    public boolean Q() {
        return this.u;
    }

    public boolean R() {
        return this.t.f();
    }

    public boolean S() {
        return this.a0;
    }

    public boolean T() {
        return this.J;
    }

    public void U() {
        this.h.B();
        this.i.B();
    }

    public void V(lp4 lp4Var, rp4 rp4Var) {
        if (rp4Var == null || rp4Var.h()) {
            this.U.t(lp4Var);
        }
        this.U.r(lp4Var, rp4Var);
    }

    public void W(uo4 uo4Var, boolean z) {
        List list = this.q;
        if (list == null || list.isEmpty()) {
            return;
        }
        uo4 uo4Var2 = new uo4();
        gp4 gp4VarK = K();
        Object[] objArrB = x26.b(this, gp4VarK, this.q, z);
        uo4Var2.r(lp4.d3, (gp4) objArrB[0]);
        uo4Var2.r(lp4.f5, (gp4) objArrB[1]);
        uo4Var2.r(lp4.q1, new op4(((Integer) objArrB[2]).intValue()));
        o(uo4Var2, gp4VarK);
        uo4Var.r(lp4.N6, gp4VarK);
    }

    @Override // com.zepto.wt1, com.zepto.tt1
    public void a() {
        super.a();
        try {
            this.r.d(this.c);
            this.j = new a(this);
            if (this.t.h()) {
                uo4 uo4Var = new uo4();
                uo4Var.r(lp4.O3, new ko4(new float[]{2.2f, 2.2f, 2.2f}));
                uo4Var.r(lp4.z5, new ko4(new float[]{0.4124f, 0.2126f, 0.0193f, 0.3576f, 0.7152f, 0.1192f, 0.1805f, 0.0722f, 0.9505f}));
                uo4Var.r(lp4.pb, new ko4(new float[]{0.9505f, 1.0f, 1.089f}));
                ko4 ko4Var = new ko4(lp4.C0);
                ko4Var.m(uo4Var);
                V(lp4.P1, n(ko4Var).a());
            }
        } catch (IOException e) {
            throw new p52(e);
        }
    }

    @Override // com.zepto.wt1, com.zepto.tt1
    public void close() {
        if (this.d) {
            if (this.n - 1 != this.m.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("The page ");
                sb.append(this.m.size());
                sb.append(" was requested but the document has only ");
                sb.append(this.n - 1);
                sb.append(" pages.");
                throw new RuntimeException(sb.toString());
            }
            this.g.close();
            try {
                l();
                Iterator it = this.L.iterator();
                if (it.hasNext()) {
                    wb0.a(it.next());
                    throw null;
                }
                uo4 uo4VarT = t(this.l.b());
                if (this.s != null) {
                    gq4 gq4Var = new gq4(this.s);
                    lp4 lp4Var = lp4.sa;
                    lp4 lp4Var2 = lp4.L5;
                    gq4Var.r(lp4Var, lp4Var2);
                    gq4Var.r(lp4.v9, lp4.wb);
                    uo4VarT.r(lp4Var2, this.j.b(gq4Var).a());
                }
                if (R()) {
                    this.t.c(C());
                    this.t.b(B());
                }
                uo4 uo4Var = this.k;
                if (uo4Var != null) {
                    uo4VarT.q(uo4Var);
                }
                W(uo4VarT, false);
                fp4 fp4VarQ = q(uo4VarT, false);
                fp4 fp4VarQ2 = q(C(), false);
                this.j.i();
                rp4 rp4VarB = yo4.b(yo4.a());
                this.j.n(this.c, fp4VarQ.a(), fp4VarQ2.a(), null, rp4VarB, this.p);
                if (this.u) {
                    this.c.write(wt1.f("startxref\n"));
                    this.c.write(wt1.f(String.valueOf(this.j.l())));
                    this.c.write(wt1.f("\n%%EOF\n"));
                } else {
                    new b(this.j.m(), this.j.l(), fp4VarQ.a(), fp4VarQ2.a(), null, rp4VarB, this.p).k(this, this.c);
                }
                super.close();
            } catch (IOException e) {
                throw new p52(e);
            }
        }
    }

    public gp4 h(yp4 yp4Var, qo4 qo4Var) throws zo4 {
        if (!this.d) {
            throw new zo4(dt3.b("the.document.is.not.open", new Object[0]));
        }
        try {
            yp4Var.v(n(qo4Var).a());
            rp4 rp4Var = this.Q;
            if (rp4Var != null) {
                yp4Var.r(lp4.U3, rp4Var);
                this.Q = null;
            } else if (this.a0) {
                uo4 uo4Var = new uo4();
                lp4 lp4Var = lp4.sa;
                lp4 lp4Var2 = lp4.U3;
                uo4Var.r(lp4Var, lp4Var2);
                uo4Var.r(lp4.E8, lp4.ga);
                uo4Var.r(lp4.A1, lp4.X1);
                yp4Var.r(lp4Var2, uo4Var);
            }
            this.l.a(yp4Var);
            this.n++;
            return null;
        } catch (IOException e) {
            throw new p52(e);
        }
    }

    public final void i(lp4 lp4Var, lp4 lp4Var2) {
        ko4 ko4Var = new ko4();
        Iterator it = this.L.iterator();
        if (it.hasNext()) {
            wb0.a(it.next());
            lp4 lp4Var3 = lp4.g;
            throw null;
        }
        if (ko4Var.t() == 0) {
            return;
        }
        uo4 uo4Var = (uo4) this.N.m(lp4.D1);
        lp4 lp4Var4 = lp4.O;
        ko4 ko4Var2 = (ko4) uo4Var.m(lp4Var4);
        if (ko4Var2 == null) {
            ko4Var2 = new ko4();
            uo4Var.r(lp4Var4, ko4Var2);
        }
        uo4 uo4Var2 = new uo4();
        uo4Var2.r(lp4.P2, lp4Var);
        uo4Var2.r(lp4.G0, new ko4(lp4Var2));
        uo4Var2.r(lp4.v6, ko4Var);
        ko4Var2.m(uo4Var2);
    }

    public void j(io4 io4Var) {
        this.g.v(io4Var);
    }

    public void k(TreeMap treeMap) {
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            vo4.a aVar = (vo4.a) entry.getValue();
            to4 to4Var = aVar.c;
            if (aVar.b == null) {
                aVar.b = K();
            }
            if (to4Var == null) {
                o(new hq4("invalid_" + str), aVar.b);
            } else {
                o(to4Var, aVar.b);
            }
        }
    }

    public void l() {
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            ((ae2) it.next()).e(this);
        }
        Iterator it2 = this.y.values().iterator();
        while (it2.hasNext()) {
        }
        Iterator it3 = this.A.values().iterator();
        if (it3.hasNext()) {
            wb0.a(it3.next());
            throw null;
        }
        for (qr0 qr0Var : this.B.values()) {
            o(qr0Var.b(this), qr0Var.a());
        }
        Iterator it4 = this.D.keySet().iterator();
        if (it4.hasNext()) {
            wb0.a(it4.next());
            throw null;
        }
        Iterator it5 = this.F.iterator();
        if (it5.hasNext()) {
            wb0.a(it5.next());
            throw null;
        }
        Iterator it6 = this.G.iterator();
        if (it6.hasNext()) {
            wb0.a(it6.next());
            throw null;
        }
        for (Map.Entry entry : this.H.entrySet()) {
            o((uo4) entry.getKey(), (gp4) ((rp4[]) entry.getValue())[1]);
        }
        for (Map.Entry entry2 : this.I.entrySet()) {
            Object key = entry2.getKey();
            rp4[] rp4VarArr = (rp4[]) entry2.getValue();
            if (key instanceof uo4) {
                o((uo4) key, (gp4) rp4VarArr[1]);
            }
        }
    }

    public ae2 m(s40 s40Var) {
        if (s40Var.m() == 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("F");
            int i = this.x;
            this.x = i + 1;
            sb.append(i);
            new lp4(sb.toString());
            wb0.a(s40Var);
            throw null;
        }
        ae2 ae2Var = (ae2) this.w.get(s40Var);
        if (ae2Var != null) {
            return ae2Var;
        }
        rq4.a(this, 4, s40Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("F");
        int i2 = this.x;
        this.x = i2 + 1;
        sb2.append(i2);
        ae2 ae2Var2 = new ae2(new lp4(sb2.toString()), this.j.k(), s40Var);
        this.w.put(s40Var, ae2Var2);
        return ae2Var2;
    }

    public fp4 n(rp4 rp4Var) {
        return this.j.b(rp4Var);
    }

    public fp4 o(rp4 rp4Var, gp4 gp4Var) {
        return this.j.e(rp4Var, gp4Var);
    }

    public fp4 p(rp4 rp4Var, gp4 gp4Var, boolean z) {
        return this.j.f(rp4Var, gp4Var, z);
    }

    public fp4 q(rp4 rp4Var, boolean z) {
        return this.j.g(rp4Var, z);
    }

    public void r(uo4 uo4Var) {
        for (ae2 ae2Var : this.w.values()) {
            if (uo4Var.m(ae2Var.b()) != null) {
                ae2Var.d(false);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void s(boolean z) {
        if (this.N == null) {
            this.N = new qp4();
        }
        if (z) {
            this.N.t(lp4.v6);
            this.N.t(lp4.D1);
        }
        qp4 qp4Var = this.N;
        lp4 lp4Var = lp4.v6;
        if (qp4Var.m(lp4Var) == null) {
            ko4 ko4Var = new ko4();
            Iterator it = this.L.iterator();
            if (it.hasNext()) {
                wb0.a(it.next());
                throw null;
            }
            this.N.r(lp4Var, ko4Var);
        }
        if (this.N.m(lp4.D1) != null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.M);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            wb0.a(it2.next());
            throw null;
        }
        ko4 ko4Var2 = new ko4();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            wb0.a(it3.next());
            E(ko4Var2, null);
        }
        uo4 uo4Var = new uo4();
        this.N.r(lp4.D1, uo4Var);
        uo4Var.r(lp4.J6, ko4Var2);
        ko4 ko4Var3 = new ko4();
        Iterator it4 = this.L.iterator();
        if (it4.hasNext()) {
            wb0.a(it4.next());
            throw null;
        }
        if (ko4Var3.t() > 0) {
            uo4Var.r(lp4.z6, ko4Var3);
        }
        if (this.O.t() > 0) {
            uo4Var.r(lp4.X7, this.O);
        }
        if (this.P.t() > 0) {
            uo4Var.r(lp4.v5, this.P);
        }
        lp4 lp4Var2 = lp4.Va;
        i(lp4Var2, lp4.Fb);
        i(lp4Var2, lp4Var2);
        lp4 lp4Var3 = lp4.D7;
        i(lp4Var3, lp4Var3);
        lp4 lp4Var4 = lp4.N2;
        i(lp4Var4, lp4Var4);
        uo4Var.r(lp4.s5, lp4.bb);
    }

    public uo4 t(gp4 gp4Var) {
        vo4.c cVarE = this.g.E(gp4Var);
        if (this.J) {
            try {
                N().v();
                cVarE.r(lp4.q9, this.K.w());
                uo4 uo4Var = new uo4();
                lp4 lp4Var = lp4.C5;
                lo4 lo4Var = lo4.g;
                uo4Var.r(lp4Var, lo4Var);
                if (this.Z) {
                    uo4Var.r(lp4.Ka, lo4Var);
                }
                cVarE.r(lp4.D5, uo4Var);
            } catch (Exception e) {
                throw new p52(e);
            }
        }
        if (!this.L.isEmpty()) {
            s(false);
            cVarE.r(lp4.x6, this.N);
        }
        return cVarE;
    }

    public int u() {
        return this.v;
    }

    public gp4 v() {
        return I(this.n);
    }

    public int w() {
        return this.n;
    }

    public uo4 x() {
        return this.U;
    }

    public po4 y() {
        if (this.d) {
            return this.h;
        }
        throw new RuntimeException(dt3.b("the.document.is.not.open", new Object[0]));
    }

    public po4 z() {
        if (this.d) {
            return this.i;
        }
        throw new RuntimeException(dt3.b("the.document.is.not.open", new Object[0]));
    }
}
