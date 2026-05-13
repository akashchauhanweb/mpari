package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class yd6 {
    public String a;
    public char[] b;
    public int c;

    public yd6() {
        this(16);
    }

    public void a(char c) {
        f(this.c + 1);
        char[] cArr = this.b;
        int i = this.c;
        this.c = i + 1;
        cArr[i] = c;
    }

    public void b(yd6 yd6Var) {
        d(yd6Var.b, 0, yd6Var.c);
    }

    public void c(String str) {
        f(this.c + str.length());
        str.getChars(0, str.length(), this.b, this.c);
        this.c += str.length();
    }

    public void d(char[] cArr, int i, int i2) {
        f(this.c + i2);
        System.arraycopy(cArr, i, this.b, this.c, i2);
        this.c += i2;
    }

    public void e() {
        this.a = null;
        this.c = 0;
    }

    public void f(int i) {
        char[] cArr = this.b;
        if (cArr.length < i) {
            char[] cArr2 = new char[Math.max(i, cArr.length * 2)];
            System.arraycopy(this.b, 0, cArr2, 0, this.c);
            this.b = cArr2;
        }
    }

    public int g() {
        return this.c;
    }

    public String toString() {
        return new String(this.b, 0, this.c);
    }

    public yd6(int i) {
        this.b = new char[i];
    }
}
