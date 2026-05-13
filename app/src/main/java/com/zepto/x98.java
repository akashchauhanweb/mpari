package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class x98 extends cy {
    public final int b;
    public final String c;
    public final String d;

    public x98(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.zepto.cy
    public final String a() {
        return this.d;
    }

    @Override // com.zepto.cy
    public final int b() {
        return this.b;
    }

    @Override // com.zepto.cy
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cy) {
            cy cyVar = (cy) obj;
            if (this.b == cyVar.b() && ((str = this.c) != null ? str.equals(cyVar.c()) : cyVar.c() == null) && ((str2 = this.d) != null ? str2.equals(cyVar.a()) : cyVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.c;
        int iHashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
