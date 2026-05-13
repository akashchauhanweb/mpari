package com.zepto;

import com.zepto.px;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i46 implements px.a {
    public static float n = 0.001f;
    public final int a = -1;
    public int b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;
    public int k = -1;
    public final px l;
    public final j90 m;

    public i46(px pxVar, j90 j90Var) {
        this.l = pxVar;
        this.m = j90Var;
        clear();
    }

    @Override // com.zepto.px.a
    public float a(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.zepto.px.a
    public float b(h46 h46Var) {
        int iP = p(h46Var);
        if (iP != -1) {
            return this.g[iP];
        }
        return 0.0f;
    }

    @Override // com.zepto.px.a
    public void c(h46 h46Var, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            i(h46Var, true);
            return;
        }
        if (this.j == 0) {
            m(0, h46Var, f);
            l(h46Var, 0);
            this.k = 0;
            return;
        }
        int iP = p(h46Var);
        if (iP != -1) {
            this.g[iP] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = h46Var.f;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, h46Var, f);
    }

    @Override // com.zepto.px.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            h46 h46VarF = f(i2);
            if (h46VarF != null) {
                h46VarF.d(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // com.zepto.px.a
    public boolean d(h46 h46Var) {
        return p(h46Var) != -1;
    }

    @Override // com.zepto.px.a
    public int e() {
        return this.j;
    }

    @Override // com.zepto.px.a
    public h46 f(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // com.zepto.px.a
    public void g(h46 h46Var, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int iP = p(h46Var);
            if (iP == -1) {
                c(h46Var, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[iP] + f;
            fArr[iP] = f3;
            float f4 = n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[iP] = 0.0f;
            i(h46Var, z);
        }
    }

    @Override // com.zepto.px.a
    public void h(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.zepto.px.a
    public float i(h46 h46Var, boolean z) {
        int iP = p(h46Var);
        if (iP == -1) {
            return 0.0f;
        }
        r(h46Var);
        float f = this.g[iP];
        if (this.k == iP) {
            this.k = this.i[iP];
        }
        this.f[iP] = -1;
        int[] iArr = this.h;
        int i = iArr[iP];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[iP];
        }
        int i2 = this.i[iP];
        if (i2 != -1) {
            iArr[i2] = iArr[iP];
        }
        this.j--;
        h46Var.p--;
        if (z) {
            h46Var.d(this.l);
        }
        return f;
    }

    @Override // com.zepto.px.a
    public float j(px pxVar, boolean z) {
        float fB = b(pxVar.a);
        i(pxVar.a, z);
        i46 i46Var = (i46) pxVar.e;
        int iE = i46Var.e();
        int i = 0;
        int i2 = 0;
        while (i < iE) {
            int i3 = i46Var.f[i2];
            if (i3 != -1) {
                g(this.m.d[i3], i46Var.g[i2] * fB, z);
                i++;
            }
            i2++;
        }
        return fB;
    }

    @Override // com.zepto.px.a
    public void k() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public final void l(h46 h46Var, int i) {
        int[] iArr;
        int i2 = h46Var.f % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void m(int i, h46 h46Var, float f) {
        this.f[i] = h46Var.f;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        h46Var.a(this.l);
        h46Var.p++;
        this.j++;
    }

    public final int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    public int p(h46 h46Var) {
        if (this.j != 0 && h46Var != null) {
            int i = h46Var.f;
            int i2 = this.d[i % this.c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f[i2] != i);
            if (i2 != -1 && this.f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final void q(int i, h46 h46Var, float f) {
        int iN = n();
        m(iN, h46Var, f);
        if (i != -1) {
            this.h[iN] = i;
            int[] iArr = this.i;
            iArr[iN] = iArr[i];
            iArr[i] = iN;
        } else {
            this.h[iN] = -1;
            if (this.j > 0) {
                this.i[iN] = this.k;
                this.k = iN;
            } else {
                this.i[iN] = -1;
            }
        }
        int i2 = this.i[iN];
        if (i2 != -1) {
            this.h[i2] = iN;
        }
        l(h46Var, iN);
    }

    public final void r(h46 h46Var) {
        int[] iArr;
        int i;
        int i2 = h46Var.f;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            } else {
                i4 = i;
            }
        }
        if (i == -1 || this.f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            h46 h46VarF = f(i2);
            if (h46VarF != null) {
                String str2 = str + h46VarF + " = " + a(i2) + " ";
                int iP = p(h46VarF);
                String str3 = str2 + "[p: ";
                String str4 = (this.h[iP] != -1 ? str3 + this.m.d[this.f[this.h[iP]]] : str3 + "none") + ", n: ";
                str = (this.i[iP] != -1 ? str4 + this.m.d[this.f[this.i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
