package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public final class m08 extends g08 implements u12 {
    public final i08 f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public static class b {
        public final i08 a;
        public byte[] b = null;
        public byte[] c = null;
        public byte[] d = null;

        public b(i08 i08Var) {
            this.a = i08Var;
        }

        public m08 e() {
            return new m08(this);
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

    public m08(b bVar) {
        super(false, bVar.a.e());
        i08 i08Var = bVar.a;
        this.f = i08Var;
        if (i08Var == null) {
            throw new NullPointerException("params == null");
        }
        int iF = i08Var.f();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length == iF + iF) {
                this.g = 0;
                this.h = v08.g(bArr, 0, iF);
                this.i = v08.g(bArr, iF, iF);
                return;
            } else {
                if (bArr.length != iF + 4 + iF) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.g = vk4.a(bArr, 0);
                this.h = v08.g(bArr, 4, iF);
                this.i = v08.g(bArr, 4 + iF, iF);
                return;
            }
        }
        if (i08Var.d() != null) {
            this.g = i08Var.d().a();
        } else {
            this.g = 0;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.h = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.h = bArr2;
        }
        byte[] bArr3 = bVar.c;
        if (bArr3 == null) {
            this.i = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.i = bArr3;
        }
    }

    public i08 b() {
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
        int iF = this.f.f();
        int i = this.g;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[iF + 4 + iF];
            vk4.d(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[iF + iF];
        }
        v08.e(bArr, this.h, i2);
        v08.e(bArr, this.i, i2 + iF);
        return bArr;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        return e();
    }
}
