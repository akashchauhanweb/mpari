package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class a10 extends ue3 {
    public final String a;
    public final String b;

    public a10(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    @Override // com.zepto.ue3
    public String b() {
        return this.a;
    }

    @Override // com.zepto.ue3
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ue3)) {
            return false;
        }
        ue3 ue3Var = (ue3) obj;
        return this.a.equals(ue3Var.b()) && this.b.equals(ue3Var.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
