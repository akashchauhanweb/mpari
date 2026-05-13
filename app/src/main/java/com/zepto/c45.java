package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class c45 extends n0 {
    public k0 c;
    public p0 e;
    public byte[][] f;
    public byte[] g;
    public byte[][] h;
    public byte[] i;
    public byte[] j;
    public cb3[] k;

    public c45(x0 x0Var) {
        int i = 0;
        if (x0Var.j0(0) instanceof k0) {
            this.c = k0.i0(x0Var.j0(0));
        } else {
            this.e = p0.l0(x0Var.j0(0));
        }
        x0 x0Var2 = (x0) x0Var.j0(1);
        this.f = new byte[x0Var2.size()][];
        for (int i2 = 0; i2 < x0Var2.size(); i2++) {
            this.f[i2] = ((q0) x0Var2.j0(i2)).j0();
        }
        this.g = ((q0) ((x0) x0Var.j0(2)).j0(0)).j0();
        x0 x0Var3 = (x0) x0Var.j0(3);
        this.h = new byte[x0Var3.size()][];
        for (int i3 = 0; i3 < x0Var3.size(); i3++) {
            this.h[i3] = ((q0) x0Var3.j0(i3)).j0();
        }
        this.i = ((q0) ((x0) x0Var.j0(4)).j0(0)).j0();
        this.j = ((q0) ((x0) x0Var.j0(5)).j0(0)).j0();
        x0 x0Var4 = (x0) x0Var.j0(6);
        byte[][][][] bArr = new byte[x0Var4.size()][][][];
        byte[][][][] bArr2 = new byte[x0Var4.size()][][][];
        byte[][][] bArr3 = new byte[x0Var4.size()][][];
        byte[][] bArr4 = new byte[x0Var4.size()][];
        int i4 = 0;
        while (i4 < x0Var4.size()) {
            x0 x0Var5 = (x0) x0Var4.j0(i4);
            x0 x0Var6 = (x0) x0Var5.j0(i);
            bArr[i4] = new byte[x0Var6.size()][][];
            for (int i5 = i; i5 < x0Var6.size(); i5++) {
                x0 x0Var7 = (x0) x0Var6.j0(i5);
                bArr[i4][i5] = new byte[x0Var7.size()][];
                for (int i6 = 0; i6 < x0Var7.size(); i6++) {
                    bArr[i4][i5][i6] = ((q0) x0Var7.j0(i6)).j0();
                }
            }
            x0 x0Var8 = (x0) x0Var5.j0(1);
            bArr2[i4] = new byte[x0Var8.size()][][];
            for (int i7 = 0; i7 < x0Var8.size(); i7++) {
                x0 x0Var9 = (x0) x0Var8.j0(i7);
                bArr2[i4][i7] = new byte[x0Var9.size()][];
                for (int i8 = 0; i8 < x0Var9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((q0) x0Var9.j0(i8)).j0();
                }
            }
            x0 x0Var10 = (x0) x0Var5.j0(2);
            bArr3[i4] = new byte[x0Var10.size()][];
            for (int i9 = 0; i9 < x0Var10.size(); i9++) {
                bArr3[i4][i9] = ((q0) x0Var10.j0(i9)).j0();
            }
            bArr4[i4] = ((q0) x0Var5.j0(3)).j0();
            i4++;
            i = 0;
        }
        int length = this.j.length - 1;
        this.k = new cb3[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.j;
            int i11 = i10 + 1;
            this.k[i10] = new cb3(bArr5[i10], bArr5[i11], g45.f(bArr[i10]), g45.f(bArr2[i10]), g45.d(bArr3[i10]), g45.b(bArr4[i10]));
            i10 = i11;
        }
    }

    public static c45 D(Object obj) {
        if (obj instanceof c45) {
            return (c45) obj;
        }
        if (obj != null) {
            return new c45(x0.i0(obj));
        }
        return null;
    }

    public short[] B() {
        return g45.b(this.i);
    }

    public short[][] O() {
        return g45.d(this.f);
    }

    public short[][] P() {
        return g45.d(this.h);
    }

    public cb3[] T() {
        return this.k;
    }

    public int[] a0() {
        return g45.g(this.j);
    }

    @Override // com.zepto.n0, com.zepto.a0
    public u0 m() {
        b0 b0Var = new b0();
        a0 a0Var = this.c;
        if (a0Var == null) {
            a0Var = this.e;
        }
        b0Var.a(a0Var);
        b0 b0Var2 = new b0();
        for (int i = 0; i < this.f.length; i++) {
            b0Var2.a(new z41(this.f[i]));
        }
        b0Var.a(new d51(b0Var2));
        b0 b0Var3 = new b0();
        b0Var3.a(new z41(this.g));
        b0Var.a(new d51(b0Var3));
        b0 b0Var4 = new b0();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            b0Var4.a(new z41(this.h[i2]));
        }
        b0Var.a(new d51(b0Var4));
        b0 b0Var5 = new b0();
        b0Var5.a(new z41(this.i));
        b0Var.a(new d51(b0Var5));
        b0 b0Var6 = new b0();
        b0Var6.a(new z41(this.j));
        b0Var.a(new d51(b0Var6));
        b0 b0Var7 = new b0();
        for (int i3 = 0; i3 < this.k.length; i3++) {
            b0 b0Var8 = new b0();
            byte[][][] bArrE = g45.e(this.k[i3].a());
            b0 b0Var9 = new b0();
            for (int i4 = 0; i4 < bArrE.length; i4++) {
                b0 b0Var10 = new b0();
                for (int i5 = 0; i5 < bArrE[i4].length; i5++) {
                    b0Var10.a(new z41(bArrE[i4][i5]));
                }
                b0Var9.a(new d51(b0Var10));
            }
            b0Var8.a(new d51(b0Var9));
            byte[][][] bArrE2 = g45.e(this.k[i3].b());
            b0 b0Var11 = new b0();
            for (int i6 = 0; i6 < bArrE2.length; i6++) {
                b0 b0Var12 = new b0();
                for (int i7 = 0; i7 < bArrE2[i6].length; i7++) {
                    b0Var12.a(new z41(bArrE2[i6][i7]));
                }
                b0Var11.a(new d51(b0Var12));
            }
            b0Var8.a(new d51(b0Var11));
            byte[][] bArrC = g45.c(this.k[i3].d());
            b0 b0Var13 = new b0();
            for (byte[] bArr : bArrC) {
                b0Var13.a(new z41(bArr));
            }
            b0Var8.a(new d51(b0Var13));
            b0Var8.a(new z41(g45.a(this.k[i3].c())));
            b0Var7.a(new d51(b0Var8));
        }
        b0Var.a(new d51(b0Var7));
        return new d51(b0Var);
    }

    public short[] z() {
        return g45.b(this.g);
    }

    public c45(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, cb3[] cb3VarArr) {
        this.c = new k0(1L);
        this.f = g45.c(sArr);
        this.g = g45.a(sArr2);
        this.h = g45.c(sArr3);
        this.i = g45.a(sArr4);
        this.j = g45.h(iArr);
        this.k = cb3VarArr;
    }
}
