package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class q20 implements PublicKey, Key {
    public transient p0 c;
    public transient qg5 e;

    public q20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        this.c = ng5.z(o86Var.z().D()).B().z();
        this.e = (qg5) wx4.a(o86Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return this.c.a0(q20Var.c) && wx.a(this.e.b(), q20Var.e.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return (this.e.a() != null ? p86.a(this.e) : new o86(new eo(hk4.r, new ng5(new eo(this.c))), this.e.b())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.c.hashCode() + (wx.k(this.e.b()) * 37);
    }
}
