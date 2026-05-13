package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class t20 implements PrivateKey {
    public transient s08 c;
    public transient p0 e;
    public transient z0 f;

    public t20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.f = sv4Var.z();
        this.e = e08.B(sv4Var.D().D()).D().z();
        this.c = (s08) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t20)) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return this.e.a0(t20Var.e) && wx.a(this.c.c(), t20Var.c.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return tv4.a(this.c, this.f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.e.hashCode() + (wx.k(this.c.c()) * 37);
    }
}
