package com.zepto;

import com.zepto.e50;
import com.zepto.jx0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class mt7 extends zl2 {
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 0;
    public int U0 = 0;
    public boolean V0 = false;
    public int W0 = 0;
    public int X0 = 0;
    public e50.a Y0 = new e50.a();
    public e50.b Z0 = null;

    public int A1() {
        return this.U0;
    }

    public int B1() {
        return this.N0;
    }

    public abstract void C1(int i, int i2, int i3, int i4);

    public void D1(jx0 jx0Var, jx0.b bVar, int i, jx0.b bVar2, int i2) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((kx0) K()).I1();
        }
        e50.a aVar = this.Y0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.Z0.b(jx0Var, aVar);
        jx0Var.k1(this.Y0.e);
        jx0Var.L0(this.Y0.f);
        jx0Var.K0(this.Y0.h);
        jx0Var.A0(this.Y0.g);
    }

    public boolean E1() {
        jx0 jx0Var = this.a0;
        e50.b bVarI1 = jx0Var != null ? ((kx0) jx0Var).I1() : null;
        if (bVarI1 == null) {
            return false;
        }
        for (int i = 0; i < this.M0; i++) {
            jx0 jx0Var2 = this.L0[i];
            if (jx0Var2 != null && !(jx0Var2 instanceof sk2)) {
                jx0.b bVarU = jx0Var2.u(0);
                jx0.b bVarU2 = jx0Var2.u(1);
                jx0.b bVar = jx0.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || jx0Var2.w == 1 || bVarU2 != bVar || jx0Var2.x == 1) {
                    if (bVarU == bVar) {
                        bVarU = jx0.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = jx0.b.WRAP_CONTENT;
                    }
                    e50.a aVar = this.Y0;
                    aVar.a = bVarU;
                    aVar.b = bVarU2;
                    aVar.c = jx0Var2.W();
                    this.Y0.d = jx0Var2.x();
                    bVarI1.b(jx0Var2, this.Y0);
                    jx0Var2.k1(this.Y0.e);
                    jx0Var2.L0(this.Y0.f);
                    jx0Var2.A0(this.Y0.g);
                }
            }
        }
        return true;
    }

    public boolean F1() {
        return this.V0;
    }

    public void G1(boolean z) {
        this.V0 = z;
    }

    public void H1(int i, int i2) {
        this.W0 = i;
        this.X0 = i2;
    }

    public void I1(int i) {
        this.P0 = i;
        this.N0 = i;
        this.Q0 = i;
        this.O0 = i;
        this.R0 = i;
        this.S0 = i;
    }

    public void J1(int i) {
        this.O0 = i;
    }

    public void K1(int i) {
        this.S0 = i;
    }

    public void L1(int i) {
        this.P0 = i;
        this.T0 = i;
    }

    public void M1(int i) {
        this.Q0 = i;
        this.U0 = i;
    }

    public void N1(int i) {
        this.R0 = i;
        this.T0 = i;
        this.U0 = i;
    }

    public void O1(int i) {
        this.N0 = i;
    }

    @Override // com.zepto.zl2, com.zepto.xl2
    public void a(kx0 kx0Var) {
        u1();
    }

    public void t1(boolean z) {
        int i = this.R0;
        if (i > 0 || this.S0 > 0) {
            if (z) {
                this.T0 = this.S0;
                this.U0 = i;
            } else {
                this.T0 = i;
                this.U0 = this.S0;
            }
        }
    }

    public void u1() {
        for (int i = 0; i < this.M0; i++) {
            jx0 jx0Var = this.L0[i];
            if (jx0Var != null) {
                jx0Var.U0(true);
            }
        }
    }

    public boolean v1(HashSet hashSet) {
        for (int i = 0; i < this.M0; i++) {
            if (hashSet.contains(this.L0[i])) {
                return true;
            }
        }
        return false;
    }

    public int w1() {
        return this.X0;
    }

    public int x1() {
        return this.W0;
    }

    public int y1() {
        return this.O0;
    }

    public int z1() {
        return this.T0;
    }
}
