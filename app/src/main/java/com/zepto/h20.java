package com.zepto;

import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class h20 implements mk0, PublicKey {
    public pr3 c;

    public h20(pr3 pr3Var) {
        this.c = pr3Var;
    }

    public ii2 a() {
        return this.c.b();
    }

    public int b() {
        return this.c.c();
    }

    public int c() {
        return this.c.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return this.c.c() == h20Var.b() && this.c.d() == h20Var.c() && this.c.b().equals(h20Var.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new o86(new eo(hk4.n), new or3(this.c.c(), this.c.d(), this.c.b(), rt6.a(this.c.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.c.c() + (this.c.d() * 37)) * 37) + this.c.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.c.c() + "\n") + " error correction capability: " + this.c.d() + "\n") + " generator matrix           : " + this.c.b().toString();
    }
}
