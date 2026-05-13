package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/DrivingSchoolModal;", "", "statusCd", "", "statusDesc", "stateWiseSchoolList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/StateWiseDrivingSchoolList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getStateWiseSchoolList", "()Ljava/util/ArrayList;", "getStatusCd", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DrivingSchoolModal {

    @xy5("StateWiseDSList")
    private final ArrayList<StateWiseDrivingSchoolList> stateWiseSchoolList;

    @xy5("status_code")
    private final String statusCd;

    @xy5("status_desc")
    private final String statusDesc;

    public DrivingSchoolModal() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrivingSchoolModal copy$default(DrivingSchoolModal drivingSchoolModal, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drivingSchoolModal.statusCd;
        }
        if ((i & 2) != 0) {
            str2 = drivingSchoolModal.statusDesc;
        }
        if ((i & 4) != 0) {
            arrayList = drivingSchoolModal.stateWiseSchoolList;
        }
        return drivingSchoolModal.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCd() {
        return this.statusCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<StateWiseDrivingSchoolList> component3() {
        return this.stateWiseSchoolList;
    }

    public final DrivingSchoolModal copy(String statusCd, String statusDesc, ArrayList<StateWiseDrivingSchoolList> stateWiseSchoolList) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new DrivingSchoolModal(statusCd, statusDesc, stateWiseSchoolList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingSchoolModal)) {
            return false;
        }
        DrivingSchoolModal drivingSchoolModal = (DrivingSchoolModal) other;
        return Intrinsics.areEqual(this.statusCd, drivingSchoolModal.statusCd) && Intrinsics.areEqual(this.statusDesc, drivingSchoolModal.statusDesc) && Intrinsics.areEqual(this.stateWiseSchoolList, drivingSchoolModal.stateWiseSchoolList);
    }

    public final ArrayList<StateWiseDrivingSchoolList> getStateWiseSchoolList() {
        return this.stateWiseSchoolList;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int iHashCode = ((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<StateWiseDrivingSchoolList> arrayList = this.stateWiseSchoolList;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "DrivingSchoolModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", stateWiseSchoolList=" + this.stateWiseSchoolList + ')';
    }

    public DrivingSchoolModal(String statusCd, String statusDesc, ArrayList<StateWiseDrivingSchoolList> arrayList) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.statusCd = statusCd;
        this.statusDesc = statusDesc;
        this.stateWiseSchoolList = arrayList;
    }

    public /* synthetic */ DrivingSchoolModal(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : arrayList);
    }
}
