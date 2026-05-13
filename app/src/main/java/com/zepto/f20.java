package com.zepto;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public class f20 implements PublicKey, Key {
    public transient fa3 c;

    public f20(o86 o86Var) {
        a(o86Var);
    }

    public final void a(o86 o86Var) {
        this.c = (fa3) wx4.a(o86Var);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f20) {
            try {
                return wx.a(this.c.getEncoded(), ((f20) obj).c.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
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
            return wx.k(this.c.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
