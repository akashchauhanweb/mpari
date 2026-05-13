package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class dy4 {
    public mw3 a = null;
    public z22 b = null;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public p80 j = null;

    public static boolean j(int i) {
        return i >= 0 && i < 8;
    }

    public z22 a() {
        return this.b;
    }

    public int b() {
        return this.e;
    }

    public p80 c() {
        return this.j;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.c;
    }

    public boolean i() {
        int i;
        p80 p80Var;
        return (this.a == null || this.b == null || this.c == -1 || this.d == -1 || (i = this.e) == -1 || this.f == -1 || this.g == -1 || this.h == -1 || this.i == -1 || !j(i) || this.f != this.g + this.h || (p80Var = this.j) == null || this.d != p80Var.f() || this.j.f() != this.j.d()) ? false : true;
    }

    public void k(z22 z22Var) {
        this.b = z22Var;
    }

    public void l(int i) {
        this.e = i;
    }

    public void m(p80 p80Var) {
        this.j = p80Var;
    }

    public void n(int i) {
        this.d = i;
    }

    public void o(mw3 mw3Var) {
        this.a = mw3Var;
    }

    public void p(int i) {
        this.g = i;
    }

    public void q(int i) {
        this.h = i;
    }

    public void r(int i) {
        this.i = i;
    }

    public void s(int i) {
        this.f = i;
    }

    public void t(int i) {
        this.c = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append("<<\n");
        stringBuffer.append(" mode: ");
        stringBuffer.append(this.a);
        stringBuffer.append("\n ecLevel: ");
        stringBuffer.append(this.b);
        stringBuffer.append("\n version: ");
        stringBuffer.append(this.c);
        stringBuffer.append("\n matrixWidth: ");
        stringBuffer.append(this.d);
        stringBuffer.append("\n maskPattern: ");
        stringBuffer.append(this.e);
        stringBuffer.append("\n numTotalBytes: ");
        stringBuffer.append(this.f);
        stringBuffer.append("\n numDataBytes: ");
        stringBuffer.append(this.g);
        stringBuffer.append("\n numECBytes: ");
        stringBuffer.append(this.h);
        stringBuffer.append("\n numRSBlocks: ");
        stringBuffer.append(this.i);
        if (this.j == null) {
            stringBuffer.append("\n matrix: null\n");
        } else {
            stringBuffer.append("\n matrix:\n");
            stringBuffer.append(this.j.toString());
        }
        stringBuffer.append(">>\n");
        return stringBuffer.toString();
    }
}
