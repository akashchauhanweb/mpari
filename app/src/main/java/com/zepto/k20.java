package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes3.dex */
public class k20 implements Key, PrivateKey {
    public transient j14 c;
    public transient z0 e;

    public k20(sv4 sv4Var) {
        a(sv4Var);
    }

    public final void a(sv4 sv4Var) {
        this.e = sv4Var.z();
        this.c = (j14) rv4.b(sv4Var);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k20) {
            return wx.c(this.c.a(), ((k20) obj).c.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        return wx.o(this.c.a());
    }
}
