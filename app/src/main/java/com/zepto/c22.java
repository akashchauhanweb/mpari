package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class c22 {
    public final String a;

    public c22(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public static c22 b(String str) {
        return new c22(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c22) {
            return this.a.equals(((c22) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
