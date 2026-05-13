package com.zepto;

import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class s20 implements PublicKey {
    public transient p0 c;
    public transient m08 e;

    public s20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        m08 m08Var = (m08) wx4.a(o86Var);
        this.e = m08Var;
        this.c = zj1.a(m08Var.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj;
        return this.c.a0(s20Var.c) && wx.a(this.e.e(), s20Var.e.e());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return p86.a(this.e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.c.hashCode() + (wx.k(this.e.e()) * 37);
    }
}
