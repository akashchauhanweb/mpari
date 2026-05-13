package com.nic.mparivahan.dlservices.ui.newlearner.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/DrivingSchoolMasterModal;", "", "drivingSchoolName", "", "drivingSchoolCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getDrivingSchoolCode", "()Ljava/lang/String;", "getDrivingSchoolName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DrivingSchoolMasterModal {

    @xy5("drivingSchool_code")
    private final String drivingSchoolCode;

    @xy5("drivingSchool_name")
    private final String drivingSchoolName;

    public DrivingSchoolMasterModal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DrivingSchoolMasterModal copy$default(DrivingSchoolMasterModal drivingSchoolMasterModal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drivingSchoolMasterModal.drivingSchoolName;
        }
        if ((i & 2) != 0) {
            str2 = drivingSchoolMasterModal.drivingSchoolCode;
        }
        return drivingSchoolMasterModal.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDrivingSchoolCode() {
        return this.drivingSchoolCode;
    }

    public final DrivingSchoolMasterModal copy(String drivingSchoolName, String drivingSchoolCode) {
        Intrinsics.checkNotNullParameter(drivingSchoolName, "drivingSchoolName");
        Intrinsics.checkNotNullParameter(drivingSchoolCode, "drivingSchoolCode");
        return new DrivingSchoolMasterModal(drivingSchoolName, drivingSchoolCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingSchoolMasterModal)) {
            return false;
        }
        DrivingSchoolMasterModal drivingSchoolMasterModal = (DrivingSchoolMasterModal) other;
        return Intrinsics.areEqual(this.drivingSchoolName, drivingSchoolMasterModal.drivingSchoolName) && Intrinsics.areEqual(this.drivingSchoolCode, drivingSchoolMasterModal.drivingSchoolCode);
    }

    public final String getDrivingSchoolCode() {
        return this.drivingSchoolCode;
    }

    public final String getDrivingSchoolName() {
        return this.drivingSchoolName;
    }

    public int hashCode() {
        return (this.drivingSchoolName.hashCode() * 31) + this.drivingSchoolCode.hashCode();
    }

    public String toString() {
        return "DrivingSchoolMasterModal(drivingSchoolName=" + this.drivingSchoolName + ", drivingSchoolCode=" + this.drivingSchoolCode + ')';
    }

    public DrivingSchoolMasterModal(String drivingSchoolName, String drivingSchoolCode) {
        Intrinsics.checkNotNullParameter(drivingSchoolName, "drivingSchoolName");
        Intrinsics.checkNotNullParameter(drivingSchoolCode, "drivingSchoolCode");
        this.drivingSchoolName = drivingSchoolName;
        this.drivingSchoolCode = drivingSchoolCode;
    }

    public /* synthetic */ DrivingSchoolMasterModal(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
