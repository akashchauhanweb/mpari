package com.zepto;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xm4 implements Serializable {
    public final a c;
    public final Map e;
    public final String f;
    public final byte[] g;
    public final h40 h;

    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public xm4(Map map) {
        if (map == null) {
            throw new IllegalArgumentException("The JSON object must not be null");
        }
        Map mapA = j33.a();
        this.e = mapA;
        mapA.putAll(map);
        this.f = null;
        this.g = null;
        this.h = null;
        this.c = a.JSON;
    }

    public static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, m66.a);
        }
        return null;
    }

    public static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(m66.a);
        }
        return null;
    }

    public byte[] c() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        h40 h40Var = this.h;
        return h40Var != null ? h40Var.a() : b(toString());
    }

    public String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        Map map = this.e;
        if (map != null) {
            return j33.b(map);
        }
        byte[] bArr = this.g;
        if (bArr != null) {
            return a(bArr);
        }
        h40 h40Var = this.h;
        if (h40Var != null) {
            return h40Var.b();
        }
        return null;
    }
}
