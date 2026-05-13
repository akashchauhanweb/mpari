package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class u08 extends d08 implements u12 {
    public final q08 f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public static class b {
        public final q08 a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(q08 q08Var) {
            this.a = q08Var;
        }

        public u08 e() {
            return new u08(this);
        }

        public b f(byte[] bArr) {
            this.d = v08.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.c = v08.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.b = v08.c(bArr);
            return this;
        }
    }

    public u08(b bVar) {
        super(false, bVar.a.f());
        q08 q08Var = bVar.a;
        this.f = q08Var;
        if (q08Var == null) {
            throw new NullPointerException("params == null");
        }
        int iH = q08Var.h();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length == iH + iH) {
                this.g = 0;
                this.h = v08.g(bArr, 0, iH);
                this.i = v08.g(bArr, iH, iH);
                return;
            } else {
                if (bArr.length != iH + 4 + iH) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.g = vk4.a(bArr, 0);
                this.h = v08.g(bArr, 4, iH);
                this.i = v08.g(bArr, 4 + iH, iH);
                return;
            }
        }
        if (q08Var.e() != null) {
            this.g = q08Var.e().a();
        } else {
            this.g = 0;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.h = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.h = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.i = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.i = bArr3;
        }
    }

    public q08 b() {
        return this.f;
    }

    public byte[] c() {
        return v08.c(this.i);
    }

    public byte[] d() {
        return v08.c(this.h);
    }

    public byte[] e() {
        byte[] bArr;
        int iH = this.f.h();
        int i = this.g;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[iH + 4 + iH];
            vk4.d(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[iH + iH];
        }
        v08.e(bArr, this.h, i2);
        v08.e(bArr, this.i, i2 + iH);
        return bArr;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        return e();
    }
}
