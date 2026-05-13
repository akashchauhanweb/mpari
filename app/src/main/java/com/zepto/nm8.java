package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public final class nm8 extends dv {
    public final int a;
    public final boolean b;

    public /* synthetic */ nm8(int i, boolean z, hm8 hm8Var) {
        this.a = i;
        this.b = z;
    }

    @Override // com.zepto.dv
    public final boolean a() {
        return this.b;
    }

    @Override // com.zepto.dv
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dv) {
            dv dvVar = (dv) obj;
            if (this.a == dvVar.b() && this.b == dvVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
