package com.zepto;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b1 {
    public final InputStream a;
    public final int b;
    public final byte[][] c;

    public b1(InputStream inputStream, int i, byte[][] bArr) {
        this.a = inputStream;
        this.b = i;
        this.c = bArr;
    }

    public a0 a(int i) throws IOException {
        i(false);
        int iU = j0.U(this.a, i);
        int iD = j0.D(this.a, this.b, iU == 3 || iU == 4 || iU == 16 || iU == 17 || iU == 8);
        if (iD < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            b1 b1Var = new b1(new jy2(this.a, this.b), this.b, this.c);
            int i2 = i & 192;
            return i2 != 0 ? 64 == i2 ? new b30(iU, b1Var) : new m30(i2, iU, b1Var) : b1Var.e(iU);
        }
        xg1 xg1Var = new xg1(this.a, iD, this.b);
        if ((i & 224) == 0) {
            return f(iU, xg1Var);
        }
        b1 b1Var2 = new b1(xg1Var, xg1Var.d(), this.c);
        int i3 = i & 192;
        if (i3 == 0) {
            return b1Var2.d(iU);
        }
        boolean z = (i & 32) != 0;
        return 64 == i3 ? (o51) b1Var2.b(i3, iU, z) : new tb1(i3, iU, z, b1Var2);
    }

    public u0 b(int i, int i2, boolean z) {
        return !z ? e1.j0(i, i2, ((xg1) this.a).n()) : e1.h0(i, i2, h());
    }

    public u0 c(int i, int i2) {
        return e1.i0(i, i2, h());
    }

    public a0 d(int i) throws d0 {
        if (i == 3) {
            return new d30(this);
        }
        if (i == 4) {
            return new g30(this);
        }
        if (i == 8) {
            return new s41(this);
        }
        if (i == 16) {
            return new ga1(this);
        }
        if (i == 17) {
            return new qb1(this);
        }
        throw new d0("unknown DL object encountered: 0x" + Integer.toHexString(i));
    }

    public a0 e(int i) throws d0 {
        if (i == 3) {
            return new d30(this);
        }
        if (i == 4) {
            return new g30(this);
        }
        if (i == 8) {
            return new s41(this);
        }
        if (i == 16) {
            return new i30(this);
        }
        if (i == 17) {
            return new k30(this);
        }
        throw new d0("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    public a0 f(int i, xg1 xg1Var) throws d0 {
        if (i == 3) {
            return new q51(xg1Var);
        }
        if (i == 4) {
            return new a51(xg1Var);
        }
        if (i == 8) {
            throw new d0("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new d0("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new d0("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return j0.m(i, xg1Var, this.c);
        } catch (IllegalArgumentException e) {
            throw new d0("corrupted stream detected", e);
        }
    }

    public a0 g() throws IOException {
        int i = this.a.read();
        if (i < 0) {
            return null;
        }
        return a(i);
    }

    public b0 h() throws IOException {
        int i = this.a.read();
        if (i < 0) {
            return new b0(0);
        }
        b0 b0Var = new b0();
        do {
            a0 a0VarA = a(i);
            b0Var.a(a0VarA instanceof ey2 ? ((ey2) a0VarA).r() : a0VarA.m());
            i = this.a.read();
        } while (i >= 0);
        return b0Var;
    }

    public final void i(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof jy2) {
            ((jy2) inputStream).m(z);
        }
    }
}
