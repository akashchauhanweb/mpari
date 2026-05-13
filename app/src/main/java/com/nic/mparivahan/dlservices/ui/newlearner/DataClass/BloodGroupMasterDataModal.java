package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/BloodGroupMasterDataModal;", "", "bloodGroupCode", "", "bloodGroupName", "masterNotAvailable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBloodGroupCode", "()Ljava/lang/String;", "getBloodGroupName", "getMasterNotAvailable", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BloodGroupMasterDataModal {

    @xy5("bloodGroup_code")
    private final String bloodGroupCode;

    @xy5("bloodGroup_name")
    private final String bloodGroupName;

    @xy5("UC01-E232")
    private final String masterNotAvailable;

    public BloodGroupMasterDataModal() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BloodGroupMasterDataModal copy$default(BloodGroupMasterDataModal bloodGroupMasterDataModal, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bloodGroupMasterDataModal.bloodGroupCode;
        }
        if ((i & 2) != 0) {
            str2 = bloodGroupMasterDataModal.bloodGroupName;
        }
        if ((i & 4) != 0) {
            str3 = bloodGroupMasterDataModal.masterNotAvailable;
        }
        return bloodGroupMasterDataModal.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBloodGroupCode() {
        return this.bloodGroupCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBloodGroupName() {
        return this.bloodGroupName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMasterNotAvailable() {
        return this.masterNotAvailable;
    }

    public final BloodGroupMasterDataModal copy(String bloodGroupCode, String bloodGroupName, String masterNotAvailable) {
        Intrinsics.checkNotNullParameter(bloodGroupCode, "bloodGroupCode");
        Intrinsics.checkNotNullParameter(bloodGroupName, "bloodGroupName");
        Intrinsics.checkNotNullParameter(masterNotAvailable, "masterNotAvailable");
        return new BloodGroupMasterDataModal(bloodGroupCode, bloodGroupName, masterNotAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodGroupMasterDataModal)) {
            return false;
        }
        BloodGroupMasterDataModal bloodGroupMasterDataModal = (BloodGroupMasterDataModal) other;
        return Intrinsics.areEqual(this.bloodGroupCode, bloodGroupMasterDataModal.bloodGroupCode) && Intrinsics.areEqual(this.bloodGroupName, bloodGroupMasterDataModal.bloodGroupName) && Intrinsics.areEqual(this.masterNotAvailable, bloodGroupMasterDataModal.masterNotAvailable);
    }

    public final String getBloodGroupCode() {
        return this.bloodGroupCode;
    }

    public final String getBloodGroupName() {
        return this.bloodGroupName;
    }

    public final String getMasterNotAvailable() {
        return this.masterNotAvailable;
    }

    public int hashCode() {
        return (((this.bloodGroupCode.hashCode() * 31) + this.bloodGroupName.hashCode()) * 31) + this.masterNotAvailable.hashCode();
    }

    public String toString() {
        return "BloodGroupMasterDataModal(bloodGroupCode=" + this.bloodGroupCode + ", bloodGroupName=" + this.bloodGroupName + ", masterNotAvailable=" + this.masterNotAvailable + ')';
    }

    public BloodGroupMasterDataModal(String bloodGroupCode, String bloodGroupName, String masterNotAvailable) {
        Intrinsics.checkNotNullParameter(bloodGroupCode, "bloodGroupCode");
        Intrinsics.checkNotNullParameter(bloodGroupName, "bloodGroupName");
        Intrinsics.checkNotNullParameter(masterNotAvailable, "masterNotAvailable");
        this.bloodGroupCode = bloodGroupCode;
        this.bloodGroupName = bloodGroupName;
        this.masterNotAvailable = masterNotAvailable;
    }

    public /* synthetic */ BloodGroupMasterDataModal(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
