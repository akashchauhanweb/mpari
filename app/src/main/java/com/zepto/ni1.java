package com.zepto;

import com.zepto.e50;
import com.zepto.jx0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ni1 {
    public kx0 a;
    public kx0 d;
    public boolean b = true;
    public boolean c = true;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public e50.b g = null;
    public e50.a h = new e50.a();
    public ArrayList i = new ArrayList();

    public ni1(kx0 kx0Var) {
        this.a = kx0Var;
        this.d = kx0Var;
    }

    public final void a(oi1 oi1Var, int i, int i2, oi1 oi1Var2, ArrayList arrayList, kf5 kf5Var) {
        xu7 xu7Var = oi1Var.d;
        if (xu7Var.c == null) {
            kx0 kx0Var = this.a;
            if (xu7Var == kx0Var.e || xu7Var == kx0Var.f) {
                return;
            }
            if (kf5Var == null) {
                kf5Var = new kf5(xu7Var, i2);
                arrayList.add(kf5Var);
            }
            xu7Var.c = kf5Var;
            kf5Var.a(xu7Var);
            for (ii1 ii1Var : xu7Var.h.k) {
                if (ii1Var instanceof oi1) {
                    a((oi1) ii1Var, i, 0, oi1Var2, arrayList, kf5Var);
                }
            }
            for (ii1 ii1Var2 : xu7Var.i.k) {
                if (ii1Var2 instanceof oi1) {
                    a((oi1) ii1Var2, i, 1, oi1Var2, arrayList, kf5Var);
                }
            }
            if (i == 1 && (xu7Var instanceof rp7)) {
                for (ii1 ii1Var3 : ((rp7) xu7Var).k.k) {
                    if (ii1Var3 instanceof oi1) {
                        a((oi1) ii1Var3, i, 2, oi1Var2, arrayList, kf5Var);
                    }
                }
            }
            for (oi1 oi1Var3 : xu7Var.h.l) {
                if (oi1Var3 == oi1Var2) {
                    kf5Var.b = true;
                }
                a(oi1Var3, i, 0, oi1Var2, arrayList, kf5Var);
            }
            for (oi1 oi1Var4 : xu7Var.i.l) {
                if (oi1Var4 == oi1Var2) {
                    kf5Var.b = true;
                }
                a(oi1Var4, i, 1, oi1Var2, arrayList, kf5Var);
            }
            if (i == 1 && (xu7Var instanceof rp7)) {
                Iterator it = ((rp7) xu7Var).k.l.iterator();
                while (it.hasNext()) {
                    a((oi1) it.next(), i, 2, oi1Var2, arrayList, kf5Var);
                }
            }
        }
    }

    public final boolean b(kx0 kx0Var) {
        int iW;
        jx0.b bVar;
        int iX;
        jx0.b bVar2;
        jx0.b bVar3;
        jx0.b bVar4;
        for (jx0 jx0Var : kx0Var.L0) {
            jx0.b[] bVarArr = jx0Var.Z;
            jx0.b bVar5 = bVarArr[0];
            jx0.b bVar6 = bVarArr[1];
            if (jx0Var.V() == 8) {
                jx0Var.a = true;
            } else {
                if (jx0Var.B < 1.0f && bVar5 == jx0.b.MATCH_CONSTRAINT) {
                    jx0Var.w = 2;
                }
                if (jx0Var.E < 1.0f && bVar6 == jx0.b.MATCH_CONSTRAINT) {
                    jx0Var.x = 2;
                }
                if (jx0Var.v() > 0.0f) {
                    jx0.b bVar7 = jx0.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == jx0.b.WRAP_CONTENT || bVar6 == jx0.b.FIXED)) {
                        jx0Var.w = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == jx0.b.WRAP_CONTENT || bVar5 == jx0.b.FIXED)) {
                        jx0Var.x = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (jx0Var.w == 0) {
                            jx0Var.w = 3;
                        }
                        if (jx0Var.x == 0) {
                            jx0Var.x = 3;
                        }
                    }
                }
                jx0.b bVar8 = jx0.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && jx0Var.w == 1 && (jx0Var.O.f == null || jx0Var.Q.f == null)) {
                    bVar5 = jx0.b.WRAP_CONTENT;
                }
                jx0.b bVar9 = bVar5;
                if (bVar6 == bVar8 && jx0Var.x == 1 && (jx0Var.P.f == null || jx0Var.R.f == null)) {
                    bVar6 = jx0.b.WRAP_CONTENT;
                }
                jx0.b bVar10 = bVar6;
                gr2 gr2Var = jx0Var.e;
                gr2Var.d = bVar9;
                int i = jx0Var.w;
                gr2Var.a = i;
                rp7 rp7Var = jx0Var.f;
                rp7Var.d = bVar10;
                int i2 = jx0Var.x;
                rp7Var.a = i2;
                jx0.b bVar11 = jx0.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == jx0.b.FIXED || bVar9 == jx0.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == jx0.b.FIXED || bVar10 == jx0.b.WRAP_CONTENT)) {
                    int iW2 = jx0Var.W();
                    if (bVar9 == bVar11) {
                        iW = (kx0Var.W() - jx0Var.O.g) - jx0Var.Q.g;
                        bVar = jx0.b.FIXED;
                    } else {
                        iW = iW2;
                        bVar = bVar9;
                    }
                    int iX2 = jx0Var.x();
                    if (bVar10 == bVar11) {
                        iX = (kx0Var.x() - jx0Var.P.g) - jx0Var.R.g;
                        bVar2 = jx0.b.FIXED;
                    } else {
                        iX = iX2;
                        bVar2 = bVar10;
                    }
                    l(jx0Var, bVar, iW, bVar2, iX);
                    jx0Var.e.e.d(jx0Var.W());
                    jx0Var.f.e.d(jx0Var.x());
                    jx0Var.a = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = jx0.b.WRAP_CONTENT) || bVar10 == jx0.b.FIXED)) {
                        if (i == 3) {
                            if (bVar10 == bVar4) {
                                l(jx0Var, bVar4, 0, bVar4, 0);
                            }
                            int iX3 = jx0Var.x();
                            int i3 = (int) ((iX3 * jx0Var.d0) + 0.5f);
                            jx0.b bVar12 = jx0.b.FIXED;
                            l(jx0Var, bVar12, i3, bVar12, iX3);
                            jx0Var.e.e.d(jx0Var.W());
                            jx0Var.f.e.d(jx0Var.x());
                            jx0Var.a = true;
                        } else if (i == 1) {
                            l(jx0Var, bVar4, 0, bVar10, 0);
                            jx0Var.e.e.m = jx0Var.W();
                        } else if (i == 2) {
                            jx0.b bVar13 = kx0Var.Z[0];
                            jx0.b bVar14 = jx0.b.FIXED;
                            if (bVar13 == bVar14 || bVar13 == bVar11) {
                                l(jx0Var, bVar14, (int) ((jx0Var.B * kx0Var.W()) + 0.5f), bVar10, jx0Var.x());
                                jx0Var.e.e.d(jx0Var.W());
                                jx0Var.f.e.d(jx0Var.x());
                                jx0Var.a = true;
                            }
                        } else {
                            yw0[] yw0VarArr = jx0Var.W;
                            if (yw0VarArr[0].f == null || yw0VarArr[1].f == null) {
                                l(jx0Var, bVar4, 0, bVar10, 0);
                                jx0Var.e.e.d(jx0Var.W());
                                jx0Var.f.e.d(jx0Var.x());
                                jx0Var.a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = jx0.b.WRAP_CONTENT) || bVar9 == jx0.b.FIXED)) {
                        if (i2 == 3) {
                            if (bVar9 == bVar3) {
                                l(jx0Var, bVar3, 0, bVar3, 0);
                            }
                            int iW3 = jx0Var.W();
                            float f = jx0Var.d0;
                            if (jx0Var.w() == -1) {
                                f = 1.0f / f;
                            }
                            jx0.b bVar15 = jx0.b.FIXED;
                            l(jx0Var, bVar15, iW3, bVar15, (int) ((iW3 * f) + 0.5f));
                            jx0Var.e.e.d(jx0Var.W());
                            jx0Var.f.e.d(jx0Var.x());
                            jx0Var.a = true;
                        } else if (i2 == 1) {
                            l(jx0Var, bVar9, 0, bVar3, 0);
                            jx0Var.f.e.m = jx0Var.x();
                        } else if (i2 == 2) {
                            jx0.b bVar16 = kx0Var.Z[1];
                            jx0.b bVar17 = jx0.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar11) {
                                l(jx0Var, bVar9, jx0Var.W(), bVar17, (int) ((jx0Var.E * kx0Var.x()) + 0.5f));
                                jx0Var.e.e.d(jx0Var.W());
                                jx0Var.f.e.d(jx0Var.x());
                                jx0Var.a = true;
                            }
                        } else {
                            yw0[] yw0VarArr2 = jx0Var.W;
                            if (yw0VarArr2[2].f == null || yw0VarArr2[3].f == null) {
                                l(jx0Var, bVar3, 0, bVar10, 0);
                                jx0Var.e.e.d(jx0Var.W());
                                jx0Var.f.e.d(jx0Var.x());
                                jx0Var.a = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i == 1 || i2 == 1) {
                            jx0.b bVar18 = jx0.b.WRAP_CONTENT;
                            l(jx0Var, bVar18, 0, bVar18, 0);
                            jx0Var.e.e.m = jx0Var.W();
                            jx0Var.f.e.m = jx0Var.x();
                        } else if (i2 == 2 && i == 2) {
                            jx0.b[] bVarArr2 = kx0Var.Z;
                            jx0.b bVar19 = bVarArr2[0];
                            jx0.b bVar20 = jx0.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                l(jx0Var, bVar20, (int) ((jx0Var.B * kx0Var.W()) + 0.5f), bVar20, (int) ((jx0Var.E * kx0Var.x()) + 0.5f));
                                jx0Var.e.e.d(jx0Var.W());
                                jx0Var.f.e.d(jx0Var.x());
                                jx0Var.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.e);
        this.i.clear();
        kf5.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        HashSet hashSet = null;
        for (jx0 jx0Var : this.d.L0) {
            if (jx0Var instanceof sk2) {
                arrayList.add(new tk2(jx0Var));
            } else {
                if (jx0Var.i0()) {
                    if (jx0Var.c == null) {
                        jx0Var.c = new jc0(jx0Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jx0Var.c);
                } else {
                    arrayList.add(jx0Var.e);
                }
                if (jx0Var.k0()) {
                    if (jx0Var.d == null) {
                        jx0Var.d = new jc0(jx0Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(jx0Var.d);
                } else {
                    arrayList.add(jx0Var.f);
                }
                if (jx0Var instanceof zl2) {
                    arrayList.add(new yl2(jx0Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xu7) it.next()).f();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            xu7 xu7Var = (xu7) it2.next();
            if (xu7Var.b != this.d) {
                xu7Var.d();
            }
        }
    }

    public final int e(kx0 kx0Var, int i) {
        int size = this.i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((kf5) this.i.get(i2)).b(kx0Var, i));
        }
        return (int) jMax;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            for (jx0 jx0Var : this.a.L0) {
                jx0Var.n();
                jx0Var.a = false;
                jx0Var.e.r();
                jx0Var.f.q();
            }
            this.a.n();
            kx0 kx0Var = this.a;
            kx0Var.a = false;
            kx0Var.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.m1(0);
        this.a.n1(0);
        jx0.b bVarU = this.a.u(0);
        jx0.b bVarU2 = this.a.u(1);
        if (this.b) {
            c();
        }
        int iX = this.a.X();
        int iY = this.a.Y();
        this.a.e.h.d(iX);
        this.a.f.h.d(iY);
        m();
        jx0.b bVar = jx0.b.WRAP_CONTENT;
        if (bVarU == bVar || bVarU2 == bVar) {
            if (z4) {
                Iterator it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((xu7) it.next()).m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarU == jx0.b.WRAP_CONTENT) {
                this.a.P0(jx0.b.FIXED);
                kx0 kx0Var2 = this.a;
                kx0Var2.k1(e(kx0Var2, 0));
                kx0 kx0Var3 = this.a;
                kx0Var3.e.e.d(kx0Var3.W());
            }
            if (z4 && bVarU2 == jx0.b.WRAP_CONTENT) {
                this.a.g1(jx0.b.FIXED);
                kx0 kx0Var4 = this.a;
                kx0Var4.L0(e(kx0Var4, 1));
                kx0 kx0Var5 = this.a;
                kx0Var5.f.e.d(kx0Var5.x());
            }
        }
        kx0 kx0Var6 = this.a;
        jx0.b bVar2 = kx0Var6.Z[0];
        jx0.b bVar3 = jx0.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == jx0.b.MATCH_PARENT) {
            int iW = kx0Var6.W() + iX;
            this.a.e.i.d(iW);
            this.a.e.e.d(iW - iX);
            m();
            kx0 kx0Var7 = this.a;
            jx0.b bVar4 = kx0Var7.Z[1];
            if (bVar4 == bVar3 || bVar4 == jx0.b.MATCH_PARENT) {
                int iX2 = kx0Var7.x() + iY;
                this.a.f.i.d(iX2);
                this.a.f.e.d(iX2 - iY);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (xu7 xu7Var : this.e) {
            if (xu7Var.b != this.a || xu7Var.g) {
                xu7Var.e();
            }
        }
        for (xu7 xu7Var2 : this.e) {
            if (z2 || xu7Var2.b != this.a) {
                if (!xu7Var2.h.j || ((!xu7Var2.i.j && !(xu7Var2 instanceof tk2)) || (!xu7Var2.e.j && !(xu7Var2 instanceof jc0) && !(xu7Var2 instanceof tk2)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.P0(bVarU);
        this.a.g1(bVarU2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            for (jx0 jx0Var : this.a.L0) {
                jx0Var.n();
                jx0Var.a = false;
                gr2 gr2Var = jx0Var.e;
                gr2Var.e.j = false;
                gr2Var.g = false;
                gr2Var.r();
                rp7 rp7Var = jx0Var.f;
                rp7Var.e.j = false;
                rp7Var.g = false;
                rp7Var.q();
            }
            this.a.n();
            kx0 kx0Var = this.a;
            kx0Var.a = false;
            gr2 gr2Var2 = kx0Var.e;
            gr2Var2.e.j = false;
            gr2Var2.g = false;
            gr2Var2.r();
            rp7 rp7Var2 = this.a.f;
            rp7Var2.e.j = false;
            rp7Var2.g = false;
            rp7Var2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.m1(0);
        this.a.n1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        jx0.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        jx0.b bVarU = this.a.u(0);
        jx0.b bVarU2 = this.a.u(1);
        int iX = this.a.X();
        int iY = this.a.Y();
        if (z4 && (bVarU == (bVar = jx0.b.WRAP_CONTENT) || bVarU2 == bVar)) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xu7 xu7Var = (xu7) it.next();
                if (xu7Var.f == i && !xu7Var.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && bVarU == jx0.b.WRAP_CONTENT) {
                    this.a.P0(jx0.b.FIXED);
                    kx0 kx0Var = this.a;
                    kx0Var.k1(e(kx0Var, 0));
                    kx0 kx0Var2 = this.a;
                    kx0Var2.e.e.d(kx0Var2.W());
                }
            } else if (z4 && bVarU2 == jx0.b.WRAP_CONTENT) {
                this.a.g1(jx0.b.FIXED);
                kx0 kx0Var3 = this.a;
                kx0Var3.L0(e(kx0Var3, 1));
                kx0 kx0Var4 = this.a;
                kx0Var4.f.e.d(kx0Var4.x());
            }
        }
        if (i == 0) {
            kx0 kx0Var5 = this.a;
            jx0.b bVar2 = kx0Var5.Z[0];
            if (bVar2 == jx0.b.FIXED || bVar2 == jx0.b.MATCH_PARENT) {
                int iW = kx0Var5.W() + iX;
                this.a.e.i.d(iW);
                this.a.e.e.d(iW - iX);
                z2 = true;
            }
            z2 = false;
        } else {
            kx0 kx0Var6 = this.a;
            jx0.b bVar3 = kx0Var6.Z[1];
            if (bVar3 == jx0.b.FIXED || bVar3 == jx0.b.MATCH_PARENT) {
                int iX2 = kx0Var6.x() + iY;
                this.a.f.i.d(iX2);
                this.a.f.e.d(iX2 - iY);
                z2 = true;
            }
            z2 = false;
        }
        m();
        for (xu7 xu7Var2 : this.e) {
            if (xu7Var2.f == i && (xu7Var2.b != this.a || xu7Var2.g)) {
                xu7Var2.e();
            }
        }
        for (xu7 xu7Var3 : this.e) {
            if (xu7Var3.f == i && (z2 || xu7Var3.b != this.a)) {
                if (!xu7Var3.h.j || !xu7Var3.i.j || (!(xu7Var3 instanceof jc0) && !xu7Var3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.P0(bVarU);
        this.a.g1(bVarU2);
        return z3;
    }

    public final void i(xu7 xu7Var, int i, ArrayList arrayList) {
        for (ii1 ii1Var : xu7Var.h.k) {
            if (ii1Var instanceof oi1) {
                a((oi1) ii1Var, i, 0, xu7Var.i, arrayList, null);
            } else if (ii1Var instanceof xu7) {
                a(((xu7) ii1Var).h, i, 0, xu7Var.i, arrayList, null);
            }
        }
        for (ii1 ii1Var2 : xu7Var.i.k) {
            if (ii1Var2 instanceof oi1) {
                a((oi1) ii1Var2, i, 1, xu7Var.h, arrayList, null);
            } else if (ii1Var2 instanceof xu7) {
                a(((xu7) ii1Var2).i, i, 1, xu7Var.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (ii1 ii1Var3 : ((rp7) xu7Var).k.k) {
                if (ii1Var3 instanceof oi1) {
                    a((oi1) ii1Var3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(jx0 jx0Var, jx0.b bVar, int i, jx0.b bVar2, int i2) {
        e50.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(jx0Var, aVar);
        jx0Var.k1(this.h.e);
        jx0Var.L0(this.h.f);
        jx0Var.K0(this.h.h);
        jx0Var.A0(this.h.g);
    }

    public void m() {
        bk1 bk1Var;
        for (jx0 jx0Var : this.a.L0) {
            if (!jx0Var.a) {
                jx0.b[] bVarArr = jx0Var.Z;
                boolean z = false;
                jx0.b bVar = bVarArr[0];
                jx0.b bVar2 = bVarArr[1];
                int i = jx0Var.w;
                int i2 = jx0Var.x;
                jx0.b bVar3 = jx0.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == jx0.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == jx0.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                bk1 bk1Var2 = jx0Var.e.e;
                boolean z3 = bk1Var2.j;
                bk1 bk1Var3 = jx0Var.f.e;
                boolean z4 = bk1Var3.j;
                if (z3 && z4) {
                    jx0.b bVar4 = jx0.b.FIXED;
                    l(jx0Var, bVar4, bk1Var2.g, bVar4, bk1Var3.g);
                    jx0Var.a = true;
                } else if (z3 && z) {
                    l(jx0Var, jx0.b.FIXED, bk1Var2.g, bVar3, bk1Var3.g);
                    if (bVar2 == jx0.b.MATCH_CONSTRAINT) {
                        jx0Var.f.e.m = jx0Var.x();
                    } else {
                        jx0Var.f.e.d(jx0Var.x());
                        jx0Var.a = true;
                    }
                } else if (z4 && z2) {
                    l(jx0Var, bVar3, bk1Var2.g, jx0.b.FIXED, bk1Var3.g);
                    if (bVar == jx0.b.MATCH_CONSTRAINT) {
                        jx0Var.e.e.m = jx0Var.W();
                    } else {
                        jx0Var.e.e.d(jx0Var.W());
                        jx0Var.a = true;
                    }
                }
                if (jx0Var.a && (bk1Var = jx0Var.f.l) != null) {
                    bk1Var.d(jx0Var.p());
                }
            }
        }
    }

    public void n(e50.b bVar) {
        this.g = bVar;
    }
}
