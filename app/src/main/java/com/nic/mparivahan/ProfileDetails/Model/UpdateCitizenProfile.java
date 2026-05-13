package com.nic.mparivahan.ProfileDetails.Model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/Model/UpdateCitizenProfile;", "", "statusCode", "", "statusDesc", "mparCitizenProfile", "Lcom/nic/mparivahan/ProfileDetails/Model/MparCitizenProfile;", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/ProfileDetails/Model/MparCitizenProfile;)V", "getMparCitizenProfile", "()Lcom/nic/mparivahan/ProfileDetails/Model/MparCitizenProfile;", "getStatusCode", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UpdateCitizenProfile {
    private final MparCitizenProfile mparCitizenProfile;
    private final String statusCode;
    private final String statusDesc;

    public UpdateCitizenProfile(String statusCode, String statusDesc, MparCitizenProfile mparCitizenProfile) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(mparCitizenProfile, "mparCitizenProfile");
        this.statusCode = statusCode;
        this.statusDesc = statusDesc;
        this.mparCitizenProfile = mparCitizenProfile;
    }

    public static /* synthetic */ UpdateCitizenProfile copy$default(UpdateCitizenProfile updateCitizenProfile, String str, String str2, MparCitizenProfile mparCitizenProfile, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateCitizenProfile.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = updateCitizenProfile.statusDesc;
        }
        if ((i & 4) != 0) {
            mparCitizenProfile = updateCitizenProfile.mparCitizenProfile;
        }
        return updateCitizenProfile.copy(str, str2, mparCitizenProfile);
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
    public final MparCitizenProfile getMparCitizenProfile() {
        return this.mparCitizenProfile;
    }

    public final UpdateCitizenProfile copy(String statusCode, String statusDesc, MparCitizenProfile mparCitizenProfile) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        Intrinsics.checkNotNullParameter(mparCitizenProfile, "mparCitizenProfile");
        return new UpdateCitizenProfile(statusCode, statusDesc, mparCitizenProfile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCitizenProfile)) {
            return false;
        }
        UpdateCitizenProfile updateCitizenProfile = (UpdateCitizenProfile) other;
        return Intrinsics.areEqual(this.statusCode, updateCitizenProfile.statusCode) && Intrinsics.areEqual(this.statusDesc, updateCitizenProfile.statusDesc) && Intrinsics.areEqual(this.mparCitizenProfile, updateCitizenProfile.mparCitizenProfile);
    }

    public final MparCitizenProfile getMparCitizenProfile() {
        return this.mparCitizenProfile;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31) + this.mparCitizenProfile.hashCode();
    }

    public String toString() {
        return "UpdateCitizenProfile(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", mparCitizenProfile=" + this.mparCitizenProfile + ')';
    }
}
