package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/Welcome/Model/VersionX;", "", "versionDesc", "", "versionMandate", "", "versionNo", "", "versionOs", "versionUpdatedBy", "(Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)V", "getVersionDesc", "()Ljava/lang/String;", "getVersionMandate", "()Z", "getVersionNo", "()I", "getVersionOs", "getVersionUpdatedBy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VersionX {
    private final String versionDesc;
    private final boolean versionMandate;
    private final int versionNo;
    private final String versionOs;
    private final String versionUpdatedBy;

    public VersionX(String versionDesc, boolean z, int i, String versionOs, String versionUpdatedBy) {
        Intrinsics.checkNotNullParameter(versionDesc, "versionDesc");
        Intrinsics.checkNotNullParameter(versionOs, "versionOs");
        Intrinsics.checkNotNullParameter(versionUpdatedBy, "versionUpdatedBy");
        this.versionDesc = versionDesc;
        this.versionMandate = z;
        this.versionNo = i;
        this.versionOs = versionOs;
        this.versionUpdatedBy = versionUpdatedBy;
    }

    public static /* synthetic */ VersionX copy$default(VersionX versionX, String str, boolean z, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = versionX.versionDesc;
        }
        if ((i2 & 2) != 0) {
            z = versionX.versionMandate;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = versionX.versionNo;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = versionX.versionOs;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = versionX.versionUpdatedBy;
        }
        return versionX.copy(str, z2, i3, str4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersionDesc() {
        return this.versionDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVersionMandate() {
        return this.versionMandate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersionNo() {
        return this.versionNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersionOs() {
        return this.versionOs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersionUpdatedBy() {
        return this.versionUpdatedBy;
    }

    public final VersionX copy(String versionDesc, boolean versionMandate, int versionNo, String versionOs, String versionUpdatedBy) {
        Intrinsics.checkNotNullParameter(versionDesc, "versionDesc");
        Intrinsics.checkNotNullParameter(versionOs, "versionOs");
        Intrinsics.checkNotNullParameter(versionUpdatedBy, "versionUpdatedBy");
        return new VersionX(versionDesc, versionMandate, versionNo, versionOs, versionUpdatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionX)) {
            return false;
        }
        VersionX versionX = (VersionX) other;
        return Intrinsics.areEqual(this.versionDesc, versionX.versionDesc) && this.versionMandate == versionX.versionMandate && this.versionNo == versionX.versionNo && Intrinsics.areEqual(this.versionOs, versionX.versionOs) && Intrinsics.areEqual(this.versionUpdatedBy, versionX.versionUpdatedBy);
    }

    public final String getVersionDesc() {
        return this.versionDesc;
    }

    public final boolean getVersionMandate() {
        return this.versionMandate;
    }

    public final int getVersionNo() {
        return this.versionNo;
    }

    public final String getVersionOs() {
        return this.versionOs;
    }

    public final String getVersionUpdatedBy() {
        return this.versionUpdatedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.versionDesc.hashCode() * 31;
        boolean z = this.versionMandate;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((iHashCode + r1) * 31) + Integer.hashCode(this.versionNo)) * 31) + this.versionOs.hashCode()) * 31) + this.versionUpdatedBy.hashCode();
    }

    public String toString() {
        return "VersionX(versionDesc=" + this.versionDesc + ", versionMandate=" + this.versionMandate + ", versionNo=" + this.versionNo + ", versionOs=" + this.versionOs + ", versionUpdatedBy=" + this.versionUpdatedBy + ')';
    }
}
