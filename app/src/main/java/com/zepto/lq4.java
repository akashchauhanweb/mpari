package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public class lq4 {
    public static final byte[][] f = {wt1.f("\n"), wt1.f("%PDF-"), wt1.f("\n%âãÏÓ\n")};
    public boolean a = false;
    public boolean b = false;
    public char c = '4';
    public lp4 d = null;
    public uo4 e = null;

    public void a(uo4 uo4Var) {
        lp4 lp4Var = this.d;
        if (lp4Var != null) {
            uo4Var.r(lp4.Sa, lp4Var);
        }
        uo4 uo4Var2 = this.e;
        if (uo4Var2 != null) {
            uo4Var.r(lp4.K2, uo4Var2);
        }
    }

    public byte[] b(char c) {
        return wt1.f(c(c).toString().substring(1));
    }

    public lp4 c(char c) {
        switch (c) {
            case '2':
                return pq4.b0;
            case '3':
                return pq4.c0;
            case '4':
                return pq4.d0;
            case '5':
                return pq4.e0;
            case '6':
                return pq4.f0;
            case '7':
                return pq4.g0;
            default:
                return pq4.d0;
        }
    }

    public void d(sj4 sj4Var) {
        if (this.b) {
            sj4Var.write(f[0]);
            return;
        }
        byte[][] bArr = f;
        sj4Var.write(bArr[1]);
        sj4Var.write(b(this.c));
        sj4Var.write(bArr[2]);
        this.a = true;
    }
}
