package com.zepto;

import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class u20 implements PublicKey {
    public transient u08 c;
    public transient p0 e;

    public u20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        u08 u08Var = (u08) wx4.a(o86Var);
        this.c = u08Var;
        this.e = zj1.a(u08Var.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u20) {
            u20 u20Var = (u20) obj;
            try {
                if (this.e.a0(u20Var.e)) {
                    if (wx.a(this.c.getEncoded(), u20Var.c.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
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
        try {
            return this.e.hashCode() + (wx.k(this.c.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.e.hashCode();
        }
    }
}
