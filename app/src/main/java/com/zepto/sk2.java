package com.zepto;

import com.zepto.jx0;
import com.zepto.yw0;

/* JADX INFO: loaded from: classes.dex */
public class sk2 extends jx0 {
    public float L0 = -1.0f;
    public int M0 = -1;
    public int N0 = -1;
    public boolean O0 = true;
    public yw0 P0 = this.P;
    public int Q0 = 0;
    public int R0 = 0;
    public boolean S0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[yw0.b.values().length];
            a = iArr;
            try {
                iArr[yw0.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yw0.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[yw0.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[yw0.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[yw0.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[yw0.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[yw0.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[yw0.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[yw0.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public sk2() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i = 0; i < length; i++) {
            this.W[i] = this.P0;
        }
    }

    public void A1(int i) {
        if (this.Q0 == i) {
            return;
        }
        this.Q0 = i;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.W[i2] = this.P0;
        }
    }

    @Override // com.zepto.jx0
    public void g(nf3 nf3Var, boolean z) {
        kx0 kx0Var = (kx0) K();
        if (kx0Var == null) {
            return;
        }
        yw0 yw0VarO = kx0Var.o(yw0.b.LEFT);
        yw0 yw0VarO2 = kx0Var.o(yw0.b.RIGHT);
        jx0 jx0Var = this.a0;
        boolean z2 = jx0Var != null && jx0Var.Z[0] == jx0.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            yw0VarO = kx0Var.o(yw0.b.TOP);
            yw0VarO2 = kx0Var.o(yw0.b.BOTTOM);
            jx0 jx0Var2 = this.a0;
            z2 = jx0Var2 != null && jx0Var2.Z[1] == jx0.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.n()) {
            h46 h46VarQ = nf3Var.q(this.P0);
            nf3Var.f(h46VarQ, this.P0.e());
            if (this.M0 != -1) {
                if (z2) {
                    nf3Var.h(nf3Var.q(yw0VarO2), h46VarQ, 0, 5);
                }
            } else if (this.N0 != -1 && z2) {
                h46 h46VarQ2 = nf3Var.q(yw0VarO2);
                nf3Var.h(h46VarQ, nf3Var.q(yw0VarO), 0, 5);
                nf3Var.h(h46VarQ2, h46VarQ, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            h46 h46VarQ3 = nf3Var.q(this.P0);
            nf3Var.e(h46VarQ3, nf3Var.q(yw0VarO), this.M0, 8);
            if (z2) {
                nf3Var.h(nf3Var.q(yw0VarO2), h46VarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                nf3Var.d(nf3.s(nf3Var, nf3Var.q(this.P0), nf3Var.q(yw0VarO2), this.L0));
                return;
            }
            return;
        }
        h46 h46VarQ4 = nf3Var.q(this.P0);
        h46 h46VarQ5 = nf3Var.q(yw0VarO2);
        nf3Var.e(h46VarQ4, h46VarQ5, -this.N0, 8);
        if (z2) {
            nf3Var.h(h46VarQ4, nf3Var.q(yw0VarO), 0, 5);
            nf3Var.h(h46VarQ5, h46VarQ4, 0, 5);
        }
    }

    @Override // com.zepto.jx0
    public boolean h() {
        return true;
    }

    @Override // com.zepto.jx0
    public boolean n0() {
        return this.S0;
    }

    @Override // com.zepto.jx0
    public yw0 o(yw0.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // com.zepto.jx0
    public boolean o0() {
        return this.S0;
    }

    @Override // com.zepto.jx0
    public void q1(nf3 nf3Var, boolean z) {
        if (K() == null) {
            return;
        }
        int iX = nf3Var.x(this.P0);
        if (this.Q0 == 1) {
            m1(iX);
            n1(0);
            L0(K().x());
            k1(0);
            return;
        }
        m1(0);
        n1(iX);
        k1(K().W());
        L0(0);
    }

    public yw0 r1() {
        return this.P0;
    }

    public int s1() {
        return this.Q0;
    }

    public int t1() {
        return this.M0;
    }

    public int u1() {
        return this.N0;
    }

    public float v1() {
        return this.L0;
    }

    public void w1(int i) {
        this.P0.t(i);
        this.S0 = true;
    }

    public void x1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = i;
            this.N0 = -1;
        }
    }

    public void y1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i;
        }
    }

    public void z1(float f) {
        if (f > -1.0f) {
            this.L0 = f;
            this.M0 = -1;
            this.N0 = -1;
        }
    }
}
