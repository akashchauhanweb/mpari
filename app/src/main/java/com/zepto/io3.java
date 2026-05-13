package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class io3 implements Cloneable {
    public static final Object h = new Object();
    public boolean c;
    public long[] e;
    public Object[] f;
    public int g;

    public io3() {
        this(10);
    }

    public void a() {
        int i = this.g;
        Object[] objArr = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.g = 0;
        this.c = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public io3 clone() {
        try {
            io3 io3Var = (io3) super.clone();
            io3Var.e = (long[]) this.e.clone();
            io3Var.f = (Object[]) this.f.clone();
            return io3Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i = this.g;
        long[] jArr = this.e;
        Object[] objArr = this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != h) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.c = false;
        this.g = i2;
    }

    public Object d(long j) {
        return e(j, null);
    }

    public Object e(long j, Object obj) {
        Object obj2;
        int iB = iy0.b(this.e, this.g, j);
        return (iB < 0 || (obj2 = this.f[iB]) == h) ? obj : obj2;
    }

    public int f(long j) {
        if (this.c) {
            c();
        }
        return iy0.b(this.e, this.g, j);
    }

    public long g(int i) {
        if (this.c) {
            c();
        }
        return this.e[i];
    }

    public void h(long j, Object obj) {
        int iB = iy0.b(this.e, this.g, j);
        if (iB >= 0) {
            this.f[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.g;
        if (i < i2) {
            Object[] objArr = this.f;
            if (objArr[i] == h) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.c && i2 >= this.e.length) {
            c();
            i = ~iy0.b(this.e, this.g, j);
        }
        int i3 = this.g;
        if (i3 >= this.e.length) {
            int iF = iy0.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = jArr;
            this.f = objArr2;
        }
        int i4 = this.g;
        if (i4 - i != 0) {
            long[] jArr3 = this.e;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f;
            System.arraycopy(objArr4, i, objArr4, i5, this.g - i);
        }
        this.e[i] = j;
        this.f[i] = obj;
        this.g++;
    }

    public void i(long j) {
        int iB = iy0.b(this.e, this.g, j);
        if (iB >= 0) {
            Object[] objArr = this.f;
            Object obj = objArr[iB];
            Object obj2 = h;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.c = true;
            }
        }
    }

    public void k(int i) {
        Object[] objArr = this.f;
        Object obj = objArr[i];
        Object obj2 = h;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.c = true;
        }
    }

    public int l() {
        if (this.c) {
            c();
        }
        return this.g;
    }

    public Object o(int i) {
        if (this.c) {
            c();
        }
        return this.f[i];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        for (int i = 0; i < this.g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(g(i));
            sb.append('=');
            Object objO = o(i);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public io3(int i) {
        this.c = false;
        if (i == 0) {
            this.e = iy0.b;
            this.f = iy0.c;
        } else {
            int iF = iy0.f(i);
            this.e = new long[iF];
            this.f = new Object[iF];
        }
    }
}
