package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/Welcome/Model/Version;", "", "statusCode", "", "statusDesc", "version", "Lcom/nic/mparivahan/Welcome/Model/VersionX;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/Welcome/Model/VersionX;)V", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "getVersion", "()Lcom/nic/mparivahan/Welcome/Model/VersionX;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Version {
    private final String statusCode;
    private final String statusDesc;
    private final VersionX version;

    public Version(String statusCode, String statusDesc, VersionX versionX) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.version = versionX;
    }

    public static /* synthetic */ Version copy$default(Version version, String str, String str2, VersionX versionX, int i, Object obj) {
        if ((i & 1) != 0) {
            str = version.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = version.statusDesc;
        }
        if ((i & 4) != 0) {
            versionX = version.version;
        }
        return version.copy(str, str2, versionX);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VersionX getVersion() {
        return this.version;
    }

    public final Version copy(String statusCode, String statusDesc, VersionX version) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new Version(statusCode, statusDesc, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return Intrinsics.areEqual(this.statusCode, version.statusCode) && Intrinsics.areEqual(this.statusDesc, version.statusDesc) && Intrinsics.areEqual(this.version, version.version);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final VersionX getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        VersionX versionX = this.version;
        return iHashCode + (versionX == null ? 0 : versionX.hashCode());
    }

    public String toString() {
        return "Version(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", version=" + this.version + ')';
    }
}
