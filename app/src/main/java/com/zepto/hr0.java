package com.zepto;

import com.zepto.zs6;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr0 extends q80 {
    public static final Logger c = Logger.getLogger(hr0.class.getName());
    public static final boolean d = iq6.E();
    public ir0 a;
    public boolean b;

    public static class b extends hr0 {
        public final byte[] e;
        public final int f;
        public final int g;
        public int h;

        public b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.f = i;
            this.h = i;
            this.g = i3;
        }

        @Override // com.zepto.hr0
        public final void C0(int i, String str) throws c {
            D0(i, 2);
            M0(str);
        }

        @Override // com.zepto.hr0
        public final void D0(int i, int i2) throws c {
            F0(zw7.c(i, i2));
        }

        @Override // com.zepto.hr0
        public final void E0(int i, int i2) throws c {
            D0(i, 0);
            F0(i2);
        }

        @Override // com.zepto.hr0
        public final void F0(int i) throws c {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr2 = this.e;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.zepto.hr0
        public final void G0(int i, long j) throws c {
            D0(i, 0);
            H0(j);
        }

        @Override // com.zepto.hr0
        public final void H0(long j) throws c {
            if (hr0.d && W() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    iq6.K(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                iq6.K(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void I0(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void J0(s80 s80Var) throws c {
            F0(s80Var.size());
            s80Var.o0(this);
        }

        public final void K0(int i, at3 at3Var) throws c {
            D0(i, 2);
            L0(at3Var);
        }

        public final void L0(at3 at3Var) throws c {
            F0(at3Var.a());
            at3Var.c(this);
        }

        public final void M0(String str) throws c {
            int i = this.h;
            try {
                int iN = hr0.N(str.length() * 3);
                int iN2 = hr0.N(str.length());
                if (iN2 == iN) {
                    int i2 = i + iN2;
                    this.h = i2;
                    int iF = zs6.f(str, this.e, i2, W());
                    this.h = i;
                    F0((iF - i) - iN2);
                    this.h = iF;
                } else {
                    F0(zs6.g(str));
                    this.h = zs6.f(str, this.e, this.h, W());
                }
            } catch (zs6.d e) {
                this.h = i;
                S(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // com.zepto.hr0
        public final int W() {
            return this.g - this.h;
        }

        @Override // com.zepto.hr0
        public final void X(byte b) throws c {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.zepto.hr0
        public final void Y(int i, boolean z) throws c {
            D0(i, 0);
            X(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.zepto.hr0, com.zepto.q80
        public final void a(byte[] bArr, int i, int i2) throws c {
            I0(bArr, i, i2);
        }

        @Override // com.zepto.hr0
        public final void a0(int i, s80 s80Var) throws c {
            D0(i, 2);
            J0(s80Var);
        }

        @Override // com.zepto.hr0
        public final void f0(int i, int i2) throws c {
            D0(i, 5);
            g0(i2);
        }

        @Override // com.zepto.hr0
        public final void g0(int i) throws c {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i2 + 1] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i2 + 2] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.h = i2 + 4;
                bArr[i2 + 3] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.zepto.hr0
        public final void h0(int i, long j) throws c {
            D0(i, 1);
            i0(j);
        }

        @Override // com.zepto.hr0
        public final void i0(long j) throws c {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 1] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 2] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 3] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 4] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 5] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr[i + 6] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.h = i + 8;
                bArr[i + 7] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.zepto.hr0
        public final void n0(int i, int i2) throws c {
            D0(i, 0);
            o0(i2);
        }

        @Override // com.zepto.hr0
        public final void o0(int i) throws c {
            if (i >= 0) {
                F0(i);
            } else {
                H0(i);
            }
        }

        @Override // com.zepto.hr0
        public final void r0(int i, at3 at3Var, dp5 dp5Var) throws c {
            D0(i, 2);
            F0(((k2) at3Var).g(dp5Var));
            dp5Var.c(at3Var, this.a);
        }

        @Override // com.zepto.hr0
        public final void s0(int i, at3 at3Var) throws c {
            D0(1, 3);
            E0(2, i);
            K0(3, at3Var);
            D0(1, 4);
        }

        @Override // com.zepto.hr0
        public final void t0(int i, s80 s80Var) throws c {
            D0(1, 3);
            E0(2, i);
            a0(3, s80Var);
            D0(1, 4);
        }
    }

    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i, s80 s80Var) {
        return (L(1) * 2) + M(2, i) + f(3, s80Var);
    }

    public static int B(int i, int i2) {
        return L(i) + C(i2);
    }

    public static int C(int i) {
        return 4;
    }

    public static int D(int i, long j) {
        return L(i) + E(j);
    }

    public static int E(long j) {
        return 8;
    }

    public static int F(int i, int i2) {
        return L(i) + G(i2);
    }

    public static int G(int i) {
        return N(Q(i));
    }

    public static int H(int i, long j) {
        return L(i) + I(j);
    }

    public static int I(long j) {
        return P(R(j));
    }

    public static int J(int i, String str) {
        return L(i) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = zs6.g(str);
        } catch (zs6.d unused) {
            length = str.getBytes(x03.b).length;
        }
        return x(length);
    }

    public static int L(int i) {
        return N(zw7.c(i, 0));
    }

    public static int M(int i, int i2) {
        return L(i) + N(i2);
    }

    public static int N(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int O(int i, long j) {
        return L(i) + P(j);
    }

    public static int P(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int Q(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long R(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static hr0 U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static hr0 V(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int d(int i, boolean z) {
        return L(i) + e(z);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static int f(int i, s80 s80Var) {
        return L(i) + g(s80Var);
    }

    public static int g(s80 s80Var) {
        return x(s80Var.size());
    }

    public static int h(int i, double d2) {
        return L(i) + i(d2);
    }

    public static int i(double d2) {
        return 8;
    }

    public static int j(int i, int i2) {
        return L(i) + k(i2);
    }

    public static int k(int i) {
        return u(i);
    }

    public static int l(int i, int i2) {
        return L(i) + m(i2);
    }

    public static int m(int i) {
        return 4;
    }

    public static int n(int i, long j) {
        return L(i) + o(j);
    }

    public static int o(long j) {
        return 8;
    }

    public static int p(int i, float f) {
        return L(i) + q(f);
    }

    public static int q(float f) {
        return 4;
    }

    public static int r(int i, at3 at3Var, dp5 dp5Var) {
        return (L(i) * 2) + s(at3Var, dp5Var);
    }

    public static int s(at3 at3Var, dp5 dp5Var) {
        return ((k2) at3Var).g(dp5Var);
    }

    public static int t(int i, int i2) {
        return L(i) + u(i2);
    }

    public static int u(int i) {
        if (i >= 0) {
            return N(i);
        }
        return 10;
    }

    public static int v(int i, long j) {
        return L(i) + w(j);
    }

    public static int w(long j) {
        return P(j);
    }

    public static int x(int i) {
        return N(i) + i;
    }

    public static int y(int i, at3 at3Var, dp5 dp5Var) {
        return L(i) + z(at3Var, dp5Var);
    }

    public static int z(at3 at3Var, dp5 dp5Var) {
        return x(((k2) at3Var).g(dp5Var));
    }

    public final void A0(int i, long j) {
        G0(i, R(j));
    }

    public final void B0(long j) {
        H0(R(j));
    }

    public abstract void C0(int i, String str);

    public abstract void D0(int i, int i2);

    public abstract void E0(int i, int i2);

    public abstract void F0(int i);

    public abstract void G0(int i, long j);

    public abstract void H0(long j);

    public final void S(String str, zs6.d dVar) throws c {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(x03.b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        }
    }

    public boolean T() {
        return this.b;
    }

    public abstract int W();

    public abstract void X(byte b2);

    public abstract void Y(int i, boolean z);

    public final void Z(boolean z) {
        X(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.zepto.q80
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void a0(int i, s80 s80Var);

    public final void b0(int i, double d2) {
        h0(i, Double.doubleToRawLongBits(d2));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d2) {
        i0(Double.doubleToRawLongBits(d2));
    }

    public final void d0(int i, int i2) {
        n0(i, i2);
    }

    public final void e0(int i) {
        o0(i);
    }

    public abstract void f0(int i, int i2);

    public abstract void g0(int i);

    public abstract void h0(int i, long j);

    public abstract void i0(long j);

    public final void j0(int i, float f) {
        f0(i, Float.floatToRawIntBits(f));
    }

    public final void k0(float f) {
        g0(Float.floatToRawIntBits(f));
    }

    public final void l0(int i, at3 at3Var, dp5 dp5Var) {
        D0(i, 3);
        m0(at3Var, dp5Var);
        D0(i, 4);
    }

    public final void m0(at3 at3Var, dp5 dp5Var) {
        dp5Var.c(at3Var, this.a);
    }

    public abstract void n0(int i, int i2);

    public abstract void o0(int i);

    public final void p0(int i, long j) {
        G0(i, j);
    }

    public final void q0(long j) {
        H0(j);
    }

    public abstract void r0(int i, at3 at3Var, dp5 dp5Var);

    public abstract void s0(int i, at3 at3Var);

    public abstract void t0(int i, s80 s80Var);

    public final void u0(int i, int i2) {
        f0(i, i2);
    }

    public final void v0(int i) {
        g0(i);
    }

    public final void w0(int i, long j) {
        h0(i, j);
    }

    public final void x0(long j) {
        i0(j);
    }

    public final void y0(int i, int i2) {
        E0(i, Q(i2));
    }

    public final void z0(int i) {
        F0(Q(i));
    }

    public hr0() {
    }
}
