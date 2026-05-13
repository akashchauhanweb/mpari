package com.zepto;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ba8 extends dy {
    public final long a;
    public final Map b;

    public ba8(long j, Map map) {
        this.a = j;
        this.b = map;
    }

    @Override // com.zepto.dy
    public final Map a() {
        return this.b;
    }

    @Override // com.zepto.dy
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dy) {
            dy dyVar = (dy) obj;
            if (this.a == dyVar.b() && this.b.equals(dyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        long j = this.a;
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(string.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
