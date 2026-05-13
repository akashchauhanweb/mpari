package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class l20 implements Key, PublicKey {
    public transient k14 c;

    public l20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        this.c = (k14) wx4.a(o86Var);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof l20)) {
            return false;
        }
        return wx.a(this.c.a(), ((l20) obj).c.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
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
        return wx.k(this.c.a());
    }
}
