package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class k08 extends g08 implements u12 {
    public final i08 f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public volatile long k;
    public volatile y20 l;

    public static class b {
        public final i08 a;
        public long b = 0;
        public long c = -1;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public byte[] g = null;
        public y20 h = null;
        public byte[] i = null;
        public q08 j = null;

        public b(i08 i08Var) {
            this.a = i08Var;
        }

        public k08 k() {
            return new k08(this);
        }

        public b l(y20 y20Var) {
            if (y20Var.b() == 0) {
                this.h = new y20(y20Var, (1 << this.a.a()) - 1);
            } else {
                this.h = y20Var;
            }
            return this;
        }

        public b m(long j) {
            this.b = j;
            return this;
        }

        public b n(long j) {
            this.c = j;
            return this;
        }

        public b o(byte[] bArr) {
            this.f = v08.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.g = v08.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.e = v08.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.d = v08.c(bArr);
            return this;
        }
    }

    public k08(b bVar) {
        super(true, bVar.a.e());
        i08 i08Var = bVar.a;
        this.f = i08Var;
        if (i08Var == null) {
            throw new NullPointerException("params == null");
        }
        int iF = i08Var.f();
        byte[] bArr = bVar.i;
        if (bArr != null) {
            if (bVar.j == null) {
                throw new NullPointerException("xmss == null");
            }
            int iA = i08Var.a();
            int i = (iA + 7) / 8;
            this.k = v08.a(bArr, 0, i);
            if (!v08.l(iA, this.k)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.g = v08.g(bArr, i, iF);
            int i2 = i + iF;
            this.h = v08.g(bArr, i2, iF);
            int i3 = i2 + iF;
            this.i = v08.g(bArr, i3, iF);
            int i4 = i3 + iF;
            this.j = v08.g(bArr, i4, iF);
            int i5 = i4 + iF;
            try {
                this.l = ((y20) v08.f(v08.g(bArr, i5, bArr.length - i5), y20.class)).f(bVar.j.g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        this.k = bVar.b;
        byte[] bArr2 = bVar.d;
        if (bArr2 == null) {
            this.g = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.g = bArr2;
        }
        byte[] bArr3 = bVar.e;
        if (bArr3 == null) {
            this.h = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.h = bArr3;
        }
        byte[] bArr4 = bVar.f;
        if (bArr4 == null) {
            this.i = new byte[iF];
        } else {
            if (bArr4.length != iF) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.i = bArr4;
        }
        byte[] bArr5 = bVar.g;
        if (bArr5 == null) {
            this.j = new byte[iF];
        } else {
            if (bArr5.length != iF) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.j = bArr5;
        }
        y20 y20Var = bVar.h;
        if (y20Var == null) {
            y20Var = (!v08.l(i08Var.a(), bVar.b) || bArr4 == null || bArr2 == null) ? new y20(bVar.c + 1) : new y20(i08Var, bVar.b, bArr4, bArr2);
        }
        this.l = y20Var;
        if (bVar.c >= 0 && bVar.c != this.l.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public i08 b() {
        return this.f;
    }

    public byte[] c() {
        byte[] bArrF;
        synchronized (this) {
            try {
                int iF = this.f.f();
                int iA = (this.f.a() + 7) / 8;
                byte[] bArr = new byte[iA + iF + iF + iF + iF];
                v08.e(bArr, v08.q(this.k, iA), 0);
                v08.e(bArr, this.g, iA);
                int i = iA + iF;
                v08.e(bArr, this.h, i);
                int i2 = i + iF;
                v08.e(bArr, this.i, i2);
                v08.e(bArr, this.j, i2 + iF);
                try {
                    bArrF = wx.f(bArr, v08.p(this.l));
                } catch (IOException e) {
                    throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrF;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        byte[] bArrC;
        synchronized (this) {
            bArrC = c();
        }
        return bArrC;
    }
}
