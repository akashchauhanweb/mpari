package com.zepto;

import com.zepto.e50;
import com.zepto.jx0;
import com.zepto.yw0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck1 {
    public static e50.a a = new e50.a();
    public static int b = 0;
    public static int c = 0;

    public static boolean a(int i, jx0 jx0Var) {
        jx0.b bVar;
        jx0.b bVar2;
        jx0.b bVarA = jx0Var.A();
        jx0.b bVarT = jx0Var.T();
        kx0 kx0Var = jx0Var.K() != null ? (kx0) jx0Var.K() : null;
        if (kx0Var != null) {
            kx0Var.A();
            jx0.b bVar3 = jx0.b.FIXED;
        }
        if (kx0Var != null) {
            kx0Var.T();
            jx0.b bVar4 = jx0.b.FIXED;
        }
        jx0.b bVar5 = jx0.b.FIXED;
        boolean z = bVarA == bVar5 || jx0Var.n0() || bVarA == jx0.b.WRAP_CONTENT || (bVarA == (bVar2 = jx0.b.MATCH_CONSTRAINT) && jx0Var.w == 0 && jx0Var.d0 == 0.0f && jx0Var.a0(0)) || (bVarA == bVar2 && jx0Var.w == 1 && jx0Var.d0(0, jx0Var.W()));
        boolean z2 = bVarT == bVar5 || jx0Var.o0() || bVarT == jx0.b.WRAP_CONTENT || (bVarT == (bVar = jx0.b.MATCH_CONSTRAINT) && jx0Var.x == 0 && jx0Var.d0 == 0.0f && jx0Var.a0(1)) || (bVarT == bVar && jx0Var.x == 1 && jx0Var.d0(1, jx0Var.x()));
        if (jx0Var.d0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i, jx0 jx0Var, e50.b bVar, boolean z) {
        yw0 yw0Var;
        yw0 yw0Var2;
        yw0 yw0Var3;
        yw0 yw0Var4;
        if (jx0Var.g0()) {
            return;
        }
        boolean z2 = true;
        b++;
        if (!(jx0Var instanceof kx0) && jx0Var.m0()) {
            int i2 = i + 1;
            if (a(i2, jx0Var)) {
                kx0.S1(i2, jx0Var, bVar, new e50.a(), e50.a.k);
            }
        }
        yw0 yw0VarO = jx0Var.o(yw0.b.LEFT);
        yw0 yw0VarO2 = jx0Var.o(yw0.b.RIGHT);
        int iE = yw0VarO.e();
        int iE2 = yw0VarO2.e();
        if (yw0VarO.d() != null && yw0VarO.n()) {
            for (yw0 yw0Var5 : yw0VarO.d()) {
                jx0 jx0Var2 = yw0Var5.d;
                int i3 = i + 1;
                boolean zA = a(i3, jx0Var2);
                if (jx0Var2.m0() && zA) {
                    kx0.S1(i3, jx0Var2, bVar, new e50.a(), e50.a.k);
                }
                boolean z3 = ((yw0Var5 == jx0Var2.O && (yw0Var4 = jx0Var2.Q.f) != null && yw0Var4.n()) || (yw0Var5 == jx0Var2.Q && (yw0Var3 = jx0Var2.O.f) != null && yw0Var3.n())) ? z2 : false;
                jx0.b bVarA = jx0Var2.A();
                jx0.b bVar2 = jx0.b.MATCH_CONSTRAINT;
                if (bVarA != bVar2 || zA) {
                    if (!jx0Var2.m0()) {
                        yw0 yw0Var6 = jx0Var2.O;
                        if (yw0Var5 == yw0Var6 && jx0Var2.Q.f == null) {
                            int iF = yw0Var6.f() + iE;
                            jx0Var2.F0(iF, jx0Var2.W() + iF);
                            b(i3, jx0Var2, bVar, z);
                        } else {
                            yw0 yw0Var7 = jx0Var2.Q;
                            if (yw0Var5 == yw0Var7 && yw0Var6.f == null) {
                                int iF2 = iE - yw0Var7.f();
                                jx0Var2.F0(iF2 - jx0Var2.W(), iF2);
                                b(i3, jx0Var2, bVar, z);
                            } else if (z3 && !jx0Var2.i0()) {
                                d(i3, bVar, jx0Var2, z);
                            }
                        }
                    }
                } else if (jx0Var2.A() == bVar2 && jx0Var2.A >= 0 && jx0Var2.z >= 0 && ((jx0Var2.V() == 8 || (jx0Var2.w == 0 && jx0Var2.v() == 0.0f)) && !jx0Var2.i0() && !jx0Var2.l0() && z3 && !jx0Var2.i0())) {
                    e(i3, jx0Var, bVar, jx0Var2, z);
                }
                z2 = true;
            }
        }
        if (jx0Var instanceof sk2) {
            return;
        }
        if (yw0VarO2.d() != null && yw0VarO2.n()) {
            for (yw0 yw0Var8 : yw0VarO2.d()) {
                jx0 jx0Var3 = yw0Var8.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, jx0Var3);
                if (jx0Var3.m0() && zA2) {
                    kx0.S1(i4, jx0Var3, bVar, new e50.a(), e50.a.k);
                }
                boolean z4 = (yw0Var8 == jx0Var3.O && (yw0Var2 = jx0Var3.Q.f) != null && yw0Var2.n()) || (yw0Var8 == jx0Var3.Q && (yw0Var = jx0Var3.O.f) != null && yw0Var.n());
                jx0.b bVarA2 = jx0Var3.A();
                jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar3 || zA2) {
                    if (!jx0Var3.m0()) {
                        yw0 yw0Var9 = jx0Var3.O;
                        if (yw0Var8 == yw0Var9 && jx0Var3.Q.f == null) {
                            int iF3 = yw0Var9.f() + iE2;
                            jx0Var3.F0(iF3, jx0Var3.W() + iF3);
                            b(i4, jx0Var3, bVar, z);
                        } else {
                            yw0 yw0Var10 = jx0Var3.Q;
                            if (yw0Var8 == yw0Var10 && yw0Var9.f == null) {
                                int iF4 = iE2 - yw0Var10.f();
                                jx0Var3.F0(iF4 - jx0Var3.W(), iF4);
                                b(i4, jx0Var3, bVar, z);
                            } else if (z4 && !jx0Var3.i0()) {
                                d(i4, bVar, jx0Var3, z);
                            }
                        }
                    }
                } else if (jx0Var3.A() == bVar3 && jx0Var3.A >= 0 && jx0Var3.z >= 0 && (jx0Var3.V() == 8 || (jx0Var3.w == 0 && jx0Var3.v() == 0.0f))) {
                    if (!jx0Var3.i0() && !jx0Var3.l0() && z4 && !jx0Var3.i0()) {
                        e(i4, jx0Var, bVar, jx0Var3, z);
                    }
                }
            }
        }
        jx0Var.q0();
    }

    public static void c(int i, a40 a40Var, e50.b bVar, int i2, boolean z) {
        if (a40Var.t1()) {
            if (i2 == 0) {
                b(i + 1, a40Var, bVar, z);
            } else {
                i(i + 1, a40Var, bVar);
            }
        }
    }

    public static void d(int i, e50.b bVar, jx0 jx0Var, boolean z) {
        float fY = jx0Var.y();
        int iE = jx0Var.O.f.e();
        int iE2 = jx0Var.Q.f.e();
        int iF = jx0Var.O.f() + iE;
        int iF2 = iE2 - jx0Var.Q.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iW = jx0Var.W();
        int i2 = (iE2 - iE) - iW;
        if (iE > iE2) {
            i2 = (iE - iE2) - iW;
        }
        int i3 = ((int) (i2 > 0 ? (fY * i2) + 0.5f : fY * i2)) + iE;
        int i4 = i3 + iW;
        if (iE > iE2) {
            i4 = i3 - iW;
        }
        jx0Var.F0(i3, i4);
        b(i + 1, jx0Var, bVar, z);
    }

    public static void e(int i, jx0 jx0Var, e50.b bVar, jx0 jx0Var2, boolean z) {
        float fY = jx0Var2.y();
        int iE = jx0Var2.O.f.e() + jx0Var2.O.f();
        int iE2 = jx0Var2.Q.f.e() - jx0Var2.Q.f();
        if (iE2 >= iE) {
            int iW = jx0Var2.W();
            if (jx0Var2.V() != 8) {
                int i2 = jx0Var2.w;
                if (i2 == 2) {
                    iW = (int) (jx0Var2.y() * 0.5f * (jx0Var instanceof kx0 ? jx0Var.W() : jx0Var.K().W()));
                } else if (i2 == 0) {
                    iW = iE2 - iE;
                }
                iW = Math.max(jx0Var2.z, iW);
                int i3 = jx0Var2.A;
                if (i3 > 0) {
                    iW = Math.min(i3, iW);
                }
            }
            int i4 = iE + ((int) ((fY * ((iE2 - iE) - iW)) + 0.5f));
            jx0Var2.F0(i4, iW + i4);
            b(i + 1, jx0Var2, bVar, z);
        }
    }

    public static void f(int i, e50.b bVar, jx0 jx0Var) {
        float fR = jx0Var.R();
        int iE = jx0Var.P.f.e();
        int iE2 = jx0Var.R.f.e();
        int iF = jx0Var.P.f() + iE;
        int iF2 = iE2 - jx0Var.R.f();
        if (iE == iE2) {
            fR = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = jx0Var.x();
        int i2 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i2 = (iE - iE2) - iX;
        }
        int i3 = (int) (i2 > 0 ? (fR * i2) + 0.5f : fR * i2);
        int i4 = iE + i3;
        int i5 = i4 + iX;
        if (iE > iE2) {
            i4 = iE - i3;
            i5 = i4 - iX;
        }
        jx0Var.I0(i4, i5);
        i(i + 1, jx0Var, bVar);
    }

    public static void g(int i, jx0 jx0Var, e50.b bVar, jx0 jx0Var2) {
        float fR = jx0Var2.R();
        int iE = jx0Var2.P.f.e() + jx0Var2.P.f();
        int iE2 = jx0Var2.R.f.e() - jx0Var2.R.f();
        if (iE2 >= iE) {
            int iX = jx0Var2.x();
            if (jx0Var2.V() != 8) {
                int i2 = jx0Var2.x;
                if (i2 == 2) {
                    iX = (int) (fR * 0.5f * (jx0Var instanceof kx0 ? jx0Var.x() : jx0Var.K().x()));
                } else if (i2 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(jx0Var2.C, iX);
                int i3 = jx0Var2.D;
                if (i3 > 0) {
                    iX = Math.min(i3, iX);
                }
            }
            int i4 = iE + ((int) ((fR * ((iE2 - iE) - iX)) + 0.5f));
            jx0Var2.I0(i4, iX + i4);
            i(i + 1, jx0Var2, bVar);
        }
    }

    public static void h(kx0 kx0Var, e50.b bVar) {
        jx0.b bVarA = kx0Var.A();
        jx0.b bVarT = kx0Var.T();
        b = 0;
        c = 0;
        kx0Var.v0();
        ArrayList arrayListR1 = kx0Var.r1();
        int size = arrayListR1.size();
        for (int i = 0; i < size; i++) {
            ((jx0) arrayListR1.get(i)).v0();
        }
        boolean zP1 = kx0Var.P1();
        if (bVarA == jx0.b.FIXED) {
            kx0Var.F0(0, kx0Var.W());
        } else {
            kx0Var.G0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            jx0 jx0Var = (jx0) arrayListR1.get(i2);
            if (jx0Var instanceof sk2) {
                sk2 sk2Var = (sk2) jx0Var;
                if (sk2Var.s1() == 1) {
                    if (sk2Var.t1() != -1) {
                        sk2Var.w1(sk2Var.t1());
                    } else if (sk2Var.u1() != -1 && kx0Var.n0()) {
                        sk2Var.w1(kx0Var.W() - sk2Var.u1());
                    } else if (kx0Var.n0()) {
                        sk2Var.w1((int) ((sk2Var.v1() * kx0Var.W()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((jx0Var instanceof a40) && ((a40) jx0Var).x1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                jx0 jx0Var2 = (jx0) arrayListR1.get(i3);
                if (jx0Var2 instanceof sk2) {
                    sk2 sk2Var2 = (sk2) jx0Var2;
                    if (sk2Var2.s1() == 1) {
                        b(0, sk2Var2, bVar, zP1);
                    }
                }
            }
        }
        b(0, kx0Var, bVar, zP1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                jx0 jx0Var3 = (jx0) arrayListR1.get(i4);
                if (jx0Var3 instanceof a40) {
                    a40 a40Var = (a40) jx0Var3;
                    if (a40Var.x1() == 0) {
                        c(0, a40Var, bVar, 0, zP1);
                    }
                }
            }
        }
        if (bVarT == jx0.b.FIXED) {
            kx0Var.I0(0, kx0Var.x());
        } else {
            kx0Var.H0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            jx0 jx0Var4 = (jx0) arrayListR1.get(i5);
            if (jx0Var4 instanceof sk2) {
                sk2 sk2Var3 = (sk2) jx0Var4;
                if (sk2Var3.s1() == 0) {
                    if (sk2Var3.t1() != -1) {
                        sk2Var3.w1(sk2Var3.t1());
                    } else if (sk2Var3.u1() != -1 && kx0Var.o0()) {
                        sk2Var3.w1(kx0Var.x() - sk2Var3.u1());
                    } else if (kx0Var.o0()) {
                        sk2Var3.w1((int) ((sk2Var3.v1() * kx0Var.x()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((jx0Var4 instanceof a40) && ((a40) jx0Var4).x1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                jx0 jx0Var5 = (jx0) arrayListR1.get(i6);
                if (jx0Var5 instanceof sk2) {
                    sk2 sk2Var4 = (sk2) jx0Var5;
                    if (sk2Var4.s1() == 0) {
                        i(1, sk2Var4, bVar);
                    }
                }
            }
        }
        i(0, kx0Var, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                jx0 jx0Var6 = (jx0) arrayListR1.get(i7);
                if (jx0Var6 instanceof a40) {
                    a40 a40Var2 = (a40) jx0Var6;
                    if (a40Var2.x1() == 1) {
                        c(0, a40Var2, bVar, 1, zP1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            jx0 jx0Var7 = (jx0) arrayListR1.get(i8);
            if (jx0Var7.m0() && a(0, jx0Var7)) {
                kx0.S1(0, jx0Var7, bVar, a, e50.a.k);
                if (!(jx0Var7 instanceof sk2)) {
                    b(0, jx0Var7, bVar, zP1);
                    i(0, jx0Var7, bVar);
                } else if (((sk2) jx0Var7).s1() == 0) {
                    i(0, jx0Var7, bVar);
                } else {
                    b(0, jx0Var7, bVar, zP1);
                }
            }
        }
    }

    public static void i(int i, jx0 jx0Var, e50.b bVar) {
        yw0 yw0Var;
        yw0 yw0Var2;
        yw0 yw0Var3;
        yw0 yw0Var4;
        if (jx0Var.p0()) {
            return;
        }
        c++;
        if (!(jx0Var instanceof kx0) && jx0Var.m0()) {
            int i2 = i + 1;
            if (a(i2, jx0Var)) {
                kx0.S1(i2, jx0Var, bVar, new e50.a(), e50.a.k);
            }
        }
        yw0 yw0VarO = jx0Var.o(yw0.b.TOP);
        yw0 yw0VarO2 = jx0Var.o(yw0.b.BOTTOM);
        int iE = yw0VarO.e();
        int iE2 = yw0VarO2.e();
        if (yw0VarO.d() != null && yw0VarO.n()) {
            for (yw0 yw0Var5 : yw0VarO.d()) {
                jx0 jx0Var2 = yw0Var5.d;
                int i3 = i + 1;
                boolean zA = a(i3, jx0Var2);
                if (jx0Var2.m0() && zA) {
                    kx0.S1(i3, jx0Var2, bVar, new e50.a(), e50.a.k);
                }
                boolean z = (yw0Var5 == jx0Var2.P && (yw0Var4 = jx0Var2.R.f) != null && yw0Var4.n()) || (yw0Var5 == jx0Var2.R && (yw0Var3 = jx0Var2.P.f) != null && yw0Var3.n());
                jx0.b bVarT = jx0Var2.T();
                jx0.b bVar2 = jx0.b.MATCH_CONSTRAINT;
                if (bVarT != bVar2 || zA) {
                    if (!jx0Var2.m0()) {
                        yw0 yw0Var6 = jx0Var2.P;
                        if (yw0Var5 == yw0Var6 && jx0Var2.R.f == null) {
                            int iF = yw0Var6.f() + iE;
                            jx0Var2.I0(iF, jx0Var2.x() + iF);
                            i(i3, jx0Var2, bVar);
                        } else {
                            yw0 yw0Var7 = jx0Var2.R;
                            if (yw0Var5 == yw0Var7 && yw0Var6.f == null) {
                                int iF2 = iE - yw0Var7.f();
                                jx0Var2.I0(iF2 - jx0Var2.x(), iF2);
                                i(i3, jx0Var2, bVar);
                            } else if (z && !jx0Var2.k0()) {
                                f(i3, bVar, jx0Var2);
                            }
                        }
                    }
                } else if (jx0Var2.T() == bVar2 && jx0Var2.D >= 0 && jx0Var2.C >= 0 && (jx0Var2.V() == 8 || (jx0Var2.x == 0 && jx0Var2.v() == 0.0f))) {
                    if (!jx0Var2.k0() && !jx0Var2.l0() && z && !jx0Var2.k0()) {
                        g(i3, jx0Var, bVar, jx0Var2);
                    }
                }
            }
        }
        if (jx0Var instanceof sk2) {
            return;
        }
        if (yw0VarO2.d() != null && yw0VarO2.n()) {
            for (yw0 yw0Var8 : yw0VarO2.d()) {
                jx0 jx0Var3 = yw0Var8.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, jx0Var3);
                if (jx0Var3.m0() && zA2) {
                    kx0.S1(i4, jx0Var3, bVar, new e50.a(), e50.a.k);
                }
                boolean z2 = (yw0Var8 == jx0Var3.P && (yw0Var2 = jx0Var3.R.f) != null && yw0Var2.n()) || (yw0Var8 == jx0Var3.R && (yw0Var = jx0Var3.P.f) != null && yw0Var.n());
                jx0.b bVarT2 = jx0Var3.T();
                jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
                if (bVarT2 != bVar3 || zA2) {
                    if (!jx0Var3.m0()) {
                        yw0 yw0Var9 = jx0Var3.P;
                        if (yw0Var8 == yw0Var9 && jx0Var3.R.f == null) {
                            int iF3 = yw0Var9.f() + iE2;
                            jx0Var3.I0(iF3, jx0Var3.x() + iF3);
                            i(i4, jx0Var3, bVar);
                        } else {
                            yw0 yw0Var10 = jx0Var3.R;
                            if (yw0Var8 == yw0Var10 && yw0Var9.f == null) {
                                int iF4 = iE2 - yw0Var10.f();
                                jx0Var3.I0(iF4 - jx0Var3.x(), iF4);
                                i(i4, jx0Var3, bVar);
                            } else if (z2 && !jx0Var3.k0()) {
                                f(i4, bVar, jx0Var3);
                            }
                        }
                    }
                } else if (jx0Var3.T() == bVar3 && jx0Var3.D >= 0 && jx0Var3.C >= 0 && (jx0Var3.V() == 8 || (jx0Var3.x == 0 && jx0Var3.v() == 0.0f))) {
                    if (!jx0Var3.k0() && !jx0Var3.l0() && z2 && !jx0Var3.k0()) {
                        g(i4, jx0Var, bVar, jx0Var3);
                    }
                }
            }
        }
        yw0 yw0VarO3 = jx0Var.o(yw0.b.BASELINE);
        if (yw0VarO3.d() != null && yw0VarO3.n()) {
            int iE3 = yw0VarO3.e();
            for (yw0 yw0Var11 : yw0VarO3.d()) {
                jx0 jx0Var4 = yw0Var11.d;
                int i5 = i + 1;
                boolean zA3 = a(i5, jx0Var4);
                if (jx0Var4.m0() && zA3) {
                    kx0.S1(i5, jx0Var4, bVar, new e50.a(), e50.a.k);
                }
                if (jx0Var4.T() != jx0.b.MATCH_CONSTRAINT || zA3) {
                    if (!jx0Var4.m0() && yw0Var11 == jx0Var4.S) {
                        jx0Var4.E0(yw0Var11.f() + iE3);
                        i(i5, jx0Var4, bVar);
                    }
                }
            }
        }
        jx0Var.r0();
    }
}
