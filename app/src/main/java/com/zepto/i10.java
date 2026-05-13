package com.zepto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i10 extends so5 {
    public final uq0 a;
    public final Map b;

    public i10(uq0 uq0Var, Map map) {
        if (uq0Var == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = uq0Var;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.zepto.so5
    public uq0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof so5)) {
            return false;
        }
        so5 so5Var = (so5) obj;
        return this.a.equals(so5Var.e()) && this.b.equals(so5Var.h());
    }

    @Override // com.zepto.so5
    public Map h() {
        return this.b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
