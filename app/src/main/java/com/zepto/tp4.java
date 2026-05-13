package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class tp4 extends i65 {
    public float A;
    public float B;
    public float C;
    public boolean D;
    public wp4 E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public cs4 J;
    public int K;
    public tr0 v;
    public int w;
    public float x;
    public float y;
    public float z;

    public tp4() {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        tr0 tr0Var = new tr0(null);
        this.v = tr0Var;
        this.w = 4;
        this.x = 2.0f;
        this.y = 2.0f;
        this.z = 2.0f;
        this.A = 2.0f;
        this.B = 0.0f;
        this.D = false;
        this.F = 1;
        this.G = 1;
        this.I = false;
        this.l = 0.5f;
        this.j = 15;
        tr0Var.B(0.0f, 1.0f);
    }

    public void M(f02 f02Var) {
        if (this.E != null) {
            this.E = null;
            this.v.J(null);
        }
        this.v.a(f02Var);
    }

    public void N(float f) {
        float fS = s() - V();
        float fP = p() + U();
        float fW = (f - W()) - S();
        if (v() == 90 || v() == 270) {
            this.v.E(0.0f, fP, fW + 0.001f, fS);
        } else {
            this.v.E(fP, fW + 0.001f, fS, 0.0f);
        }
        try {
            this.v.p(true);
        } catch (cu1 unused) {
        }
    }

    public up4 P() {
        return null;
    }

    public int Q() {
        return this.F;
    }

    public tr0 R() {
        return this.v;
    }

    public float S() {
        if (j0()) {
            return this.A + (i() / (D() ? 1.0f : 2.0f));
        }
        return this.A;
    }

    public float U() {
        if (j0()) {
            return this.x + (j() / (D() ? 1.0f : 2.0f));
        }
        return this.x;
    }

    public float V() {
        if (j0()) {
            return this.y + (k() / (D() ? 1.0f : 2.0f));
        }
        return this.y;
    }

    public float W() {
        if (j0()) {
            return this.z + (l() / (D() ? 1.0f : 2.0f));
        }
        return this.z;
    }

    public float X() {
        return this.B;
    }

    public int Y() {
        return this.v.h();
    }

    public hx2 Z() {
        return null;
    }

    public float b0() {
        float fW;
        float fU;
        float fW2;
        boolean z = v() == 90 || v() == 270;
        Z();
        if (z && g0()) {
            H(w() - X());
        } else {
            tr0 tr0VarD = tr0.d(R());
            if (z) {
                fW = s() - V();
                fW2 = p() + U();
                fU = 0.0f;
            } else {
                fS = i0() ? 20000.0f : s() - V();
                fW = w() - W();
                fU = U() + p();
                fW2 = g0() ? (w() + S()) - X() : -1.0737418E9f;
            }
            vp4.g(tr0VarD, fU, fW2, fS, fW);
            try {
                tr0VarD.p(true);
                if (z) {
                    H(((w() - W()) - S()) - tr0VarD.j());
                } else {
                    float fN = tr0VarD.n();
                    if (k0()) {
                        fN += tr0VarD.i();
                    }
                    H(fN - S());
                }
            } catch (cu1 e) {
                throw new p52(e);
            }
        }
        float fO = o();
        return g0() ? X() : (!h0() || fO >= c0()) ? fO : c0();
    }

    public float c0() {
        return this.C;
    }

    public int d0() {
        return this.G;
    }

    public int e0() {
        return this.v.m();
    }

    public int f0() {
        return this.w;
    }

    public boolean g0() {
        return X() > 0.0f;
    }

    public boolean h0() {
        return c0() > 0.0f;
    }

    public boolean i0() {
        return this.D;
    }

    public boolean j0() {
        return this.I;
    }

    public boolean k0() {
        return this.H;
    }

    public void l0(int i) {
        this.F = i;
    }

    public void m0(tr0 tr0Var) {
        this.v = tr0Var;
    }

    public void n0(float f) {
        this.B = f;
        this.C = 0.0f;
    }

    public void o0(int i) {
        this.v.t(i);
    }

    public void p0(float f) {
        this.C = f;
        this.B = 0.0f;
    }

    public void q0(float f) {
        this.A = f;
        this.z = f;
        this.x = f;
        this.y = f;
    }

    public void r0(cs4 cs4Var) {
        this.E = null;
        tr0 tr0Var = this.v;
        this.J = cs4Var;
        tr0Var.J(cs4Var);
    }

    public void s0(int i) {
        this.G = i;
    }

    public void t0(int i) {
        this.v.D(i);
    }

    public void u0(int i) {
        wp4 wp4Var = this.E;
        if (wp4Var != null) {
            wp4Var.N(i == 4);
        }
        this.w = i;
    }

    @Override // com.zepto.i65
    public int v() {
        return this.K;
    }

    public tp4(cs4 cs4Var) {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        tr0 tr0Var = new tr0(null);
        this.v = tr0Var;
        this.w = 4;
        this.x = 2.0f;
        this.y = 2.0f;
        this.z = 2.0f;
        this.A = 2.0f;
        this.B = 0.0f;
        this.D = false;
        this.F = 1;
        this.G = 1;
        this.I = false;
        this.l = 0.5f;
        this.j = 15;
        this.J = cs4Var;
        tr0Var.b(cs4Var);
        this.v.B(0.0f, 1.0f);
    }

    public tp4(wp4 wp4Var) {
        this(wp4Var, null);
    }

    public tp4(wp4 wp4Var, tp4 tp4Var) {
        super(0.0f, 0.0f, 0.0f, 0.0f);
        tr0 tr0Var = new tr0(null);
        this.v = tr0Var;
        this.w = 4;
        this.x = 2.0f;
        this.y = 2.0f;
        this.z = 2.0f;
        this.A = 2.0f;
        this.B = 0.0f;
        this.D = false;
        this.F = 1;
        this.G = 1;
        this.I = false;
        this.l = 0.5f;
        this.j = 15;
        tr0Var.B(0.0f, 1.0f);
        this.E = wp4Var;
        wp4Var.W(100.0f);
        wp4Var.N(true);
        this.v.a(wp4Var);
        if (tp4Var != null) {
            a(tp4Var);
            this.w = tp4Var.w;
            this.x = tp4Var.x;
            this.y = tp4Var.y;
            this.z = tp4Var.z;
            this.A = tp4Var.A;
            this.F = tp4Var.F;
            this.G = tp4Var.G;
            this.H = tp4Var.H;
            this.I = tp4Var.I;
            this.K = tp4Var.K;
            return;
        }
        q0(0.0f);
    }

    public tp4(tp4 tp4Var) {
        super(tp4Var.c, tp4Var.e, tp4Var.f, tp4Var.g);
        this.v = new tr0(null);
        this.w = 4;
        this.x = 2.0f;
        this.y = 2.0f;
        this.z = 2.0f;
        this.A = 2.0f;
        this.B = 0.0f;
        this.D = false;
        this.F = 1;
        this.G = 1;
        this.I = false;
        a(tp4Var);
        this.w = tp4Var.w;
        this.x = tp4Var.x;
        this.y = tp4Var.y;
        this.z = tp4Var.z;
        this.A = tp4Var.A;
        this.J = tp4Var.J;
        this.B = tp4Var.B;
        this.C = tp4Var.C;
        this.D = tp4Var.D;
        this.F = tp4Var.F;
        this.G = tp4Var.G;
        wp4 wp4Var = tp4Var.E;
        if (wp4Var != null) {
            this.E = new wp4(wp4Var);
        }
        hx2.M(null);
        this.H = tp4Var.H;
        this.v = tr0.d(tp4Var.v);
        this.I = tp4Var.I;
        this.K = tp4Var.K;
    }
}
