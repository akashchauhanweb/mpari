package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class zd6 {
    public yd6 a = new yd6();
    public yd6 b = new yd6();
    public yd6 c = new yd6();
    public bc2 d;
    public int e;

    public zd6(bc2 bc2Var) {
        this.d = bc2Var;
    }

    public void a() {
        this.b.e();
        this.c.e();
        this.a.e();
        this.e = 0;
    }

    public final void b() {
        while (true) {
            int i = this.e;
            yd6 yd6Var = this.a;
            if (i >= yd6Var.c) {
                break;
            }
            char[] cArr = yd6Var.b;
            this.e = i + 1;
            char c = cArr[i];
            if (c == '}') {
                e();
                break;
            }
            this.b.a(c);
        }
        if (this.b.g() > 0) {
            this.c.c("${");
            this.c.b(this.b);
        }
    }

    public final void c() {
        while (true) {
            int i = this.e;
            yd6 yd6Var = this.a;
            int i2 = yd6Var.c;
            if (i >= i2) {
                return;
            }
            char[] cArr = yd6Var.b;
            int i3 = i + 1;
            this.e = i3;
            char c = cArr[i];
            if (c == '$' && i3 < i2) {
                this.e = i + 2;
                if (cArr[i3] == '{') {
                    b();
                } else {
                    this.e = i + 1;
                }
            }
            this.c.a(c);
        }
    }

    public String d(String str) {
        if (str.indexOf(36) < 0) {
            return str;
        }
        try {
            this.a.c(str);
            c();
            return this.c.toString();
        } finally {
            a();
        }
    }

    public final void e() {
        if (this.b.g() > 0) {
            f(this.b);
        }
        this.b.e();
    }

    public final void f(yd6 yd6Var) {
        g(yd6Var.toString());
    }

    public final void g(String str) {
        String strA = this.d.a(str);
        if (strA != null) {
            this.c.c(strA);
            return;
        }
        this.c.c("${");
        this.c.c(str);
        this.c.c("}");
    }
}
