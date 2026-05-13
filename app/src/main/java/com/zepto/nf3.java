package com.zepto;

import com.zepto.h46;
import com.zepto.yw0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class nf3 {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    public static int w = 1000;
    public static long x;
    public static long y;
    public a d;
    public px[] g;
    public final j90 n;
    public a q;
    public boolean a = false;
    public int b = 0;
    public HashMap c = null;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean i = false;
    public boolean[] j = new boolean[32];
    public int k = 1;
    public int l = 0;
    public int m = 32;
    public h46[] o = new h46[w];
    public int p = 0;

    public interface a {
        void a(h46 h46Var);

        h46 b(nf3 nf3Var, boolean[] zArr);

        void c(a aVar);

        void clear();

        h46 getKey();

        boolean isEmpty();
    }

    public class b extends px {
        public b(j90 j90Var) {
            this.e = new i46(this, j90Var);
        }
    }

    public nf3() {
        this.g = null;
        this.g = new px[32];
        C();
        j90 j90Var = new j90();
        this.n = j90Var;
        this.d = new ov4(j90Var);
        if (v) {
            this.q = new b(j90Var);
        } else {
            this.q = new px(j90Var);
        }
    }

    public static px s(nf3 nf3Var, h46 h46Var, h46 h46Var2, float f) {
        return nf3Var.r().j(h46Var, h46Var2, f);
    }

    public static du3 w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z) {
        for (int i = 0; i < this.k; i++) {
            this.j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.j[aVar.getKey().f] = true;
            }
            h46 h46VarB = aVar.b(this, this.j);
            if (h46VarB != null) {
                boolean[] zArr = this.j;
                int i3 = h46VarB.f;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (h46VarB != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.l; i5++) {
                    px pxVar = this.g[i5];
                    if (pxVar.a.m != h46.a.UNRESTRICTED && !pxVar.f && pxVar.t(h46VarB)) {
                        float fB = pxVar.e.b(h46VarB);
                        if (fB < 0.0f) {
                            float f2 = (-pxVar.b) / fB;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    px pxVar2 = this.g[i4];
                    pxVar2.a.g = -1;
                    pxVar2.x(h46VarB);
                    h46 h46Var = pxVar2.a;
                    h46Var.g = i4;
                    h46Var.h(this, pxVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    public final void C() {
        int i = 0;
        if (v) {
            while (i < this.l) {
                px pxVar = this.g[i];
                if (pxVar != null) {
                    this.n.a.a(pxVar);
                }
                this.g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.l) {
            px pxVar2 = this.g[i];
            if (pxVar2 != null) {
                this.n.b.a(pxVar2);
            }
            this.g[i] = null;
            i++;
        }
    }

    public void D() {
        j90 j90Var;
        int i = 0;
        while (true) {
            j90Var = this.n;
            h46[] h46VarArr = j90Var.d;
            if (i >= h46VarArr.length) {
                break;
            }
            h46 h46Var = h46VarArr[i];
            if (h46Var != null) {
                h46Var.e();
            }
            i++;
        }
        j90Var.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, (Object) null);
        HashMap map = this.c;
        if (map != null) {
            map.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int i2 = 0; i2 < this.l; i2++) {
            px pxVar = this.g[i2];
            if (pxVar != null) {
                pxVar.c = false;
            }
        }
        C();
        this.l = 0;
        if (v) {
            this.q = new b(this.n);
        } else {
            this.q = new px(this.n);
        }
    }

    public final h46 a(h46.a aVar, String str) {
        h46 h46Var = (h46) this.n.c.b();
        if (h46Var == null) {
            h46Var = new h46(aVar, str);
            h46Var.g(aVar, str);
        } else {
            h46Var.e();
            h46Var.g(aVar, str);
        }
        int i = this.p;
        int i2 = w;
        if (i >= i2) {
            int i3 = i2 * 2;
            w = i3;
            this.o = (h46[]) Arrays.copyOf(this.o, i3);
        }
        h46[] h46VarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        h46VarArr[i4] = h46Var;
        return h46Var;
    }

    public void b(jx0 jx0Var, jx0 jx0Var2, float f, int i) {
        yw0.b bVar = yw0.b.LEFT;
        h46 h46VarQ = q(jx0Var.o(bVar));
        yw0.b bVar2 = yw0.b.TOP;
        h46 h46VarQ2 = q(jx0Var.o(bVar2));
        yw0.b bVar3 = yw0.b.RIGHT;
        h46 h46VarQ3 = q(jx0Var.o(bVar3));
        yw0.b bVar4 = yw0.b.BOTTOM;
        h46 h46VarQ4 = q(jx0Var.o(bVar4));
        h46 h46VarQ5 = q(jx0Var2.o(bVar));
        h46 h46VarQ6 = q(jx0Var2.o(bVar2));
        h46 h46VarQ7 = q(jx0Var2.o(bVar3));
        h46 h46VarQ8 = q(jx0Var2.o(bVar4));
        px pxVarR = r();
        double d = f;
        double d2 = i;
        pxVarR.q(h46VarQ2, h46VarQ4, h46VarQ6, h46VarQ8, (float) (Math.sin(d) * d2));
        d(pxVarR);
        px pxVarR2 = r();
        pxVarR2.q(h46VarQ, h46VarQ3, h46VarQ5, h46VarQ7, (float) (Math.cos(d) * d2));
        d(pxVarR2);
    }

    public void c(h46 h46Var, h46 h46Var2, int i, float f, h46 h46Var3, h46 h46Var4, int i2, int i3) {
        px pxVarR = r();
        pxVarR.h(h46Var, h46Var2, i, f, h46Var3, h46Var4, i2);
        if (i3 != 8) {
            pxVarR.d(this, i3);
        }
        d(pxVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.zepto.px r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r4.l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r4.m
            if (r0 >= r2) goto L12
            int r0 = r4.k
            int r0 = r0 + r1
            int r2 = r4.f
            if (r0 < r2) goto L15
        L12:
            r4.y()
        L15:
            boolean r0 = r5.f
            if (r0 != 0) goto L84
            r5.D(r4)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L23
            return
        L23:
            r5.r()
            boolean r0 = r5.f(r4)
            if (r0 == 0) goto L7a
            com.zepto.h46 r0 = r4.p()
            r5.a = r0
            int r2 = r4.l
            r4.l(r5)
            int r3 = r4.l
            int r2 = r2 + r1
            if (r3 != r2) goto L7a
            com.zepto.nf3$a r2 = r4.q
            r2.c(r5)
            com.zepto.nf3$a r2 = r4.q
            r4.B(r2, r1)
            int r2 = r0.g
            r3 = -1
            if (r2 != r3) goto L7b
            com.zepto.h46 r2 = r5.a
            if (r2 != r0) goto L58
            com.zepto.h46 r0 = r5.v(r0)
            if (r0 == 0) goto L58
            r5.x(r0)
        L58:
            boolean r0 = r5.f
            if (r0 != 0) goto L61
            com.zepto.h46 r0 = r5.a
            r0.h(r4, r5)
        L61:
            boolean r0 = com.zepto.nf3.v
            if (r0 == 0) goto L6d
            com.zepto.j90 r0 = r4.n
            com.zepto.xs4 r0 = r0.a
            r0.a(r5)
            goto L74
        L6d:
            com.zepto.j90 r0 = r4.n
            com.zepto.xs4 r0 = r0.b
            r0.a(r5)
        L74:
            int r0 = r4.l
            int r0 = r0 - r1
            r4.l = r0
            goto L7b
        L7a:
            r1 = 0
        L7b:
            boolean r0 = r5.s()
            if (r0 != 0) goto L82
            return
        L82:
            if (r1 != 0) goto L87
        L84:
            r4.l(r5)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.nf3.d(com.zepto.px):void");
    }

    public px e(h46 h46Var, h46 h46Var2, int i, int i2) {
        if (s && i2 == 8 && h46Var2.j && h46Var.g == -1) {
            h46Var.f(this, h46Var2.i + i);
            return null;
        }
        px pxVarR = r();
        pxVarR.n(h46Var, h46Var2, i);
        if (i2 != 8) {
            pxVarR.d(this, i2);
        }
        d(pxVarR);
        return pxVarR;
    }

    public void f(h46 h46Var, int i) {
        if (s && h46Var.g == -1) {
            float f = i;
            h46Var.f(this, f);
            for (int i2 = 0; i2 < this.b + 1; i2++) {
                h46 h46Var2 = this.n.d[i2];
                if (h46Var2 != null && h46Var2.q && h46Var2.r == h46Var.f) {
                    h46Var2.f(this, h46Var2.s + f);
                }
            }
            return;
        }
        int i3 = h46Var.g;
        if (i3 == -1) {
            px pxVarR = r();
            pxVarR.i(h46Var, i);
            d(pxVarR);
            return;
        }
        px pxVar = this.g[i3];
        if (pxVar.f) {
            pxVar.b = i;
            return;
        }
        if (pxVar.e.e() == 0) {
            pxVar.f = true;
            pxVar.b = i;
        } else {
            px pxVarR2 = r();
            pxVarR2.m(h46Var, i);
            d(pxVarR2);
        }
    }

    public void g(h46 h46Var, h46 h46Var2, int i, boolean z) {
        px pxVarR = r();
        h46 h46VarT = t();
        h46VarT.h = 0;
        pxVarR.o(h46Var, h46Var2, h46VarT, i);
        d(pxVarR);
    }

    public void h(h46 h46Var, h46 h46Var2, int i, int i2) {
        px pxVarR = r();
        h46 h46VarT = t();
        h46VarT.h = 0;
        pxVarR.o(h46Var, h46Var2, h46VarT, i);
        if (i2 != 8) {
            m(pxVarR, (int) (pxVarR.e.b(h46VarT) * (-1.0f)), i2);
        }
        d(pxVarR);
    }

    public void i(h46 h46Var, h46 h46Var2, int i, boolean z) {
        px pxVarR = r();
        h46 h46VarT = t();
        h46VarT.h = 0;
        pxVarR.p(h46Var, h46Var2, h46VarT, i);
        d(pxVarR);
    }

    public void j(h46 h46Var, h46 h46Var2, int i, int i2) {
        px pxVarR = r();
        h46 h46VarT = t();
        h46VarT.h = 0;
        pxVarR.p(h46Var, h46Var2, h46VarT, i);
        if (i2 != 8) {
            m(pxVarR, (int) (pxVarR.e.b(h46VarT) * (-1.0f)), i2);
        }
        d(pxVarR);
    }

    public void k(h46 h46Var, h46 h46Var2, h46 h46Var3, h46 h46Var4, float f, int i) {
        px pxVarR = r();
        pxVarR.k(h46Var, h46Var2, h46Var3, h46Var4, f);
        if (i != 8) {
            pxVarR.d(this, i);
        }
        d(pxVarR);
    }

    public final void l(px pxVar) {
        int i;
        if (t && pxVar.f) {
            pxVar.a.f(this, pxVar.b);
        } else {
            px[] pxVarArr = this.g;
            int i2 = this.l;
            pxVarArr[i2] = pxVar;
            h46 h46Var = pxVar.a;
            h46Var.g = i2;
            this.l = i2 + 1;
            h46Var.h(this, pxVar);
        }
        if (t && this.a) {
            int i3 = 0;
            while (i3 < this.l) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                px pxVar2 = this.g[i3];
                if (pxVar2 != null && pxVar2.f) {
                    pxVar2.a.f(this, pxVar2.b);
                    if (v) {
                        this.n.a.a(pxVar2);
                    } else {
                        this.n.b.a(pxVar2);
                    }
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.l;
                        if (i4 >= i) {
                            break;
                        }
                        px[] pxVarArr2 = this.g;
                        int i6 = i4 - 1;
                        px pxVar3 = pxVarArr2[i4];
                        pxVarArr2[i6] = pxVar3;
                        h46 h46Var2 = pxVar3.a;
                        if (h46Var2.g == i4) {
                            h46Var2.g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public void m(px pxVar, int i, int i2) {
        pxVar.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.l; i++) {
            px pxVar = this.g[i];
            pxVar.a.i = pxVar.b;
        }
    }

    public h46 o(int i, String str) {
        if (this.k + 1 >= this.f) {
            y();
        }
        h46 h46VarA = a(h46.a.ERROR, str);
        int i2 = this.b + 1;
        this.b = i2;
        this.k++;
        h46VarA.f = i2;
        h46VarA.h = i;
        this.n.d[i2] = h46VarA;
        this.d.a(h46VarA);
        return h46VarA;
    }

    public h46 p() {
        if (this.k + 1 >= this.f) {
            y();
        }
        h46 h46VarA = a(h46.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        h46VarA.f = i;
        this.n.d[i] = h46VarA;
        return h46VarA;
    }

    public h46 q(Object obj) {
        h46 h46VarI = null;
        if (obj == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            y();
        }
        if (obj instanceof yw0) {
            yw0 yw0Var = (yw0) obj;
            h46VarI = yw0Var.i();
            if (h46VarI == null) {
                yw0Var.s(this.n);
                h46VarI = yw0Var.i();
            }
            int i = h46VarI.f;
            if (i == -1 || i > this.b || this.n.d[i] == null) {
                if (i != -1) {
                    h46VarI.e();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.k++;
                h46VarI.f = i2;
                h46VarI.m = h46.a.UNRESTRICTED;
                this.n.d[i2] = h46VarI;
            }
        }
        return h46VarI;
    }

    public px r() {
        px pxVar;
        if (v) {
            pxVar = (px) this.n.a.b();
            if (pxVar == null) {
                pxVar = new b(this.n);
                y++;
            } else {
                pxVar.y();
            }
        } else {
            pxVar = (px) this.n.b.b();
            if (pxVar == null) {
                pxVar = new px(this.n);
                x++;
            } else {
                pxVar.y();
            }
        }
        h46.c();
        return pxVar;
    }

    public h46 t() {
        if (this.k + 1 >= this.f) {
            y();
        }
        h46 h46VarA = a(h46.a.SLACK, null);
        int i = this.b + 1;
        this.b = i;
        this.k++;
        h46VarA.f = i;
        this.n.d[i] = h46VarA;
        return h46VarA;
    }

    public final int u(a aVar) {
        for (int i = 0; i < this.l; i++) {
            px pxVar = this.g[i];
            if (pxVar.a.m != h46.a.UNRESTRICTED && pxVar.b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        if (i3 >= this.l) {
                            break;
                        }
                        px pxVar2 = this.g[i3];
                        if (pxVar2.a.m != h46.a.UNRESTRICTED && !pxVar2.f && pxVar2.b < 0.0f) {
                            int i7 = 9;
                            if (u) {
                                int iE = pxVar2.e.e();
                                int i8 = 0;
                                while (i8 < iE) {
                                    h46 h46VarF = pxVar2.e.f(i8);
                                    float fB = pxVar2.e.b(h46VarF);
                                    if (fB > 0.0f) {
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            float f2 = h46VarF.k[i9] / fB;
                                            if ((f2 < f && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = h46VarF.f;
                                                i4 = i3;
                                                f = f2;
                                            }
                                            i9++;
                                            i7 = 9;
                                        }
                                    }
                                    i8++;
                                    i7 = 9;
                                }
                            } else {
                                for (int i10 = 1; i10 < this.k; i10++) {
                                    h46 h46Var = this.n.d[i10];
                                    float fB2 = pxVar2.e.b(h46Var);
                                    if (fB2 > 0.0f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f3 = h46Var.k[i11] / fB2;
                                            if ((f3 < f && i11 == i6) || i11 > i6) {
                                                i4 = i3;
                                                i5 = i10;
                                                i6 = i11;
                                                f = f3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3++;
                    }
                    if (i4 != -1) {
                        px pxVar3 = this.g[i4];
                        pxVar3.a.g = -1;
                        pxVar3.x(this.n.d[i5]);
                        h46 h46Var2 = pxVar3.a;
                        h46Var2.g = i4;
                        h46Var2.h(this, pxVar3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.k / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public j90 v() {
        return this.n;
    }

    public int x(Object obj) {
        h46 h46VarI = ((yw0) obj).i();
        if (h46VarI != null) {
            return (int) (h46VarI.i + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i = this.e * 2;
        this.e = i;
        this.g = (px[]) Arrays.copyOf(this.g, i);
        j90 j90Var = this.n;
        j90Var.d = (h46[]) Arrays.copyOf(j90Var.d, this.e);
        int i2 = this.e;
        this.j = new boolean[i2];
        this.f = i2;
        this.m = i2;
    }

    public void z() {
        if (this.d.isEmpty()) {
            n();
            return;
        }
        if (!this.h && !this.i) {
            A(this.d);
            return;
        }
        for (int i = 0; i < this.l; i++) {
            if (!this.g[i].f) {
                A(this.d);
                return;
            }
        }
        n();
    }
}
