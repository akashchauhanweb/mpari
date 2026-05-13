package com.zepto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c40 implements Serializable {
    public final String c;

    public c40(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.c = str;
    }

    public byte[] a() {
        return f40.c(this.c);
    }

    public String b() {
        return new String(a(), m66.a);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return this.c;
    }
}
