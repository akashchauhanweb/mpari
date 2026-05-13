package com.zepto;

import com.zepto.jx0;
import com.zepto.yw0;

/* JADX INFO: loaded from: classes.dex */
public class a40 extends zl2 {
    public int N0 = 0;
    public boolean O0 = true;
    public int P0 = 0;
    public boolean Q0 = false;

    public void A1(int i) {
        this.N0 = i;
    }

    public void B1(int i) {
        this.P0 = i;
    }

    @Override // com.zepto.jx0
    public void g(nf3 nf3Var, boolean z) {
        yw0[] yw0VarArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        yw0[] yw0VarArr2 = this.W;
        yw0VarArr2[0] = this.O;
        yw0VarArr2[2] = this.P;
        yw0VarArr2[1] = this.Q;
        yw0VarArr2[3] = this.R;
        int i4 = 0;
        while (true) {
            yw0VarArr = this.W;
            if (i4 >= yw0VarArr.length) {
                break;
            }
            yw0 yw0Var = yw0VarArr[i4];
            yw0Var.i = nf3Var.q(yw0Var);
            i4++;
        }
        int i5 = this.N0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        yw0 yw0Var2 = yw0VarArr[i5];
        if (!this.Q0) {
            t1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i6 = this.N0;
            if (i6 == 0 || i6 == 1) {
                nf3Var.f(this.O.i, this.f0);
                nf3Var.f(this.Q.i, this.f0);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    nf3Var.f(this.P.i, this.g0);
                    nf3Var.f(this.R.i, this.g0);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.M0; i7++) {
            jx0 jx0Var = this.L0[i7];
            if ((this.O0 || jx0Var.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && jx0Var.A() == jx0.b.MATCH_CONSTRAINT && jx0Var.O.f != null && jx0Var.Q.f != null) || (((i3 = this.N0) == 2 || i3 == 3) && jx0Var.T() == jx0.b.MATCH_CONSTRAINT && jx0Var.P.f != null && jx0Var.R.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.O.l() || this.Q.l();
        boolean z4 = this.P.l() || this.R.l();
        int i8 = !(!z2 && (((i = this.N0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.M0; i9++) {
            jx0 jx0Var2 = this.L0[i9];
            if (this.O0 || jx0Var2.h()) {
                h46 h46VarQ = nf3Var.q(jx0Var2.W[this.N0]);
                yw0[] yw0VarArr3 = jx0Var2.W;
                int i10 = this.N0;
                yw0 yw0Var3 = yw0VarArr3[i10];
                yw0Var3.i = h46VarQ;
                yw0 yw0Var4 = yw0Var3.f;
                int i11 = (yw0Var4 == null || yw0Var4.d != this) ? 0 : yw0Var3.g;
                if (i10 == 0 || i10 == 2) {
                    nf3Var.i(yw0Var2.i, h46VarQ, this.P0 - i11, z2);
                } else {
                    nf3Var.g(yw0Var2.i, h46VarQ, this.P0 + i11, z2);
                }
                nf3Var.e(yw0Var2.i, h46VarQ, this.P0 + i11, i8);
            }
        }
        int i12 = this.N0;
        if (i12 == 0) {
            nf3Var.e(this.Q.i, this.O.i, 0, 8);
            nf3Var.e(this.O.i, this.a0.Q.i, 0, 4);
            nf3Var.e(this.O.i, this.a0.O.i, 0, 0);
            return;
        }
        if (i12 == 1) {
            nf3Var.e(this.O.i, this.Q.i, 0, 8);
            nf3Var.e(this.O.i, this.a0.O.i, 0, 4);
            nf3Var.e(this.O.i, this.a0.Q.i, 0, 0);
        } else if (i12 == 2) {
            nf3Var.e(this.R.i, this.P.i, 0, 8);
            nf3Var.e(this.P.i, this.a0.R.i, 0, 4);
            nf3Var.e(this.P.i, this.a0.P.i, 0, 0);
        } else if (i12 == 3) {
            nf3Var.e(this.P.i, this.R.i, 0, 8);
            nf3Var.e(this.P.i, this.a0.P.i, 0, 4);
            nf3Var.e(this.P.i, this.a0.R.i, 0, 0);
        }
    }

    @Override // com.zepto.jx0
    public boolean h() {
        return true;
    }

    @Override // com.zepto.jx0
    public boolean n0() {
        return this.Q0;
    }

    @Override // com.zepto.jx0
    public boolean o0() {
        return this.Q0;
    }

    public boolean t1() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.M0;
            if (i4 >= i) {
                break;
            }
            jx0 jx0Var = this.L0[i4];
            if ((this.O0 || jx0Var.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && !jx0Var.n0()) || (((i3 = this.N0) == 2 || i3 == 3) && !jx0Var.o0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.M0; i5++) {
            jx0 jx0Var2 = this.L0[i5];
            if (this.O0 || jx0Var2.h()) {
                if (!z2) {
                    int i6 = this.N0;
                    if (i6 == 0) {
                        iMax = jx0Var2.o(yw0.b.LEFT).e();
                    } else if (i6 == 1) {
                        iMax = jx0Var2.o(yw0.b.RIGHT).e();
                    } else if (i6 == 2) {
                        iMax = jx0Var2.o(yw0.b.TOP).e();
                    } else if (i6 == 3) {
                        iMax = jx0Var2.o(yw0.b.BOTTOM).e();
                    }
                    z2 = true;
                }
                int i7 = this.N0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, jx0Var2.o(yw0.b.LEFT).e());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, jx0Var2.o(yw0.b.RIGHT).e());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, jx0Var2.o(yw0.b.TOP).e());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, jx0Var2.o(yw0.b.BOTTOM).e());
                }
            }
        }
        int i8 = iMax + this.P0;
        int i9 = this.N0;
        if (i9 == 0 || i9 == 1) {
            F0(i8, i8);
        } else {
            I0(i8, i8);
        }
        this.Q0 = true;
        return true;
    }

    @Override // com.zepto.jx0
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i = 0; i < this.M0; i++) {
            jx0 jx0Var = this.L0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + jx0Var.t();
        }
        return str + "}";
    }

    public boolean u1() {
        return this.O0;
    }

    public int v1() {
        return this.N0;
    }

    public int w1() {
        return this.P0;
    }

    public int x1() {
        int i = this.N0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public void y1() {
        for (int i = 0; i < this.M0; i++) {
            jx0 jx0Var = this.L0[i];
            if (this.O0 || jx0Var.h()) {
                int i2 = this.N0;
                if (i2 == 0 || i2 == 1) {
                    jx0Var.S0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    jx0Var.S0(1, true);
                }
            }
        }
    }

    public void z1(boolean z) {
        this.O0 = z;
    }
}
