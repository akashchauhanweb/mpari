package com.zepto;

import com.zepto.jx0;
import com.zepto.yw0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e50 {
    public final ArrayList a = new ArrayList();
    public a b = new a();
    public kx0 c;

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public jx0.b a;
        public jx0.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public interface b {
        void a();

        void b(jx0 jx0Var, a aVar);
    }

    public e50(kx0 kx0Var) {
        this.c = kx0Var;
    }

    public final boolean a(b bVar, jx0 jx0Var, int i) {
        this.b.a = jx0Var.A();
        this.b.b = jx0Var.T();
        this.b.c = jx0Var.W();
        this.b.d = jx0Var.x();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        jx0.b bVar2 = aVar.a;
        jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.b == bVar3;
        boolean z3 = z && jx0Var.d0 > 0.0f;
        boolean z4 = z2 && jx0Var.d0 > 0.0f;
        if (z3 && jx0Var.y[0] == 4) {
            aVar.a = jx0.b.FIXED;
        }
        if (z4 && jx0Var.y[1] == 4) {
            aVar.b = jx0.b.FIXED;
        }
        bVar.b(jx0Var, aVar);
        jx0Var.k1(this.b.e);
        jx0Var.L0(this.b.f);
        jx0Var.K0(this.b.h);
        jx0Var.A0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.zepto.kx0 r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.T1(r1)
            com.zepto.e50$b r2 = r13.I1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La6
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            com.zepto.jx0 r5 = (com.zepto.jx0) r5
            boolean r6 = r5 instanceof com.zepto.sk2
            if (r6 == 0) goto L22
            goto La2
        L22:
            boolean r6 = r5 instanceof com.zepto.a40
            if (r6 == 0) goto L28
            goto La2
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La2
        L30:
            if (r1 == 0) goto L48
            com.zepto.gr2 r6 = r5.e
            if (r6 == 0) goto L48
            com.zepto.rp7 r7 = r5.f
            if (r7 == 0) goto L48
            com.zepto.bk1 r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            com.zepto.bk1 r6 = r7.e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            goto La2
        L48:
            com.zepto.jx0$b r6 = r5.u(r3)
            r7 = 1
            com.zepto.jx0$b r8 = r5.u(r7)
            com.zepto.jx0$b r9 = com.zepto.jx0.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.w
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.x
            if (r10 == r7) goto L61
            r10 = r7
            goto L62
        L61:
            r10 = r3
        L62:
            if (r10 != 0) goto L9a
            boolean r11 = r13.T1(r7)
            if (r11 == 0) goto L9a
            boolean r11 = r5 instanceof com.zepto.mt7
            if (r11 != 0) goto L9a
            if (r6 != r9) goto L7d
            int r11 = r5.w
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7d
            r10 = r7
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.x
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8c
            goto L8d
        L8c:
            r7 = r10
        L8d:
            if (r6 == r9) goto L91
            if (r8 != r9) goto L99
        L91:
            float r6 = r5.d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L99
            goto La2
        L99:
            r10 = r7
        L9a:
            if (r10 == 0) goto L9d
            goto La2
        L9d:
            int r6 = com.zepto.e50.a.k
            r12.a(r2, r5, r6)
        La2:
            int r4 = r4 + 1
            goto L12
        La6:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.e50.b(com.zepto.kx0):void");
    }

    public final void c(kx0 kx0Var, String str, int i, int i2, int i3) {
        int I = kx0Var.I();
        int iH = kx0Var.H();
        kx0Var.a1(0);
        kx0Var.Z0(0);
        kx0Var.k1(i2);
        kx0Var.L0(i3);
        kx0Var.a1(I);
        kx0Var.Z0(iH);
        this.c.X1(i);
        this.c.s1();
    }

    public long d(kx0 kx0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zH1;
        int i10;
        kx0 kx0Var2;
        int i11;
        boolean z;
        int i12;
        int i13;
        boolean z2;
        e50 e50Var = this;
        b bVarI1 = kx0Var.I1();
        int size = kx0Var.L0.size();
        int iW = kx0Var.W();
        int iX = kx0Var.x();
        boolean zB = ph4.b(i, 128);
        boolean z3 = zB || ph4.b(i, 64);
        if (z3) {
            for (int i14 = 0; i14 < size; i14++) {
                jx0 jx0Var = (jx0) kx0Var.L0.get(i14);
                jx0.b bVarA = jx0Var.A();
                jx0.b bVar = jx0.b.MATCH_CONSTRAINT;
                boolean z4 = (bVarA == bVar) && (jx0Var.T() == bVar) && jx0Var.v() > 0.0f;
                if ((jx0Var.i0() && z4) || ((jx0Var.k0() && z4) || (jx0Var instanceof mt7) || jx0Var.i0() || jx0Var.k0())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            boolean z5 = nf3.r;
        }
        boolean z6 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zB);
        int i15 = 2;
        if (z6) {
            int iMin = Math.min(kx0Var.G(), i5);
            int iMin2 = Math.min(kx0Var.F(), i7);
            if (i4 == 1073741824 && kx0Var.W() != iMin) {
                kx0Var.k1(iMin);
                kx0Var.M1();
            }
            if (i6 == 1073741824 && kx0Var.x() != iMin2) {
                kx0Var.L0(iMin2);
                kx0Var.M1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zH1 = kx0Var.F1(zB);
                i10 = 2;
            } else {
                boolean zG1 = kx0Var.G1(zB);
                if (i4 == 1073741824) {
                    zG1 &= kx0Var.H1(zB, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zH1 = kx0Var.H1(zB, 1) & zG1;
                    i10++;
                } else {
                    zH1 = zG1;
                }
            }
            if (zH1) {
                kx0Var.p1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zH1 = false;
            i10 = 0;
        }
        if (zH1 && i10 == 2) {
            return 0L;
        }
        int iJ1 = kx0Var.J1();
        if (size > 0) {
            b(kx0Var);
        }
        e(kx0Var);
        int size2 = e50Var.a.size();
        if (size > 0) {
            c(kx0Var, "First pass", 0, iW, iX);
        }
        if (size2 > 0) {
            jx0.b bVarA2 = kx0Var.A();
            jx0.b bVar2 = jx0.b.WRAP_CONTENT;
            boolean z7 = bVarA2 == bVar2;
            boolean z8 = kx0Var.T() == bVar2;
            int iMax = Math.max(kx0Var.W(), e50Var.c.I());
            int iMax2 = Math.max(kx0Var.x(), e50Var.c.H());
            int i16 = 0;
            boolean zF1 = false;
            while (i16 < size2) {
                jx0 jx0Var2 = (jx0) e50Var.a.get(i16);
                if (jx0Var2 instanceof mt7) {
                    int iW2 = jx0Var2.W();
                    int iX2 = jx0Var2.x();
                    i13 = iJ1;
                    boolean zA = e50Var.a(bVarI1, jx0Var2, a.l) | zF1;
                    int iW3 = jx0Var2.W();
                    int iX3 = jx0Var2.x();
                    if (iW3 != iW2) {
                        jx0Var2.k1(iW3);
                        if (z7 && jx0Var2.M() > iMax) {
                            iMax = Math.max(iMax, jx0Var2.M() + jx0Var2.o(yw0.b.RIGHT).f());
                        }
                        z2 = true;
                    } else {
                        z2 = zA;
                    }
                    if (iX3 != iX2) {
                        jx0Var2.L0(iX3);
                        if (z8 && jx0Var2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, jx0Var2.r() + jx0Var2.o(yw0.b.BOTTOM).f());
                        }
                        z2 = true;
                    }
                    zF1 = z2 | ((mt7) jx0Var2).F1();
                } else {
                    i13 = iJ1;
                }
                i16++;
                iJ1 = i13;
                i15 = 2;
            }
            int i17 = iJ1;
            int i18 = i15;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    jx0 jx0Var3 = (jx0) e50Var.a.get(i20);
                    if (((jx0Var3 instanceof xl2) && !(jx0Var3 instanceof mt7)) || (jx0Var3 instanceof sk2) || jx0Var3.V() == 8 || ((z6 && jx0Var3.e.e.j && jx0Var3.f.e.j) || (jx0Var3 instanceof mt7))) {
                        z = z6;
                        i12 = size2;
                    } else {
                        int iW4 = jx0Var3.W();
                        int iX4 = jx0Var3.x();
                        z = z6;
                        int iP = jx0Var3.p();
                        int i21 = a.l;
                        i12 = size2;
                        if (i19 == 1) {
                            i21 = a.m;
                        }
                        boolean zA2 = e50Var.a(bVarI1, jx0Var3, i21) | zF1;
                        int iW5 = jx0Var3.W();
                        int iX5 = jx0Var3.x();
                        if (iW5 != iW4) {
                            jx0Var3.k1(iW5);
                            if (z7 && jx0Var3.M() > iMax) {
                                iMax = Math.max(iMax, jx0Var3.M() + jx0Var3.o(yw0.b.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            jx0Var3.L0(iX5);
                            if (z8 && jx0Var3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, jx0Var3.r() + jx0Var3.o(yw0.b.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zF1 = (!jx0Var3.Z() || iP == jx0Var3.p()) ? zA2 : true;
                    }
                    i20++;
                    e50Var = this;
                    z6 = z;
                    size2 = i12;
                }
                boolean z9 = z6;
                int i22 = size2;
                if (!zF1) {
                    break;
                }
                i19++;
                c(kx0Var, "intermediate pass", i19, iW, iX);
                e50Var = this;
                z6 = z9;
                size2 = i22;
                i18 = 2;
                zF1 = false;
            }
            kx0Var2 = kx0Var;
            i11 = i17;
        } else {
            kx0Var2 = kx0Var;
            i11 = iJ1;
        }
        kx0Var2.W1(i11);
        return 0L;
    }

    public void e(kx0 kx0Var) {
        this.a.clear();
        int size = kx0Var.L0.size();
        for (int i = 0; i < size; i++) {
            jx0 jx0Var = (jx0) kx0Var.L0.get(i);
            jx0.b bVarA = jx0Var.A();
            jx0.b bVar = jx0.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || jx0Var.T() == bVar) {
                this.a.add(jx0Var);
            }
        }
        kx0Var.M1();
    }
}
