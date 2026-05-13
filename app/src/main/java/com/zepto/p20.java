package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class p20 implements PrivateKey, Key {
    public transient p0 c;
    public transient pg5 e;
    public transient z0 f;

    public p20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.f = sv4Var.z();
        this.c = ng5.z(sv4Var.D().D()).B().z();
        this.e = (pg5) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return this.c.a0(p20Var.c) && wx.a(this.e.b(), p20Var.e.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.e.a() != null ? tv4.a(this.e, this.f) : new sv4(new eo(hk4.r, new ng5(new eo(this.c))), new z41(this.e.b()), this.f)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.c.hashCode() + (wx.k(this.e.b()) * 37);
    }
}
