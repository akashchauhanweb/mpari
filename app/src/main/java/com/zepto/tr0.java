package com.zepto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class tr0 {
    public float A;
    public float D;
    public tr0 F;
    public LinkedList G;
    public boolean I;
    public cs4 J;
    public float L;
    public float b;
    public float c;
    public float d;
    public float e;
    public ArrayList g;
    public ArrayList h;
    public p50 i;
    public float j;
    public float k;
    public po4 o;
    public po4[] p;
    public int q;
    public int z;
    public int a = 0;
    public int f = 0;
    public float l = 16.0f;
    public float m = 16.0f;
    public float n = 0.0f;
    public float r = 0.0f;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public float v = -1.0f;
    public boolean w = false;
    public float x = 0.0f;
    public boolean y = true;
    public boolean B = false;
    public int C = 0;
    public boolean E = false;
    public int H = 0;
    public boolean K = false;
    public boolean M = true;

    public tr0(po4 po4Var) {
        this.o = po4Var;
    }

    public static void L(po4 po4Var, int i, cs4 cs4Var, float f, float f2, float f3) {
        M(po4Var, i, cs4Var, f, f2, f3, 1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void M(com.zepto.po4 r18, int r19, com.zepto.cs4 r20, float r21, float r22, float r23, int r24, int r25) {
        /*
            r0 = r19
            r1 = r23
            r7 = r24
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L11
            r2 = 1
            if (r0 == r2) goto L11
            if (r0 == r9) goto L11
            r15 = r8
            goto L12
        L11:
            r15 = r0
        L12:
            r18.I()
            com.zepto.tr0 r14 = new com.zepto.tr0
            r13 = r18
            r14.<init>(r13)
            r0 = 1184645120(0x469c4000, float:20000.0)
            r2 = 0
            if (r15 == 0) goto L2c
            r3 = -962838528(0xffffffffc69c4000, float:-20000.0)
            if (r15 == r9) goto L2a
            r10 = r0
        L28:
            r11 = r3
            goto L2e
        L2a:
            r10 = r2
            goto L28
        L2c:
            r10 = r0
            r11 = r2
        L2e:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L43
            float r11 = r11 + r21
            float r0 = r22 + r12
            float r10 = r10 + r21
            float r1 = r22 + r16
            r16 = r1
            r1 = r10
        L41:
            r12 = r11
            goto L68
        L43:
            double r0 = (double) r1
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r0 = r0 * r2
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r0 = r0 / r2
            double r2 = java.lang.Math.cos(r0)
            float r4 = (float) r2
            double r0 = java.lang.Math.sin(r0)
            float r2 = (float) r0
            float r3 = -r2
            r0 = r18
            r1 = r4
            r5 = r21
            r6 = r22
            r0.i(r1, r2, r3, r4, r5, r6)
            r1 = r10
            r0 = r12
            goto L41
        L68:
            r2 = 1073741824(0x40000000, float:2.0)
            r10 = r14
            r11 = r20
            r13 = r0
            r0 = r14
            r14 = r1
            r1 = r15
            r15 = r16
            r16 = r2
            r17 = r1
            r10.G(r11, r12, r13, r14, r15, r16, r17)
            r2 = 3
            if (r7 != r2) goto L84
            if (r1 != 0) goto L81
            r8 = r9
            goto L85
        L81:
            if (r1 != r9) goto L84
            goto L85
        L84:
            r8 = r1
        L85:
            r0.t(r8)
            r1 = r25
            r0.u(r1)
            r0.D(r7)
            r0.o()     // Catch: com.zepto.cu1 -> L97
            r18.G()
            return
        L97:
            r0 = move-exception
            r1 = r0
            com.zepto.p52 r0 = new com.zepto.p52
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tr0.M(com.zepto.po4, int, com.zepto.cs4, float, float, float, int, int):void");
    }

    public static tr0 d(tr0 tr0Var) {
        tr0 tr0Var2 = new tr0(null);
        tr0Var2.s(tr0Var);
        return tr0Var2;
    }

    public void A(float f) {
        this.m = f;
        this.n = 0.0f;
    }

    public void B(float f, float f2) {
        this.m = f;
        this.n = f2;
    }

    public void C(float f) {
        this.t = f;
        this.y = true;
    }

    public void D(int i) {
        if (i < 0 || i > 3) {
            throw new RuntimeException(dt3.a("invalid.run.direction.1", i));
        }
        this.a = i;
    }

    public void E(float f, float f2, float f3, float f4) {
        this.d = Math.min(f, f3);
        this.b = Math.max(f2, f4);
        this.c = Math.min(f2, f4);
        float fMax = Math.max(f, f3);
        this.e = fMax;
        this.j = this.b;
        float f5 = fMax - this.d;
        this.v = f5;
        if (f5 < 0.0f) {
            this.v = 0.0f;
        }
        this.w = true;
    }

    public void F(float f, float f2, float f3, float f4, float f5, int i) {
        A(f5);
        this.f = i;
        E(f, f2, f3, f4);
    }

    public void G(cs4 cs4Var, float f, float f2, float f3, float f4, float f5, int i) {
        b(cs4Var);
        F(f, f2, f3, f4, f5, i);
    }

    public void H(tr0 tr0Var) {
        this.b = tr0Var.b;
        this.c = tr0Var.c;
        this.f = tr0Var.f;
        this.g = null;
        if (tr0Var.g != null) {
            this.g = new ArrayList(tr0Var.g);
        }
        this.h = null;
        if (tr0Var.h != null) {
            this.h = new ArrayList(tr0Var.h);
        }
        this.j = tr0Var.j;
        this.l = tr0Var.l;
        this.m = tr0Var.m;
        this.n = tr0Var.n;
        this.o = tr0Var.o;
        this.p = tr0Var.p;
        this.q = tr0Var.q;
        this.r = tr0Var.r;
        this.s = tr0Var.s;
        this.t = tr0Var.t;
        this.u = tr0Var.u;
        this.v = tr0Var.v;
        this.w = tr0Var.w;
        this.x = tr0Var.x;
        this.y = tr0Var.y;
        this.z = tr0Var.z;
        this.C = tr0Var.C;
        this.a = tr0Var.a;
        this.D = tr0Var.D;
        this.E = tr0Var.E;
        this.I = tr0Var.I;
        if (tr0Var.E) {
            LinkedList linkedList = new LinkedList(tr0Var.G);
            this.G = linkedList;
            if (this.I) {
                this.G.set(0, new wp4((wp4) linkedList.getFirst()));
            }
            tr0 tr0Var2 = tr0Var.F;
            if (tr0Var2 != null) {
                this.F = d(tr0Var2);
            }
        }
        this.H = tr0Var.H;
        this.A = tr0Var.A;
        this.d = tr0Var.d;
        this.e = tr0Var.e;
        this.B = tr0Var.B;
        this.J = tr0Var.J;
        this.K = tr0Var.K;
        this.L = tr0Var.L;
        this.M = tr0Var.M;
    }

    public void I(float f) {
        this.x = f;
    }

    public void J(cs4 cs4Var) {
        this.i = null;
        this.E = false;
        this.F = null;
        this.G = null;
        this.H = 0;
        this.I = false;
        this.J = cs4Var;
    }

    public void K(boolean z) {
        this.K = z;
    }

    public void N(float f) {
        if (f > this.L) {
            this.L = f;
        }
    }

    public boolean O() {
        return this.E && !this.G.isEmpty() && ((f02) this.G.getFirst()).z() == 55;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.zepto.f02 r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            int r0 = r3.z()
            r1 = 10
            if (r0 != r1) goto L14
            com.zepto.fl4 r0 = new com.zepto.fl4
            com.zepto.fk0 r3 = (com.zepto.fk0) r3
            r0.<init>(r3)
        L12:
            r3 = r0
            goto L24
        L14:
            int r0 = r3.z()
            r1 = 11
            if (r0 != r1) goto L24
            com.zepto.fl4 r0 = new com.zepto.fl4
            com.zepto.cs4 r3 = (com.zepto.cs4) r3
            r0.<init>(r3)
            goto L12
        L24:
            int r0 = r3.z()
            r1 = 12
            if (r0 == r1) goto L54
            int r0 = r3.z()
            r1 = 14
            if (r0 == r1) goto L54
            int r0 = r3.z()
            r1 = 23
            if (r0 == r1) goto L54
            int r0 = r3.z()
            r1 = 55
            if (r0 != r1) goto L45
            goto L54
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "element.not.allowed"
            java.lang.String r0 = com.zepto.dt3.b(r1, r0)
            r3.<init>(r0)
            throw r3
        L54:
            boolean r0 = r2.E
            if (r0 != 0) goto L67
            r0 = 1
            r2.E = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.G = r0
            r0 = 0
            r2.i = r0
            r2.J = r0
        L67:
            java.util.LinkedList r0 = r2.G
            r0.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tr0.a(com.zepto.f02):void");
    }

    public void b(cs4 cs4Var) {
        if (cs4Var == null || this.E) {
            return;
        }
        c();
        if (this.i == null) {
            this.J = cs4Var;
            return;
        }
        Iterator it = cs4Var.a0().iterator();
        while (it.hasNext()) {
            this.i.a(new no4((fk0) it.next(), (ho4) null));
        }
    }

    public final void c() {
        if (this.i != null || this.J == null) {
            return;
        }
        this.i = new p50();
        Iterator it = this.J.a0().iterator();
        while (it.hasNext()) {
            this.i.a(new no4((fk0) it.next(), (ho4) null));
        }
        this.J = null;
    }

    public float[] e() {
        float f = f(this.g);
        int i = this.q;
        if (i == 1 || i == 2) {
            return null;
        }
        float f2 = f(this.h);
        if (this.q == 2) {
            return null;
        }
        return new float[]{f, f2};
    }

    public float f(ArrayList arrayList) {
        this.q = 0;
        float f = this.j;
        if (f < this.c || f > this.b) {
            this.q = 1;
            return 0.0f;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            float[] fArr = (float[]) arrayList.get(i);
            float f2 = this.j;
            if (f2 >= fArr[0] && f2 <= fArr[1]) {
                return (fArr[2] * f2) + fArr[3];
            }
        }
        this.q = 2;
        return 0.0f;
    }

    public float[] g() {
        do {
            float[] fArrE = e();
            int i = this.q;
            if (i == 1) {
                return null;
            }
            this.j -= this.l;
            if (i != 2) {
                float[] fArrE2 = e();
                int i2 = this.q;
                if (i2 == 1) {
                    return null;
                }
                if (i2 == 2) {
                    this.j -= this.l;
                } else {
                    float f = fArrE[0];
                    if (f < fArrE2[1]) {
                        float f2 = fArrE2[0];
                        float f3 = fArrE[1];
                        if (f2 < f3) {
                            return new float[]{f, f3, fArrE2[0], fArrE2[1]};
                        }
                    }
                }
            }
        } while (this.l != 0.0f);
        return null;
    }

    public int h() {
        return this.f;
    }

    public float i() {
        return this.D;
    }

    public float j() {
        return this.L;
    }

    public float k() {
        return this.r;
    }

    public float l() {
        return this.k;
    }

    public int m() {
        return this.a;
    }

    public float n() {
        return this.j;
    }

    public int o() {
        return p(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        r23.i.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int p(boolean r24) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tr0.p(boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x057c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int q(boolean r23) throws com.zepto.cu1 {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.tr0.q(boolean):int");
    }

    public boolean r() {
        return this.K;
    }

    public tr0 s(tr0 tr0Var) {
        H(tr0Var);
        if (tr0Var.i != null) {
            this.i = new p50(tr0Var.i);
        }
        return this;
    }

    public void t(int i) {
        this.f = i;
    }

    public void u(int i) {
        this.C = i;
    }

    public void v(po4[] po4VarArr) {
        this.p = po4VarArr;
        this.o = po4VarArr[3];
        tr0 tr0Var = this.F;
        if (tr0Var != null) {
            tr0Var.v(po4VarArr);
        }
    }

    public void w(float f) {
        this.u = f;
    }

    public void x(float f) {
        this.L = f;
    }

    public void y(float f) {
        this.s = f;
        this.y = true;
    }

    public void z(float f) {
        this.r = f;
        this.y = true;
    }
}
