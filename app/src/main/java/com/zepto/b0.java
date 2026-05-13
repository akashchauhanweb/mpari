package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class b0 {
    public static final a0[] d = new a0[0];
    public a0[] a;
    public int b;
    public boolean c;

    public b0() {
        this(10);
    }

    public static a0[] b(a0[] a0VarArr) {
        return a0VarArr.length < 1 ? d : (a0[]) a0VarArr.clone();
    }

    public void a(a0 a0Var) {
        if (a0Var == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.a.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            e(i);
        }
        this.a[this.b] = a0Var;
        this.b = i;
    }

    public a0[] c() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        a0[] a0VarArr = new a0[i];
        System.arraycopy(this.a, 0, a0VarArr, 0, i);
        return a0VarArr;
    }

    public a0 d(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public final void e(int i) {
        a0[] a0VarArr = new a0[Math.max(this.a.length, i + (i >> 1))];
        System.arraycopy(this.a, 0, a0VarArr, 0, this.b);
        this.a = a0VarArr;
        this.c = false;
    }

    public int f() {
        return this.b;
    }

    public a0[] g() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        a0[] a0VarArr = this.a;
        if (a0VarArr.length == i) {
            this.c = true;
            return a0VarArr;
        }
        a0[] a0VarArr2 = new a0[i];
        System.arraycopy(a0VarArr, 0, a0VarArr2, 0, i);
        return a0VarArr2;
    }

    public b0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.a = i == 0 ? d : new a0[i];
        this.b = 0;
        this.c = false;
    }
}
