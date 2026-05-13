package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class i20 implements mk0, PrivateKey {
    public ur3 c;

    public i20(ur3 ur3Var) {
        this.c = ur3Var;
    }

    public ji2 a() {
        return this.c.a();
    }

    public rs4 b() {
        return this.c.b();
    }

    public int c() {
        return this.c.c();
    }

    public int d() {
        return this.c.d();
    }

    public dr4 e() {
        return this.c.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return d() == i20Var.d() && c() == i20Var.c() && a().equals(i20Var.a()) && b().equals(i20Var.b()) && g().equals(i20Var.g()) && e().equals(i20Var.e()) && f().equals(i20Var.f());
    }

    public dr4 f() {
        return this.c.f();
    }

    public ii2 g() {
        return this.c.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new sv4(new eo(hk4.m), new tr3(this.c.d(), this.c.c(), this.c.a(), this.c.b(), this.c.e(), this.c.f(), this.c.g())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.c.c() * 37) + this.c.d()) * 37) + this.c.a().hashCode()) * 37) + this.c.b().hashCode()) * 37) + this.c.e().hashCode()) * 37) + this.c.f().hashCode()) * 37) + this.c.g().hashCode();
    }
}
