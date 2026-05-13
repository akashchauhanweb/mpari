package com.zepto;

import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class j20 implements PublicKey {
    public wr3 c;

    public j20(wr3 wr3Var) {
        this.c = wr3Var;
    }

    public ii2 a() {
        return this.c.a();
    }

    public int b() {
        return this.c.b();
    }

    public int c() {
        return this.c.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return this.c.b() == j20Var.b() && this.c.c() == j20Var.c() && this.c.a().equals(j20Var.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new o86(new eo(hk4.m), new vr3(this.c.b(), this.c.c(), this.c.a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.c.b() + (this.c.c() * 37)) * 37) + this.c.a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.c.b() + "\n") + " error correction capability: " + this.c.c() + "\n") + " generator matrix           : " + this.c.a();
    }
}
