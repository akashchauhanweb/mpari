package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class e56 implements Cloneable {
    public static final Object h = new Object();
    public boolean c;
    public int[] e;
    public Object[] f;
    public int g;

    public e56() {
        this(10);
    }

    public void a(int i, Object obj) {
        int i2 = this.g;
        if (i2 != 0 && i <= this.e[i2 - 1]) {
            l(i, obj);
            return;
        }
        if (this.c && i2 >= this.e.length) {
            d();
        }
        int i3 = this.g;
        if (i3 >= this.e.length) {
            int iE = iy0.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.e = iArr;
            this.f = objArr;
        }
        this.e[i3] = i;
        this.f[i3] = obj;
        this.g = i3 + 1;
    }

    public void b() {
        int i = this.g;
        Object[] objArr = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.g = 0;
        this.c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e56 clone() {
        try {
            e56 e56Var = (e56) super.clone();
            e56Var.e = (int[]) this.e.clone();
            e56Var.f = (Object[]) this.f.clone();
            return e56Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.g;
        int[] iArr = this.e;
        Object[] objArr = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != h) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.c = false;
        this.g = i2;
    }

    public Object e(int i) {
        return f(i, null);
    }

    public Object f(int i, Object obj) {
        Object obj2;
        int iA = iy0.a(this.e, this.g, i);
        return (iA < 0 || (obj2 = this.f[iA]) == h) ? obj : obj2;
    }

    public int g(int i) {
        if (this.c) {
            d();
        }
        return iy0.a(this.e, this.g, i);
    }

    public int h(Object obj) {
        if (this.c) {
            d();
        }
        for (int i = 0; i < this.g; i++) {
            if (this.f[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public boolean i() {
        return q() == 0;
    }

    public int k(int i) {
        if (this.c) {
            d();
        }
        return this.e[i];
    }

    public void l(int i, Object obj) {
        int iA = iy0.a(this.e, this.g, i);
        if (iA >= 0) {
            this.f[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == h) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.c && i3 >= this.e.length) {
            d();
            i2 = ~iy0.a(this.e, this.g, i);
        }
        int i4 = this.g;
        if (i4 >= this.e.length) {
            int iE = iy0.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = iArr;
            this.f = objArr2;
        }
        int i5 = this.g;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.e;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f;
            System.arraycopy(objArr4, i2, objArr4, i6, this.g - i2);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public void o(int i) {
        Object[] objArr = this.f;
        Object obj = objArr[i];
        Object obj2 = h;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.c = true;
        }
    }

    public Object p(int i, Object obj) {
        int iG = g(i);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public int q() {
        if (this.c) {
            d();
        }
        return this.g;
    }

    public Object r(int i) {
        if (this.c) {
            d();
        }
        return this.f[i];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        for (int i = 0; i < this.g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(k(i));
            sb.append('=');
            Object objR = r(i);
            if (objR != this) {
                sb.append(objR);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e56(int i) {
        this.c = false;
        if (i == 0) {
            this.e = iy0.a;
            this.f = iy0.c;
        } else {
            int iE = iy0.e(i);
            this.e = new int[iE];
            this.f = new Object[iE];
        }
    }
}
