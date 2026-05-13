package com.zepto;

import com.google.android.play.core.assetpacks.AssetPackState;

/* JADX INFO: loaded from: classes.dex */
public final class z98 extends AssetPackState {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;

    public z98(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = i3;
        this.g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long a() {
        return this.d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.a.equals(assetPackState.c()) && this.b == assetPackState.d() && this.c == assetPackState.b() && this.d == assetPackState.a() && this.e == assetPackState.e() && this.f == assetPackState.f() && this.g == assetPackState.g() && this.h.equals(assetPackState.j()) && this.i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String j() {
        return this.h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String k() {
        return this.i;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        String str2 = this.h;
        String str3 = this.i;
        StringBuilder sb = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", availableVersionTag=");
        sb.append(str2);
        sb.append(", installedVersionTag=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
