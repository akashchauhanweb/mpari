package com.zepto;

import java.io.IOException;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class r20 implements PrivateKey {
    public transient p0 c;
    public transient k08 e;
    public transient z0 f;

    public r20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.f = sv4Var.z();
        this.c = h08.B(sv4Var.D().D()).O().z();
        this.e = (k08) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r20)) {
            return false;
        }
        r20 r20Var = (r20) obj;
        return this.c.a0(r20Var.c) && wx.a(this.e.c(), r20Var.e.c());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return tv4.a(this.e, this.f).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.c.hashCode() + (wx.k(this.e.c()) * 37);
    }
}
