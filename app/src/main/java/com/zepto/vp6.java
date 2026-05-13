package com.zepto;

import com.zepto.nz7;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vp6 {
    public static final vp6 f = new vp6(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public vp6() {
        this(0, new int[8], new Object[8], true);
    }

    public static vp6 c() {
        return f;
    }

    public static int f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int g(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static vp6 j(vp6 vp6Var, vp6 vp6Var2) {
        int i = vp6Var.a + vp6Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(vp6Var.b, i);
        System.arraycopy(vp6Var2.b, 0, iArrCopyOf, vp6Var.a, vp6Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(vp6Var.c, i);
        System.arraycopy(vp6Var2.c, 0, objArrCopyOf, vp6Var.a, vp6Var2.a);
        return new vp6(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static vp6 k() {
        return new vp6();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i, Object obj, nz7 nz7Var) {
        int iA = zw7.a(i);
        int iB = zw7.b(i);
        if (iB == 0) {
            nz7Var.c(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            nz7Var.w(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            nz7Var.F(iA, (s80) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(b13.e());
            }
            nz7Var.n(iA, ((Integer) obj).intValue());
        } else if (nz7Var.x() == nz7.a.ASCENDING) {
            nz7Var.h(iA);
            ((vp6) obj).r(nz7Var);
            nz7Var.C(iA);
        } else {
            nz7Var.C(iA);
            ((vp6) obj).r(nz7Var);
            nz7Var.h(iA);
        }
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public int d() {
        int iO;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int iA = zw7.a(i4);
            int iB = zw7.b(i4);
            if (iB == 0) {
                iO = hr0.O(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 1) {
                iO = hr0.n(iA, ((Long) this.c[i3]).longValue());
            } else if (iB == 2) {
                iO = hr0.f(iA, (s80) this.c[i3]);
            } else if (iB == 3) {
                iO = (hr0.L(iA) * 2) + ((vp6) this.c[i3]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(b13.e());
                }
                iO = hr0.l(iA, ((Integer) this.c[i3]).intValue());
            }
            i2 += iO;
        }
        this.d = i2;
        return i2;
    }

    public int e() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            iA += hr0.A(zw7.a(this.b[i2]), (s80) this.c[i2]);
        }
        this.d = iA;
        return iA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vp6)) {
            return false;
        }
        vp6 vp6Var = (vp6) obj;
        int i = this.a;
        return i == vp6Var.a && o(this.b, vp6Var.b, i) && l(this.c, vp6Var.c, this.a);
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + f(this.b, i)) * 31) + g(this.c, this.a);
    }

    public vp6 i(vp6 vp6Var) {
        if (vp6Var.equals(c())) {
            return this;
        }
        a();
        int i = this.a + vp6Var.a;
        b(i);
        System.arraycopy(vp6Var.b, 0, this.b, this.a, vp6Var.a);
        System.arraycopy(vp6Var.c, 0, this.c, this.a, vp6Var.a);
        this.a = i;
        return this;
    }

    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            ct3.d(sb, i, String.valueOf(zw7.a(this.b[i2])), this.c[i2]);
        }
    }

    public void n(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public void p(nz7 nz7Var) {
        if (nz7Var.x() == nz7.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                nz7Var.f(zw7.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            nz7Var.f(zw7.a(this.b[i2]), this.c[i2]);
        }
    }

    public void r(nz7 nz7Var) {
        if (this.a == 0) {
            return;
        }
        if (nz7Var.x() == nz7.a.ASCENDING) {
            for (int i = 0; i < this.a; i++) {
                q(this.b[i], this.c[i], nz7Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            q(this.b[i2], this.c[i2], nz7Var);
        }
    }

    public vp6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
