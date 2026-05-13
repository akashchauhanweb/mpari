package com.zepto;

import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class w20 implements PublicKey {
    public transient hy4 c;

    public w20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        this.c = (hy4) wx4.a(o86Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return this.c.b() == w20Var.c.b() && wx.a(this.c.a(), w20Var.c.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return iy4.a(this.c.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return p86.a(this.c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.c.b() + (wx.k(this.c.a()) * 37);
    }
}
