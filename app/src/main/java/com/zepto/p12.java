package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class p12 implements gy2 {
    public final boolean c;

    public p12(boolean z) {
        this.c = z;
    }

    @Override // com.zepto.gy2
    public v94 a() {
        return null;
    }

    @Override // com.zepto.gy2
    public boolean isActive() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
