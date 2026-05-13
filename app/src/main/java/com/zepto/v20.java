package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class v20 implements PrivateKey {
    public transient gy4 c;
    public transient z0 e;

    public v20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.e = sv4Var.z();
        this.c = (gy4) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return this.c.b() == v20Var.c.b() && wx.a(this.c.a(), v20Var.c.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return iy4.a(this.c.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return tv4.a(this.c, this.e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.c.b() + (wx.k(this.c.a()) * 37);
    }
}
