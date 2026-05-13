package com.zepto;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class vo4 extends bu1 {
    public static final DecimalFormat h0 = new DecimalFormat("0000000000000000");
    public int A;
    public float C;
    public float D;
    public float E;
    public float F;
    public sp4 M;
    public sp4 N;
    public String S;
    public ho4 T;
    public uo4 U;
    public jo4 V;
    public int W;
    public gp4 d0;
    public al4 e0;
    public pq4 r;
    public po4 s;
    public po4 t;
    public float u = 0.0f;
    public int v = 0;
    public float w = 0.0f;
    public boolean x = false;
    public int y = 0;
    public ho4 z = null;
    public byte[] B = null;
    public boolean G = true;
    public ip4 H = null;
    public ArrayList I = new ArrayList();
    public int J = -1;
    public b K = new b();
    public d L = new d();
    public oq4 O = new oq4();
    public TreeMap P = new TreeMap();
    public HashMap Q = new HashMap();
    public HashMap R = new HashMap();
    public i65 X = null;
    public HashMap Y = new HashMap();
    public HashMap Z = new HashMap();
    public boolean a0 = true;
    public int b0 = -1;
    public uo4 c0 = null;
    public boolean f0 = false;
    public float g0 = -1.0f;

    public class a {
        public ho4 a;
        public gp4 b;
        public to4 c;

        public a() {
        }
    }

    public static class b {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 0.0f;
        public float g = 0.0f;
        public float h = 0.0f;
        public float i = 0.0f;
    }

    public static class c extends uo4 {
        public pq4 m;

        public c(gp4 gp4Var, pq4 pq4Var) {
            super(uo4.l);
            this.m = pq4Var;
            r(lp4.Y6, gp4Var);
        }

        public void v(TreeMap treeMap, HashMap map, HashMap map2, pq4 pq4Var) {
            if (treeMap.isEmpty() && map.isEmpty() && map2.isEmpty()) {
                return;
            }
            try {
                uo4 uo4Var = new uo4();
                if (!treeMap.isEmpty()) {
                    ko4 ko4Var = new ko4();
                    for (Map.Entry entry : treeMap.entrySet()) {
                        String str = (String) entry.getKey();
                        a aVar = (a) entry.getValue();
                        if (aVar.c != null) {
                            gp4 gp4Var = aVar.b;
                            ko4Var.m(new hq4(str, null));
                            ko4Var.m(gp4Var);
                        }
                    }
                    if (ko4Var.t() > 0) {
                        uo4 uo4Var2 = new uo4();
                        uo4Var2.r(lp4.Z5, ko4Var);
                        uo4Var.r(lp4.V1, pq4Var.n(uo4Var2).a());
                    }
                }
                if (!map.isEmpty()) {
                    uo4Var.r(lp4.T4, pq4Var.n(mp4.a(map, pq4Var)).a());
                }
                if (!map2.isEmpty()) {
                    uo4Var.r(lp4.B2, pq4Var.n(mp4.a(map2, pq4Var)).a());
                }
                if (uo4Var.u() > 0) {
                    r(lp4.Z5, pq4Var.n(uo4Var).a());
                }
            } catch (IOException e) {
                throw new p52(e);
            }
        }

        public void w(uo4 uo4Var) {
            try {
                r(lp4.j, this.m.n(uo4Var).a());
            } catch (Exception e) {
                throw new p52(e);
            }
        }

        public void x(ho4 ho4Var) {
            r(lp4.D6, ho4Var);
        }
    }

    public static class d extends uo4 {
        public d() {
            z();
            w();
        }

        public void A(String str) {
            r(lp4.t9, new hq4(str, "UnicodeBig"));
        }

        public void B(String str) {
            r(lp4.T9, new hq4(str, "UnicodeBig"));
        }

        public void C(String str, String str2) {
            if (str.equals("Producer") || str.equals("CreationDate")) {
                return;
            }
            r(new lp4(str), new hq4(str2, "UnicodeBig"));
        }

        public void v(String str) {
            r(lp4.U, new hq4(str, "UnicodeBig"));
        }

        public void w() {
            so4 so4Var = new so4();
            r(lp4.v1, so4Var);
            r(lp4.Q5, so4Var);
        }

        public void x(String str) {
            r(lp4.w1, new hq4(str, "UnicodeBig"));
        }

        public void y(String str) {
            r(lp4.Z4, new hq4(str, "UnicodeBig"));
        }

        public void z() {
            r(lp4.L7, new hq4(bu1.o()));
        }
    }

    public vo4() {
        i();
        g();
    }

    public void A() {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        ip4 ip4Var = this.H;
        if (ip4Var != null && ip4Var.w() > 0) {
            if (this.w + this.H.l() + this.u > M() - J()) {
                ip4 ip4Var2 = this.H;
                this.H = null;
                b();
                this.H = ip4Var2;
            }
            this.w += this.H.l();
            this.I.add(this.H);
            this.a0 = false;
        }
        float f = this.g0;
        if (f > -1.0f && this.w > f) {
            this.g0 = -1.0f;
            b bVar = this.K;
            bVar.g = 0.0f;
            bVar.d = 0.0f;
        }
        this.H = new ip4(K(), L(), this.v, this.u);
    }

    public void B() {
        try {
            int i = this.J;
            if (i == 11 || i == 10) {
                R();
                D();
            }
        } catch (cu1 e) {
            throw new p52(e);
        }
    }

    public boolean C(wp4 wp4Var, float f) {
        if (!wp4Var.G()) {
            wp4Var.V(((L() - K()) * wp4Var.C()) / 100.0f);
        }
        B();
        return wp4Var.A() + (this.w > 0.0f ? wp4Var.d0() : 0.0f) <= ((M() - this.w) - J()) - f;
    }

    public float D() {
        if (this.I == null) {
            return 0.0f;
        }
        ip4 ip4Var = this.H;
        if (ip4Var != null && ip4Var.w() > 0) {
            this.I.add(this.H);
            this.H = new ip4(K(), L(), this.v, this.u);
        }
        if (this.I.isEmpty()) {
            return 0.0f;
        }
        Object[] objArr = new Object[2];
        objArr[1] = new Float(0.0f);
        bp4 bp4Var = null;
        float fL = 0.0f;
        for (ip4 ip4Var2 : this.I) {
            float fM = ip4Var2.m() - K();
            b bVar = this.K;
            float f = fM + bVar.a + bVar.c + bVar.b;
            this.s.w(f, -ip4Var2.l());
            if (ip4Var2.r() != null) {
                tr0.L(this.t, 0, new cs4(ip4Var2.r()), this.s.t() - ip4Var2.q(), this.s.u(), 0.0f);
            }
            objArr[0] = bp4Var;
            X(ip4Var2, this.s, this.t, objArr, this.r.M());
            bp4Var = (bp4) objArr[0];
            fL += ip4Var2.l();
            this.s.w(-f, 0.0f);
        }
        this.I = new ArrayList();
        return fL;
    }

    public c E(gp4 gp4Var) {
        c cVar = new c(gp4Var, this.r);
        if (this.M.w().size() > 0) {
            cVar.r(lp4.X6, lp4.Ia);
            cVar.r(lp4.N6, this.M.x());
        }
        this.r.L().a(cVar);
        this.O.a(cVar);
        cVar.v(this.P, F(), this.R, this.r);
        String str = this.S;
        if (str != null) {
            cVar.x(H(str));
        } else {
            ho4 ho4Var = this.T;
            if (ho4Var != null) {
                cVar.x(ho4Var);
            }
        }
        uo4 uo4Var = this.U;
        if (uo4Var != null) {
            cVar.w(uo4Var);
        }
        if (this.V.g()) {
            try {
                cVar.r(lp4.m, this.r.n(this.V.e()).a());
            } catch (IOException e) {
                throw new p52(e);
            }
        }
        return cVar;
    }

    public HashMap F() {
        return this.Q;
    }

    public d G() {
        return this.L;
    }

    public ho4 H(String str) {
        a aVar = (a) this.P.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        ho4 ho4Var = aVar.a;
        if (ho4Var != null) {
            return ho4Var;
        }
        if (aVar.b == null) {
            aVar.b = this.r.K();
        }
        ho4 ho4Var2 = new ho4(aVar.b);
        aVar.a = ho4Var2;
        this.P.put(str, aVar);
        return ho4Var2;
    }

    public al4 I() {
        return this.e0;
    }

    public float J() {
        return l(this.K.i);
    }

    public float K() {
        b bVar = this.K;
        return q(bVar.a + bVar.c + bVar.d + bVar.b);
    }

    public float L() {
        b bVar = this.K;
        return r(bVar.e + bVar.f + bVar.g);
    }

    public float M() {
        return t(this.K.h);
    }

    public void N() throws cu1 {
        this.n++;
        this.V.h();
        this.e0 = new al4();
        this.r.U();
        this.t = new po4(this.r);
        this.W = 0;
        V();
        this.g0 = -1.0f;
        b bVar = this.K;
        bVar.g = 0.0f;
        bVar.d = 0.0f;
        bVar.i = 0.0f;
        bVar.h = 0.0f;
        this.w = 0.0f;
        this.Y = new HashMap(this.Z);
        if (this.d.b() != null || this.d.C() || this.d.c() != null) {
            d(this.d);
        }
        float f = this.u;
        int i = this.v;
        this.a0 = true;
        this.u = f;
        this.v = i;
        A();
        this.r.H();
        this.G = false;
    }

    public boolean O() {
        pq4 pq4Var = this.r;
        return pq4Var == null || (pq4Var.y().d0() == 0 && this.r.z().d0() == 0 && (this.a0 || this.r.g()));
    }

    public boolean P(String str, to4 to4Var) {
        a aVar = (a) this.P.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        if (aVar.c != null) {
            return false;
        }
        aVar.c = to4Var;
        this.P.put(str, aVar);
        if (to4Var.v()) {
            return true;
        }
        to4Var.u(this.r.v());
        return true;
    }

    public void Q(String str, float f, float f2, float f3, float f4) {
        this.V.c(new io4(this.r, f, f2, f3, f4, H(str)));
    }

    public void R() {
        this.J = -1;
        A();
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.I.add(this.H);
            this.w += this.H.l();
        }
        this.H = new ip4(K(), L(), this.v, this.u);
    }

    public void S(sp4 sp4Var) {
        sp4Var.B(this.r.K());
        if (sp4Var.z() != null) {
            sp4Var.r(lp4.c7, sp4Var.z().x());
        }
        ArrayList arrayListW = sp4Var.w();
        int size = arrayListW.size();
        for (int i = 0; i < size; i++) {
            S((sp4) arrayListW.get(i));
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                ((sp4) arrayListW.get(i2)).r(lp4.B7, ((sp4) arrayListW.get(i2 - 1)).x());
            }
            if (i2 < size - 1) {
                ((sp4) arrayListW.get(i2)).r(lp4.f6, ((sp4) arrayListW.get(i2 + 1)).x());
            }
        }
        if (size > 0) {
            sp4Var.r(lp4.d3, ((sp4) arrayListW.get(0)).x());
            sp4Var.r(lp4.f5, ((sp4) arrayListW.get(size - 1)).x());
        }
        for (int i3 = 0; i3 < size; i3++) {
            sp4 sp4Var2 = (sp4) arrayListW.get(i3);
            this.r.o(sp4Var2, sp4Var2.x());
        }
    }

    public void T(String str, int i, float f, float f2, float f3, float f4) {
        v(new io4(this.r, f, f2, f3, f4, new ho4(str, i)));
    }

    public void U(String str, String str2, float f, float f2, float f3, float f4) {
        this.V.c(new io4(this.r, f, f2, f3, f4, new ho4(str, str2)));
    }

    public void V() {
        this.d = this.X;
        if (this.i && (m() & 1) == 0) {
            this.f = this.C;
            this.e = this.D;
        } else {
            this.e = this.C;
            this.f = this.D;
        }
        if (this.j && (m() & 1) == 0) {
            this.g = this.F;
            this.h = this.E;
        } else {
            this.g = this.E;
            this.h = this.F;
        }
        po4 po4Var = new po4(this.r);
        this.s = po4Var;
        po4Var.B();
        this.s.e();
        this.A = this.s.d0();
        this.s.w(p(), s());
    }

    public void W(sp4 sp4Var) {
        ArrayList arrayListW = sp4Var.w();
        sp4 sp4VarZ = sp4Var.z();
        if (arrayListW.isEmpty()) {
            if (sp4VarZ != null) {
                sp4VarZ.A(sp4VarZ.v() + 1);
                return;
            }
            return;
        }
        for (int i = 0; i < arrayListW.size(); i++) {
            W((sp4) arrayListW.get(i));
        }
        if (sp4VarZ != null) {
            if (sp4Var.y()) {
                sp4VarZ.A(sp4Var.v() + sp4VarZ.v() + 1);
            } else {
                sp4VarZ.A(sp4VarZ.v() + 1);
                sp4Var.A(-sp4Var.v());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0557 A[PHI: r6
      0x0557: PHI (r6v7 int) = (r6v6 int), (r6v11 int) binds: [B:189:0x053f, B:196:0x0554] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float X(com.zepto.ip4 r57, com.zepto.po4 r58, com.zepto.po4 r59, java.lang.Object[] r60, float r61) {
        /*
            Method dump skipped, instruction units count: 1843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.vo4.X(com.zepto.ip4, com.zepto.po4, com.zepto.po4, java.lang.Object[], float):float");
    }

    public void Y() {
        if (this.M.w().size() == 0) {
            return;
        }
        S(this.M);
        pq4 pq4Var = this.r;
        sp4 sp4Var = this.M;
        pq4Var.o(sp4Var, sp4Var.x());
    }

    @Override // com.zepto.bu1, com.zepto.tt1
    public void a() {
        if (!this.b) {
            super.a();
            this.r.a();
            sp4 sp4Var = new sp4(this.r);
            this.M = sp4Var;
            this.N = sp4Var;
        }
        try {
            N();
        } catch (cu1 e) {
            throw new p52(e);
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
    @Override // com.zepto.bu1, com.zepto.tt1
    public boolean b() {
        this.J = -1;
        if (O()) {
            V();
            return false;
        }
        if (!this.b || this.c) {
            throw new RuntimeException(dt3.b("the.document.is.not.open", new Object[0]));
        }
        this.r.H();
        super.b();
        b bVar = this.K;
        bVar.d = 0.0f;
        bVar.g = 0.0f;
        try {
            D();
            int iV = this.d.v();
            if (this.r.R()) {
                if (this.Y.containsKey("art") && this.Y.containsKey("trim")) {
                    throw new qq4(dt3.b("only.one.of.artbox.or.trimbox.can.exist.in.the.page", new Object[0]));
                }
                if (!this.Y.containsKey("art") && !this.Y.containsKey("trim")) {
                    if (this.Y.containsKey("crop")) {
                        HashMap map = this.Y;
                        map.put("trim", map.get("crop"));
                    } else {
                        HashMap map2 = this.Y;
                        i65 i65Var = this.d;
                        map2.put("trim", new cq4(i65Var, i65Var.v()));
                    }
                }
            }
            this.e0.a(this.r.x());
            if (this.r.S()) {
                uo4 uo4Var = new uo4();
                uo4Var.r(lp4.A1, lp4.X1);
                this.e0.a(uo4Var);
            }
            yp4 yp4Var = new yp4(new cq4(this.d, iV), this.Y, this.e0.c(), iV);
            yp4Var.r(lp4.D9, this.r.O());
            if (this.B != null) {
                gq4 gq4Var = new gq4(this.B);
                lp4 lp4Var = lp4.sa;
                lp4 lp4Var2 = lp4.L5;
                gq4Var.r(lp4Var, lp4Var2);
                gq4Var.r(lp4.v9, lp4.wb);
                this.r.A();
                yp4Var.r(lp4Var2, this.r.n(gq4Var).a());
            }
            int i = this.b0;
            if (i > 0) {
                yp4Var.r(lp4.o2, new op4(i));
                this.b0 = 0;
            }
            uo4 uo4Var2 = this.c0;
            if (uo4Var2 != null) {
                yp4Var.r(lp4.j, this.r.n(uo4Var2).a());
                this.c0 = null;
            }
            gp4 gp4Var = this.d0;
            if (gp4Var != null) {
                yp4Var.r(lp4.K9, gp4Var);
                this.d0 = null;
            }
            if (this.r.P() > 0.0f) {
                yp4Var.r(lp4.La, new op4(this.r.P()));
            }
            if (this.V.f()) {
                ko4 ko4VarI = this.V.i(this.r, this.d);
                if (ko4VarI.t() != 0) {
                    yp4Var.r(lp4.H, ko4VarI);
                }
            }
            if (this.r.T()) {
                yp4Var.r(lp4.p9, new op4(this.r.w() - 1));
            }
            if (this.s.d0() > this.A) {
                this.s.j();
            } else {
                this.s = null;
            }
            this.r.h(yp4Var, new qo4(this.r.z(), this.t, this.s, this.r.y(), this.d));
            N();
            return true;
        } catch (cu1 e) {
            throw new p52(e);
        } catch (IOException e2) {
            throw new p52(e2);
        }
    }

    @Override // com.zepto.bu1, com.zepto.tt1
    public boolean c(float f, float f2, float f3, float f4) {
        pq4 pq4Var = this.r;
        if (pq4Var != null && pq4Var.g()) {
            return false;
        }
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        return true;
    }

    @Override // com.zepto.bu1, com.zepto.tt1
    public void close() {
        if (this.c) {
            return;
        }
        try {
            b();
            if (this.V.f()) {
                throw new RuntimeException(dt3.b("not.all.annotations.could.be.added.to.the.document.the.document.doesn.t.have.enough.pages", new Object[0]));
            }
            this.r.H();
            super.close();
            this.r.k(this.P);
            z();
            Y();
            this.r.close();
        } catch (Exception e) {
            throw p52.a(e);
        }
    }

    @Override // com.zepto.bu1, com.zepto.r02
    public boolean d(f02 f02Var) throws cu1 {
        pq4 pq4Var = this.r;
        if (pq4Var != null && pq4Var.g()) {
            return false;
        }
        try {
            int iZ = f02Var.z();
            if (iZ == 23) {
                wp4 wp4Var = (wp4) f02Var;
                if (wp4Var.Z() > wp4Var.m()) {
                    B();
                    D();
                    w(wp4Var);
                    this.a0 = false;
                    R();
                }
            } else {
                if (iZ == 40) {
                    B();
                    D();
                    wb0.a(f02Var);
                    this.r.y();
                    M();
                    throw null;
                }
                if (iZ == 50) {
                    wb0.a(f02Var);
                    throw null;
                }
                if (iZ == 55) {
                    wb0.a(f02Var);
                    K();
                    J();
                    L();
                    M();
                    M();
                    throw null;
                }
                if (iZ == 29) {
                    if (this.H == null) {
                        A();
                    }
                    vp vpVar = (vp) f02Var;
                    i65 i65Var = new i65(0.0f, 0.0f);
                    if (this.H != null) {
                        i65Var = new i65(vpVar.e(L() - this.H.x()), vpVar.l((M() - this.w) - 20.0f), vpVar.j((L() - this.H.x()) + 20.0f), vpVar.g(M() - this.w));
                    }
                    this.V.c(jo4.d(this.r, vpVar, i65Var));
                    this.a0 = false;
                } else if (iZ != 30) {
                    switch (iZ) {
                        case 0:
                            this.L.C(((kt3) f02Var).b(), ((kt3) f02Var).a());
                            break;
                        case 1:
                            this.L.B(((kt3) f02Var).a());
                            break;
                        case 2:
                            this.L.A(((kt3) f02Var).a());
                            break;
                        case 3:
                            this.L.y(((kt3) f02Var).a());
                            break;
                        case 4:
                            this.L.v(((kt3) f02Var).a());
                            break;
                        case 5:
                            this.L.z();
                            break;
                        case 6:
                            this.L.w();
                            break;
                        case 7:
                            this.L.x(((kt3) f02Var).a());
                            break;
                        default:
                            switch (iZ) {
                                case 10:
                                    if (this.H == null) {
                                        A();
                                    }
                                    no4 no4Var = new no4((fk0) f02Var, this.z);
                                    while (true) {
                                        no4 no4VarA = this.H.a(no4Var);
                                        if (no4VarA == null) {
                                            this.a0 = false;
                                            if (no4Var.k("NEWPAGE")) {
                                                b();
                                            }
                                        } else {
                                            A();
                                            no4VarA.y();
                                            no4Var = no4VarA;
                                        }
                                        break;
                                    }
                                    break;
                                case 11:
                                    this.y++;
                                    this.u = ((cs4) f02Var).k0();
                                    f02Var.u(this);
                                    this.y--;
                                    break;
                                case 12:
                                    this.y++;
                                    fl4 fl4Var = (fl4) f02Var;
                                    x(fl4Var.v0(), this.u, fl4Var.i0());
                                    this.v = fl4Var.n0();
                                    this.u = fl4Var.w0();
                                    A();
                                    if (this.w + this.H.l() + this.u > M() - J()) {
                                        b();
                                    }
                                    this.K.a += fl4Var.q0();
                                    this.K.e += fl4Var.r0();
                                    A();
                                    this.r.H();
                                    if (fl4Var.s0()) {
                                        A();
                                        wp4 wp4Var2 = new wp4(1);
                                        wp4Var2.W(100.0f);
                                        tp4 tp4Var = new tp4();
                                        tp4Var.M(fl4Var);
                                        tp4Var.F(0);
                                        tp4Var.q0(0.0f);
                                        wp4Var2.a(tp4Var);
                                        this.K.a -= fl4Var.q0();
                                        this.K.e -= fl4Var.r0();
                                        d(wp4Var2);
                                        this.K.a += fl4Var.q0();
                                        this.K.e += fl4Var.r0();
                                    } else {
                                        this.H.u(fl4Var.p0());
                                        f02Var.u(this);
                                        A();
                                        x(fl4Var.u0(), fl4Var.w0(), fl4Var.i0());
                                    }
                                    this.v = 0;
                                    this.K.a -= fl4Var.q0();
                                    this.K.e -= fl4Var.r0();
                                    A();
                                    this.y--;
                                    break;
                                case 13:
                                case 16:
                                    wb0.a(f02Var);
                                    this.r.H();
                                    throw null;
                                case 14:
                                    qf3 qf3Var = (qf3) f02Var;
                                    if (qf3Var.e()) {
                                        qf3Var.f();
                                    }
                                    this.K.c += qf3Var.b();
                                    this.K.e += qf3Var.c();
                                    f02Var.u(this);
                                    this.K.c -= qf3Var.b();
                                    this.K.e -= qf3Var.c();
                                    A();
                                    break;
                                case 15:
                                    this.y++;
                                    sf3 sf3Var = (sf3) f02Var;
                                    x(sf3Var.v0(), this.u, sf3Var.i0());
                                    this.v = sf3Var.n0();
                                    this.K.c += sf3Var.q0();
                                    this.K.e += sf3Var.r0();
                                    this.u = sf3Var.w0();
                                    A();
                                    this.H.v(sf3Var);
                                    f02Var.u(this);
                                    x(sf3Var.u0(), sf3Var.w0(), sf3Var.i0());
                                    if (this.H.k()) {
                                        this.H.t();
                                    }
                                    A();
                                    this.K.c -= sf3Var.q0();
                                    this.K.e -= sf3Var.r0();
                                    this.y--;
                                    break;
                                case 17:
                                    this.y++;
                                    wb0.a(f02Var);
                                    throw null;
                                default:
                                    switch (iZ) {
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                            wb0.a(f02Var);
                                            u(null);
                                            break;
                                        default:
                                            return false;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.t.A((i65) f02Var);
                    this.a0 = false;
                }
            }
            this.J = f02Var.z();
            return true;
        } catch (Exception e) {
            throw new cu1(e);
        }
    }

    @Override // com.zepto.bu1, com.zepto.tt1
    public boolean e(i65 i65Var) {
        pq4 pq4Var = this.r;
        if (pq4Var != null && pq4Var.g()) {
            return false;
        }
        this.X = new i65(i65Var);
        return true;
    }

    public void u(hx2 hx2Var) {
        throw null;
    }

    public void v(io4 io4Var) {
        this.a0 = false;
        this.V.a(io4Var);
    }

    public void w(wp4 wp4Var) throws cu1 {
        tr0 tr0Var = new tr0(this.r.y());
        if (wp4Var.o() && !C(wp4Var, 0.0f) && this.w > 0.0f) {
            b();
        }
        if (this.w > 0.0f) {
            fl4 fl4Var = new fl4();
            fl4Var.C0(0.0f);
            tr0Var.a(fl4Var);
        }
        tr0Var.a(wp4Var);
        boolean zF = wp4Var.F();
        wp4Var.Q(true);
        int i = 0;
        while (true) {
            tr0Var.E(K(), J(), L(), M() - this.w);
            if ((tr0Var.o() & 1) != 0) {
                this.s.w(0.0f, (tr0Var.n() - M()) + this.w);
                this.w = M() - tr0Var.n();
                wp4Var.Q(zF);
                return;
            } else {
                i = M() - this.w == tr0Var.n() ? i + 1 : 0;
                if (i == 3) {
                    throw new cu1(dt3.b("infinite.table.loop", new Object[0]));
                }
                b();
            }
        }
    }

    public void x(float f, float f2, zd2 zd2Var) {
        if (f == 0.0f || this.a0 || this.w + this.H.l() + this.u > M() - J()) {
            return;
        }
        this.u = f;
        A();
        if (zd2Var.n() || zd2Var.m()) {
            zd2 zd2Var2 = new zd2(zd2Var);
            zd2Var2.o(zd2Var2.k() & (-13));
            zd2Var = zd2Var2;
        }
        new fk0(" ", zd2Var).u(this);
        A();
        this.u = f2;
    }

    public void y(pq4 pq4Var) {
        if (this.r != null) {
            throw new cu1(dt3.b("you.can.only.add.a.writer.to.a.pdfdocument.once", new Object[0]));
        }
        this.r = pq4Var;
        this.V = new jo4(pq4Var);
    }

    public void z() {
        if (this.M.w().size() == 0) {
            return;
        }
        W(this.M);
    }
}
