package com.zepto;

import com.zepto.kp3;
import com.zepto.nz7;
import com.zepto.zw7;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ir0 implements nz7 {
    public final hr0 a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zw7.b.values().length];
            a = iArr;
            try {
                iArr[zw7.b.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[zw7.b.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[zw7.b.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[zw7.b.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[zw7.b.v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[zw7.b.r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[zw7.b.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[zw7.b.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[zw7.b.u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[zw7.b.w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[zw7.b.i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[zw7.b.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public ir0(hr0 hr0Var) {
        hr0 hr0Var2 = (hr0) x03.b(hr0Var, "output");
        this.a = hr0Var2;
        hr0Var2.a = this;
    }

    public static ir0 P(hr0 hr0Var) {
        ir0 ir0Var = hr0Var.a;
        return ir0Var != null ? ir0Var : new ir0(hr0Var);
    }

    @Override // com.zepto.nz7
    public void A(int i, List list) {
        int i2 = 0;
        if (!(list instanceof sb3)) {
            while (i2 < list.size()) {
                this.a.C0(i, (String) list.get(i2));
                i2++;
            }
        } else {
            sb3 sb3Var = (sb3) list;
            while (i2 < list.size()) {
                R(i, sb3Var.N(i2));
                i2++;
            }
        }
    }

    @Override // com.zepto.nz7
    public void B(int i, kp3.a aVar, Map map) {
        if (this.a.T()) {
            Q(i, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.D0(i, 2);
            this.a.F0(kp3.a(aVar, entry.getKey(), entry.getValue()));
            kp3.b(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.zepto.nz7
    public void C(int i) {
        this.a.D0(i, 4);
    }

    @Override // com.zepto.nz7
    public void D(int i, String str) {
        this.a.C0(i, str);
    }

    @Override // com.zepto.nz7
    public void E(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.y0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG += hr0.G(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iG);
        while (i2 < list.size()) {
            this.a.z0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void F(int i, s80 s80Var) {
        this.a.a0(i, s80Var);
    }

    @Override // com.zepto.nz7
    public void G(int i, long j) {
        this.a.G0(i, j);
    }

    @Override // com.zepto.nz7
    public void H(int i, int i2) {
        this.a.d0(i, i2);
    }

    @Override // com.zepto.nz7
    public void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.p0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += hr0.w(((Long) list.get(i3)).longValue());
        }
        this.a.F0(iW);
        while (i2 < list.size()) {
            this.a.q0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void J(int i, List list, dp5 dp5Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            L(i, list.get(i2), dp5Var);
        }
    }

    @Override // com.zepto.nz7
    public void K(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.d0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += hr0.k(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iK);
        while (i2 < list.size()) {
            this.a.e0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void L(int i, Object obj, dp5 dp5Var) {
        this.a.l0(i, (at3) obj, dp5Var);
    }

    @Override // com.zepto.nz7
    public void M(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b0(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += hr0.i(((Double) list.get(i4)).doubleValue());
        }
        this.a.F0(i3);
        while (i2 < list.size()) {
            this.a.c0(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void N(int i, int i2) {
        this.a.y0(i, i2);
    }

    @Override // com.zepto.nz7
    public void O(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.a0(i, (s80) list.get(i2));
        }
    }

    public final void Q(int i, kp3.a aVar, Map map) {
        int[] iArr = a.a;
        throw null;
    }

    public final void R(int i, Object obj) {
        if (obj instanceof String) {
            this.a.C0(i, (String) obj);
        } else {
            this.a.a0(i, (s80) obj);
        }
    }

    @Override // com.zepto.nz7
    public void a(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU += hr0.u(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iU);
        while (i2 < list.size()) {
            this.a.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void b(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.j0(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += hr0.q(((Float) list.get(i3)).floatValue());
        }
        this.a.F0(iQ);
        while (i2 < list.size()) {
            this.a.k0(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void c(int i, long j) {
        this.a.p0(i, j);
    }

    @Override // com.zepto.nz7
    public void d(int i, boolean z) {
        this.a.Y(i, z);
    }

    @Override // com.zepto.nz7
    public void e(int i, int i2) {
        this.a.E0(i, i2);
    }

    @Override // com.zepto.nz7
    public final void f(int i, Object obj) {
        if (obj instanceof s80) {
            this.a.t0(i, (s80) obj);
        } else {
            this.a.s0(i, (at3) obj);
        }
    }

    @Override // com.zepto.nz7
    public void g(int i, int i2) {
        this.a.u0(i, i2);
    }

    @Override // com.zepto.nz7
    public void h(int i) {
        this.a.D0(i, 3);
    }

    @Override // com.zepto.nz7
    public void i(int i, Object obj, dp5 dp5Var) {
        this.a.r0(i, (at3) obj, dp5Var);
    }

    @Override // com.zepto.nz7
    public void j(int i, int i2) {
        this.a.n0(i, i2);
    }

    @Override // com.zepto.nz7
    public void k(int i, List list, dp5 dp5Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            i(i, list.get(i2), dp5Var);
        }
    }

    @Override // com.zepto.nz7
    public void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.h0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += hr0.o(((Long) list.get(i3)).longValue());
        }
        this.a.F0(iO);
        while (i2 < list.size()) {
            this.a.i0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void m(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.u0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iC = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC += hr0.C(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iC);
        while (i2 < list.size()) {
            this.a.v0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void n(int i, int i2) {
        this.a.f0(i, i2);
    }

    @Override // com.zepto.nz7
    public void o(int i, double d) {
        this.a.b0(i, d);
    }

    @Override // com.zepto.nz7
    public void p(int i, long j) {
        this.a.w0(i, j);
    }

    @Override // com.zepto.nz7
    public void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.w0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += hr0.E(((Long) list.get(i3)).longValue());
        }
        this.a.F0(iE);
        while (i2 < list.size()) {
            this.a.x0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void r(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.f0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += hr0.m(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iM);
        while (i2 < list.size()) {
            this.a.g0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void s(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.G0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += hr0.P(((Long) list.get(i3)).longValue());
        }
        this.a.F0(iP);
        while (i2 < list.size()) {
            this.a.H0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void t(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Y(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += hr0.e(((Boolean) list.get(i3)).booleanValue());
        }
        this.a.F0(iE);
        while (i2 < list.size()) {
            this.a.Z(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void u(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.E0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += hr0.N(((Integer) list.get(i3)).intValue());
        }
        this.a.F0(iN);
        while (i2 < list.size()) {
            this.a.F0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void v(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.A0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.D0(i, 2);
        int I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            I += hr0.I(((Long) list.get(i3)).longValue());
        }
        this.a.F0(I);
        while (i2 < list.size()) {
            this.a.B0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.zepto.nz7
    public void w(int i, long j) {
        this.a.h0(i, j);
    }

    @Override // com.zepto.nz7
    public nz7.a x() {
        return nz7.a.ASCENDING;
    }

    @Override // com.zepto.nz7
    public void y(int i, long j) {
        this.a.A0(i, j);
    }

    @Override // com.zepto.nz7
    public void z(int i, float f) {
        this.a.j0(i, f);
    }
}
