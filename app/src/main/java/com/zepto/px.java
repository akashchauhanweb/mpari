package com.zepto;

import com.zepto.h46;
import com.zepto.nf3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class px implements nf3.a {
    public a e;
    public h46 a = null;
    public float b = 0.0f;
    public boolean c = false;
    public ArrayList d = new ArrayList();
    public boolean f = false;

    public interface a {
        float a(int i);

        float b(h46 h46Var);

        void c(h46 h46Var, float f);

        void clear();

        boolean d(h46 h46Var);

        int e();

        h46 f(int i);

        void g(h46 h46Var, float f, boolean z);

        void h(float f);

        float i(h46 h46Var, boolean z);

        float j(px pxVar, boolean z);

        void k();
    }

    public px() {
    }

    public void A(nf3 nf3Var, h46 h46Var, boolean z) {
        if (h46Var == null || !h46Var.j) {
            return;
        }
        this.b += h46Var.i * this.e.b(h46Var);
        this.e.i(h46Var, z);
        if (z) {
            h46Var.d(this);
        }
        if (nf3.t && this.e.e() == 0) {
            this.f = true;
            nf3Var.a = true;
        }
    }

    public void B(nf3 nf3Var, px pxVar, boolean z) {
        this.b += pxVar.b * this.e.j(pxVar, z);
        if (z) {
            pxVar.a.d(this);
        }
        if (nf3.t && this.a != null && this.e.e() == 0) {
            this.f = true;
            nf3Var.a = true;
        }
    }

    public void C(nf3 nf3Var, h46 h46Var, boolean z) {
        if (h46Var == null || !h46Var.q) {
            return;
        }
        float fB = this.e.b(h46Var);
        this.b += h46Var.s * fB;
        this.e.i(h46Var, z);
        if (z) {
            h46Var.d(this);
        }
        this.e.g(nf3Var.n.d[h46Var.r], fB, z);
        if (nf3.t && this.e.e() == 0) {
            this.f = true;
            nf3Var.a = true;
        }
    }

    public void D(nf3 nf3Var) {
        if (nf3Var.g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iE = this.e.e();
            for (int i = 0; i < iE; i++) {
                h46 h46VarF = this.e.f(i);
                if (h46VarF.g != -1 || h46VarF.j || h46VarF.q) {
                    this.d.add(h46VarF);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    h46 h46Var = (h46) this.d.get(i2);
                    if (h46Var.j) {
                        A(nf3Var, h46Var, true);
                    } else if (h46Var.q) {
                        C(nf3Var, h46Var, true);
                    } else {
                        B(nf3Var, nf3Var.g[h46Var.g], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (nf3.t && this.a != null && this.e.e() == 0) {
            this.f = true;
            nf3Var.a = true;
        }
    }

    @Override // com.zepto.nf3.a
    public void a(h46 h46Var) {
        int i = h46Var.h;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.c(h46Var, f);
    }

    @Override // com.zepto.nf3.a
    public h46 b(nf3 nf3Var, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // com.zepto.nf3.a
    public void c(nf3.a aVar) {
        if (aVar instanceof px) {
            px pxVar = (px) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < pxVar.e.e(); i++) {
                this.e.g(pxVar.e.f(i), pxVar.e.a(i), true);
            }
        }
    }

    @Override // com.zepto.nf3.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public px d(nf3 nf3Var, int i) {
        this.e.c(nf3Var.o(i, "ep"), 1.0f);
        this.e.c(nf3Var.o(i, "em"), -1.0f);
        return this;
    }

    public px e(h46 h46Var, int i) {
        this.e.c(h46Var, i);
        return this;
    }

    public boolean f(nf3 nf3Var) {
        boolean z;
        h46 h46VarG = g(nf3Var);
        if (h46VarG == null) {
            z = true;
        } else {
            x(h46VarG);
            z = false;
        }
        if (this.e.e() == 0) {
            this.f = true;
        }
        return z;
    }

    public h46 g(nf3 nf3Var) {
        int iE = this.e.e();
        h46 h46Var = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        h46 h46Var2 = null;
        for (int i = 0; i < iE; i++) {
            float fA = this.e.a(i);
            h46 h46VarF = this.e.f(i);
            if (h46VarF.m == h46.a.UNRESTRICTED) {
                if (h46Var == null || f > fA) {
                    boolean zU = u(h46VarF, nf3Var);
                    z = zU;
                    f = fA;
                    h46Var = h46VarF;
                } else if (!z && u(h46VarF, nf3Var)) {
                    f = fA;
                    h46Var = h46VarF;
                    z = true;
                }
            } else if (h46Var == null && fA < 0.0f) {
                if (h46Var2 == null || f2 > fA) {
                    boolean zU2 = u(h46VarF, nf3Var);
                    z2 = zU2;
                    f2 = fA;
                    h46Var2 = h46VarF;
                } else if (!z2 && u(h46VarF, nf3Var)) {
                    f2 = fA;
                    h46Var2 = h46VarF;
                    z2 = true;
                }
            }
        }
        return h46Var != null ? h46Var : h46Var2;
    }

    @Override // com.zepto.nf3.a
    public h46 getKey() {
        return this.a;
    }

    public px h(h46 h46Var, h46 h46Var2, int i, float f, h46 h46Var3, h46 h46Var4, int i2) {
        if (h46Var2 == h46Var3) {
            this.e.c(h46Var, 1.0f);
            this.e.c(h46Var4, 1.0f);
            this.e.c(h46Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.c(h46Var, 1.0f);
            this.e.c(h46Var2, -1.0f);
            this.e.c(h46Var3, -1.0f);
            this.e.c(h46Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.c(h46Var, -1.0f);
            this.e.c(h46Var2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.c(h46Var4, -1.0f);
            this.e.c(h46Var3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.c(h46Var, f2 * 1.0f);
            this.e.c(h46Var2, f2 * (-1.0f));
            this.e.c(h46Var3, (-1.0f) * f);
            this.e.c(h46Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public px i(h46 h46Var, int i) {
        this.a = h46Var;
        float f = i;
        h46Var.i = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // com.zepto.nf3.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.e() == 0;
    }

    public px j(h46 h46Var, h46 h46Var2, float f) {
        this.e.c(h46Var, -1.0f);
        this.e.c(h46Var2, f);
        return this;
    }

    public px k(h46 h46Var, h46 h46Var2, h46 h46Var3, h46 h46Var4, float f) {
        this.e.c(h46Var, -1.0f);
        this.e.c(h46Var2, 1.0f);
        this.e.c(h46Var3, f);
        this.e.c(h46Var4, -f);
        return this;
    }

    public px l(float f, float f2, float f3, h46 h46Var, h46 h46Var2, h46 h46Var3, h46 h46Var4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.c(h46Var, 1.0f);
            this.e.c(h46Var2, -1.0f);
            this.e.c(h46Var4, 1.0f);
            this.e.c(h46Var3, -1.0f);
        } else if (f == 0.0f) {
            this.e.c(h46Var, 1.0f);
            this.e.c(h46Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.c(h46Var3, 1.0f);
            this.e.c(h46Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.c(h46Var, 1.0f);
            this.e.c(h46Var2, -1.0f);
            this.e.c(h46Var4, f4);
            this.e.c(h46Var3, -f4);
        }
        return this;
    }

    public px m(h46 h46Var, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.c(h46Var, 1.0f);
        } else {
            this.b = i;
            this.e.c(h46Var, -1.0f);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.px n(com.zepto.h46 r4, com.zepto.h46 r5, int r6) {
        /*
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == 0) goto L1e
            if (r6 >= 0) goto Lc
            int r6 = r6 * (-1)
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            float r6 = (float) r6
            r3.b = r6
            if (r2 != 0) goto L13
            goto L1e
        L13:
            com.zepto.px$a r6 = r3.e
            r6.c(r4, r0)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r1)
            goto L28
        L1e:
            com.zepto.px$a r6 = r3.e
            r6.c(r4, r1)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r0)
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.px.n(com.zepto.h46, com.zepto.h46, int):com.zepto.px");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.px o(com.zepto.h46 r4, com.zepto.h46 r5, com.zepto.h46 r6, int r7) {
        /*
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 == 0) goto L23
            if (r7 >= 0) goto Lc
            int r7 = r7 * (-1)
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            float r7 = (float) r7
            r3.b = r7
            if (r2 != 0) goto L13
            goto L23
        L13:
            com.zepto.px$a r7 = r3.e
            r7.c(r4, r0)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r1)
            com.zepto.px$a r4 = r3.e
            r4.c(r6, r1)
            goto L32
        L23:
            com.zepto.px$a r7 = r3.e
            r7.c(r4, r1)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r0)
            com.zepto.px$a r4 = r3.e
            r4.c(r6, r0)
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.px.o(com.zepto.h46, com.zepto.h46, com.zepto.h46, int):com.zepto.px");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.zepto.px p(com.zepto.h46 r4, com.zepto.h46 r5, com.zepto.h46 r6, int r7) {
        /*
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 == 0) goto L23
            if (r7 >= 0) goto Lc
            int r7 = r7 * (-1)
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            float r7 = (float) r7
            r3.b = r7
            if (r2 != 0) goto L13
            goto L23
        L13:
            com.zepto.px$a r7 = r3.e
            r7.c(r4, r0)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r1)
            com.zepto.px$a r4 = r3.e
            r4.c(r6, r0)
            goto L32
        L23:
            com.zepto.px$a r7 = r3.e
            r7.c(r4, r1)
            com.zepto.px$a r4 = r3.e
            r4.c(r5, r0)
            com.zepto.px$a r4 = r3.e
            r4.c(r6, r1)
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.px.p(com.zepto.h46, com.zepto.h46, com.zepto.h46, int):com.zepto.px");
    }

    public px q(h46 h46Var, h46 h46Var2, h46 h46Var3, h46 h46Var4, float f) {
        this.e.c(h46Var3, 0.5f);
        this.e.c(h46Var4, 0.5f);
        this.e.c(h46Var, -0.5f);
        this.e.c(h46Var2, -0.5f);
        this.b = -f;
        return this;
    }

    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.k();
        }
    }

    public boolean s() {
        h46 h46Var = this.a;
        return h46Var != null && (h46Var.m == h46.a.UNRESTRICTED || this.b >= 0.0f);
    }

    public boolean t(h46 h46Var) {
        return this.e.d(h46Var);
    }

    public String toString() {
        return z();
    }

    public final boolean u(h46 h46Var, nf3 nf3Var) {
        return h46Var.p <= 1;
    }

    public h46 v(h46 h46Var) {
        return w(null, h46Var);
    }

    public final h46 w(boolean[] zArr, h46 h46Var) {
        h46.a aVar;
        int iE = this.e.e();
        h46 h46Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < iE; i++) {
            float fA = this.e.a(i);
            if (fA < 0.0f) {
                h46 h46VarF = this.e.f(i);
                if ((zArr == null || !zArr[h46VarF.f]) && h46VarF != h46Var && (((aVar = h46VarF.m) == h46.a.SLACK || aVar == h46.a.ERROR) && fA < f)) {
                    f = fA;
                    h46Var2 = h46VarF;
                }
            }
        }
        return h46Var2;
    }

    public void x(h46 h46Var) {
        h46 h46Var2 = this.a;
        if (h46Var2 != null) {
            this.e.c(h46Var2, -1.0f);
            this.a.g = -1;
            this.a = null;
        }
        float fI = this.e.i(h46Var, true) * (-1.0f);
        this.a = h46Var;
        if (fI == 1.0f) {
            return;
        }
        this.b /= fI;
        this.e.h(fI);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.px.z():java.lang.String");
    }

    public px(j90 j90Var) {
        this.e = new mx(this, j90Var);
    }
}
