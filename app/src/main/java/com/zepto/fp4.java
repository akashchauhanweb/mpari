package com.zepto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class fp4 {
    public static final byte[] e;
    public static final byte[] f;
    public static final int g;
    public int a;
    public int b;
    public rp4 c;
    public pq4 d;

    static {
        byte[] bArrF = wt1.f(" obj\n");
        e = bArrF;
        byte[] bArrF2 = wt1.f("\nendobj\n");
        f = bArrF2;
        g = bArrF.length + bArrF2.length;
    }

    public fp4(int i, rp4 rp4Var, pq4 pq4Var) {
        this(i, 0, rp4Var, pq4Var);
    }

    public gp4 a() {
        return new gp4(this.c.l(), this.a, this.b);
    }

    public void b(OutputStream outputStream) {
        outputStream.write(wt1.f(String.valueOf(this.a)));
        outputStream.write(32);
        outputStream.write(wt1.f(String.valueOf(this.b)));
        outputStream.write(e);
        this.c.k(this.d, outputStream);
        outputStream.write(f);
    }

    public fp4(int i, int i2, rp4 rp4Var, pq4 pq4Var) {
        this.d = pq4Var;
        this.a = i;
        this.b = i2;
        this.c = rp4Var;
        if (pq4Var != null) {
            pq4Var.A();
        }
    }
}
