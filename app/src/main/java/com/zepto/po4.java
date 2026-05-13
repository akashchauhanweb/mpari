package com.zepto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class po4 {
    public static final float[] j = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static HashMap k;
    public pq4 b;
    public vo4 c;
    public ArrayList f;
    public o80 a = new o80();
    public a d = new a();
    public ArrayList e = new ArrayList();
    public int g = 10;
    public int h = 0;
    public boolean i = false;

    public static class a {
        public ae2 a;
        public qr0 b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;

        public a() {
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 100.0f;
            this.h = 0.0f;
            this.i = 0.0f;
        }

        public a(a aVar) {
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 100.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.a = aVar.a;
            qr0 qr0Var = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
        }
    }

    static {
        HashMap map = new HashMap();
        k = map;
        map.put(lp4.h0, "/BPC ");
        k.put(lp4.b1, "/CS ");
        k.put(lp4.J1, "/D ");
        k.put(lp4.K1, "/DP ");
        k.put(lp4.c3, "/F ");
        k.put(lp4.g4, "/H ");
        k.put(lp4.D4, "/IM ");
        k.put(lp4.M4, "/Intent ");
        k.put(lp4.N4, "/I ");
        k.put(lp4.ib, "/W ");
    }

    public po4(pq4 pq4Var) {
        if (pq4Var != null) {
            this.b = pq4Var;
            this.c = pq4Var.J();
        }
    }

    public static void k(byte[] bArr, o80 o80Var) {
        o80Var.d0(40);
        for (int i : bArr) {
            if (i == 12) {
                o80Var.B("\\f");
            } else if (i == 13) {
                o80Var.B("\\r");
            } else if (i != 40 && i != 41 && i != 92) {
                switch (i) {
                    case 8:
                        o80Var.B("\\b");
                        break;
                    case 9:
                        o80Var.B("\\t");
                        break;
                    case 10:
                        o80Var.B("\\n");
                        break;
                    default:
                        o80Var.d0(i);
                        break;
                }
            } else {
                o80Var.d0(92).d0(i);
            }
        }
        o80Var.B(")");
    }

    public static byte[] l(byte[] bArr) {
        o80 o80Var = new o80();
        k(bArr, o80Var);
        return o80Var.y0();
    }

    public void A(i65 i65Var) {
        float fP = i65Var.p();
        float fM = i65Var.m();
        float fS = i65Var.s();
        float fW = i65Var.w();
        p40 p40VarB = i65Var.b();
        if (p40VarB != null) {
            I();
            M(p40VarB);
            z(fP, fM, fS - fP, fW - fM);
            m();
            G();
        }
        if (i65Var.C()) {
            if (i65Var.D()) {
                f0(i65Var);
                return;
            }
            if (i65Var.h() != -1.0f) {
                S(i65Var.h());
            }
            p40 p40VarC = i65Var.c();
            if (p40VarC != null) {
                N(p40VarC);
            }
            if (i65Var.B(15)) {
                z(fP, fM, fS - fP, fW - fM);
            } else {
                if (i65Var.B(8)) {
                    x(fS, fM);
                    v(fS, fW);
                }
                if (i65Var.B(4)) {
                    x(fP, fM);
                    v(fP, fW);
                }
                if (i65Var.B(2)) {
                    x(fP, fM);
                    v(fS, fM);
                }
                if (i65Var.B(1)) {
                    x(fP, fW);
                    v(fS, fW);
                }
            }
            e0();
            if (p40VarC != null) {
                F();
            }
        }
    }

    public void B() {
        C(true);
    }

    public void C(boolean z) {
        this.a.m0();
        if (z) {
            H();
        }
        this.d = new a();
    }

    public void D() {
        this.a.B("0 G").d0(this.g);
    }

    public void E() {
        this.a.B("0 g").d0(this.g);
    }

    public void F() {
        this.a.B("0 G").d0(this.g);
    }

    public void G() {
        this.a.B("Q").d0(this.g);
        int size = this.e.size() - 1;
        if (size < 0) {
            throw new gx2(dt3.b("unbalanced.save.restore.state.operators", new Object[0]));
        }
        this.d = (a) this.e.get(size);
        this.e.remove(size);
    }

    public void H() {
        if (this.h != 0) {
            throw new gx2(dt3.b("unbalanced.marked.content.operators", new Object[0]));
        }
        if (this.i) {
            throw new gx2(dt3.b("unbalanced.begin.end.text.operators", new Object[0]));
        }
        ArrayList arrayList = this.f;
        if (arrayList != null && !arrayList.isEmpty()) {
            throw new gx2(dt3.b("unbalanced.layer.operators", new Object[0]));
        }
        if (!this.e.isEmpty()) {
            throw new gx2(dt3.b("unbalanced.save.restore.state.operators", new Object[0]));
        }
    }

    public void I() {
        this.a.B("q").d0(this.g);
        this.e.add(new a(this.d));
    }

    public void J(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
        this.a.B(" k").d0(this.g);
    }

    public void K(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
        this.a.B(" K").d0(this.g);
    }

    public void L(float f) {
        this.d.h = f;
        this.a.m(f).B(" Tc").d0(this.g);
    }

    public void M(p40 p40Var) {
        rq4.a(this.b, 1, p40Var);
        int iG = b72.g(p40Var);
        if (iG == 1) {
            wb0.a(p40Var);
            throw null;
        }
        if (iG == 2) {
            e90 e90Var = (e90) p40Var;
            J(e90Var.j(), e90Var.k(), e90Var.l(), e90Var.i());
        } else {
            if (iG == 3) {
                wb0.a(p40Var);
                throw null;
            }
            if (iG == 4) {
                wb0.a(p40Var);
                throw null;
            }
            if (iG != 5) {
                T(p40Var.d(), p40Var.b(), p40Var.a());
            } else {
                wb0.a(p40Var);
                throw null;
            }
        }
    }

    public void N(p40 p40Var) {
        rq4.a(this.b, 1, p40Var);
        int iG = b72.g(p40Var);
        if (iG == 1) {
            wb0.a(p40Var);
            throw null;
        }
        if (iG == 2) {
            e90 e90Var = (e90) p40Var;
            K(e90Var.j(), e90Var.k(), e90Var.l(), e90Var.i());
        } else {
            if (iG == 3) {
                wb0.a(p40Var);
                throw null;
            }
            if (iG == 4) {
                wb0.a(p40Var);
                throw null;
            }
            if (iG != 5) {
                U(p40Var.d(), p40Var.b(), p40Var.a());
            } else {
                wb0.a(p40Var);
                throw null;
            }
        }
    }

    public void O(s40 s40Var, float f) {
        f();
        if (f < 1.0E-4f && f > -1.0E-4f) {
            throw new IllegalArgumentException(dt3.b("font.size.too.small.1", String.valueOf(f)));
        }
        a aVar = this.d;
        aVar.c = f;
        aVar.a = this.b.m(s40Var);
        this.a.D(q().b(this.d.a.b(), this.d.a.c()).b()).e(' ').m(f).B(" Tf").d0(this.g);
    }

    public void P(float f) {
        this.a.m(f).B(" g").d0(this.g);
    }

    public void Q(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.a.n(i).B(" J").d0(this.g);
    }

    public void R(int i) {
        if (i < 0 || i > 2) {
            return;
        }
        this.a.n(i).B(" j").d0(this.g);
    }

    public void S(float f) {
        this.a.m(f).B(" w").d0(this.g);
    }

    public void T(int i, int i2, int i3) {
        b((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, (i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, (i3 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        this.a.B(" rg").d0(this.g);
    }

    public void U(int i, int i2, int i3) {
        b((i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, (i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, (i3 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        this.a.B(" RG").d0(this.g);
    }

    public void V(float f, float f2) {
        W(1.0f, 0.0f, 0.0f, 1.0f, f, f2);
    }

    public void W(float f, float f2, float f3, float f4, float f5, float f6) {
        a aVar = this.d;
        aVar.d = f5;
        aVar.e = f6;
        this.a.m(f).e(' ').m(f2).d0(32).m(f3).d0(32).m(f4).d0(32).m(f5).d0(32).m(f6).B(" Tm").d0(this.g);
    }

    public void X(int i) {
        this.a.n(i).B(" Tr").d0(this.g);
    }

    public void Y(float f) {
        this.a.m(f).B(" Ts").d0(this.g);
    }

    public void Z(float f) {
        this.d.i = f;
        this.a.m(f).B(" Tw").d0(this.g);
    }

    public final void a(float f, float f2, float f3, float f4) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        this.a.m(f).e(' ').m(f2).e(' ').m(f3).e(' ').m(f4);
    }

    public void a0(kq4 kq4Var) {
        Object next;
        if (this.d.a == null) {
            throw new NullPointerException(dt3.b("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
        }
        this.a.B("[");
        Iterator it = kq4Var.c().iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                next = it.next();
                if (next instanceof String) {
                    break;
                }
                if (z) {
                    this.a.e(' ');
                } else {
                    z = true;
                }
                this.a.m(((Float) next).floatValue());
            }
            this.a.B("]TJ").d0(this.g);
            return;
            c0((String) next);
        }
    }

    public final void b(float f, float f2, float f3) {
        rq4.a(this.b, 3, null);
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.a.m(f).e(' ').m(f2).e(' ').m(f3);
    }

    public void b0(String str) {
        c0(str);
        this.a.B("Tj").d0(this.g);
    }

    public void c(po4 po4Var) {
        pq4 pq4Var = po4Var.b;
        if (pq4Var != null && this.b != pq4Var) {
            throw new RuntimeException(dt3.b("inconsistent.writers.are.you.mixing.two.documents", new Object[0]));
        }
        this.a.w(po4Var.a);
    }

    public final void c0(String str) {
        ae2 ae2Var = this.d.a;
        if (ae2Var == null) {
            throw new NullPointerException(dt3.b("font.and.size.must.be.set.before.writing.any.text", new Object[0]));
        }
        k(ae2Var.a(str), this.a);
    }

    public void d(io4 io4Var) {
        this.b.j(io4Var);
    }

    public int d0() {
        return this.a.x0();
    }

    public void e() {
        if (this.i) {
            throw new gx2(dt3.b("unbalanced.begin.end.text.operators", new Object[0]));
        }
        this.i = true;
        a aVar = this.d;
        aVar.d = 0.0f;
        aVar.e = 0.0f;
        this.a.B("BT").d0(this.g);
    }

    public void e0() {
        this.a.B("S").d0(this.g);
    }

    public void f() {
        if (this.b == null) {
            throw new NullPointerException(dt3.b("the.writer.in.pdfcontentbyte.is.null", new Object[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f0(com.zepto.i65 r25) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.po4.f0(com.zepto.i65):void");
    }

    public void g() {
        this.a.B("W").d0(this.g);
    }

    public final boolean h(p40 p40Var, p40 p40Var2) {
        if (p40Var == null && p40Var2 == null) {
            return true;
        }
        if (p40Var == null || p40Var2 == null) {
            return false;
        }
        return p40Var instanceof b72 ? p40Var.equals(p40Var2) : p40Var2.equals(p40Var);
    }

    public void i(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.m(f).e(' ').m(f2).e(' ').m(f3).e(' ');
        this.a.m(f4).e(' ').m(f5).e(' ').m(f6).B(" cm").d0(this.g);
    }

    public void j() {
        if (!this.i) {
            throw new gx2(dt3.b("unbalanced.begin.end.text.operators", new Object[0]));
        }
        this.i = false;
        this.a.B("ET").d0(this.g);
    }

    public void m() {
        this.a.B("f").d0(this.g);
    }

    public float n() {
        return this.d.h;
    }

    public po4 o() {
        return new po4(this.b);
    }

    public o80 p() {
        return this.a;
    }

    public al4 q() {
        return this.c.I();
    }

    public vo4 r() {
        return this.c;
    }

    public pq4 s() {
        return this.b;
    }

    public float t() {
        return this.d.d;
    }

    public String toString() {
        return this.a.toString();
    }

    public float u() {
        return this.d.e;
    }

    public void v(float f, float f2) {
        this.a.m(f).e(' ').m(f2).B(" l").d0(this.g);
    }

    public void w(float f, float f2) {
        a aVar = this.d;
        aVar.d += f;
        aVar.e += f2;
        this.a.m(f).e(' ').m(f2).B(" Td").d0(this.g);
    }

    public void x(float f, float f2) {
        this.a.m(f).e(' ').m(f2).B(" m").d0(this.g);
    }

    public void y() {
        this.a.B("n").d0(this.g);
    }

    public void z(float f, float f2, float f3, float f4) {
        this.a.m(f).e(' ').m(f2).e(' ').m(f3).e(' ').m(f4).B(" re").d0(this.g);
    }
}
