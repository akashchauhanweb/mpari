package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class e20 implements PrivateKey, Key {
    public transient fa3 c;
    public transient z0 e;

    public e20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.e = sv4Var.z();
        this.c = (fa3) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e20)) {
            return false;
        }
        try {
            return wx.a(this.c.getEncoded(), ((e20) obj).c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
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
        try {
            return wx.k(this.c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
