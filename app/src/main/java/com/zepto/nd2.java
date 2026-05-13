package com.zepto;

import com.zepto.jx0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class nd2 extends mt7 {
    public jx0[] x1;
    public int a1 = -1;
    public int b1 = -1;
    public int c1 = -1;
    public int d1 = -1;
    public int e1 = -1;
    public int f1 = -1;
    public float g1 = 0.5f;
    public float h1 = 0.5f;
    public float i1 = 0.5f;
    public float j1 = 0.5f;
    public float k1 = 0.5f;
    public float l1 = 0.5f;
    public int m1 = 0;
    public int n1 = 0;
    public int o1 = 2;
    public int p1 = 2;
    public int q1 = 0;
    public int r1 = -1;
    public int s1 = 0;
    public ArrayList t1 = new ArrayList();
    public jx0[] u1 = null;
    public jx0[] v1 = null;
    public int[] w1 = null;
    public int y1 = 0;

    public class a {
        public int a;
        public yw0 d;
        public yw0 e;
        public yw0 f;
        public yw0 g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public jx0 b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, yw0 yw0Var, yw0 yw0Var2, yw0 yw0Var3, yw0 yw0Var4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = yw0Var;
            this.e = yw0Var2;
            this.f = yw0Var3;
            this.g = yw0Var4;
            this.h = nd2.this.z1();
            this.i = nd2.this.B1();
            this.j = nd2.this.A1();
            this.k = nd2.this.y1();
            this.q = i2;
        }

        public void b(jx0 jx0Var) {
            if (this.a == 0) {
                int iL2 = nd2.this.l2(jx0Var, this.q);
                if (jx0Var.A() == jx0.b.MATCH_CONSTRAINT) {
                    this.p++;
                    iL2 = 0;
                }
                this.l += iL2 + (jx0Var.V() != 8 ? nd2.this.m1 : 0);
                int iK2 = nd2.this.k2(jx0Var, this.q);
                if (this.b == null || this.c < iK2) {
                    this.b = jx0Var;
                    this.c = iK2;
                    this.m = iK2;
                }
            } else {
                int iL22 = nd2.this.l2(jx0Var, this.q);
                int iK22 = nd2.this.k2(jx0Var, this.q);
                if (jx0Var.T() == jx0.b.MATCH_CONSTRAINT) {
                    this.p++;
                    iK22 = 0;
                }
                this.m += iK22 + (jx0Var.V() != 8 ? nd2.this.n1 : 0);
                if (this.b == null || this.c < iL22) {
                    this.b = jx0Var;
                    this.c = iL22;
                    this.l = iL22;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            jx0 jx0Var;
            char c;
            float f;
            float f2;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < nd2.this.y1; i3++) {
                jx0 jx0Var2 = nd2.this.x1[this.n + i3];
                if (jx0Var2 != null) {
                    jx0Var2.u0();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= nd2.this.y1) {
                    break;
                }
                jx0 jx0Var3 = nd2.this.x1[this.n + i7];
                if (jx0Var3 != null && jx0Var3.V() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            jx0 jx0Var4 = null;
            if (this.a != 0) {
                jx0 jx0Var5 = this.b;
                jx0Var5.N0(nd2.this.a1);
                int i8 = this.h;
                if (i > 0) {
                    i8 += nd2.this.m1;
                }
                if (z) {
                    jx0Var5.Q.a(this.f, i8);
                    if (z2) {
                        jx0Var5.O.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.O.a(jx0Var5.Q, 0);
                    }
                } else {
                    jx0Var5.O.a(this.d, i8);
                    if (z2) {
                        jx0Var5.Q.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.Q.a(jx0Var5.O, 0);
                    }
                }
                for (int i9 = 0; i9 < i2 && this.n + i9 < nd2.this.y1; i9++) {
                    jx0 jx0Var6 = nd2.this.x1[this.n + i9];
                    if (jx0Var6 != null) {
                        if (i9 == 0) {
                            jx0Var6.k(jx0Var6.P, this.e, this.i);
                            int i10 = nd2.this.b1;
                            float f3 = nd2.this.h1;
                            if (this.n == 0 && nd2.this.d1 != -1) {
                                i10 = nd2.this.d1;
                                f3 = nd2.this.j1;
                            } else if (z2 && nd2.this.f1 != -1) {
                                i10 = nd2.this.f1;
                                f3 = nd2.this.l1;
                            }
                            jx0Var6.e1(i10);
                            jx0Var6.d1(f3);
                        }
                        if (i9 == i2 - 1) {
                            jx0Var6.k(jx0Var6.R, this.g, this.k);
                        }
                        if (jx0Var4 != null) {
                            jx0Var6.P.a(jx0Var4.R, nd2.this.n1);
                            if (i9 == i4) {
                                jx0Var6.P.u(this.i);
                            }
                            jx0Var4.R.a(jx0Var6.P, 0);
                            if (i9 == i5 + 1) {
                                jx0Var4.R.u(this.k);
                            }
                        }
                        if (jx0Var6 == jx0Var5) {
                            jx0Var4 = jx0Var6;
                        } else if (z) {
                            int i11 = nd2.this.o1;
                            if (i11 == 0) {
                                jx0Var6.Q.a(jx0Var5.Q, 0);
                            } else if (i11 == 1) {
                                jx0Var6.O.a(jx0Var5.O, 0);
                            } else if (i11 == 2) {
                                jx0Var6.O.a(jx0Var5.O, 0);
                                jx0Var6.Q.a(jx0Var5.Q, 0);
                            }
                            jx0Var4 = jx0Var6;
                        } else {
                            int i12 = nd2.this.o1;
                            if (i12 == 0) {
                                jx0Var6.O.a(jx0Var5.O, 0);
                            } else if (i12 == 1) {
                                jx0Var6.Q.a(jx0Var5.Q, 0);
                            } else if (i12 == 2) {
                                if (z3) {
                                    jx0Var6.O.a(this.d, this.h);
                                    jx0Var6.Q.a(this.f, this.j);
                                } else {
                                    jx0Var6.O.a(jx0Var5.O, 0);
                                    jx0Var6.Q.a(jx0Var5.Q, 0);
                                }
                            }
                            jx0Var4 = jx0Var6;
                        }
                    }
                }
                return;
            }
            jx0 jx0Var7 = this.b;
            jx0Var7.e1(nd2.this.b1);
            int i13 = this.i;
            if (i > 0) {
                i13 += nd2.this.n1;
            }
            jx0Var7.P.a(this.e, i13);
            if (z2) {
                jx0Var7.R.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.R.a(jx0Var7.P, 0);
            }
            char c2 = 3;
            if (nd2.this.p1 != 3 || jx0Var7.Z()) {
                jx0Var = jx0Var7;
            } else {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.n + i15 >= nd2.this.y1) {
                        break;
                    }
                    jx0Var = nd2.this.x1[this.n + i15];
                    if (jx0Var.Z()) {
                        break;
                    }
                }
                jx0Var = jx0Var7;
            }
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.n + i17 >= nd2.this.y1) {
                    return;
                }
                jx0 jx0Var8 = nd2.this.x1[this.n + i17];
                if (jx0Var8 == null) {
                    jx0Var8 = jx0Var4;
                    c = c2;
                } else {
                    if (i16 == 0) {
                        jx0Var8.k(jx0Var8.O, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i18 = nd2.this.a1;
                        float f4 = nd2.this.g1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.n != 0 || nd2.this.c1 == -1) {
                            if (z2 && nd2.this.e1 != -1) {
                                i18 = nd2.this.e1;
                                if (z) {
                                    f2 = nd2.this.k1;
                                    f = 1.0f - f2;
                                    f4 = f;
                                } else {
                                    f = nd2.this.k1;
                                    f4 = f;
                                }
                            }
                            jx0Var8.N0(i18);
                            jx0Var8.M0(f4);
                        } else {
                            i18 = nd2.this.c1;
                            if (z) {
                                f2 = nd2.this.i1;
                                f = 1.0f - f2;
                                f4 = f;
                                jx0Var8.N0(i18);
                                jx0Var8.M0(f4);
                            } else {
                                f = nd2.this.i1;
                                f4 = f;
                                jx0Var8.N0(i18);
                                jx0Var8.M0(f4);
                            }
                        }
                    }
                    if (i16 == i2 - 1) {
                        jx0Var8.k(jx0Var8.Q, this.f, this.j);
                    }
                    if (jx0Var4 != null) {
                        jx0Var8.O.a(jx0Var4.Q, nd2.this.m1);
                        if (i16 == i4) {
                            jx0Var8.O.u(this.h);
                        }
                        jx0Var4.Q.a(jx0Var8.O, 0);
                        if (i16 == i5 + 1) {
                            jx0Var4.Q.u(this.j);
                        }
                    }
                    if (jx0Var8 != jx0Var7) {
                        c = 3;
                        if (nd2.this.p1 == 3 && jx0Var.Z() && jx0Var8 != jx0Var && jx0Var8.Z()) {
                            jx0Var8.S.a(jx0Var.S, 0);
                        } else {
                            int i19 = nd2.this.p1;
                            if (i19 == 0) {
                                jx0Var8.P.a(jx0Var7.P, 0);
                            } else if (i19 == 1) {
                                jx0Var8.R.a(jx0Var7.R, 0);
                            } else if (z3) {
                                jx0Var8.P.a(this.e, this.i);
                                jx0Var8.R.a(this.g, this.k);
                            } else {
                                jx0Var8.P.a(jx0Var7.P, 0);
                                jx0Var8.R.a(jx0Var7.R, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i16++;
                c2 = c;
                jx0Var4 = jx0Var8;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - nd2.this.n1 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - nd2.this.m1 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < nd2.this.y1; i5++) {
                jx0 jx0Var = nd2.this.x1[this.n + i5];
                if (this.a == 0) {
                    if (jx0Var != null && jx0Var.A() == jx0.b.MATCH_CONSTRAINT && jx0Var.w == 0) {
                        nd2.this.D1(jx0Var, jx0.b.FIXED, i4, jx0Var.T(), jx0Var.x());
                    }
                } else if (jx0Var != null && jx0Var.T() == jx0.b.MATCH_CONSTRAINT && jx0Var.x == 0) {
                    nd2.this.D1(jx0Var, jx0Var.A(), jx0Var.W(), jx0.b.FIXED, i4);
                }
            }
            h();
        }

        public final void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < nd2.this.y1; i2++) {
                jx0 jx0Var = nd2.this.x1[this.n + i2];
                if (this.a == 0) {
                    int iW = jx0Var.W();
                    int i3 = nd2.this.m1;
                    if (jx0Var.V() == 8) {
                        i3 = 0;
                    }
                    this.l += iW + i3;
                    int iK2 = nd2.this.k2(jx0Var, this.q);
                    if (this.b == null || this.c < iK2) {
                        this.b = jx0Var;
                        this.c = iK2;
                        this.m = iK2;
                    }
                } else {
                    int iL2 = nd2.this.l2(jx0Var, this.q);
                    int iK22 = nd2.this.k2(jx0Var, this.q);
                    int i4 = nd2.this.n1;
                    if (jx0Var.V() == 8) {
                        i4 = 0;
                    }
                    this.m += iK22 + i4;
                    if (this.b == null || this.c < iL2) {
                        this.b = jx0Var;
                        this.c = iL2;
                        this.l = iL2;
                    }
                }
            }
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, yw0 yw0Var, yw0 yw0Var2, yw0 yw0Var3, yw0 yw0Var4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = yw0Var;
            this.e = yw0Var2;
            this.f = yw0Var3;
            this.g = yw0Var4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    public void A2(float f) {
        this.l1 = f;
    }

    public void B2(int i) {
        this.f1 = i;
    }

    @Override // com.zepto.mt7
    public void C1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.M0 > 0 && !E1()) {
            H1(0, 0);
            G1(false);
            return;
        }
        int iZ1 = z1();
        int iA1 = A1();
        int iB1 = B1();
        int iY1 = y1();
        int[] iArr2 = new int[2];
        int i7 = (i2 - iZ1) - iA1;
        int i8 = this.s1;
        if (i8 == 1) {
            i7 = (i4 - iB1) - iY1;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        } else {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        }
        jx0[] jx0VarArr = this.L0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.M0;
            if (i10 >= i5) {
                break;
            }
            if (this.L0[i10].V() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            jx0VarArr = new jx0[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.M0; i13++) {
                jx0 jx0Var = this.L0[i13];
                if (jx0Var.V() != 8) {
                    jx0VarArr[i12] = jx0Var;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.x1 = jx0VarArr;
        this.y1 = i6;
        int i14 = this.q1;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            p2(jx0VarArr, i6, this.s1, i9, iArr2);
        } else if (i14 == 1) {
            z = true;
            iArr = iArr2;
            n2(jx0VarArr, i6, this.s1, i9, iArr2);
        } else if (i14 == 2) {
            z = true;
            iArr = iArr2;
            m2(jx0VarArr, i6, this.s1, i9, iArr2);
        } else if (i14 != 3) {
            z = true;
            iArr = iArr2;
        } else {
            z = true;
            iArr = iArr2;
            o2(jx0VarArr, i6, this.s1, i9, iArr2);
        }
        int iMin = iArr[0] + iZ1 + iA1;
        int iMin2 = iArr[z ? 1 : 0] + iB1 + iY1;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        H1(iMin, iMin2);
        k1(iMin);
        L0(iMin2);
        if (this.M0 <= 0) {
            z = false;
        }
        G1(z);
    }

    public void C2(int i) {
        this.r1 = i;
    }

    public void D2(int i) {
        this.s1 = i;
    }

    public void E2(int i) {
        this.p1 = i;
    }

    public void F2(float f) {
        this.h1 = f;
    }

    public void G2(int i) {
        this.n1 = i;
    }

    public void H2(int i) {
        this.b1 = i;
    }

    public void I2(int i) {
        this.q1 = i;
    }

    @Override // com.zepto.jx0
    public void g(nf3 nf3Var, boolean z) {
        super.g(nf3Var, z);
        boolean z2 = K() != null && ((kx0) K()).P1();
        int i = this.q1;
        if (i != 0) {
            if (i == 1) {
                int size = this.t1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((a) this.t1.get(i2)).d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                j2(z2);
            } else if (i == 3) {
                int size2 = this.t1.size();
                int i3 = 0;
                while (i3 < size2) {
                    ((a) this.t1.get(i3)).d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.t1.size() > 0) {
            ((a) this.t1.get(0)).d(z2, 0, true);
        }
        G1(false);
    }

    public final void j2(boolean z) {
        jx0 jx0Var;
        float f;
        int i;
        if (this.w1 == null || this.v1 == null || this.u1 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.y1; i2++) {
            this.x1[i2].u0();
        }
        int[] iArr = this.w1;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.g1;
        jx0 jx0Var2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.g1;
            } else {
                f = f2;
                i = i5;
            }
            jx0 jx0Var3 = this.v1[i];
            if (jx0Var3 != null && jx0Var3.V() != 8) {
                if (i5 == 0) {
                    jx0Var3.k(jx0Var3.O, this.O, z1());
                    jx0Var3.N0(this.a1);
                    jx0Var3.M0(f);
                }
                if (i5 == i3 - 1) {
                    jx0Var3.k(jx0Var3.Q, this.Q, A1());
                }
                if (i5 > 0 && jx0Var2 != null) {
                    jx0Var3.k(jx0Var3.O, jx0Var2.Q, this.m1);
                    jx0Var2.k(jx0Var2.Q, jx0Var3.O, 0);
                }
                jx0Var2 = jx0Var3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            jx0 jx0Var4 = this.u1[i6];
            if (jx0Var4 != null && jx0Var4.V() != 8) {
                if (i6 == 0) {
                    jx0Var4.k(jx0Var4.P, this.P, B1());
                    jx0Var4.e1(this.b1);
                    jx0Var4.d1(this.h1);
                }
                if (i6 == i4 - 1) {
                    jx0Var4.k(jx0Var4.R, this.R, y1());
                }
                if (i6 > 0 && jx0Var2 != null) {
                    jx0Var4.k(jx0Var4.P, jx0Var2.R, this.n1);
                    jx0Var2.k(jx0Var2.R, jx0Var4.P, 0);
                }
                jx0Var2 = jx0Var4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.s1 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                jx0[] jx0VarArr = this.x1;
                if (i9 < jx0VarArr.length && (jx0Var = jx0VarArr[i9]) != null && jx0Var.V() != 8) {
                    jx0 jx0Var5 = this.v1[i7];
                    jx0 jx0Var6 = this.u1[i8];
                    if (jx0Var != jx0Var5) {
                        jx0Var.k(jx0Var.O, jx0Var5.O, 0);
                        jx0Var.k(jx0Var.Q, jx0Var5.Q, 0);
                    }
                    if (jx0Var != jx0Var6) {
                        jx0Var.k(jx0Var.P, jx0Var6.P, 0);
                        jx0Var.k(jx0Var.R, jx0Var6.R, 0);
                    }
                }
            }
        }
    }

    public final int k2(jx0 jx0Var, int i) {
        if (jx0Var == null) {
            return 0;
        }
        if (jx0Var.T() == jx0.b.MATCH_CONSTRAINT) {
            int i2 = jx0Var.x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (jx0Var.E * i);
                if (i3 != jx0Var.x()) {
                    jx0Var.Y0(true);
                    D1(jx0Var, jx0Var.A(), jx0Var.W(), jx0.b.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return jx0Var.x();
            }
            if (i2 == 3) {
                return (int) ((jx0Var.W() * jx0Var.d0) + 0.5f);
            }
        }
        return jx0Var.x();
    }

    public final int l2(jx0 jx0Var, int i) {
        if (jx0Var == null) {
            return 0;
        }
        if (jx0Var.A() == jx0.b.MATCH_CONSTRAINT) {
            int i2 = jx0Var.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (jx0Var.B * i);
                if (i3 != jx0Var.W()) {
                    jx0Var.Y0(true);
                    D1(jx0Var, jx0.b.FIXED, i3, jx0Var.T(), jx0Var.x());
                }
                return i3;
            }
            if (i2 == 1) {
                return jx0Var.W();
            }
            if (i2 == 3) {
                return (int) ((jx0Var.x() * jx0Var.d0) + 0.5f);
            }
        }
        return jx0Var.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2(com.zepto.jx0[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.nd2.m2(com.zepto.jx0[], int, int, int, int[]):void");
    }

    public final void n2(jx0[] jx0VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        yw0 yw0Var;
        int iA1;
        yw0 yw0Var2;
        int iY1;
        int i7;
        if (i == 0) {
            return;
        }
        this.t1.clear();
        a aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
        this.t1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                jx0 jx0Var = jx0VarArr[i9];
                int iL2 = l2(jx0Var, i3);
                if (jx0Var.A() == jx0.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.m1 + i8) + iL2 > i3) && aVar.b != null;
                if ((z || i9 <= 0 || (i7 = this.r1) <= 0 || i9 % i7 != 0) && !z) {
                    if (i9 > 0) {
                        i8 += this.m1 + iL2;
                    }
                    aVar.b(jx0Var);
                    i9++;
                    i4 = i10;
                } else {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i9);
                    this.t1.add(aVar);
                }
                i8 = iL2;
                aVar.b(jx0Var);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                jx0 jx0Var2 = jx0VarArr[i12];
                int iK2 = k2(jx0Var2, i3);
                if (jx0Var2.T() == jx0.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.n1 + i11) + iK2 > i3) && aVar.b != null;
                if ((z2 || i12 <= 0 || (i5 = this.r1) <= 0 || i12 % i5 != 0) && !z2) {
                    if (i12 > 0) {
                        i11 += this.n1 + iK2;
                    }
                    aVar.b(jx0Var2);
                    i12++;
                    i4 = i13;
                } else {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i12);
                    this.t1.add(aVar);
                }
                i11 = iK2;
                aVar.b(jx0Var2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.t1.size();
        yw0 yw0Var3 = this.O;
        yw0 yw0Var4 = this.P;
        yw0 yw0Var5 = this.Q;
        yw0 yw0Var6 = this.R;
        int iZ1 = z1();
        int iB1 = B1();
        int iA12 = A1();
        int iY12 = y1();
        jx0.b bVarA = A();
        jx0.b bVar = jx0.b.WRAP_CONTENT;
        boolean z3 = bVarA == bVar || T() == bVar;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = (a) this.t1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i15 = iB1;
        int i16 = iA12;
        int iE = 0;
        int iF = 0;
        int i17 = 0;
        int i18 = iZ1;
        yw0 yw0Var7 = yw0Var4;
        yw0 yw0Var8 = yw0Var3;
        int i19 = iY12;
        while (i17 < size) {
            a aVar3 = (a) this.t1.get(i17);
            if (i2 == 0) {
                if (i17 < size - 1) {
                    yw0Var2 = ((a) this.t1.get(i17 + 1)).b.P;
                    iY1 = 0;
                } else {
                    yw0Var2 = this.R;
                    iY1 = y1();
                }
                yw0 yw0Var9 = aVar3.b.R;
                yw0 yw0Var10 = yw0Var8;
                yw0 yw0Var11 = yw0Var8;
                int i20 = iE;
                yw0 yw0Var12 = yw0Var7;
                int i21 = iF;
                yw0 yw0Var13 = yw0Var5;
                yw0 yw0Var14 = yw0Var5;
                i6 = i17;
                aVar3.j(i2, yw0Var10, yw0Var12, yw0Var13, yw0Var2, i18, i15, i16, iY1, i3);
                int iMax = Math.max(i21, aVar3.f());
                iE = i20 + aVar3.e();
                if (i6 > 0) {
                    iE += this.n1;
                }
                yw0Var8 = yw0Var11;
                iF = iMax;
                i15 = 0;
                yw0Var7 = yw0Var9;
                yw0Var = yw0Var14;
                int i22 = iY1;
                yw0Var6 = yw0Var2;
                i19 = i22;
            } else {
                yw0 yw0Var15 = yw0Var8;
                int i23 = iE;
                int i24 = iF;
                i6 = i17;
                if (i6 < size - 1) {
                    yw0Var = ((a) this.t1.get(i6 + 1)).b.O;
                    iA1 = 0;
                } else {
                    yw0Var = this.Q;
                    iA1 = A1();
                }
                yw0 yw0Var16 = aVar3.b.Q;
                aVar3.j(i2, yw0Var15, yw0Var7, yw0Var, yw0Var6, i18, i15, iA1, i19, i3);
                iF = i24 + aVar3.f();
                int iMax2 = Math.max(i23, aVar3.e());
                if (i6 > 0) {
                    iF += this.m1;
                }
                iE = iMax2;
                i18 = 0;
                i16 = iA1;
                yw0Var8 = yw0Var16;
            }
            i17 = i6 + 1;
            yw0Var5 = yw0Var;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    public final void o2(jx0[] jx0VarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        yw0 yw0Var;
        int iA1;
        yw0 yw0Var2;
        int iY1;
        int i7;
        if (i == 0) {
            return;
        }
        this.t1.clear();
        a aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
        this.t1.add(aVar);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                jx0 jx0Var = jx0VarArr[i10];
                int iL2 = l2(jx0Var, i3);
                if (jx0Var.A() == jx0.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z = (i9 == i3 || (this.m1 + i9) + iL2 > i3) && aVar.b != null;
                if ((z || i10 <= 0 || (i7 = this.r1) <= 0 || i11 <= i7) && !z) {
                    i9 = i10 > 0 ? i9 + this.m1 + iL2 : iL2;
                    i8 = 0;
                } else {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i10);
                    this.t1.add(aVar);
                    i8 = i11;
                    i9 = iL2;
                }
                aVar.b(jx0Var);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                jx0 jx0Var2 = jx0VarArr[i14];
                int iK2 = k2(jx0Var2, i3);
                if (jx0Var2.T() == jx0.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i3 || (this.n1 + i13) + iK2 > i3) && aVar.b != null;
                if ((z2 || i14 <= 0 || (i5 = this.r1) <= 0 || i5 >= 0) && !z2) {
                    if (i14 > 0) {
                        i13 += this.n1 + iK2;
                    }
                    aVar.b(jx0Var2);
                    i14++;
                    i4 = i15;
                } else {
                    aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
                    aVar.i(i14);
                    this.t1.add(aVar);
                }
                i13 = iK2;
                aVar.b(jx0Var2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.t1.size();
        yw0 yw0Var3 = this.O;
        yw0 yw0Var4 = this.P;
        yw0 yw0Var5 = this.Q;
        yw0 yw0Var6 = this.R;
        int iZ1 = z1();
        int iB1 = B1();
        int iA12 = A1();
        int iY12 = y1();
        jx0.b bVarA = A();
        jx0.b bVar = jx0.b.WRAP_CONTENT;
        boolean z3 = bVarA == bVar || T() == bVar;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = (a) this.t1.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i17 = iB1;
        int i18 = iA12;
        int iE = 0;
        int iF = 0;
        int i19 = 0;
        int i20 = iZ1;
        yw0 yw0Var7 = yw0Var4;
        yw0 yw0Var8 = yw0Var3;
        int i21 = iY12;
        while (i19 < size) {
            a aVar3 = (a) this.t1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    yw0Var2 = ((a) this.t1.get(i19 + 1)).b.P;
                    iY1 = 0;
                } else {
                    yw0Var2 = this.R;
                    iY1 = y1();
                }
                yw0 yw0Var9 = aVar3.b.R;
                yw0 yw0Var10 = yw0Var8;
                yw0 yw0Var11 = yw0Var8;
                int i22 = iE;
                yw0 yw0Var12 = yw0Var7;
                int i23 = iF;
                yw0 yw0Var13 = yw0Var5;
                yw0 yw0Var14 = yw0Var5;
                i6 = i19;
                aVar3.j(i2, yw0Var10, yw0Var12, yw0Var13, yw0Var2, i20, i17, i18, iY1, i3);
                int iMax = Math.max(i23, aVar3.f());
                iE = i22 + aVar3.e();
                if (i6 > 0) {
                    iE += this.n1;
                }
                yw0Var8 = yw0Var11;
                iF = iMax;
                i17 = 0;
                yw0Var7 = yw0Var9;
                yw0Var = yw0Var14;
                int i24 = iY1;
                yw0Var6 = yw0Var2;
                i21 = i24;
            } else {
                yw0 yw0Var15 = yw0Var8;
                int i25 = iE;
                int i26 = iF;
                i6 = i19;
                if (i6 < size - 1) {
                    yw0Var = ((a) this.t1.get(i6 + 1)).b.O;
                    iA1 = 0;
                } else {
                    yw0Var = this.Q;
                    iA1 = A1();
                }
                yw0 yw0Var16 = aVar3.b.Q;
                aVar3.j(i2, yw0Var15, yw0Var7, yw0Var, yw0Var6, i20, i17, iA1, i21, i3);
                iF = i26 + aVar3.f();
                int iMax2 = Math.max(i25, aVar3.e());
                if (i6 > 0) {
                    iF += this.m1;
                }
                iE = iMax2;
                i20 = 0;
                i18 = iA1;
                yw0Var8 = yw0Var16;
            }
            i19 = i6 + 1;
            yw0Var5 = yw0Var;
        }
        iArr[0] = iF;
        iArr[1] = iE;
    }

    public final void p2(jx0[] jx0VarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.t1.size() == 0) {
            aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
            this.t1.add(aVar);
        } else {
            a aVar2 = (a) this.t1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i2, this.O, this.P, this.Q, this.R, z1(), B1(), A1(), y1(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(jx0VarArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void q2(float f) {
        this.i1 = f;
    }

    public void r2(int i) {
        this.c1 = i;
    }

    public void s2(float f) {
        this.j1 = f;
    }

    public void t2(int i) {
        this.d1 = i;
    }

    public void u2(int i) {
        this.o1 = i;
    }

    public void v2(float f) {
        this.g1 = f;
    }

    public void w2(int i) {
        this.m1 = i;
    }

    public void x2(int i) {
        this.a1 = i;
    }

    public void y2(float f) {
        this.k1 = f;
    }

    public void z2(int i) {
        this.e1 = i;
    }
}
