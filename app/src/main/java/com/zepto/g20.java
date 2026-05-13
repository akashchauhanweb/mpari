package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class g20 implements PrivateKey {
    public nr3 c;

    public g20(nr3 nr3Var) {
        this.c = nr3Var;
    }

    public ji2 a() {
        return this.c.b();
    }

    public rs4 b() {
        return this.c.c();
    }

    public ii2 c() {
        return this.c.d();
    }

    public int d() {
        return this.c.e();
    }

    public int e() {
        return this.c.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g20)) {
            return false;
        }
        g20 g20Var = (g20) obj;
        return e() == g20Var.e() && d() == g20Var.d() && a().equals(g20Var.a()) && b().equals(g20Var.b()) && f().equals(g20Var.f()) && c().equals(g20Var.c());
    }

    public dr4 f() {
        return this.c.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new sv4(new eo(hk4.n), new mr3(e(), d(), a(), b(), f(), rt6.a(this.c.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.c.e() * 37) + this.c.f()) * 37) + this.c.b().hashCode()) * 37) + this.c.c().hashCode()) * 37) + this.c.g().hashCode()) * 37) + this.c.d().hashCode();
    }
}
