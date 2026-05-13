package com.zepto;

import com.zepto.pe4;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class s08 extends d08 implements u12 {
    public final q08 f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public volatile x20 k;

    public static class b {
        public final q08 a;
        public int b = 0;
        public int c = -1;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public byte[] g = null;
        public x20 h = null;
        public byte[] i = null;

        public b(q08 q08Var) {
            this.a = q08Var;
        }

        public s08 j() {
            return new s08(this);
        }

        public b k(x20 x20Var) {
            this.h = x20Var;
            return this;
        }

        public b l(int i) {
            this.b = i;
            return this;
        }

        public b m(int i) {
            this.c = i;
            return this;
        }

        public b n(byte[] bArr) {
            this.f = v08.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.g = v08.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.e = v08.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.d = v08.c(bArr);
            return this;
        }
    }

    public s08(b bVar) {
        super(true, bVar.a.f());
        q08 q08Var = bVar.a;
        this.f = q08Var;
        if (q08Var == null) {
            throw new NullPointerException("params == null");
        }
        int iH = q08Var.h();
        byte[] bArr = bVar.i;
        if (bArr != null) {
            int iB = q08Var.b();
            int iA = vk4.a(bArr, 0);
            if (!v08.l(iB, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.g = v08.g(bArr, 4, iH);
            int i = 4 + iH;
            this.h = v08.g(bArr, i, iH);
            int i2 = i + iH;
            this.i = v08.g(bArr, i2, iH);
            int i3 = i2 + iH;
            this.j = v08.g(bArr, i3, iH);
            int i4 = i3 + iH;
            try {
                x20 x20Var = (x20) v08.f(v08.g(bArr, i4, bArr.length - i4), x20.class);
                if (x20Var.b() != iA) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.k = x20Var.h(bVar.a.g());
                return;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        byte[] bArr2 = bVar.d;
        if (bArr2 == null) {
            this.g = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.g = bArr2;
        }
        byte[] bArr3 = bVar.e;
        if (bArr3 == null) {
            this.h = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.h = bArr3;
        }
        byte[] bArr4 = bVar.f;
        if (bArr4 == null) {
            this.i = new byte[iH];
        } else {
            if (bArr4.length != iH) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.i = bArr4;
        }
        byte[] bArr5 = bVar.g;
        if (bArr5 == null) {
            this.j = new byte[iH];
        } else {
            if (bArr5.length != iH) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.j = bArr5;
        }
        x20 x20Var2 = bVar.h;
        this.k = x20Var2 == null ? (bVar.b >= (1 << q08Var.b()) + (-2) || bArr4 == null || bArr2 == null) ? new x20(q08Var, (1 << q08Var.b()) - 1, bVar.b) : new x20(q08Var, bArr4, bArr2, (pe4) new pe4.b().l(), bVar.b) : x20Var2;
        if (bVar.c >= 0 && bVar.c != this.k.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public q08 b() {
        return this.f;
    }

    public byte[] c() {
        byte[] bArrF;
        synchronized (this) {
            try {
                int iH = this.f.h();
                byte[] bArr = new byte[iH + 4 + iH + iH + iH];
                vk4.d(this.k.b(), bArr, 0);
                v08.e(bArr, this.g, 4);
                int i = 4 + iH;
                v08.e(bArr, this.h, i);
                int i2 = i + iH;
                v08.e(bArr, this.i, i2);
                v08.e(bArr, this.j, i2 + iH);
                try {
                    bArrF = wx.f(bArr, v08.p(this.k));
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
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
