package com.zepto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class iv0 implements Serializable {
    public static final iv0 e = new iv0("DEF");
    public final String c;

    public iv0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.c = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof iv0) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return this.c;
    }
}
