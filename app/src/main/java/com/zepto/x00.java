package com.zepto;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x00 extends wl2 {
    public final String a;
    public final List b;

    public x00(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list;
    }

    @Override // com.zepto.wl2
    public List b() {
        return this.b;
    }

    @Override // com.zepto.wl2
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wl2)) {
            return false;
        }
        wl2 wl2Var = (wl2) obj;
        return this.a.equals(wl2Var.c()) && this.b.equals(wl2Var.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
