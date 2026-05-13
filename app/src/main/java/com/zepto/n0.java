package com.zepto;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 implements a0, u12 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return m().a0(((a0) obj).m());
        }
        return false;
    }

    @Override // com.zepto.u12
    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m().O(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return m().hashCode();
    }

    @Override // com.zepto.a0
    public abstract u0 m();

    public byte[] w(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m().P(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
