package com.zepto;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class wp4 implements ab3 {
    public int B;
    public tp4[] f;
    public float[] j;
    public float[] k;
    public int l;
    public float u;
    public float v;
    public boolean x;
    public boolean z;
    public ArrayList c = new ArrayList();
    public float e = 0.0f;
    public int g = 0;
    public tp4 h = new tp4((cs4) null);
    public float i = 0.0f;
    public float m = 80.0f;
    public int n = 1;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public int r = 0;
    public boolean s = false;
    public boolean t = true;
    public boolean[] w = {false, false};
    public boolean y = true;
    public boolean A = true;
    public boolean C = true;

    public wp4() {
    }

    public static wp4 Y(wp4 wp4Var) {
        wp4 wp4Var2 = new wp4();
        wp4Var2.g(wp4Var);
        return wp4Var2;
    }

    public static po4[] c(po4 po4Var) {
        return new po4[]{po4Var, po4Var.o(), po4Var.o(), po4Var.o()};
    }

    public static void i(po4[] po4VarArr) {
        po4 po4Var = po4VarArr[0];
        po4Var.I();
        po4Var.c(po4VarArr[1]);
        po4Var.G();
        po4Var.I();
        po4Var.Q(2);
        po4Var.F();
        po4Var.c(po4VarArr[2]);
        po4Var.G();
        po4Var.c(po4VarArr[3]);
    }

    public float A() {
        return this.e;
    }

    public float B() {
        return this.i;
    }

    public float C() {
        return this.m;
    }

    public boolean D() {
        return this.w[0];
    }

    public boolean E(boolean z) {
        return z ? this.w[0] : this.w[1];
    }

    public boolean F() {
        return this.x;
    }

    public boolean G() {
        return this.s;
    }

    public boolean H() {
        return this.o;
    }

    public boolean I() {
        return this.p;
    }

    public boolean J() {
        return this.y;
    }

    public boolean K() {
        return this.t;
    }

    public boolean L(int i, int i2) {
        if (i2 >= p() || i2 < 0 || i == 0) {
            return false;
        }
        int i3 = i - 1;
        if (((vp4) this.c.get(i3)) == null) {
            return false;
        }
        tp4 tp4VarF = f(i3, i2);
        while (tp4VarF == null && i3 > 0) {
            i3--;
            if (((vp4) this.c.get(i3)) == null) {
                return false;
            }
            tp4VarF = f(i3, i2);
        }
        int i4 = i - i3;
        if (tp4VarF.d0() == 1 && i4 > 1) {
            int i5 = i2 - 1;
            vp4 vp4Var = (vp4) this.c.get(i3 + 1);
            i4--;
            tp4VarF = vp4Var.b()[i5];
            while (tp4VarF == null && i5 > 0) {
                i5--;
                tp4VarF = vp4Var.b()[i5];
            }
        }
        return tp4VarF != null && tp4VarF.d0() > i4;
    }

    public void M(boolean z) {
        this.A = z;
    }

    public void N(boolean z) {
        boolean[] zArr = this.w;
        zArr[0] = z;
        zArr[1] = z;
    }

    @Override // com.zepto.f02
    public boolean O() {
        return true;
    }

    public void P(int i) {
        if (i < 0) {
            i = 0;
        }
        this.l = i;
    }

    public void Q(boolean z) {
        this.x = z;
    }

    public void R(boolean z) {
        this.o = z;
    }

    public void S(float f) {
        this.v = f;
    }

    @Override // com.zepto.ab3
    public boolean T() {
        return this.A;
    }

    public void U(float f) {
        this.u = f;
    }

    public void V(float f) {
        if (this.i == f) {
            return;
        }
        this.i = f;
        this.e = 0.0f;
        e();
        d(true);
    }

    public void W(float f) {
        this.m = f;
    }

    public void X(float[] fArr) throws cu1 {
        if (fArr.length != p()) {
            throw new cu1(dt3.b("wrong.number.of.columns", new Object[0]));
        }
        float[] fArr2 = new float[fArr.length];
        this.j = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        this.k = new float[fArr.length];
        this.e = 0.0f;
        e();
        d(true);
    }

    public int Z() {
        return this.c.size();
    }

    public void a(tp4 tp4Var) {
        boolean z;
        int i;
        tp4[] tp4VarArr;
        this.C = false;
        tp4 tp4Var2 = new tp4(tp4Var);
        int iMin = Math.min(Math.max(tp4Var2.Q(), 1), this.f.length - this.g);
        tp4Var2.l0(iMin);
        if (iMin != 1) {
            this.q = true;
        }
        if (tp4Var2.e0() == 0) {
            tp4Var2.t0(this.r);
        }
        b0();
        int i2 = this.g;
        tp4[] tp4VarArr2 = this.f;
        if (i2 < tp4VarArr2.length) {
            tp4VarArr2[i2] = tp4Var2;
            this.g = i2 + iMin;
            z = true;
        } else {
            z = false;
        }
        b0();
        while (true) {
            i = this.g;
            tp4VarArr = this.f;
            if (i < tp4VarArr.length) {
                break;
            }
            int iP = p();
            if (this.r == 3) {
                tp4[] tp4VarArr3 = new tp4[iP];
                int length = this.f.length;
                int i3 = 0;
                while (true) {
                    tp4[] tp4VarArr4 = this.f;
                    if (i3 >= tp4VarArr4.length) {
                        break;
                    }
                    tp4 tp4Var3 = tp4VarArr4[i3];
                    int iQ = tp4Var3.Q();
                    length -= iQ;
                    tp4VarArr3[length] = tp4Var3;
                    i3 = i3 + (iQ - 1) + 1;
                }
                this.f = tp4VarArr3;
            }
            vp4 vp4Var = new vp4(this.f);
            if (this.i > 0.0f) {
                vp4Var.j(this.k);
                this.e += vp4Var.c();
            }
            this.c.add(vp4Var);
            this.f = new tp4[iP];
            this.g = 0;
            b0();
            this.C = true;
        }
        if (z) {
            return;
        }
        tp4VarArr[i] = tp4Var2;
        this.g = i + iMin;
    }

    @Override // com.zepto.f02
    public ArrayList a0() {
        return new ArrayList();
    }

    public vp4 b(int i, int i2) {
        vp4 vp4Var = new vp4(q(i));
        vp4Var.d();
        tp4[] tp4VarArrB = vp4Var.b();
        for (int i3 = 0; i3 < tp4VarArrB.length; i3++) {
            tp4 tp4Var = tp4VarArrB[i3];
            if (tp4Var != null && tp4Var.d0() != 1) {
                int iMin = Math.min(i2, tp4Var.d0() + i);
                float fS = 0.0f;
                for (int i4 = 1 + i; i4 < iMin; i4++) {
                    fS += s(i4);
                }
                vp4Var.h(i3, fS);
            }
        }
        return vp4Var;
    }

    public final void b0() {
        int i = this.r == 3 ? -1 : 1;
        while (L(this.c.size(), this.g)) {
            this.g += i;
        }
    }

    public float c0() {
        return this.v;
    }

    public float d(boolean z) {
        if (this.i <= 0.0f) {
            return 0.0f;
        }
        this.e = 0.0f;
        for (int i = 0; i < this.c.size(); i++) {
            this.e += t(i, z);
        }
        return this.e;
    }

    public float d0() {
        return this.u;
    }

    public void e() {
        float f = 0.0f;
        if (this.i <= 0.0f) {
            return;
        }
        int iP = p();
        for (int i = 0; i < iP; i++) {
            f += this.j[i];
        }
        for (int i2 = 0; i2 < iP; i2++) {
            this.k[i2] = (this.i * this.j[i2]) / f;
        }
    }

    public float e0(int i, int i2, float f, float f2, po4 po4Var) {
        return g0(0, -1, i, i2, f, f2, po4Var);
    }

    public tp4 f(int i, int i2) {
        tp4[] tp4VarArrB = ((vp4) this.c.get(i)).b();
        for (int i3 = 0; i3 < tp4VarArrB.length; i3++) {
            tp4 tp4Var = tp4VarArrB[i3];
            if (tp4Var != null && i2 >= i3 && i2 < tp4Var.Q() + i3) {
                return tp4VarArrB[i3];
            }
        }
        return null;
    }

    public float f0(int i, int i2, float f, float f2, po4[] po4VarArr) {
        return h0(0, -1, i, i2, f, f2, po4VarArr);
    }

    public void g(wp4 wp4Var) {
        this.j = new float[wp4Var.p()];
        this.k = new float[wp4Var.p()];
        System.arraycopy(wp4Var.j, 0, this.j, 0, p());
        System.arraycopy(wp4Var.k, 0, this.k, 0, p());
        this.i = wp4Var.i;
        this.e = wp4Var.e;
        this.g = 0;
        this.r = wp4Var.r;
        this.h = new tp4(wp4Var.h);
        this.f = new tp4[wp4Var.f.length];
        this.q = wp4Var.q;
        this.t = wp4Var.t;
        this.v = wp4Var.v;
        this.u = wp4Var.u;
        this.l = wp4Var.l;
        this.B = wp4Var.B;
        this.s = wp4Var.s;
        this.w = wp4Var.w;
        this.x = wp4Var.x;
        this.m = wp4Var.m;
        this.y = wp4Var.y;
        this.o = wp4Var.o;
        this.p = wp4Var.p;
        this.n = wp4Var.n;
        this.z = wp4Var.z;
        this.A = wp4Var.A;
    }

    public float g0(int i, int i2, int i3, int i4, float f, float f2, po4 po4Var) {
        int iP = p();
        int iMin = i < 0 ? 0 : Math.min(i, iP);
        int iMin2 = i2 < 0 ? iP : Math.min(i2, iP);
        boolean z = (iMin == 0 && iMin2 == iP) ? false : true;
        if (z) {
            float f3 = 0.0f;
            for (int i5 = iMin; i5 < iMin2; i5++) {
                f3 += this.k[i5];
            }
            po4Var.I();
            float f4 = iMin == 0 ? 10000.0f : 0.0f;
            po4Var.z(f - f4, -10000.0f, f3 + f4 + (iMin2 == iP ? 10000.0f : 0.0f), 20000.0f);
            po4Var.g();
            po4Var.y();
        }
        po4[] po4VarArrC = c(po4Var);
        float fH0 = h0(iMin, iMin2, i3, i4, f, f2, po4VarArrC);
        i(po4VarArrC);
        if (z) {
            po4Var.G();
        }
        return fH0;
    }

    public void h() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l; i++) {
            arrayList.add(this.c.get(i));
        }
        this.c = arrayList;
        this.e = 0.0f;
        if (this.i > 0.0f) {
            this.e = l();
        }
    }

    public float h0(int i, int i2, int i3, int i4, float f, float f2, po4[] po4VarArr) {
        if (this.i <= 0.0f) {
            throw new RuntimeException(dt3.b("the.table.width.must.be.greater.than.zero", new Object[0]));
        }
        int size = this.c.size();
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 >= 0) {
            size = Math.min(i4, size);
        }
        if (i3 >= size) {
            return f2;
        }
        int iP = p();
        int iMin = i >= 0 ? Math.min(i, iP) : 0;
        if (i2 >= 0) {
            iP = Math.min(i2, iP);
        }
        while (i3 < size) {
            vp4 vp4Var = (vp4) this.c.get(i3);
            if (vp4Var != null) {
                vp4Var.m(iMin, iP, f, f2, po4VarArr);
                f2 -= vp4Var.c();
            }
            i3++;
        }
        return f2;
    }

    public float j() {
        int iMin = Math.min(this.c.size(), this.l);
        float fC = 0.0f;
        for (int iMax = Math.max(0, this.l - this.B); iMax < iMin; iMax++) {
            vp4 vp4Var = (vp4) this.c.get(iMax);
            if (vp4Var != null) {
                fC += vp4Var.c();
            }
        }
        return fC;
    }

    public int k() {
        return this.B;
    }

    public float l() {
        int iMin = Math.min(this.c.size(), this.l);
        float fC = 0.0f;
        for (int i = 0; i < iMin; i++) {
            vp4 vp4Var = (vp4) this.c.get(i);
            if (vp4Var != null) {
                fC += vp4Var.c();
            }
        }
        return fC;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.n;
    }

    public boolean o() {
        return this.z;
    }

    public int p() {
        return this.j.length;
    }

    public vp4 q(int i) {
        return (vp4) this.c.get(i);
    }

    @Override // com.zepto.ab3
    public void r() {
        h();
        R(true);
    }

    public float s(int i) {
        return t(i, false);
    }

    public float t(int i, boolean z) {
        vp4 vp4Var;
        int i2;
        float fB0;
        if (this.i <= 0.0f || i < 0 || i >= this.c.size() || (vp4Var = (vp4) this.c.get(i)) == null) {
            return 0.0f;
        }
        if (z) {
            vp4Var.j(this.k);
        }
        float fC = vp4Var.c();
        for (int i3 = 0; i3 < this.j.length; i3++) {
            if (L(i, i3)) {
                int i4 = 1;
                while (true) {
                    i2 = i - i4;
                    if (!L(i2, i3)) {
                        break;
                    }
                    i4++;
                }
                tp4 tp4Var = ((vp4) this.c.get(i2)).b()[i3];
                if (tp4Var == null || tp4Var.d0() != i4 + 1) {
                    fB0 = 0.0f;
                } else {
                    fB0 = tp4Var.b0();
                    while (i4 > 0) {
                        fB0 -= s(i - i4);
                        i4--;
                    }
                }
                if (fB0 > fC) {
                    fC = fB0;
                }
            }
        }
        vp4Var.i(fC);
        return fC;
    }

    @Override // com.zepto.f02
    public boolean u(r02 r02Var) {
        try {
            return r02Var.d(this);
        } catch (cu1 unused) {
            return false;
        }
    }

    public ArrayList v() {
        return this.c;
    }

    public ArrayList w(int i, int i2) {
        tp4 tp4Var;
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 <= Z()) {
            vp4 vp4VarB = b(i, i2);
            int iQ = 0;
            while (iQ < p()) {
                int i3 = i;
                while (true) {
                    int i4 = i3 - 1;
                    if (!L(i3, iQ)) {
                        break;
                    }
                    vp4 vp4VarQ = q(i4);
                    if (vp4VarQ != null && (tp4Var = vp4VarQ.b()[iQ]) != null) {
                        vp4VarB.b()[iQ] = new tp4(tp4Var);
                        int iMin = Math.min(tp4Var.d0() + i4, i2);
                        float fS = 0.0f;
                        for (int i5 = i + 1; i5 < iMin; i5++) {
                            fS += s(i5);
                        }
                        vp4VarB.h(iQ, fS);
                        vp4VarB.b()[iQ].N((x(i4, iQ) - s(i)) - fS);
                    }
                    i3 = i4;
                }
                tp4 tp4Var2 = vp4VarB.b()[iQ];
                iQ = tp4Var2 == null ? iQ + 1 : iQ + tp4Var2.Q();
            }
            arrayList.add(vp4VarB);
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                arrayList.add(b(i, i2));
            }
        }
        return arrayList;
    }

    public float x(int i, int i2) {
        vp4 vp4Var;
        float fS = 0.0f;
        if (this.i > 0.0f && i >= 0 && i < this.c.size() && (vp4Var = (vp4) this.c.get(i)) != null && i2 < vp4Var.b().length) {
            tp4 tp4Var = vp4Var.b()[i2];
            if (tp4Var == null) {
                return 0.0f;
            }
            for (int i3 = 0; i3 < tp4Var.d0(); i3++) {
                fS += s(i + i3);
            }
        }
        return fS;
    }

    public xp4 y() {
        return null;
    }

    @Override // com.zepto.f02
    public int z() {
        return 23;
    }

    public wp4(int i) {
        if (i > 0) {
            this.j = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.j[i2] = 1.0f;
            }
            this.k = new float[this.j.length];
            e();
            this.f = new tp4[this.k.length];
            this.z = false;
            return;
        }
        throw new IllegalArgumentException(dt3.b("the.number.of.columns.in.pdfptable.constructor.must.be.greater.than.zero", new Object[0]));
    }

    public wp4(wp4 wp4Var) {
        tp4 tp4Var;
        g(wp4Var);
        int i = 0;
        while (true) {
            tp4[] tp4VarArr = this.f;
            if (i >= tp4VarArr.length || (tp4Var = wp4Var.f[i]) == null) {
                break;
            }
            tp4VarArr[i] = new tp4(tp4Var);
            i++;
        }
        for (int i2 = 0; i2 < wp4Var.c.size(); i2++) {
            vp4 vp4Var = (vp4) wp4Var.c.get(i2);
            if (vp4Var != null) {
                vp4Var = new vp4(vp4Var);
            }
            this.c.add(vp4Var);
        }
    }
}
