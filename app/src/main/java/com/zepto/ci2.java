package com.zepto;

import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public class ci2 {
    public b70 a;
    public ei2 b;
    public di2 c;
    public boolean d;
    public boolean e;
    public int f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public int r;
    public int s;
    public long t;
    public byte[] u;
    public int v;
    public long w;
    public long x;

    public ci2(b70 b70Var) {
        this(b70Var, null);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public int b(byte[] bArr, int i) throws z03 {
        a();
        if (this.t == 0) {
            j();
        }
        int i2 = this.s;
        if (!this.d) {
            int i3 = this.f;
            if (i2 < i3) {
                throw new z03("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new nj4("Output buffer too short");
            }
        } else if (bArr.length - i < this.f + i2) {
            throw new nj4("Output buffer too short");
        }
        if (i2 > 0) {
            n(this.l, 0, i2, bArr, i);
        }
        long j = this.w;
        int i4 = this.v;
        long j2 = j + ((long) i4);
        this.w = j2;
        if (j2 > this.x) {
            if (i4 > 0) {
                f(this.o, this.u, 0, i4);
            }
            if (this.x > 0) {
                fi2.p(this.o, this.p);
            }
            long j3 = ((this.t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.c == null) {
                d50 d50Var = new d50();
                this.c = d50Var;
                d50Var.a(this.j);
            }
            this.c.b(j3, bArr2);
            fi2.i(this.o, bArr2);
            fi2.p(this.n, this.o);
        }
        byte[] bArr3 = new byte[16];
        vk4.i(this.w * 8, bArr3, 0);
        vk4.i(this.t * 8, bArr3, 8);
        d(this.n, bArr3);
        byte[] bArr4 = new byte[16];
        this.a.a(this.k, 0, bArr4, 0);
        fi2.p(bArr4, this.n);
        int i5 = this.f;
        byte[] bArr5 = new byte[i5];
        this.m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr, i + this.s, this.f);
            i2 += this.f;
        } else {
            int i6 = this.f;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.l, i2, bArr6, 0, i6);
            if (!wx.g(this.m, bArr6)) {
                throw new z03("mac check in GCM failed");
            }
        }
        o(false);
        return i2;
    }

    public final void c(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            f(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        fi2.p(bArr, bArr2);
        this.b.b(bArr);
    }

    public final void e(byte[] bArr, byte[] bArr2, int i) {
        fi2.q(bArr, bArr2, i);
        this.b.b(bArr);
    }

    public final void f(byte[] bArr, byte[] bArr2, int i, int i2) {
        fi2.r(bArr, bArr2, i, i2);
        this.b.b(bArr);
    }

    public final void g(byte[] bArr) {
        int i = this.r;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.r = i - 1;
        byte[] bArr2 = this.q;
        int i2 = (bArr2[15] & UByte.MAX_VALUE) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & UByte.MAX_VALUE);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & UByte.MAX_VALUE);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & UByte.MAX_VALUE));
        this.a.a(bArr2, 0, bArr, 0);
    }

    public int h(int i) {
        int i2 = i + this.s;
        if (this.d) {
            return i2 + this.f;
        }
        int i3 = this.f;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    public void i(boolean z, mk0 mk0Var) {
        byte[] bArr;
        this.d = z;
        this.m = null;
        this.e = true;
        if (!(mk0Var instanceof i)) {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        i iVar = (i) mk0Var;
        byte[] bArrD = iVar.d();
        this.i = iVar.a();
        int iC = iVar.c();
        if (iC < 32 || iC > 128 || iC % 8 != 0) {
            throw new IllegalArgumentException("Invalid value for MAC size: " + iC);
        }
        this.f = iC / 8;
        m63 m63VarB = iVar.b();
        this.l = new byte[z ? 16 : this.f + 16];
        if (bArrD == null || bArrD.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr = this.h) != null && wx.a(bArr, bArrD)) {
            if (m63VarB == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.g;
            if (bArr2 != null && wx.a(bArr2, m63VarB.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.h = bArrD;
        if (m63VarB != null) {
            this.g = m63VarB.a();
        }
        if (m63VarB != null) {
            this.a.c(true, m63VarB);
            byte[] bArr3 = new byte[16];
            this.j = bArr3;
            this.a.a(bArr3, 0, bArr3, 0);
            this.b.a(this.j);
            this.c = null;
        } else if (this.j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.k = bArr4;
        byte[] bArr5 = this.h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.k[15] = 1;
        } else {
            c(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            vk4.i(((long) this.h.length) * 8, bArr6, 8);
            d(this.k, bArr6);
        }
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = wx.d(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr7 = this.i;
        if (bArr7 != null) {
            k(bArr7, 0, bArr7.length);
        }
    }

    public final void j() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i = this.v;
        if (i > 0) {
            f(this.p, this.u, 0, i);
            this.x += (long) this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    public void k(byte[] bArr, int i, int i2) {
        a();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.u;
            int i4 = this.v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.v = i5;
            if (i5 == 16) {
                d(this.o, bArr2);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    public final void l(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new nj4("Output buffer too short");
        }
        if (this.t == 0) {
            j();
        }
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.d) {
            fi2.q(bArr3, bArr, i);
            d(this.n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            e(this.n, bArr, i);
            fi2.o(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.t += 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[LOOP:1: B:14:0x0031->B:15:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m(byte[] r8, int r9, int r10, byte[] r11, int r12) {
        /*
            r7 = this;
            r7.a()
            int r0 = r8.length
            int r0 = r0 - r9
            if (r0 < r10) goto L74
            boolean r0 = r7.d
            r1 = 16
            r2 = 0
            if (r0 == 0) goto L49
            int r0 = r7.s
            if (r0 == 0) goto L30
        L12:
            if (r10 <= 0) goto L30
            int r10 = r10 + (-1)
            byte[] r0 = r7.l
            int r3 = r7.s
            int r4 = r9 + 1
            r9 = r8[r9]
            r0[r3] = r9
            int r3 = r3 + 1
            r7.s = r3
            if (r3 != r1) goto L2e
            r7.l(r0, r2, r11, r12)
            r7.s = r2
            r0 = r1
            r9 = r4
            goto L31
        L2e:
            r9 = r4
            goto L12
        L30:
            r0 = r2
        L31:
            if (r10 < r1) goto L3f
            int r3 = r12 + r0
            r7.l(r8, r9, r11, r3)
            int r9 = r9 + 16
            int r10 = r10 + (-16)
            int r0 = r0 + 16
            goto L31
        L3f:
            if (r10 <= 0) goto L73
            byte[] r11 = r7.l
            java.lang.System.arraycopy(r8, r9, r11, r2, r10)
            r7.s = r10
            goto L73
        L49:
            r0 = r2
            r3 = r0
        L4b:
            if (r3 >= r10) goto L73
            byte[] r4 = r7.l
            int r5 = r7.s
            int r6 = r9 + r3
            r6 = r8[r6]
            r4[r5] = r6
            int r5 = r5 + 1
            r7.s = r5
            int r6 = r4.length
            if (r5 != r6) goto L70
            int r5 = r12 + r0
            r7.l(r4, r2, r11, r5)
            byte[] r4 = r7.l
            int r5 = r7.f
            java.lang.System.arraycopy(r4, r1, r4, r2, r5)
            int r4 = r7.f
            r7.s = r4
            int r0 = r0 + 16
        L70:
            int r3 = r3 + 1
            goto L4b
        L73:
            return r0
        L74:
            com.zepto.rd1 r8 = new com.zepto.rd1
            java.lang.String r9 = "Input buffer too short"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ci2.m(byte[], int, int, byte[], int):int");
    }

    public final void n(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        g(bArr3);
        if (this.d) {
            fi2.n(bArr, i, bArr3, 0, i2);
            f(this.n, bArr, i, i2);
        } else {
            f(this.n, bArr, i, i2);
            fi2.n(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.t += (long) i2;
    }

    public final void o(boolean z) {
        this.a.d();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = wx.d(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr = this.l;
        if (bArr != null) {
            wx.i(bArr, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            k(bArr2, 0, bArr2.length);
        }
    }

    public ci2(b70 b70Var, ei2 ei2Var) {
        if (b70Var.b() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        ei2Var = ei2Var == null ? new lc6() : ei2Var;
        this.a = b70Var;
        this.b = ei2Var;
    }
}
