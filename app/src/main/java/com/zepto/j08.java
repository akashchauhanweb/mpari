package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class j08 extends n0 {
    public final int c;
    public final long e;
    public final long f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;

    public j08(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = 0;
        this.e = j;
        this.g = wx.d(bArr);
        this.h = wx.d(bArr2);
        this.i = wx.d(bArr3);
        this.j = wx.d(bArr4);
        this.k = wx.d(bArr5);
        this.f = -1L;
    }

    public static j08 D(Object obj) {
        if (obj instanceof j08) {
            return (j08) obj;
        }
        if (obj != null) {
            return new j08(x0.i0(obj));
        }
        return null;
    }

    public long B() {
        return this.e;
    }

    public long O() {
        return this.f;
    }

    public byte[] P() {
        return wx.d(this.i);
    }

    public byte[] T() {
        return wx.d(this.j);
    }

    public byte[] a0() {
        return wx.d(this.h);
    }

    public byte[] d0() {
        return wx.d(this.g);
    }

    public int e0() {
        return this.c;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(this.f >= 0 ? new k0(1L) : new k0(0L));
        b0 b0Var2 = new b0();
        b0Var2.a(new k0(this.e));
        b0Var2.a(new z41(this.g));
        b0Var2.a(new z41(this.h));
        b0Var2.a(new z41(this.i));
        b0Var2.a(new z41(this.j));
        if (this.f >= 0) {
            b0Var2.a(new g51(false, 0, new k0(this.f)));
        }
        b0Var.a(new d51(b0Var2));
        b0Var.a(new g51(true, 0, new z41(this.k)));
        return new d51(b0Var);
    }

    public byte[] z() {
        return wx.d(this.k);
    }

    public j08(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.c = 1;
        this.e = j;
        this.g = wx.d(bArr);
        this.h = wx.d(bArr2);
        this.i = wx.d(bArr3);
        this.j = wx.d(bArr4);
        this.k = wx.d(bArr5);
        this.f = j2;
    }

    public j08(x0 x0Var) {
        long jP0;
        k0 k0VarI0 = k0.i0(x0Var.j0(0));
        if (!k0VarI0.k0(0) && !k0VarI0.k0(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.c = k0VarI0.m0();
        if (x0Var.size() != 2 && x0Var.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        x0 x0VarI0 = x0.i0(x0Var.j0(1));
        this.e = k0.i0(x0VarI0.j0(0)).p0();
        this.g = wx.d(q0.i0(x0VarI0.j0(1)).j0());
        this.h = wx.d(q0.i0(x0VarI0.j0(2)).j0());
        this.i = wx.d(q0.i0(x0VarI0.j0(3)).j0());
        this.j = wx.d(q0.i0(x0VarI0.j0(4)).j0());
        if (x0VarI0.size() == 6) {
            e1 e1VarN0 = e1.n0(x0VarI0.j0(5));
            if (e1VarN0.q0() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            jP0 = k0.h0(e1VarN0, false).p0();
        } else {
            if (x0VarI0.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            jP0 = -1;
        }
        this.f = jP0;
        if (x0Var.size() == 3) {
            this.k = wx.d(q0.h0(e1.n0(x0Var.j0(2)), true).j0());
        } else {
            this.k = null;
        }
    }
}
