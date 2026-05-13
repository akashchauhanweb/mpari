package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class r08 extends n0 {
    public final int c;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final int j;
    public final byte[] k;

    public r08(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = 0;
        this.e = i;
        this.f = wx.d(bArr);
        this.g = wx.d(bArr2);
        this.h = wx.d(bArr3);
        this.i = wx.d(bArr4);
        this.k = wx.d(bArr5);
        this.j = -1;
    }

    public static r08 B(Object obj) {
        if (obj instanceof r08) {
            return (r08) obj;
        }
        if (obj != null) {
            return new r08(x0.i0(obj));
        }
        return null;
    }

    public int D() {
        return this.j;
    }

    public byte[] O() {
        return wx.d(this.h);
    }

    public byte[] P() {
        return wx.d(this.i);
    }

    public byte[] T() {
        return wx.d(this.g);
    }

    public byte[] a0() {
        return wx.d(this.f);
    }

    public int d0() {
        return this.c;
    }

    public int getIndex() {
        return this.e;
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        b0Var.a(this.j >= 0 ? new k0(1L) : new k0(0L));
        b0 b0Var2 = new b0();
        b0Var2.a(new k0(this.e));
        b0Var2.a(new z41(this.f));
        b0Var2.a(new z41(this.g));
        b0Var2.a(new z41(this.h));
        b0Var2.a(new z41(this.i));
        if (this.j >= 0) {
            b0Var2.a(new g51(false, 0, new k0(this.j)));
        }
        b0Var.a(new d51(b0Var2));
        b0Var.a(new g51(true, 0, new z41(this.k)));
        return new d51(b0Var);
    }

    public byte[] z() {
        return wx.d(this.k);
    }

    public r08(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.c = 1;
        this.e = i;
        this.f = wx.d(bArr);
        this.g = wx.d(bArr2);
        this.h = wx.d(bArr3);
        this.i = wx.d(bArr4);
        this.k = wx.d(bArr5);
        this.j = i2;
    }

    public r08(x0 x0Var) {
        int iM0;
        k0 k0VarI0 = k0.i0(x0Var.j0(0));
        if (!k0VarI0.k0(0) && !k0VarI0.k0(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.c = k0VarI0.m0();
        if (x0Var.size() != 2 && x0Var.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        x0 x0VarI0 = x0.i0(x0Var.j0(1));
        this.e = k0.i0(x0VarI0.j0(0)).m0();
        this.f = wx.d(q0.i0(x0VarI0.j0(1)).j0());
        this.g = wx.d(q0.i0(x0VarI0.j0(2)).j0());
        this.h = wx.d(q0.i0(x0VarI0.j0(3)).j0());
        this.i = wx.d(q0.i0(x0VarI0.j0(4)).j0());
        if (x0VarI0.size() == 6) {
            e1 e1VarN0 = e1.n0(x0VarI0.j0(5));
            if (e1VarN0.q0() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            iM0 = k0.h0(e1VarN0, false).m0();
        } else {
            if (x0VarI0.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            iM0 = -1;
        }
        this.j = iM0;
        if (x0Var.size() == 3) {
            this.k = wx.d(q0.h0(e1.n0(x0Var.j0(2)), true).j0());
        } else {
            this.k = null;
        }
    }
}
